/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.jednoduchyprojekt;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author marti
 */
public class Databaze {
    
    private ArrayList<Pojistenec> seznamPojistencu = new ArrayList<>();
    private ArrayList<String> validaceCisla = new ArrayList<>();
    private ArrayList<Integer> delkaJmen = new ArrayList<>();
    private String [] validaceCislaPole;
    private String cisla, doplneniCisla = "";
    private int delkaCisla;

    public void pridejZaznam(String jmeno, String prijmeni, String telefon, String vek) {
        seznamPojistencu.add(new Pojistenec(jmeno, prijmeni, telefon, vek));
    }
    
    public ArrayList<Pojistenec> najdiZaznamy() {
        return seznamPojistencu;
    }
    
    public String validaceCisla(String telefon) {
        validaceCislaPole = new String [telefon.length()];
        validaceCislaPole = telefon.split("");
        validaceCisla.addAll(Arrays.asList(validaceCislaPole));
        telefon = "";
        cisla = "0123456789";
        for(String c : validaceCisla) {
            if ((!c.isBlank()) && (cisla.contains(c))) {
                telefon += c;
            }
        }
        if(telefon.length() < 9) {
            delkaCisla = telefon.length();
            for(int i = delkaCisla; i < 9; i++) {
                doplneniCisla += "0";
            }
            telefon = doplneniCisla + telefon;
        }
        telefon = telefon.substring(telefon.length() - 9, telefon.length());
        return telefon;
    }
    
    public String validaceVeku(String vek) {
        if(vek.length() < 2) {
            vek = "0" + vek;
        }
        return vek;
    }
}
