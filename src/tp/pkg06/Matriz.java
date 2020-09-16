
package tp.pkg06;


public class Matriz {
    
    private int matriz [][] = { {3,6,9,12},{15,18,21},{24,27,30,33,36},{39,42} };
       
    public void armar(){
        System.out.println("La Matriz es: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {               
                    System.out.print(matriz[i][j]+"");                   
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
