package jsonmodels;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

/*"certificate_document": "string",
		"certificate_document_date": "2020-01-23",
		"certificate_document_number": "string",
		"owner_inn": "string",
		"producer_inn": "string",
		"production_date": "2020-01-23",
		"tnved_code": "string",
		"uit_code": "string",
		"uitu_code": "string"*/
public class Product {

    @JsonProperty("certificate_document")
    private String certificateDocument;

    @JsonProperty("certificate_document_date")
    private String certificateDocumentDate;

    @JsonProperty("certificate_document_number")
    private String certificateDocumentNumber;

    @JsonProperty("owner_inn")
    private String ownerInn;

    @JsonProperty("producer_inn")
    private String producerInn;

    @JsonProperty("production_date")
    private String productionDate;

    @JsonProperty("tnved_code")
    private String tnvedCode;

    @JsonProperty("uit_code")
    private String uitCode;

    @JsonProperty("uitu_code")
    private String uituCode;

    public String getCertificateDocument() {
        return certificateDocument;
    }

    public void setCertificateDocument(String certificateDocument) {
        this.certificateDocument = certificateDocument;
    }

    public String getCertificateDocumentDate() {
        return certificateDocumentDate;
    }

    public void setCertificateDocumentDate(String certificateDocumentDate) {
        this.certificateDocumentDate = certificateDocumentDate;
    }

    public String getCertificateDocumentNumber() {
        return certificateDocumentNumber;
    }

    public void setCertificateDocumentNumber(String certificateDocumentNumber) {
        this.certificateDocumentNumber = certificateDocumentNumber;
    }

    public String getOwnerInn() {
        return ownerInn;
    }

    public void setOwnerInn(String ownerInn) {
        this.ownerInn = ownerInn;
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

    public String getTnvedCode() {
        return tnvedCode;
    }

    public void setTnvedCode(String tnvedCode) {
        this.tnvedCode = tnvedCode;
    }

    public String getUitCode() {
        return uitCode;
    }

    public void setUitCode(String uitCode) {
        this.uitCode = uitCode;
    }

    public String getUituCode() {
        return uituCode;
    }

    public void setUituCode(String uituCode) {
        this.uituCode = uituCode;
    }

}
