import java.util.Scanner;

public class AnalisisNumeros {



    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        Integer numero1;
        Integer numero2;
        
        System.out.println("Ingrese el primer numero");
        numero1 = input.nextInt();
        
        System.out.println("Ingrese el segundo numero");
        numero2 = input.nextInt();

            if (numero1 > numero2) {

                System.out.println("El numero 1 :" +numero1+" es el mayor de los 2");
                
            }else if (numero1 < numero2) {

                System.out.println("El numero 2 :" +numero2+" es el mayor de los 2");
                
            } else {
                System.out.println("Ambos numeros son iguales");
            }

        input.close();
    }





}
