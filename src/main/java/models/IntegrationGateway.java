package models;

import interfaces.Confidential;
import interfaces.MedicalRecord;
    import interfaces.Versioned;

    public class IntegrationGateway<T extends MedicalRecord & Versioned & Confidential> {
        private T mockDatabaseRecord;

        public IntegrationGateway(T record) {
            this.mockDatabaseRecord = record;
        }

        String warning = null;
        public SecureResponse<T> fetchData(String id, int clearanceLevel){
            if(!this.mockDatabaseRecord.getPatientID().equals(id)){
                return new SecureResponse<>(false, null, "Pasien tidak ditemukan.");
            }
            if (clearanceLevel < this.mockDatabaseRecord.getSecurityLevel()){
                warning = "Data berkeamanan rendah ditemukan dan telah disamarkan.";
                mockDatabaseRecord.maskSensitiveData();
            }
            return new SecureResponse<>(true, mockDatabaseRecord, warning);
        }


    }
