import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static Scanner scanner = new Scanner(System.in);
 public static void main(String[] args){
//factorial();

salariosMax();
//divisibleTres();

 }   
public static void factorial(){
    System.out.println("por favor ingrese un número entero");
    int entero = scanner.nextInt();
    int counter = 1;
    int factorial = 1;
    while (counter<=entero) {
    System.out.println(counter+"X"+(counter+1)+" = "+factorial*counter);
    factorial *= counter;
    counter++;    
   
    }
    System.out.println("el factorial de "+entero+" es "+factorial);
}

public static void salariosMax(){
float salarioAlto = 0;
String trabajadorAlto ="nadie";
float salarioBajo =1000000000000000.0f;
String trabajadorBajo="nadie";
char centinela='y';
do{

    System.out.println("por favor ingrese el trabajador");
    String tempNombre = scanner.nextLine();

    System.out.println("por favor ingrese el salario");
    float tempSalario= scanner.nextFloat();
    if (tempSalario>salarioAlto){
      salarioAlto=tempSalario;
      trabajadorAlto=tempNombre;
    }
    if (tempSalario<salarioBajo) {
      salarioBajo=tempSalario;
      trabajadorBajo=tempNombre;
      
    }
    System.out.println("el trabajador "+trabajadorAlto+" tiene el salario más alto con "+salarioAlto);
    System.out.println("el trabajador "+trabajadorBajo+" tiene el salario más bajo con "+salarioBajo);
    

    System.out.println(" ingrese Y, si desea añadir un trabajador y salario, otro caracter si desea terminar la adición");
    centinela= scanner.next().charAt(0);    
    scanner.nextLine();
   
}
while (centinela=='Y'||centinela=='y');
System.out.println("finalizado");
}

public static void divisibleTres(){
  for (int i = 1; i < 101; i++) {
    if (i%3==0) {
        System.err.println(i);
    }
  }  
} 
public static void calificaciones(){

}

public static void fibonacci(){

}

public static void salariosRango(){

}
}
