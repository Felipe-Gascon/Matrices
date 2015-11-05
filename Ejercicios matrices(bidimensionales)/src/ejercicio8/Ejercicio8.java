package ejercicio8;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Crear una matriz “marco” de tamaño 8x6: todos sus elementos deben ser 0 salvo los de los bordes que
		//deben ser 1. Mostrarla

		int t[][]=new int [8][6];
		int i,j;
		for(i=0;i<8;i++)
		{
			for(j=0;j<6;j++)
			{
				if(i==0||i==7)
				{
					t[i][j]=1;
				}
				if(j==0||j==5)
				{
					t[i][j]=1;
				}
			}

			System.out.println("Matriz marco: ");

			for(i=0;i<8;i++)
			{
				for(j=0;j<6;j++)
				{
					System.out.print(t[i][j]+", "); 
				}
			}



		}
	}

}