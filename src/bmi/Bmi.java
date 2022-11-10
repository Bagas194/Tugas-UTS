/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi;

import java.util.Scanner;
public class Bmi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int berat;
        double tinggi;
        double bmi;
        
        System.out.println("masukkan berat :");
        berat = input.nextInt();
        System.out.println("Msukkann Tinggi :");
        tinggi = input.nextDouble();
        tinggi/=100;
        bmi= berat/(tinggi*tinggi);
        System.out.println("Bmi mu adalah "+ bmi);
        
        if(bmi<18.5){
            System.out.println("kurang berat badan");
        }
        else if(bmi<24.9){
            System.out.println("normal");
        }
        else if(bmi<28.9){
            System.out.println("gemuk");
        }
        else {
            system.out.println("obesitas");
        }
    }
    
}
