package jsonmodels;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/*{
	"description":
	{
		"participantInn": "string"
	},
	"doc_id": "string",
	"doc_status": "string",
	"doc_type": "LP_INTRODUCE_GOODS",
	"importRequest": true,
	"owner_inn": "string",
	"participant_inn": "string",
	"producer_inn": "string",
	"production_date": "2020-01-23",
	"production_type": "string",
	"products": [
	{
		"certificate_document": "string",
		"certificate_document_date": "2020-01-23",
		"certificate_document_number": "string",
		"owner_inn": "string",
		"producer_inn": "string",
		"production_date": "2020-01-23",
		"tnved_code": "string",
		"uit_code": "string",
		"uitu_code": "string"
	}],
	"reg_date": "2020-01-23",
	"reg_number": "string"
}*/
public class Document {
    
    @JsonProperty("description")
    private Description description;
    
    @JsonProperty("doc_id")
    private String docId;
    
    @JsonProperty("doc_status")
    private String docStatus;
    
    @JsonProperty("doc_type")
    private String docType;
    
    @JsonProperty("importRequest")
    private boolean importRequest;
    
    @JsonProperty("owner_inn")
    private String ownerInn;
    
    @JsonProperty("participant_inn")
    private String participantInn;
    
    @JsonProperty("producer_inn")
    private String producerInn;
    
    @JsonProperty("production_date")
    private String productionDate;
    
    @JsonProperty("production_type")
    private String productionType;
    
    @JsonProperty("products")
    private ArrayList<Product> products;
    
    @JsonProperty("reg_date")
    private String regDate;
    
    @JsonProperty("reg_number")
    private String regNumber;

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    public String getDocStatus() {
        return docStatus;
    }

    public void setDocStatus(String docStatus) {
        this.docStatus = docStatus;
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public boolean isImportRequest() {
        return importRequest;
    }

    public void setImportRequest(boolean importRequest) {
        this.importRequest = importRequest;
    }

    public String getOwnerInn() {
        return ownerInn;
    }

    public void setOwnerInn(String ownerInn) {
        this.ownerInn = ownerInn;
    }

    public String getParticipantInn() {
        return participantInn;
    }

    public void setParticipantInn(String participantInn) {
        this.participantInn = participantInn;
    }

    public String getProducerInn() {
        return producerInn;
    }

    public void setProducerInn(String producerInn) {
        this.producerInn = producerInn;
    }

    public String getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
    }

    public String getProductionType() {
        return productionType;
    }

    public void setProductionType(String productionType) {
        this.productionType = productionType;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }   
    
}

