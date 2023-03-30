package com.carparking.entity;

public class VechicleInFo {

    private int vechicleId;
    private String vechicleName;
    private int vechicleType;

     private int registrationNumber;

    private ResidentInformation residentInformation;

    public int getVechicleId() {
        return vechicleId;
    }

    public void setVechicleId(int vechicleId) {
        this.vechicleId = vechicleId;
    }

    public String getVechicleName() {
        return vechicleName;
    }

    public void setVechicleName(String vechicleName) {
        this.vechicleName = vechicleName;
    }

    public int getVechicleType() {
        return vechicleType;
    }

    public void setVechicleType(int vechicleType) {
        this.vechicleType = vechicleType;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public ResidentInformation getResidentInformation() {
        return residentInformation;
    }

    public void setResidentInformation(ResidentInformation residentInformation) {
        this.residentInformation = residentInformation;
    }
}
