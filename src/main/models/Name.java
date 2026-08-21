package models;

public class Name {

    private String lastname;
    private String firstname;
    private String middle_name;

    public Name(String lastname, String firstname, String middle_name){
        this.lastname = lastname;
        this.firstname = firstname;
        this.middle_name = middle_name;
    }

    //Геттеры для ФИО
    public String getLastname(){
        return lastname;
    }
    public String getFirstname(){
        return firstname;
    }
    public String getMiddle_name(){
        return middle_name;
    }


    @Override
    public String toString(){
        
        String result = "";

        if (lastname != null) result += lastname + " ";
   
        if (firstname != null) result += firstname + " ";
 
        if (middle_name != null) result += middle_name;

        return result;
    }
}
