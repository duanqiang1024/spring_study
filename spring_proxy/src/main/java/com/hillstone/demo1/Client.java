package com.hillstone.demo1;


//  租房客
public class Client {
    public static void main(String[] args) {
        /*Landlord landlord = new Landlord();
        landlord.rent();*/
        //房东出租房子
        Landlord landlord = new Landlord();
        //代理，中介帮房东出租房子，代理角色一般会有一些附属操作！
        Proxy proxy = new Proxy(landlord);
        //不用面对房东，直接找中介租房即可
        proxy.rent();
    }
}
