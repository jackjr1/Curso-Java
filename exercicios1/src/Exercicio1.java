import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int x, y, tot;
		
		System.out.println("Digite o valor de X: ");
		x = sc.nextInt();
		System.out.println("Digite o valor de Y: ");
		y = sc.nextInt();
		
		tot = x + y;
		
		System.out.println("X mais Y = " + tot);
		
		
		sc.close();
		
 	}

}
