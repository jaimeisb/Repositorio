import java.util.Scanner;


public class numeros {

	private static Scanner s;

	public static void main(String[] args) {
		int a=0;
		System.out.println("Ingrese un numero:");
		s = new Scanner(System.in);
		a=s.nextInt();
			if(a%2==0)
				System.out.println("El numero es par");
			else
				System.out.println("El numero es impar");
		}

}
