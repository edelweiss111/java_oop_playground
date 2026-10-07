package models;

import java.util.concurrent.ThreadLocalRandom;

import exceptions.ConnectionLostException;
import exceptions.ResourceClosedException;

public class Connection {
    private String address;
    private boolean isUp;
    
    public Connection(String address){
        this.address = address;
        this.isUp = true;
    }

    public String getData() throws ConnectionLostException{
        int count = ThreadLocalRandom.current().nextInt(0, 2);
        if (!isUp) throw new ResourceClosedException();

        if (count == 0) return "test connection";

        else throw new ConnectionLostException();
    }

    public void close(){
        this.isUp = false;
    }

    public void open(){
        this.isUp = true;
    }
}
