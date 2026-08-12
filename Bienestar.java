import java.util.Scanner;

public class Bienestar{
  public static void main(String arg[]){
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingresa tu nombre");
    String name = leer.nextLine();
    System.out.println("Hola "+name+" ingresa tu año de nacimiento");
    int year = leer.nextInt();
    int edad = 2026-year;
    System.out.println("Tu edad es: "+(edad));

    if(edad<18){
      System.out.println("No puedes entrar aunque tengas sed de la mala");
    }
    else{
      System.out.println("Bienvenide... mediecita o miedo?");
    }

  }
}

