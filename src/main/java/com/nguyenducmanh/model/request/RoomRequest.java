package com.nguyenducmanh.model.request;

import com.nguyenducmanh.entity.Manager;

public class RoomRequest {
    private String address;

    private String information;

    private String img1;

    private String img2;

    private String img3;

    private String img4;

    private String wifi;

    private double prices;

    private int bedroom;

    private int bathroom;

    private double deposit;

    private double watterPrices;

    private double electricPrices;

    private long idManager;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getImg1() {
        return img1;
    }

    public void setImg1(String img1) {
        this.img1 = img1;
    }

    public String getImg2() {
        return img2;
    }

    public void setImg2(String img2) {
        this.img2 = img2;
    }

    public String getImg3() {
        return img3;
    }

    public void setImg3(String img3) {
        this.img3 = img3;
    }

    public String getImg4() {
        return img4;
    }

    public void setImg4(String img4) {
        this.img4 = img4;
    }

    public String getWifi() {
        return wifi;
    }

    public void setWifi(String wifi) {
        this.wifi = wifi;
    }

    public double getPrices() {
        return prices;
    }

    public void setPrices(double prices) {
        this.prices = prices;
    }

    public int getBedroom() {
        return bedroom;
    }

    public void setBedroom(int bedroom) {
        this.bedroom = bedroom;
    }

    public int getBathroom() {
        return bathroom;
    }

    public void setBathroom(int bathroom) {
        this.bathroom = bathroom;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getWatterPrices() {
        return watterPrices;
    }

    public void setWatterPrices(double watterPrices) {
        this.watterPrices = watterPrices;
    }

    public double getElectricPrices() {
        return electricPrices;
    }

    public void setElectricPrices(double electricPrices) {
        this.electricPrices = electricPrices;
    }

    public long getIdManager() {
        return idManager;
    }

    public void setIdManager(long idManager) {
        this.idManager = idManager;
    }
}
