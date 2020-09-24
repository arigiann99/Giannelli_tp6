
package tp.pkg06;


public class Matriz {
    
    //private int matriz [][] = { {3,6,9,12},{15,18,21},{24,27,30,33,36},{39,42} }; // armado de matriz manual
   
    public void armar(){
        
        int matriz [][]=new int[4][]; // armado de matriz con serie de numeros(automatico)
        matriz[0]= new int[4];
        matriz[1]= new int[3];
        matriz[2]= new int[5];
        matriz[3]= new int[2];
        
        int contador = 3;
        
        System.out.println("La Matriz es: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j]=contador;
                    contador += 3; 
                    System.out.print(matriz[i][j]+" ");                   
            }
                System.out.println("");             
        }
        System.out.println("");             
        System.out.println("Numeros Pares de la Matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j]%2==0){
                    System.out.print(matriz[i][j]+" ");   
                }
            }
                System.out.println("");             
        }
    }
}
