package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		//utilizando dos tablas de tamaño 5x9 y 9x5, cargar la primera y trasponerla en la segunda.

		int a[][],b[][];
		int i,j;
		Scanner sc= new Scanner(System.in);

		a=new int[5][9];
		b=new int[9][5];
		
		for(i=0;i<5;i++)
		{
			for(j=0;j<9;j++)
			{
				//System.out.println("Elemento ["+i+"]["+j+"]: ");
				//a[i][j]=sc.nextInt();
				//para evitar tener que introducir 45 numeros a mano hacemos lo siguiente
				a[i][j]=10*i+j;
				
			}
		}
		
		//trasponemos
		
		for(i=0;i<5;i++)
		{
			for(j=0;j<9;j++)
			{
				b[j][i]=a[i][j];
			}
		}
		
		// mostramos la matriz traspuesta
		System.out.println("Matriz traspuesta");
		
		for(i=0;i<9;i++)
		{
			for(j=0;j<5;j++)
			{
				System.out.print(b[i][j]+", "); 
			}
		}
	}

}
