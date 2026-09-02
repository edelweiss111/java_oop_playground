package models;

public class Human {

    private Name name;
    private final Human father;

    public Human(Name name, Human father) {
        this.name = name;
        this.father = father;
    }

    //Делегирование конструкторов
    public Human(Name name) {
        this(name, null);
    }

    public Human(String name){
        this(new Name(name), null);
    }

    public Human(String name, Human father){
        this(new Name(name), father);
    }

    //Геттер имени человека
    public Name getName(){
        return name;
    }

    public String getFirstname(){
        return name.getFirstname();
    }

    public String getMiddlename(){
        return name.getMiddlename();
    }

    public String getLastname(){
        if (name.getLastname() != null) return name.getLastname();

        if (father != null) return father.getLastname();

        else return null;
    }

    //геттер для отца
    public Human getFather(){
        return this.father;
    }

    @Override
    public String toString() {
        String lastname = name.getLastname();
        String firstname = name.getFirstname();
        String middlename = name.getMiddlename();

        if (father != null) {
            //Берем фамилию отца, если своя не указана, а у него указана
            if (lastname == null) lastname = father.getLastname();

            //Склонение отчества в зависимости от имени (если оно указано)
            if (middlename == null && father.getName().getFirstname() != null){
                String fatherName = father.getName().getFirstname();

                if (fatherName.endsWith("а") || fatherName.endsWith("я")) {
                    int length = fatherName.length();
                    middlename = fatherName.substring(0, length-1) + "ич";
                }

                else if (fatherName.endsWith("й") || fatherName.endsWith("ь")) {
                    int length = fatherName.length();
                    middlename = fatherName.substring(0, length-1) + "евич";
                }

                else middlename = fatherName + "ович";
            }
        }
        String result = "";
        if (lastname != null) result += lastname + " ";
        if (firstname != null) result += firstname + " ";
        if (middlename != null) result += middlename;

        return result;
    }
}
