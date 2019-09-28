package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        TestArray();
    }

    public static void TestArray() {
        int n;
        int num = 0;
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Input the dimension of the massive : ");
            n = in.nextInt();
            Array array = new Array(n);

            while (num != 2 && num != 1) {
                System.out.println("In what way do you want to fill the massive");
                System.out.println("1. With randoms.");
                System.out.println("2. By yourself from keyboard.");
                System.out.print("Chosen number: ");
                num = in.nextInt();
                switch (num) {
                    case 1:
                        array.randInput(10, 150);
                        array.OutputLefoRighto();
                        array.OutputRightoLefto();
                        break;
                    case 2:
                        array.KeyboardInput();
                        array.OutputLefoRighto();
                        array.OutputRightoLefto();
                        break;
                }
            }

            System.out.println("Input a number to find in the massive: ");
            long z = in.nextInt();
            array.find(z);
            System.out.print("Massive sorted by bubble algorithm by increasing : ");
            array.bubble();
            array.OutputLefoRighto();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}