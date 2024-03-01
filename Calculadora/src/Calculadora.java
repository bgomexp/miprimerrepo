
public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int resultado=0;
		resultado=Sumatorio(4);
		System.out.println("SUMATORIO : "+resultado);
	}//fin main
	
	//Método que toma dos enteros como parámetros y los suma.
	public static int sumar(int a, int b){
		return a+b;
	}
	
	//Método que toma dos enteros como parámetros y resta el segundo al primero.
	public static int restar(int a, int b){
		return a-b;
	}
	
	//Método que toma dos enteros como parámetros y los multiplica.
	public static int multiplicar(int a, int b){
		return a*b;
	}
	
	//Método que toma dos enteros como parámetros y divide el primero entre el segundo. 
	public static int dividir(int a, int b){
		return a/b;
	}
	
	//Método que toma un entero como parámetro y devuelve su sumatorio.
	public static int Sumatorio(int numero){
		int sumatorio = 0;	 
			
		while(numero > 0){
		   sumatorio = sumatorio + numero;
		   numero--;
		} 
		 
		return sumatorio;
	}
	
	//Método que toma un entero como parámetro y devuelve su factorial.
	public static int Factorial(int numero){
		int factorial = 1;	 
			
		while(numero > 0){
		   factorial = factorial * numero;
		   numero--;
		} 
		 
		return factorial;
	}

}  //fin clase Calculadora



