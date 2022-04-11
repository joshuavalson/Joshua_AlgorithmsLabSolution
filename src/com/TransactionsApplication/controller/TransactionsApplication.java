package com.TransactionsApplication.controller;

import java.util.Scanner;

public class TransactionsApplication {
    public static void main(String[] args) {
        System.out.println("\n Hello and welcome to PayMoney Transaction Counter.. ");

        Scanner sc = new Scanner(System.in);

        System.out.println("\n Enter the size of transation array :");

        int size = sc.nextInt();
        int[] transactions = new int[size];

        System.out.println("\n Enter the values of Array : ");

        for(int i =0; i< size;i++){
            transactions[i]=sc.nextInt();
        }
        
        System.out.println("\n Enter the total number of targets that needs to be achieved:");

        int numOfTargets = sc.nextInt();

        while(numOfTargets--!=0){
            int flag = 0;
            int target;


            System.out.println("\n Enter the value of Target:");
            target = sc.nextInt();
            int sum = 0;
            for(int i = 0; i<size;i++){
                sum += transactions[i];
                if(sum>target){
                    System.out.println("\n Target achieved in "+ (i+1)+" transactions.");
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                System.out.println("\n Given target is not achieved.");
            }
        }
        sc.close();
    }
}
