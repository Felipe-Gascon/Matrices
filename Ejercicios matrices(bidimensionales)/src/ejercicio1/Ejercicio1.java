package ejercicio1;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Crear una tabla bidimensional de tamaño 5x5 y rellenarla de la siguiente forma: la posición T[n,m]
		//debe contener n+m. Después se debe mostrar su contenido.

		int t[][]= new int[5][5]; //cramos la matriz de 5x5

		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				t[i][j]=i+j;
			}
		}

		System.out.println("Tabla:");

		for ( int i = 0; i<5; i++) //recorro la matriz para que me la muestre de forma como si la escribiese
		{
			for(int j = 0; j < 5; j++)
			{
				System.out.print(t[i][j]+", ");
			}
		}
	}

}
