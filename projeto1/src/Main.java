import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		int y = 32;
		double x = 1.54658;
		
		
		System.out.println("Olá Mundo!");
		System.out.println("Bom Dia!");
		System.out.println(y);
		System.out.printf("%.2f\n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f\n", x);
		System.out.println("resultado = " + x + "metros\n");
		System.out.printf("O valor de %d é maior que o valor de %f", y, x);

	}

}
