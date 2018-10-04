package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter money:");
        double money = scanner.nextDouble();
        System.out.println("Enter month:");
        int month = scanner.nextInt();
        System.out.println("Enter interset_rate:");
        double interset = scanner.nextDouble();
        int i;
        double total_interset = 0;
        for(i=0;i<month;i++){
            total_interset = money*(interset/100)/12*month;
        }
        System.out.println("Total Interset:"+total_interset);
    }
}
