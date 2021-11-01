package com.company;

import java.util.*;

public class Main{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        int n = 0;
        for(int i = 0;i < t; i++){
            n = scn.nextInt();


            int count = 0;
            for(int div = 2; div * div <= n; div++){
                if(n % div == 0){
                    count++ ;
                    break;
                }
            }

            if(count ==0){
                System.out.println("prime");
            }
            else{
                System.out.println("not prime");
            }

        }
    }
}