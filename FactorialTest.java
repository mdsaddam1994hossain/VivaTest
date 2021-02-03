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
public class FactorialTest {

    public static void main(String[] args) {

        System.out.print("please Enter a Integer number :");
        
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int result = fact(number);
        System.out.println("factorial is ="+result);
    }

    static int fact(int n) {

        if (n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }

    }
}
