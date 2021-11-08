package Desafio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean control=true;
        boolean validaIngreso = false;
        String nombre, raza, tipo_pelaje, color_pelaje;
        int opcion = 10;
       
        do {

            System.out.println("Ingrese la opcion para un Animal : " + "\n" + "1 - GATO" + "\n" + "2 - MONO" + "\n"
                    + "3 - PERRO" + "\n" + "4 - VACA" + "\n" + "0 - SALIR");
            try {
                opcion = input.nextInt();
                input.nextLine();   
                validaIngreso = true;
            } catch (InputMismatchException ime) {
                System.out.println("Se ingreso un valor incorrecto. Vuelva a ingresar una opcion valida");
                validaIngreso = false;
                input.nextLine();
            }
            

            if (control && validaIngreso) {
                switch (opcion) {
                case 1:

                    System.out.println("Ingrese el nombre de su Gato");
                    nombre = input.nextLine();
                    System.out.println("Ingrese la raza de su Gato");
                    raza = input.nextLine();
                    System.out.println("Ingrese el tipo de pelaje de su Gato");
                    tipo_pelaje = input.nextLine();
                    System.out.println("Ingrese el color del pelaje de su Gato");
                    color_pelaje = input.nextLine();

                    Gato gato = new Gato("VERTEBRADO", "GATO", nombre, raza, tipo_pelaje, color_pelaje);
                    System.out.println(gato.toString());
                    System.out.println("El gato se comunica :" + gato.comunicarse());
                    System.out.println("El gato se translada :" + gato.transladarse());
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del Mono");
                    nombre = input.nextLine();
                    System.out.println("Ingrese la raza del Mono");
                    raza = input.nextLine();

                    Mono mono = new Mono("VERTEBRADO", "MONO", nombre, raza);
                    System.out.println(mono.toString());
                    System.out.println("El mono se comunica :" + mono.comunicarse());
                    System.out.println("El mono se translada :" + mono.transladarse());

                    break;
                case 3:
                    System.out.println("Ingrese de su Perro");
                    nombre = input.nextLine();
                    System.out.println("Ingrese la raza de su Perro");
                    raza = input.nextLine();
                    System.out.println("Ingrese el tipo de pelaje de su Perro");
                    tipo_pelaje = input.nextLine();
                    System.out.println("Ingrese el color del pelaje de su Perro");
                    color_pelaje = input.nextLine();

                    Perro perro = new Perro("VERTEBRADO", "PERRO", nombre, raza, tipo_pelaje, color_pelaje);
                    System.out.println(perro.toString());
                    System.out.println("El perro se comunica :" + perro.comunicarse());
                    System.out.println("El perro se translada :" + perro.transladarse());

                    break;
                case 4:
                    System.out.println("Ingrese el nombre de la Vaca");
                    nombre = input.nextLine();
                    System.out.println("Ingrese la raza de la Vaca");
                    raza = input.nextLine();

                    Vaca vaca = new Vaca("VERTEBRADO", "VACA", nombre, raza);
                    System.out.println(vaca.toString());
                    System.out.println("La vaca se comunica :" + vaca.comunicarse());
                    System.out.println("La vaca se translada :" + vaca.transladarse());
                    break;

                case 0:
                    control = false;
                    break;

                default:
                    System.out.println(
                            "El valor ingresado no corresponde a una opcion valida, vuelva a ingresar una opcion");
                }
            }
        } while (control);

        input.close();
    }
}
