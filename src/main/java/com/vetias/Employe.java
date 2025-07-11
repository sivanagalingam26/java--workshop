package com.vetias;


import java.util.Arrays;

public class Employe {
    public static void main(String[] args) {
        String[][] employes = new String[10][2];
        employes [0][0]="siva";
        employes [0][1]="2056";
        employes [1][0]="hari";
        employes [1][1]="2057";
        employes [2][0]="haran";
        employes [2][1]="2058";
        for(String[] employee : employes) {
            System.out.println(Arrays.toString(employee));
        } 
    }

}
