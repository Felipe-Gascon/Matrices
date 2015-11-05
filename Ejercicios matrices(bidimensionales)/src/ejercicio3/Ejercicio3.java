package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//Crear y cargar dos matrices de tamaño 3x3, sumarlas y mostrar su suma
		int a[][], b[][], suma[][];
		int i, j;

		a= new int [3][3];
		b= new int [3][3]; 
		Scanner sc = new Scanner(System.in);

		//Leemos los datos
		System.out.println("Matriz A: ");
		for (i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print("A["+i+"] ["+j+"]: ");
				a[i][j]=sc.nextInt();

			}
		}
		
		System.out.println("Matriz B: ");
		
		for (i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print("B["+i+"] ["+j+"]: ");
				b[i][j]=sc.nextInt();

			}
		}
		
		//hacemos la suma
		
		suma = new int[3][3];
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				suma[i][j]=a[i][j]+b[i][j];
			}
		}
		
		
		//Mostramos el resultado
		System.out.println("Matriz suma:");
		
		for(i=0;i<3;i++)
		{
			for (j=0;j<3;j++)
			{
				System.out.println((suma[i][j]+" "));
			}
		}
		System.out.println();
	}
}
