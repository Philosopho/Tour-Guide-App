package com.krinotech.tourguideapp;

public class Area {

    public Area(String name, String address, String contactInfo, int picture) {
        this.name = name;
        this.address = address;
        this.contactInfo = contactInfo;
        this.picture = picture;
    }

    private String name;
    private String address;
    private String contactInfo;
    private int picture;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public int getPicture() {
        return picture;
    }
}
