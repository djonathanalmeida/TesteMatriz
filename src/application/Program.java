package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	
		int[][] m = new int[n][n];
		
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++) {
				m[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Números na diagonal: ");
		for(int i=0; i<n; i++) {
			System.out.print(m[i][i] + " ");
		}
		
		int cont = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(m[i][j] < 0){
					cont++;
				}
			}
			
		}
		
		System.out.print("Quantidade de números negativos: "+ cont);
		
		sc.close();

	}

}
