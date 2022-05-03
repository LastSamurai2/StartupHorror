package com.company.humans;

public class Client extends Human{
    public ClientType clientType;

    public Client(String name, String surname, Integer age,ClientType clientType) {
        super(name, surname, age);
        this.clientType = clientType;
    }
}
