/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubio;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Rubio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1-Precticar
        //2-Salir
        int opcion=EntradaSalida.mostrarMenu();
        
        while(opcion!=2)
        {
            
            int n_operaciones=EntradaSalida.preguntarNumeroOperaciones();
            int puntuacion=0;
            for(int contador=0; contador<n_operaciones; contador++)
            {
                
                int x=(int)(Math.random()*10);
                int y=(int)(Math.random()*10);
                int respuesta_usuario=EntradaSalida.mostrarOperacion(x, y);
                if(respuesta_usuario==x*y)
                {
                    puntuacion=puntuacion+1;
                    //puntuacion++;
                    System.out.println("Enhorabuena");
                }
                else
                {
                    System.out.println("Error");
                }
//EntradaSalida.mostrarMultiplicacion(x, y);
            }
            //NombreClase.metodo();->Estático
            //nombre_objeto.metodo();->No estático
            System.out.println("Has tenido "+puntuacion+" aciertos");
            
            opcion=EntradaSalida.mostrarMenu();
        }
    }
    
}
