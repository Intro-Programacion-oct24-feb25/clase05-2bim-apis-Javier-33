/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete05;

/**
 *
 * @author reroes
 */
public class DatoFinal {
    
    public static double obtenerPromedio(double[] n){
        
        double suma = 0;
        double promedio;
        
        for (int i = 0; i < n.length; i++) {
            suma = suma + n[i];
        }
        
        promedio = suma / n.length;
        return promedio;
    }
    public static double obtenerMejorNota(double[] a){
        double mayor = a[0];
        for(int i = 0; i < a.length; i++){
            if(mayor < a[i]){
                mayor = a[i];
            }
            
        }
        /*
        if(n[0] > n[1] && n[0]> n[2] && n[0] > n[3]){
            mayor = n[0];
        }else{
            if(n[1] > n[0] && n[1]> n[2] && n[1] > n[3]){
                mayor = n[1];
            }else{
                if(n[2] > n[0] && n[2]> n[1] && n[2] > n[3]){
                    mayor = n[2];
                }else{
                    if(n[3] > n[0] && n[3]> n[1] && n[3] > n[2]){
                        mayor = n[3];
                    }
                }
            }
        }
        */
        return mayor;
    }
}
