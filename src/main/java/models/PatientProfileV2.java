package models;

import interfaces.*;

public class PatientProfileV2 implements MedicalRecord, Versioned, Confidential {
    private String patientID;
    private String name;
    private String diagnosis;
    private String treatmentPlan;
    private int securityLevel;

    public PatientProfileV2(String patientID, String name, String diagnosis, String treatmentPlan, int securityLevel) {
        this.patientID = patientID;
        this.name = name;
        this.diagnosis = diagnosis;
        this.treatmentPlan = treatmentPlan;
        this.securityLevel = securityLevel;
    }

    @Override
    public String getPatientID() {
        return patientID;
    }

    @Override
    public int getVersion() {
        return 2;
    }

    @Override
    public int getSecurityLevel() {
        return securityLevel;
    }

    @Override
    public void maskSensitiveData() {
        this.diagnosis = "*";
        this.treatmentPlan = "*";
    }

    @Override
    public String toString() {
        return "V2 - ID: " + patientID + ", Nama: " + name +
               ", Diagnosis: " + diagnosis + ", Treatment: " + treatmentPlan;
    }
}