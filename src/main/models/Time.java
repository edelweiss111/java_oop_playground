package models;

public class Time {
    
    private int seconds;

    public Time(int seconds){
        //в сутказ максимум 86400 секунд, выводим сколько прошло от начала суток
        this.seconds = seconds%86400;
    }
   
    @Override
    public String toString(){
        int hours = seconds/3600;
        int minutes = (seconds%3600)/60;
        int secs = seconds%60;

        return String.format("%02d:%02d:%02d", hours, minutes, secs);

    }
}
