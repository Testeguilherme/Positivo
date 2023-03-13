package VetorEMatrizes;

import java.util.Scanner;

public class VetorExer04 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite 10 numeros:");
		int vetor[] = new int[10];
		int vetor2[] = new int[10];
		int flag = 0;
		int a = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = scanner.nextInt();
		} 
		
		for(int i=0; i<10; i++){
	        for(int j=0; j<10; j++){

	            flag=0;
	            if(vetor[i]==vetor[j] && i != j){
	            	
	                for(int w=0; w<10; w++){
	                	
	                    if(vetor2[w] == vetor[j])
	                        flag=1;
	                }
	                if(flag==0){
	                	vetor2[a]=vetor[i];
	                    a++;
	                }
	            }
	        }
	     }
		
		for(int i = 0 ; i < a; i++) {
			System.out.println("Numeros que não se repetem: " + vetor2[i] + " | posição: " + i);
		}
			
	}
}
