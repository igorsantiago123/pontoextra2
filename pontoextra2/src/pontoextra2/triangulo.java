package pontoextra2;
import java.util.Scanner;

public class triangulo {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int ladoA, ladoB, ladoC;
		
        System.out.println("Entre com os lados do triângulo /n Lembrando que Para que uma forma seja um triângulo, todos os lados devem ter comprimento > 0, e a soma dos comprimentos de quaisquer dois lados deve ser maior ou igual ao comprimento do terceiro lado.");
        
        System.out.println("Primeiro lado do triângulo:");
        ladoA = ler.nextInt();
		
        System.out.println("Segundo lado do triângulo:");
        ladoB = ler.nextInt();
        
        System.out.println("Terceiro lado do triângulo:");
        ladoC = ler.nextInt();
        
        if( ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB) {
        	
        if(ladoA==ladoB && ladoB == ladoC) {
        	System.out.println("Triângulo Equilatero");
        }
        
        else if(ladoA==ladoB || ladoA==ladoC || ladoB==ladoC) {
        	System.out.println("Triângulo Isósceles");
        }
        
        else 
        	System.out.println("Triângulo Escaleno");
	}
        else{ 
			System.out.print("Os lados fornecidos não caracterizam um triângulo");
		}
	}

}