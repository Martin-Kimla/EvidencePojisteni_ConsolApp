/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cz.itnetwork.jednoduchyprojekt;

import java.util.Scanner;


/**
 *
 * @author martin kimla
 */
public class JednoduchyProjekt {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in, "Windows-1250");
        
        Evidence evidence = new Evidence();
        String volba;
        
        do {
            evidence.vypisUvodniObrazovku();
            volba = sc.nextLine();
            System.out.println("");
            
            switch (volba) {
                case "1" -> evidence.pridejZaznam();
                case "2" -> evidence.vypisZaznamy();
                case "3" -> evidence.vyhledejZaznamy();
                case "4" -> System.out.println("Děkuji za použití programu");
                default -> System.out.println("Neplatná volba!");
            } 
        } while (!volba.equals("4"));
    }
}
