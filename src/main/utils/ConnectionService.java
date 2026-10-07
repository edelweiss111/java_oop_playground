package utils;

import exceptions.ConnectionLostException;
import models.Connection;

public class ConnectionService {
    public static void readData(){
        Connection connection = new Connection("ai.edu");
        //Объявляем i заранее, чтобы в catch видеть номер строки с ошибкой
        int i = 0;
        try{
            for(; i<10; i++){
                String data = connection.getData();
                System.out.println(i+1 + " " + data);
            }
        }
        catch(ConnectionLostException e){
            System.out.println("Произошел сбой связи при чтении %d строки".formatted(i + 1));
        }
        finally{
            connection.close();
            System.out.println("Соединение закрыто");
        }
    }
}
