/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.jednoduchyprojekt;

import java.util.Scanner;

/**
 *
 * @author marti
 */
public class Pojistenec {
    private Evidence evidence = new Evidence();
    private String jmeno, prijmeni, telefon, vek, textMezeraJmeno, textMezeraPrijmeni, textMezeraTelefon;
    private int mezeraJmeno, mezeraPrijmeni, mezeraTelefon;
    private Scanner sc = new Scanner(System.in, "Windows-1250");
    
    public Pojistenec(String jmeno, String prijmeni, String telefon, String vek) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.telefon = telefon;
        this.vek = vek;
    }
    
    public String getJmeno() {
        return jmeno;
    }
    
    public String getPrijmeni() {
        return prijmeni;
    }

    @Override
    public String toString() {
        mezeraJmeno = 13 - jmeno.length();
        mezeraPrijmeni = 16 - prijmeni.length();
        mezeraTelefon = 18 - telefon.length();
        textMezeraJmeno = " ";
        textMezeraPrijmeni = " ";
        textMezeraTelefon = " ";
        for(int i = 0; i < mezeraJmeno; i++) {
            textMezeraJmeno += " ";
        }
        for(int i = 0; i < mezeraPrijmeni; i++) {
            textMezeraPrijmeni += " ";
        }
        for(int i = 0; i < mezeraTelefon; i++) {
            textMezeraTelefon += " ";
        }

        String pojisteny = jmeno.substring(0, 1).toUpperCase() + jmeno.substring(1).toLowerCase() + textMezeraJmeno + prijmeni.substring(0, 1).toUpperCase() + prijmeni.substring(1).toLowerCase() + textMezeraPrijmeni + telefon + textMezeraTelefon + vek + "\n";
        return pojisteny;
    }
}
