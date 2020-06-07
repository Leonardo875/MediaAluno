/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediaaluno;
import java.util.Scanner;
public class MediaAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        double n1,n2,media,media2,exame;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite a primeira nota:");
        n1 = entrada.nextDouble();
        System.out.println("Digite a segunda nota:");
        n2 = entrada.nextDouble();
        System.out.println("Digite a nota do exame:");
        exame = entrada.nextDouble();
        
        media = (n1 + n2) / 2;
        media2 = (n1 + n2 + exame)/2;
        
        if (media >=7){
            System.out.println("O aluno foi aprovado sem precisar do exame"+media);
        }
        else{ 
             if(media2 >=5){
                 System.out.println("O aluno foi aprovado com a nota de exame"+media2);
             }
         }
         if(media2<5){
             System.out.println("O aluno não foi aprovado"+media2);
         }
        
                 
                        
                 
                       
                 
    }
    
}
