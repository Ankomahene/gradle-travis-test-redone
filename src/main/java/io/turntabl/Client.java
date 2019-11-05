package io.turntabl;

public abstract class Client {
    private String name;
    private int id;
    private Level serviceLevel;

    public Client(String name, int id, Level serviceLevel) {
        this.name = name;
        this.id = id;
        this.serviceLevel = serviceLevel;
    }

    public String getName(){
        return this.name;
    }
    public int getId(){
        return this.id;
    }
    public Level getServiceLevel(){
        return this.serviceLevel;
    }
}
