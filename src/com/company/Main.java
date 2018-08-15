package com.company;

public class Main {

    public static void main(String[] args) {
        int value = 3;
        if (value == 1) {
            System.out.println("Value is 1");
        } else if (value == 2) {
            System.out.println("Value is 2");
        } else {
            System.out.println("Nor 1 or 2");
        }

        int switchValue = 1;

        switch (switchValue) {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            default:
                System.out.println("Value is not 1 or 2 ");
                break;
        }


    }
}
