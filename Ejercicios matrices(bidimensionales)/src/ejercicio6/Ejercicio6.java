package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//Crear y cargar una tabla de tamaño 4x4, mostrar la suma de cada fila y de cada columna.

		int t[][]= new int[4][4];
		int suma_fila,suma_col;
		int i,j;
		final int tamaño=4;
		Scanner sc=new Scanner(System.in);
		t=new int[tamaño][tamaño];

		for(i=0;i<tamaño;i++)
		{
			for(j=0;j<tamaño;j++)
			{
				System.out.print("Elemento ["+i+"]["+j+"]: ");
				t[i][j]=sc.nextInt();
			}
		}

		//sumamos fila a fila

		for(i=0;i<tamaño;i++)
		{
			suma_fila=0;
			for(j=0;j<tamaño;j++)
			{
				suma_fila=suma_fila+t[i][j];
			}
			System.out.println("Fila"+" "+i+": "+" "+suma_fila);
		}


		//sumamos columna a columna
		for(j=0;j<tamaño;j++)
		{
			suma_col=0;
			for(i=0;i<tamaño;i++) 
			{
				suma_col=suma_col+t[i][j];
			}
			System.out.println("Columna"+" "+j+": "+" "+suma_col);
		}
	}

}
