
import models.IntegrationGateway;
import models.PatientProfileV1;
import models.PatientProfileV2;
import models.SecureResponse;

public class MainSimulation {
    public static void main(String[] args) {
        PatientProfileV1 patientV1 = new PatientProfileV1("12345", "John Doe", "Flu", 3);
        IntegrationGateway<PatientProfileV1> gatewayV1 = new IntegrationGateway<>(patientV1);
        SecureResponse<PatientProfileV1> responseV1 = gatewayV1.fetchData("12345", 2);
        System.out.println("Response V1: " + responseV1.getWarningMessage());

        PatientProfileV2 patientV2 = new PatientProfileV2("12345", "John Doe", "Flu", "Rest and fluids", 4);
        IntegrationGateway<PatientProfileV2> gatewayV2 = new IntegrationGateway<>(patientV2);
        SecureResponse<PatientProfileV2> responseV2 = gatewayV2.fetchData("12345", 4);
        System.out.println("Response V2: " + responseV2.getWarningMessage());

        SecureResponse<PatientProfileV1> responseNotFound = gatewayV1.fetchData("99999", 5);
        System.out.println("Response Not Found: " + responseNotFound.getWarningMessage());
    }
}
