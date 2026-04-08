package models;

import interfaces.*;

public class PatientProfileV1 implements MedicalRecord, Versioned, Confidential {
    private String patientID;
    private String name;
    private String diagnosis;
    private int securityLevel;

    public PatientProfileV1(String patientID, String name, String diagnosis, int securityLevel) {
        this.patientID = patientID;
        this.name = name;
        this.diagnosis = diagnosis;
        this.securityLevel = securityLevel;
    }

    @Override
    public String getPatientID() {
        return patientID;
    }

    @Override
    public int getVersion() {
        return 1;
    }

    @Override
    public int getSecurityLevel() {
        return securityLevel;
    }

    @Override
    public void maskSensitiveData() {
        this.diagnosis = "*";
    }

    @Override
    public String toString() {
        return "V1 - ID: " + patientID + ", Nama: " + name + ", Diagnosis: " + diagnosis;
    }
}