package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//Crear y cargar una tabla de tamaño 4x4 y decir si es simetrica o no, es decir si se obtiene la 
		//misma tabla al cambiar las filas por columnas


		int t[][]= new int[4][4];
		boolean simetrica;
		Scanner sc = new Scanner(System.in);
		int i,j;

		for(i=0;i<4;i++)
		{
			for(j=0;j<4;j++)
			{
				System.out.println("Introduzca elemento ["+i+"]["+j+"]:");
				t[i][j]=sc.nextInt();
			}
		}

		simetrica = true;
		for (i=0;i<4;i++)
		{
			for(j=0;j<i;j++)
			{
				if (t[i][j]!=t[j][i])
				{
					simetrica=false;
				}
			}
		}
		if(simetrica)
			System.out.println("Es simetrica");
		
		else
			System.out.println("no es simetrica");

	}

}
