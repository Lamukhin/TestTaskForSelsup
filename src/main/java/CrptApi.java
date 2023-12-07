
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.net.ssl.HttpsURLConnection;
import jsonmodels.Document;

public class CrptApi {

    private final long timeUnitInMillis;
    private final int requestLimit;
    private volatile LinkedList<Long> requestTimes = new LinkedList<>();
    private final Logger log = Logger.getLogger(CrptApi.class.getName());
    private final ObjectMapper objectMapper = new ObjectMapper();

    public CrptApi(TimeUnit timeUnit, int requestLimit) {
        this.requestLimit = requestLimit;
        timeUnitInMillis = timeUnit.toMillis(1);
        requestTimes.add(System.currentTimeMillis());
    }

    public String serializeDocument(Document document, String sign) {
        String resultOfMapping = null;
        if (checkIfCanCreate()) {
            try {
                resultOfMapping = objectMapper.writeValueAsString(document);
                log.warning("Document is serialized!");
            } catch (JsonProcessingException ex) {
                log.severe(String.format("Can not convert file to JSON: %s", ex));
            }
        } else {
            log.severe("Your request is blocked, because you reached the limit!");
        }
        return resultOfMapping;
    }

    private synchronized boolean checkIfCanCreate() {
        if (System.currentTimeMillis() - requestTimes.getFirst() < timeUnitInMillis) {
            if (requestTimes.size() < requestLimit) {
                requestTimes.add(System.currentTimeMillis());
                return true;
            }
            return false;
        } else {
            requestTimes.clear();
            requestTimes.add(System.currentTimeMillis());
            return true;
        }
    }

    public String sendSerializedDocument(String serializedJson) {
        try {
            String responseFromServer = sendDataToServer(serializedJson);
            return responseFromServer;
        } catch (Exception ex) {
            log.severe(String.format("Can not send your data: %s", ex));
        }
        return null;
    }

    private String sendDataToServer(String body) throws Exception {

        URL url = new URL("https://ismp.crpt.ru/api/v3/lk/documents/create");

        HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setDoOutput(true);

        OutputStreamWriter writer = new OutputStreamWriter(connection.getOutputStream());
        writer.write(body);
        writer.flush();

        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String line;
        StringBuilder response = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            response.append(line);
        }
        reader.close();

        return response.toString();
    }
}
