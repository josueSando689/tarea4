package tarea4;
import java.util.Scanner;

public class Promedio2Clase {
	
	public static void main(String[] args) {
	Scanner texto = new Scanner(System.in);
	System.out.println("Escribe un primer numero");
	double numero1 = texto.nextDouble();
	System.out.println("Escribe un segundo numero");
	double numero2 = texto.nextDouble();
	System.out.println("Escribe un tercer numero");
	double numero3 = texto.nextDouble();
	System.out.println("Escribe un cuarto numero");
	double numero4 = texto.nextDouble();
	System.out.println("Escribe un quinto numero");
	double numero5 = texto.nextDouble();
	System.out.println("Escribe un sexto numero");
	double numero6 = texto.nextDouble();
	
	//LLAMAR A LAS CLASES
	Promedio PromedioTotal = new Promedio(); 
	
	
	//RESULADOS UTILIZANDO LAS CLASES Y MANDANDO A TRAER LOS METODOS JEJE
	double rPromedio = PromedioTotal.algo (numero1, numero2,numero3,numero4,numero5,numero6);
	System.out.println("El promedio de esos numeros es" + rPromedio);
 }
	
}
