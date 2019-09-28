package com.company;
import java.util.Scanner;
public class Array {
    private int n;
    private int x[];
    //Exception
    Array(int n) throws Exception {
        if (n <= 0) throw new Exception(new String("Unsupported number of elements!"));
        this.n = n;
        this.x = new int[this.n];
    }
    //Randomizer
    void randInput(long min, long max) {
        for (int i = 0; i < n; i++) {
            x[i] = (int) (Math.random() * ++max + min);
        }
    }
    //Keyboard input
    void KeyboardInput(){
        System.out.println("Your Massive: ");
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            x[i] = in.nextInt();
        }
    }
    //RL
    void OutputRightoLefto() {
        System.out.println("(Massive output from right to left)");
        for (int i = n-1; i >= 0; i--) {
            System.out.println(x[i]);
        }
    }
    //LR
    void OutputLefoRighto() {
        System.out.println("(Massive output from left to right )");
        for (int i:x) {
            System.out.println(i);
        }
    }
    //Finder
    void find(long z) {
        int ind = -1;
        for ( int i = 0; i < n; i++) {
            if (x[i]==z) {
                ind = i;
                break;
            }
        }
        if ( ind == -1)
            System.out.println("Number " + z + " is absent.");
        else
            System.out.println("Number " + z + " is here!. It's index is = " + ind);
    }
    //Swap
    void Swap(int first, int second){
        int hi = x[first];
        x[first] = x[second];
        x[second] = hi;
    }
    //Bubble
    void bubble() {
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (x[j] > x[j + 1])
                    Swap(j, j + 1);
            }
        }
    }
}
