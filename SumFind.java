/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vivatest;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class SumFind {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
         System.out.println("please input  5 number for sum ");
     
        
        int[] n = new int[5];
        for (int i = 0; i < n.length; i++) {
            n[i] = input.nextInt();
        }
        int sum =0;
        
        for (int i = 0; i < 5; i++) {
            sum  +=  n[i];
        }
        System.out.println("sum is "+sum);
    }
}
