package tarea4;
import java.util.Scanner;
public class Calculadora_Flotantes {
	public static void main (String []args) {
	Scanner texto = new Scanner(System.in);
	
	//IMPRIMIR Y LEER
	System.out.println("Escribe un numero");
	float numero1 = texto.nextFloat();
	System.out.println("Escribe otro numero");
	float numero2 = texto.nextFloat();
	
	//LLAMAR A LAS CLASES
	ClaseSuma sumita = new ClaseSuma(); 
	ClaseResta restita = new ClaseResta();
	ClaseMultiplicacion multiplicacioncita = new ClaseMultiplicacion ();
	ClaseDivisionsota Divicioncita = new ClaseDivisionsota ();
	
	//RESULADOS UTILIZANDO LAS CLASES Y MANDANDO A TRAER LOS METODOS JEJE
	float rSuma = sumita.sumador (numero1, numero2);
	System.out.println("La suma de " + numero1 + " y " + numero2 + " es " + rSuma) ;
	float rResta = restita.restador (numero1, numero2);
	System.out.println("La resta de " + numero1 + " y "+ numero2 + " es " + rResta) ;
	float rMultiplicacion = multiplicacioncita.multiplicador (numero1, numero2);
	System.out.println("La multiplicacion de " + numero1 + " y "+ numero2 + " es " + rMultiplicacion) ;
	float Rdivision = Divicioncita.divisor (numero1, numero2);
	System.out.println("La division de " + numero1 + " y "+ numero2 + " es " + Rdivision) ;
	}
}
