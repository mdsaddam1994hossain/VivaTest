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
public class Plindromic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a word for test plindromic : ");
        String word = input.nextLine();
        int low =0;
        int heigh = word.length() - 1;
        boolean isplandromic = true;
        while(low < heigh){
                if(word.charAt(low) != word.charAt(heigh)){
                    isplandromic = false;
                    break;
                }low++;
                heigh--;
        }
        if(isplandromic == true){
            System.out.println("this is palindromic ");
        }else{
        System.out.println("this is not palindromic ");
        }
    }
            
}
