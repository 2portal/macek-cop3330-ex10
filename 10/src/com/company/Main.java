package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        final double taxpercent = 0.055;
        System.out.print("Enter the price of Item 1:");
        Scanner ainput = new Scanner (System.in);
        String aItem = ainput.next();
        float Itemone = Integer.parseInt(aItem);

        System.out.print("Enter the quantity of Item 1:");
        Scanner qainput = new Scanner (System.in);
        String anum = qainput.next();
        float numone = Integer.parseInt(anum);


        System.out.print("Enter the price of Item 1:");
        Scanner binput = new Scanner (System.in);
        String bItem = binput.next();
        float Itemtwo = Integer.parseInt(bItem);

        System.out.print("Enter the quantity of Item 1:");
        Scanner qbinput = new Scanner (System.in);
        String bnum = qbinput.next();
        float numtwo = Integer.parseInt(bnum);


        System.out.print("Enter the price of Item 1:");
        Scanner cinput = new Scanner (System.in);
        String cItem = cinput.next();
        float Itemthree = Integer.parseInt(cItem);

        System.out.print("Enter the quantity of Item 3:");
        Scanner qcinput = new Scanner (System.in);
        String cnum = qcinput.next();
        float numthree = Integer.parseInt(cnum);

        float subtotal =((Itemone*numone)+(Itemtwo*numtwo)+(Itemthree*numthree));
        double tax= subtotal*taxpercent;
        double total =(subtotal+tax);
        System.out.print("Subtotal: $"+subtotal+"\n");
        System.out.print("Tax: $"+tax+"\n");
        System.out.print("Total: $"+total+"\n");

    }
}
