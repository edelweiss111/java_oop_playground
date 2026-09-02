package models;

public class Name {

    private final String lastname;
    private final String firstname;
    private final String middlename;

    public Name(String lastname, String firstname, String middlename){
        if ((lastname == null || lastname.isBlank()) && (firstname == null || firstname.isBlank()) && (middlename == null || middlename.isBlank())){
            throw new IllegalArgumentException("Хотя бы одно поле не должно быть пустым");
        }

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
