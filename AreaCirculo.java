package tarea4;
import java.util.Scanner;
public class AreaCirculo {

	    public static double Circulo(double radio) {
	        double area = Math.PI * Math.pow(radio, 2);
	        return area;
	    }

	    public static void main(String[] args) {
	    	Scanner texto = new Scanner(System.in);
	    	System.out.println("Escribe el radio del circulo");
	    	double radio = texto.nextFloat();
	        double area = Circulo(radio);

	        System.out.println("La bendita area del circulo es: " + area);
	    }
	}
