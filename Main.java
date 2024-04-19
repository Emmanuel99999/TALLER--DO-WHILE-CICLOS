import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
 public static void main(String[] args){
  System.out.println("ingrese el numero del punto a revisar");
  int opcion =scanner.nextInt();
  
  switch (opcion) {
    case 1:
    factorial();
      break;
    case 2:
    divisibleTres();
    break;

    case 3:
    salariosMax();
    break;

    case 4:
    calificaciones();
    break;

    case 5:
    fibonacci();
    break;

    case 6:
    salariosRango();
    break;

    case 7:
    tablas();
    break;

    case 8:
    parImpar();
    break;
    default:
      break;
  }









 }   
public static void factorial(){
    System.out.println("por favor ingrese un número entero");
    int numero = scanner.nextInt();
    int factorial = 1;
    for (int i = 1; i <= numero; i++) {
      if (i!=numero) {
        System.out.print(i+"x");
        factorial *= i;
      }
      else{
        System.out.print(i);
        factorial *= i;
      }
        }
    System.out.println("="+factorial);
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
  char centinela='y';
 int counter = 0;
    do{
    System.out.println("por favor ingrese una nota");
    float nota = scanner.nextFloat();
    if (nota>=3) {
      counter++;
      System.out.println(" ingrese Y, si desea añadir otra nota, ingrese otro caracter si desea terminar la adición");
      centinela= scanner.next().charAt(0);    
      scanner.nextLine();
    }
       
    }
    while (centinela=='Y'||centinela=='y');
    System.out.println("el total de aprobados es "+counter);
}

public static void fibonacci(){
  int centinela = 0;
  while (centinela==0) {
  System.out.println("por favor ingrese un número mayor que 20 y menor o igual a 30 para ver su componente fibonacci");
  int numero = scanner.nextInt();
  int fibonacci= 0;
  int temp =1;
  if (numero>20&&numero<=30) {
    while (temp<=numero) {
      System.out.print(fibonacci+" "+temp+" ");
      fibonacci+=temp;
      temp+=fibonacci;
    }
    centinela=1;
  }
}
}

public static void salariosRango(){
  System.out.println("ingrese cuantos empleados tiene su empresa");
  int cabezas = scanner.nextInt();
  int categoriaUno=0; //menos de 100.000
  int categoriaDos=0;  // entre 200.001 y 300.000
  int categoriaTres=0; //mas de 300.000
  int contador = 1;
  while (contador<=cabezas) {
    System.out.println("por favor ingrese el salario de el empleado número "+contador);
    float temp= scanner.nextFloat();
    if (temp<100000) {
      categoriaUno++;
    }
    else if (temp>200000&&temp<=300000) {
      categoriaDos++;
    }
    else if (temp>300000) {
      categoriaTres++;
    }
    else{
      System.out.println("no hay categoria asignada para este salario");
    }
    contador++;
  }
  System.out.println("el total de trabajadores en categoría 1 es "+categoriaUno);
  System.out.println("el total de trabajadores en categoría 2 es "+categoriaDos);
  System.out.println("el total de trabajadores en categoría 3 es "+categoriaTres);
}
public static void tablas(){
  for (int i = 1; i <= 10; i++) {
    for (int j = 1; j <= 10; j++) {
      System.out.println(i+" X "+j+" = "+i*j);
    }
  }
}
public static void parImpar(){
  System.out.println("por favor ingrese un numero entero");
  int numero = scanner.nextInt();
  int sumatoria=0;
  if (numero%2==0) {
    for (int i = 1; i <= numero; i++) {
      if (i!=numero) {
      System.out.print(i+" + ");
      sumatoria+=i;
      }
      else{
      System.out.print(i);
      sumatoria+=i;
      }
    }
    System.out.println(" = "+sumatoria+ ", es la sumatoria de "+numero);
  }
  else {
    int factorial = 1;
    for (int i = 1; i <= numero; i++) {
      if (i!=numero) {
        System.out.print(i+"x");
        factorial *= i;
      }
      else{
        System.out.print(i);
        factorial *= i;
      }
        }
        System.out.println("="+factorial);
  }
}
}
