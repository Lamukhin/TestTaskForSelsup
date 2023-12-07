import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import jsonmodels.Description;
import jsonmodels.Document;
import jsonmodels.Product;

public class Main {

    public static void main(String[] args) { 
        
        TimeUnit timeUnit = TimeUnit.MINUTES;
        CrptApi crptApi = new CrptApi(timeUnit, 10);
        
        Description description = new Description();
        description.setParticipantInn("string");
        
        Product product = new Product();
        product.setCertificateDocument("String");
        product.setCertificateDocumentDate("2020-01-23");
        product.setCertificateDocumentNumber("string");
        product.setOwnerInn("string");
        product.setProducerInn("string");
        product.setProductionDate("2020-01-23");
        product.setTnvedCode("string");
        product.setUitCode("string");
        product.setUituCode("string");
                
        Document document = new Document();
        document.setDescription(description);
        document.setDocId("string");
        document.setDocStatus("string");
        document.setDocType("string");
        document.setImportRequest(true);
        document.setOwnerInn("string");
        document.setParticipantInn("string");
        document.setProducerInn("string");
        document.setProductionDate("2020-01-23");
        document.setProductionType("string");
        document.setProducts(new ArrayList<>(Arrays.asList(product)));
        document.setRegDate("2020-01-23");
        document.setRegNumber("string");
        
        
        String sign = "sign";
        
        //многократные запросы для проверки лимита подключений
        String result;
        result = crptApi.serializeDocument(document, sign);
        result = crptApi.serializeDocument(document, sign);
        result = crptApi.serializeDocument(document, sign);
        result = crptApi.serializeDocument(document, sign);
        result = crptApi.serializeDocument(document, sign);
        result = crptApi.serializeDocument(document, sign);
        result = crptApi.serializeDocument(document, sign);
        try {
            Thread.sleep(60000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        result = crptApi.serializeDocument(document, sign);
        result = crptApi.serializeDocument(document, sign);
        result = crptApi.serializeDocument(document, sign);        
        result = crptApi.serializeDocument(document, sign);
        result = crptApi.serializeDocument(document, sign);
        result = crptApi.serializeDocument(document, sign);
        result = crptApi.serializeDocument(document, sign);
        
        
        if (result != null){
            String response = crptApi.sendSerializedDocument(result);
        }
        
        
        
    }
}
