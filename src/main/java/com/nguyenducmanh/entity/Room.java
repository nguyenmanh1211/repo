package com.nguyenducmanh.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "roomProperties")
public class Room extends Base {
    @Column(name = "address")
    private String address;

    @Column(name = "prices")
    private double prices;

    @Column(name = "wifi")
    private String wifi;

    @Column(name = "bedroom")
    private int bedroom;

    @Column(name = "bathroom")
    private int bathroom;

    @Column(name = "deposit")
    private double deposit;

    @Column(name = "watter_prices")
    private double watterPrices;

    @Column(name = "electric_prices")
    private double electricPrices;

    @Column(name = "information_more", columnDefinition = "text")
    private String information;

    @Column(name = "img1", columnDefinition = "text")
    private String img1;

    @Column(name = "img2", columnDefinition = "text")
    private String img2;

    @Column(name = "img3", columnDefinition = "text")
    private String img3;

    @Column(name = "img4", columnDefinition = "text")
    private String img4;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "Manager_id")
    private Manager manager;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPrices() {
        return prices;
    }

    public void setPrices(double prices) {
        this.prices = prices;
    }

    public String getWifi() {
        return wifi;
    }

    public void setWifi(String wifi) {
        this.wifi = wifi;
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

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}
