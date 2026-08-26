package models;

public class Name {

    private String lastname;
    private String firstname;
    private String middlename;

    public Name(String lastname, String firstname, String middlename){
        this.lastname = lastname;
        this.firstname = firstname;
        this.middlename = middlename;
    }

    //Делегирование конструкторы
    public Name(String firstname){
        this(null, firstname, null);
    }

    public Name(String lastname, String firstname){
        this(lastname, firstname, null);
    }

    //Геттеры для ФИО
    public String getLastname(){
        return lastname;
    }
    public String getFirstname(){
        return firstname;
    }
    public String getMiddlename(){
        return middlename;
    }


    @Override
    public String toString(){
        
        String result = "";

        if (lastname != null) result += lastname + " ";
   
        if (firstname != null) result += firstname + " ";
 
        if (middlename != null) result += middlename;

        return result;
    }
}
