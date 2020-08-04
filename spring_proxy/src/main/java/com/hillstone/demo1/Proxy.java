package com.hillstone.demo1;

public class Proxy implements Rent {
    private Landlord landlord;

    public Proxy() {
    }

    public Proxy(Landlord landlord) {
        this.landlord = landlord;
    }

    public void rent() {
        seeHouse();
        landlord.rent();
        fare();
        heTong();
    }

    //看房
    public void seeHouse() {
        System.out.println("中介带你看房");
    }

    //收中介费
    public void fare() {
        System.out.println("收中介费");
    }

    //看房
    public void heTong() {
        System.out.println("签合同 ");
    }
}
