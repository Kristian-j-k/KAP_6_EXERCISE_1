package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for (int x = 1; x <= 10; x++){
            for (int y = 1; y <= 10; y++){
                System.out.printf("%4d", x*y);
            }
            System.out.println();
        }

    }
}
