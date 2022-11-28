package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class WiseCounting {
    public static void main(String[] args) {
Person emperor = new Emperor("Akbar");
List<Courtier> courtiers= new ArrayList<>();
courtiers.add(new Courtier("first"));
courtiers.add(new Courtier("second"));
courtiers.add(new Courtier("third"));
Person birbal = new Birbal("Birbal");

        ((Emperor)emperor).ask(0);
         courtiers.forEach(Courtier::thinks);
        ((Birbal)birbal).enters();
        ((Birbal)birbal).asks();
        ((Emperor)emperor).ask(0);
        ((Birbal)birbal).answers();
        ((Emperor)emperor).ask(1);
        ((Birbal)birbal).says();



    }
}
class Person{
    private final String name;


    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Emperor extends Person{
    private final List<String> questions = new LinkedList<>();

    public Emperor(String name) {
        super(name);
        questions.add( "How many crows are there in this city?");
        questions.add("How can you be so sure?");
    }
    public void ask(int number){
        String s = questions.get(number);
        System.out.println(getName()+"asks: "+s );
    }
    public void looks(){
        System.out.println(getName()+ "glanced at his courtiers. ");
    }
}

class Courtier extends Person{

    public Courtier(String name) {
        super(name);
    }

    public  void thinks(){
        System.out.println("The head began to hang low in search answer");
    }
}

class Birbal extends Person{

    public Birbal(String name) {
        super(name);
    }

    public void asks(){
        System.out.println(getName()+ "asks:  May I know the question so that I can try for an answer ");

    }
    public void enters(){
        System.out.println(getName()+ "entered the courtyard");
    }
    public void answers(){
        System.out.println( "There are fifty thousand five hundred and eighty nine crows, my lord");
    }
    public  void  says(){
        System.out.println("Make you men count, My lord. If you find more crows it means some have come to visit their relatives here. If you find less number of crows it" +
                " means some have gone to visit their relatives elsewhere" );
    }
}