/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.estructurasdedatosclase02;

/**
 *
 * @author SALA H
 */
public class ESTRUCTURASDEDATOSClase02 {

    public static void main(String[] args) {
        Metodos_Archivos obj = new Metodos_Archivos();
        int opc;
        do{
            opc = obj.menu();
            switch (opc) {
                case 1 -> obj.ingresar();
                case 2 -> obj.presentar();
                default ->{
            }
        }
            
        }while(opc != 0);
    }
}
