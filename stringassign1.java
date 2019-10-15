package com.assignment;

import java.util.*;
import java.util.Arrays;
import java.util.Scanner;


class stringassign1 {
    Scanner sc = new Scanner(System.in);
    static {
        System.out.println("Press 1 to Create a java program to sort an array of strings.");
        System.out.println("Press 2 to Create a java program that will search for an element in an array of strings.");
        System.out.println(
                "Press 3 to Create a java program that will subtract string array arr2 from string array arr1 and print the result.");
        System.out.println(
                "Press 4 to Create a java program to reverse the elements in a numeric array and print the original and the reversed array.");
    }

    public void fun1() {
        System.out.println("How many strings you want to sort?");
        int len = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[len];
        for (int k = 0; k < len; k++) {
            System.out.printf("Please enter String %d\n", k+1);
            arr[k] = sc.nextLine();
        }
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len - 1; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("The strings you Enterd in sorted order");
        System.out.print("[");
        for (int i = 0; i < len-1; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.print(arr[len-1]+"]\n");
    }



    public void fun2() {
        System.out.println("List of Wild animals\n");
        String[] data = {"Lion","Monkey","Panda","Shark","Zebra","Gorilla","Walrus","Leopard","Wolf"};
        for (String s : data) {System.out.print(s+" ");}
        System.out.println("Enter the animal name You have to find");
        String a=sc.nextLine();
        for(String s: data){if(s.equalsIgnoreCase(a)) System.out.printf("Yay! %s is a wild animal\n",a);return;}
        System.out.printf("Whoops! %s is a not wild animal\n",a);
    }



    public void fun3() {
        sc.nextLine();
        System.out.println("List of Wild animals");
        String[] data = {"Lion","Monkey","Panda","Shark","Zebra","Gorilla","Walrus","Leopard","Wolf"};
        for (String s : data) {System.out.println(s+" ");}
        System.out.println("Enter the animals name You have to remove");
        String a=sc.nextLine();
        String[] input=a.split(" ");
        int len=data.length-input.length;
        String[] output=new String[len];
        int i=0;
        for (String s : data){
            boolean x=true;
            loop1:
            for (String c : input){
                if(s.equalsIgnoreCase(c)) x=false;break loop1;
            }
            if(x){output[i]=s;i++;}
        }
        for (String p : output) {System.out.print(p+" ");}
        System.out.println("\n");
    }




    public void fun4() {
        System.out.println("Enter Array length you need to reverse");
        int len=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter "+ len +" Elements with spaces inbetween");
        String data=sc.nextLine();
        String[] output=data.split(" ");
        System.out.print("[");
        for(int i=output.length-1 ; i>0;i++){
            System.out.print(output[i]+" ");
        }
        System.out.print(output[0]+"]\n");
    }

    public static void main(String args[]) {
        stringassign1 s = new stringassign1();
        int input = s.sc.nextInt();
        s.sc.nextLine();
        switch (input) {
        case 1:
            s.fun1();
            break;
        case 2:
            s.fun2();
            break;
        case 3:
            s.fun3();
            break;
        case 4:
            s.fun4();
            break;
        default:
            System.out.println("Please enter a valid input");
        }
    }

}