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
public class MinNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input 5 number for find min number : ");
        int[] number = new int[5];
        
        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextInt();
        }
        // supose 0 number index value is min number
        
        int minNumber = number[0];
        for (int i = 0; i < number.length; i++) {
            if(minNumber > number[i]){
                minNumber = number[i];
            }
        }
        
        System.out.println("Min Number is "+ minNumber);
    }
}
