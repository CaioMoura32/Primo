package Programa;


import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
    
        Scanner ler = new Scanner(System.in); 

            
         int[] numero = new int[10];

         for (int i = 0; i < 10; i++){

             System.out.printf("Digite um numero inteiro %d : "    ,(i+1));
             numero[i] = ler.nextInt();
             ler.nextLine();
             System.out.println("\n----------------------------------\n");
         }
         for (int i = 0; i < 10; i++){
             boolean primo = true;
             for (int j= 2; j < numero[i]; j++){
                 if (numero[i] % j == 0) {
                     primo = false;
                     break;
                 }
             }
            if (primo == true){
                
                System.out.println("O numero " + numero[i] + "  Primo");
                System.out.println("--------------------------\n");
            }else
            if(primo == false){
                
                System.out.println("O numero " + numero[i] + "  Inteiro");
                System.out.println("--------------------------\n"); 
            }
        }
         ler.close();



    }
}

