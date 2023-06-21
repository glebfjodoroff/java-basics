package lv.acodemy;

import static java.awt.Color.black;
import static lv.acodemy.Sizes.XXL;

public class ObjectPractice {

    public static void main(String[] args) {

        Animal barsik = new Animal();
        String catName = barsik.getName();
//name null
        System.out.println(catName);
        System.out.println(barsik);
//name Kitty
        barsik.setName("Kitty");
        System.out.println(barsik);
//age 5
        barsik.setAge(5);
        System.out.println(barsik);
        System.out.println(" My cat is: " + barsik.getAge() + " years old. ");

        // Create getter and setter for weight, color, size;
        // set data using setters;

        barsik.setColor("grey");
        System.out.println(barsik);
        System.out.println(" My cat color is " + barsik.getColor());

        barsik.setWeight(20);
        System.out.println(barsik);
        System.out.println(" My cat weight is " + barsik.getWeight() + " kg ");

        barsik.setSize(Sizes.L);
        System.out.println(" My cat size is " + barsik.getSize());

        // objekt s parametrami

        Animal barbos = new Animal(13, "Barbos");
        // My name is Barbos. I am 13 years old.
        System.out.println(barbos);
        System.out.printf("My name is %s. I am %d old. \n", barbos.getName(), barbos.getAge());

        //System.out.println("My name is " + barbos.getName() + "I am" + barbos.getAge() + "years old");

        //Create All argument constructor;

        Animal zhorik = new Animal(13, 12.5, "black", XXL, "Barbos", true);
        System.out.println(zhorik);

        zhorik.speak();
        zhorik.feed("bulka");

        zhorik.speak();
        zhorik.getEnergy();

        zhorik.speak();
        zhorik.speak();
        zhorik.speak();
        zhorik.speak();
        zhorik.getEnergy();



    }
}
