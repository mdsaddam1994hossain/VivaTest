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
public class FindMaxNumber {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a 5 number : ");
        int[] number = new int[5];
        for (int i = 0; i <number.length ; i++) {
            number[i] = input.nextInt();
        }
        
        // supose 0 number index value is max number
        
        int maxNumber = number[0];
        
        for (int i = 0; i < number.length; i++) {
            if(maxNumber < number[i]){
                maxNumber = number[i];
            }
        }
        System.out.println("Max number is " + maxNumber);
    }
}
