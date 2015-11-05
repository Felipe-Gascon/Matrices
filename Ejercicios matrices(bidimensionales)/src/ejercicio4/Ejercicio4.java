package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// crear y cargar una tabla de tamaño 3x3 y trasponerla
		Scanner sc = new Scanner (System.in);
		int t[][]=new int[3][3];
		int aux;
		int i,j;
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print("Introduzca elemento["+i+"]["+j+"]: ");
				t[i][j]= sc.nextInt();
			}
		}
		
		
		
		//mostramos la matriz original
		System.out.println(("Matriz original: "));
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(t[i][j]+", ");
				
			}
		}
		//trasponemos la matriz
		// no podemos transponer todos los elementos. Un ejemplo el elemento t[1][2]
		// se convierte en el [2][1]... pero cuando transpongamos el elemento [2][1] se convierte
		// en el [1][2]. Al intercambiar dos veces los elemento, la matriz se quedaría exactamente igual.
		
		// solo traspondremos los elementos por debajo de la diagonal principal.
		
		for(i=1;i<3;i++)
		{
			for(j=0;j<i;j++)
			{
				aux=t[i][j];
				t[i][j]=t[j][i];
				t[j][i]=aux;
			}
		}
		
		//Mostramos la matriz transpuesta
		
		System.out.println("-------------------------");
		System.out.println("Matriz transpuesta");
		
		for(i=2;i>=0;i--)
		{
			for( j=0;j<3;j++)
			{
				System.out.print(t[i][j]+", ");
			}
		
		}
	}

}
