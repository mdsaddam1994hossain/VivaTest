/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class ArraySorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        System.out.println("Please input 5 number : ");
        int[] numbers = new int[5];
        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        Arrays.sort(numbers);
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("sorting array is "+ numbers[i]);
        }
        
    }
    
}
