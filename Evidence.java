/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.jednoduchyprojekt;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author marti
 */
public class Evidence {
    private Databaze databaze = new Databaze();
    private Scanner sc = new Scanner(System.in, "Windows-1250");
    private String jmeno, prijmeni, telefon, vek, pokracovat;

    public void vypisUvodniObrazovku() {
        System.out.println("\n\n----------------------------------------------------");
        System.out.println("Evidence pojištěných");
        System.out.println("----------------------------------------------------\n");
        System.out.println("Vyberte si akci:");
        System.out.println("1 - Přidat nového pojištěného");
        System.out.println("2 - Vypsat všechny pojištěné");
        System.out.println("3 - Vyhledat pojištěného");
        System.out.println("4 - Konec");
    }
    
    public void pridejZaznam() {
        System.out.println("Zadejte jméno pojištěného:");
        jmeno = sc.nextLine().trim().toLowerCase();
        System.out.println("Zadejte příjmení pojištěného:");
        prijmeni = sc.nextLine().trim().toLowerCase();
        System.out.println("Zadejte telefon pojištěného:");
        telefon = sc.nextLine().trim();
        System.out.println("Zadejte věk pojištěného:");
        vek = sc.nextLine().trim();
        databaze.pridejZaznam(jmeno, prijmeni, databaze.validaceCisla(telefon), databaze.validaceVeku(vek));
        System.out.print("\nZáznam byl uložen. Pokračujte libovolnou klávesou...");
        pokracovat = sc.nextLine();
    }

    public void vypisZaznamy() {
        ArrayList<Pojistenec> seznamPojistencu = databaze.najdiZaznamy(); 
        if (!seznamPojistencu.isEmpty()) {
            for (Pojistenec p : seznamPojistencu) {
                System.out.print(p); 
            } 
        } 
        else {
            System.out.println("Nebyly nalezeny žádné záznamy.");
        }
        System.out.print("\nPokračujte libovolnou klávesou...");
        pokracovat = sc.nextLine(); 
    }
    
    public void vyhledejZaznamy() {
        System.out.println("Zadejte jméno pojištěného:");
        String hledatJmeno = sc.nextLine().trim().toLowerCase();
        System.out.println("Zadejte příjmení:");      
        String hledatPrijmeni = sc.nextLine().trim().toLowerCase();
        ArrayList<Pojistenec> seznamPojistencu = databaze.najdiZaznamy();
        System.out.println("");
        String vysledekHledani = "";
        for (Pojistenec p : seznamPojistencu) {
            if ((p.getJmeno().equals(hledatJmeno)) && (p.getPrijmeni().equals(hledatPrijmeni))) {
                vysledekHledani += p + "\n";
            }
        }
        System.out.print(vysledekHledani);
        if (vysledekHledani.isEmpty()) System.out.println("Nebyly nalezeny žádné záznamy.\n");
        
        System.out.print("Pokračujte libovolnou klávesou...");
        pokracovat = sc.nextLine();
    }
    
}
