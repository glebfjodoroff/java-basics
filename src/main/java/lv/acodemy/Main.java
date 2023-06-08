package lv.acodemy;

public class Main {
    public static void main(String[] args) {


        // One-line comment

        /*
        This is
        multi-line comment
         */

        // Primitive data types

        // double - floating number
        double pi = 3.14;
        System.out.println(pi);

        // float - floating number
        float weight = 70.34f;
        System.out.println(weight);

        // int (integer)
        int populationOfLatvia = 1700000;
        System.out.println(populationOfLatvia);

        // char
        char myFirstNameChar = 'G';
        System.out.println(myFirstNameChar);

        // byte
        byte age = 30;
        System.out.println(age);

        // boolean is , has
        boolean isSummer = true;
        System.out.println(isSummer);

        boolean isWinter = false;
        System.out.println(isWinter);

        // String
        String name = "Gleb";
        String surname = "Fjodoroff";
        System.out.println(name + " " + surname);
        System.out.printf("%s %s\n", name, surname);
        System.out.printf("%s %s\n", name, surname);

        System.out.printf(String.format("My name is: %s. My surname is: %s\n", name, surname));

        // Operator

        int a = 10;
        int b = 5;
        int c = a + b;
        System.out.println(c);

        double d = 20.54;
        double e = 9.61;
        double f = d - e;
        System.out.println(f);

        int x = 10;
        int y = 10 % 3;
        System.out.println(y);



    }
}