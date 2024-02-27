import java.util.Scanner;

public class Ex5 {
	
	public static void main(String[] args) {
		
		double nota [][] = new double [3][4];
		
		//   l  c
		nota[0][0] = 10.0;
		nota[0][1] = 7.0;
		nota[0][2] = 9.0;		
		nota[0][3] = 9.5;		
		
		nota[1][0] = 9.0;		
		nota[1][1] = 8.0;	
		nota[1][2] = 7.0;		
		nota[1][3] = 9.0;	
		
		nota[2][0] = 8.0;		
		nota[2][1] = 9.0;	
		nota[2][2] = 10.0;		
		nota[2][3] = 7.9;	
		
		for (int i=0; i<3;i++) {
			System.out.print("Aluno " + (i+1) + " Notas: ");
			for(int j=0; j<4;j++) {
				System.out.print(j == 3 ? nota[i][j] : nota[i][j] + " ; ");
				
			}
			System.out.println();
		}
		
	}
}
