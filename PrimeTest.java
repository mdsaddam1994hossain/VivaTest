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
public class PrimeTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a number for testing prime or not prime ");
        int number = input.nextInt();
        boolean isprime = true;
        for(int i=2;i<number;i++){
            if(number % i == 0){
                isprime = false;
                break;
            }}
            if(isprime == true){
                System.out.println(number +" this is prime number");
            }else
                System.out.println(number +" this is not prime number");
    }
}
