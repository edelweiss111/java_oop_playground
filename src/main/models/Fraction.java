package models;

public class Fraction {

    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int denominator){

        if (denominator == 0) {
        throw new IllegalArgumentException("Знаменатель не может быть равен 0");
        }

        //знаменатель всегда больше 0
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }

        this.numerator = numerator;
        this.denominator = denominator;
    }

    //Конструктор для целовго числа
    public Fraction(int num){
        this(num, 1);
    }

    //Геттеры
    public int getNumerator(){
        return numerator;
    }

    public int getDenominator(){
        return denominator;
    }

    //Сумма с другой дробью или числом
    public Fraction sum(Fraction fraction){
        int newDenominator = this.getDenominator() * fraction.getDenominator();

        int numerator1 = this.getNumerator() * fraction.getDenominator();

        int numerator2 = this.getDenominator() * fraction.getNumerator();

        Fraction result = new Fraction(numerator1 + numerator2, newDenominator);

        return result;  
    }

    public Fraction sum(int num){
        return sum(new Fraction(num));
    }

    //Разность с другой дробью или числом
    public Fraction minus(Fraction fraction){
        int newDenominator = this.getDenominator() * fraction.getDenominator();

        int numerator1 = this.getNumerator() * fraction.getDenominator();

        int numerator2 = this.getDenominator() * fraction.getNumerator();

        Fraction result = new Fraction(numerator1 - numerator2, newDenominator);

        return result;  
    }

    public Fraction minus(int num){
        return minus(new Fraction(num)); 
    }

    //Произведение с другой дробью или числом
    public Fraction multiply(Fraction fraction){
        int newNumerator = this.getNumerator() * fraction.getNumerator();

        int newDenominator = this.getDenominator() * fraction.getDenominator();

        Fraction result = new Fraction(newNumerator, newDenominator);

        return result;  
    }

    public Fraction multiply(int num){
        return multiply(new Fraction(num));
    }

    //Деление на другую дробь или число
    public Fraction divide(Fraction fraction){
        int newNumerator = this.getNumerator() * fraction.getDenominator();

        int newDenominator = this.getDenominator() * fraction.getNumerator();

        Fraction result = new Fraction(newNumerator, newDenominator);

        return result;  
    }

    public Fraction divide(int num){
        return divide(new Fraction(num));
    }

    @Override
    public String toString(){
        return numerator + "/" + denominator;
    }
}
