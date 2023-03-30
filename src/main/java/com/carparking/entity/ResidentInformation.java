package com.carparking.entity;

public class ResidentInformation {
    private int residentId;
    private String name;
    private long mobNumber;
    private String email;
    private int apt;

    public int getResidentId() {
        return residentId;
    }

    public void setResidentId(int residentId) {
        this.residentId = residentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMobNumber() {
        return mobNumber;
    }

    public void setMobNumber(long mobNumber) {
        this.mobNumber = mobNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getApt() {
        return apt;
    }

    public void setApt(int apt) {
        this.apt = apt;
    }
}