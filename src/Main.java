import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = false;
        int edad = 0;

        System.out.println("Introduce el nombre: ");
        String nombre = sc.nextLine();

        do {
            try {
                System.out.println("Introduce la edad: ");
                edad = sc.nextInt();
                sc.nextLine();
                continuar = true;
            }catch (InputMismatchException e){
                System.out.println("La edad ha de ser numérica.");
                sc.nextLine();
            }
        }while (continuar == false);

        try {
            Persona nuevaPersona = new Persona(nombre, edad);
            nuevaPersona.saludar();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}