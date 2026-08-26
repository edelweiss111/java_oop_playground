package models;

public class Human {

    private Name name;
    private Human father;

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
    

    @Override
    public String toString() {
        String lastname = name.getLastname();
        String firstname = name.getFirstname();
        String middle_name = name.getMiddle_name();

        if (father != null) {
            //Берем фамилию отца, если своя не указана, а у него указана
            if (lastname == null && father.getName().getLastname() != null) lastname = father.getName().getLastname();

            //Склонение отчества в зависимости от имени (если оно указано)
            if (middle_name == null && father.getName().getFirstname() != null){
                String fatherName = father.getName().getFirstname();

                if (fatherName.endsWith("а") || fatherName.endsWith("я")) {
                    int length = fatherName.length();
                    middle_name = fatherName.substring(0, length-1) + "ич";
                }

                else if (fatherName.endsWith("й") || fatherName.endsWith("ь")) {
                    int length = fatherName.length();
                    middle_name = fatherName.substring(0, length-1) + "евич";
                }

                else middle_name = fatherName + "ович";
            }
        }
        String result = "";
        if (lastname != null) result += lastname + " ";
        if (firstname != null) result += firstname + " ";
        if (middle_name != null) result += middle_name;

        return result;
    }
}
