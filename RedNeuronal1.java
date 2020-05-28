/*
 * Diseñe un algoritmo que le permita: 
1). Desplegar el nombre del proyecto de su paper.
2). Que es una red neuronal.
3). Cuales son los elementos que forman una red neuronal.
4). Como utilizaron la red neuronal en el proyecto que usted ha seleccionado.
5). Como utilizaria usted la red neuronal como mejoramiento al proyecto propuesto.
6). En qué consisióe el entrenamiento utilizando la red neuronal, e indique 
el algoritmo utilizado.

 */
package redneuronal1;

/**
 *
 * @author Alex
 */
import java.util.Scanner;
public class RedNeuronal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner objeto=new Scanner (System.in);
        System.out.println("Ingrese el nombre de su proyecto:");
        String nombreproyecto=objeto.nextLine();
        
        System.out.println("¿Qué es una red neuronal?");
        String redneuronal=objeto.nextLine();
        
        System.out.println("¿Cuales son los elementos que forman una red neuronal?");
        String elementos=objeto.nextLine();
        
        System.out.println("¿Como utilizaron la red neuronal en el proyecto que usted ha seleccionado?");
        String usoredneuronal=objeto.nextLine();
        
        System.out.println("¿Como utilizaria usted la red neuronal como mejoramiento al proyecto propuesto?");
        String comomejoraria=objeto.nextLine();
        
        System.out.println("¿En qué consistió el entrenamiento utilizando la red neuronal, e indique \n" +
"el algoritmo utilizado?");
        String entrenamiento=objeto.nextLine();
        
        
    }
    
}
