package lv.acodemy.Classroom;

import java.util.Arrays;

public class Arraysifs {
    public static void main(String[] args) {

        // Array

        int[] numbers = {1, 5, 9, 18, 20, 38, 58};

        System.out.println(numbers[3]); // print 18

        //numbers[0] = 1
        //numbers[1] = 5
        //numbers[2] = 9

        int[] ages = new int[10];
        ages[0] = 18;
        ages[3] = 24;

        System.out.println(Arrays.toString(ages));
        System.out.println(ages);

        // String array

        String[] names = {"John", "Andres", "Mary", "Angelica"};
        System.out.println(Arrays.toString(names));
        System.out.println(names[3]); // print Angelica

        // Logical Statements

        /*

        if(condition) {

        }

        condition = boolean (true or false)

         */

        if (5 < 10) {
            System.out.println("Yes, this is correct!");
        }


        boolean isSummer = true;
        if (isSummer) {
            System.out.println("Yes, this is summer and its quite hot in here!");
        }

        int x = 20;
        if (x > 0) {
            System.out.println("YES, ITS POSITIVE NUMBER");
        }

        if (x % 2 == 0) ;
        System.out.println("YES, THIS NUMBER DIVISIBLE BY 2");

        /*

        if(true) {
        do something if true
        } else {
        do something another if false
        }

         */

        if (x > 0) {
            System.out.println("Number is positive:" + x);
        } else {
            System.out.println("Number is negative: " + x);
        }


        if (x % 2 == 0) {
            System.out.println("NUMBER IS EVEN");
        } else {
            System.out.println("NUMBER IS ODD");
        }

        x = 18;

        // <= (less or equals)
        // >= (more or equals)
        // == (compare)

        if (x < 18) {
            System.out.println("Person is not eligible for voting");
        } else {
            System.out.println("Person can vote");
        }

        boolean isWinter = false;
        boolean isAutumn = false;

        if (isSummer) {
            System.out.println("Right, this is summer!");
        } else if (isWinter) {
            System.out.println("Right, this is winter!");
        } else if (isAutumn) {
            System.out.println("Right, this is autumn!");
        } else {
            System.out.println("Not sure, but it can be spring!");
        }


        int grade = 5;

        if (grade == 1) {
            System.out.println("Unsatisfactory");
        } else if (grade == 2) {
            System.out.println("Unsatisfactory");
        } else if (grade == 3) {
            System.out.println("Unsatisfactory");
        } else if (grade == 4) {
            System.out.println("Almost satisfactory");
        } else if (grade == 5) {
            System.out.println("Almost satisfactory");
        } else if (grade == 6) {
            System.out.println("Almost good");
        } else if (grade == 7) {
            System.out.println("Good");
        } else if (grade == 8) {
            System.out.println("Very good");
        } else if (grade == 9) {
            System.out.println("Excellent");
        } else if (grade == 10) {
            System.out.println("Perfect");
        } else {
            System.out.println("Error");
        }


        int angle = 200;
        if (angle > 0 && angle < 90) {
            System.out.println("Ocute angle");
        } else if (angle == 45) {
            System.out.println("Right angle");
        } else if (angle == 180) {
            System.out.println("Straight angle");
        } else if (angle > 90 && angle < 180) {
            System.out.println("Obtuse angle");
        } else {
            System.out.println("FUCK OFF");


            



        }


    }
}



