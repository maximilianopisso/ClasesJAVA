package Desafio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);   
        boolean control = false;
        String nombre,raza,tipo_pelaje,color_pelaje;
        String animal="";
        do{

            System.out.println("Ingrese el tipo de Animal : " +"\n"+ "GATO" +"\n"+ "MONO" +"\n"+"PERRO"+"\n"+"VACA"+"\n"+"SALIR (Para abandonar ingrese cualqueir texto)");
            try{
                animal = input.nextLine();
                animal = animal.toUpperCase();
                control =true;
                
            }catch (InputMismatchException ime){
                System.out.println("Se ingreso un valor incorrecto. Vuelta a ingresar una opcion valida");
                control = false;
            }
            
              if (control){
                switch (animal){
                case "GATO":
                    
                    System.out.println("Ingrese su nombre");
                    nombre = input.nextLine();
                    System.out.println("Ingrese su raza");
                    raza = input.nextLine();
                    System.out.println("Ingrese el tipo de pelaje");
                    tipo_pelaje = input.nextLine();
                    System.out.println("Ingrese el color del pelaje");
                    color_pelaje = input.nextLine();

                    Gato gato = new Gato("VERTEBRADO", "GATO", nombre, raza,tipo_pelaje,color_pelaje);
                    System.out.println(gato.toString());
                    control = true;
                break;
                case "MONO":
                    System.out.println("Ingrese su nombre");
                    nombre = input.nextLine();
                    System.out.println("Ingrese su raza");
                    raza = input.nextLine();
                    System.out.println("Ingrese el tipo de pelaje");
                    
                    Mono mono = new Mono("VERTEBRADO", "MONO", nombre, raza);
                    System.out.println(mono.toString());
                    control = true;
                break;
                case "PERRO":
                System.out.println("Ingrese su nombre");
                    nombre = input.nextLine();
                    System.out.println("Ingrese su raza");
                    raza = input.nextLine();
                    System.out.println("Ingrese el tipo de pelaje");
                    tipo_pelaje = input.nextLine();
                    System.out.println("Ingrese el color del pelaje");
                    color_pelaje = input.nextLine();

                    Perro perro = new Perro("VERTEBRADO", "PERRO", nombre, raza,tipo_pelaje,color_pelaje);
                    System.out.println(perro.toString());
                    control = true;
                break;
                case "VACA":
                    System.out.println("Ingrese su nombre");
                    nombre = input.nextLine();
                    System.out.println("Ingrese su raza");
                    raza = input.nextLine();
                    System.out.println("Ingrese el tipo de pelaje");
                    
                    Vaca vaca = new Vaca("VERTEBRADO", "VACA", nombre, raza);
                    System.out.println(vaca.toString());
                    control = true;
                break;
                
                default:
                    System.out.println(animal);
                    control =false;
              }  



            
            }

        }while (control);

        input.close(); 
        
    }
}
