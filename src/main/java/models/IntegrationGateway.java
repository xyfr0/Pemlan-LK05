package models;

public class IntegrationGateway<T> {
    private T mockDatabaseRecord;

    public IntegrationGateway(T record) {
        this.mockDatabaseRecord = record;
    }

    public SecureResponse<T> fetchData(String id, int clearanceLevel){

        return null;
    }


}
