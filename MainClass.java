import java.util.Scanner;

public class MainClass{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Scanner input = new Scanner(System.in);
        // Estudiante estudiante1 = new Estudiante();

        Estudiante estudiante2 = new Estudiante(1, "Maximiliano Pisso", 9f, true);   //la f es por float
        System.out.println(estudiante2.toString());
        
        Estudiante estudiante1 = new Estudiante();
        
        System.out.println("Por favor ingrese el id del estudiante");
        estudiante1.setId(input.nextInt());

        input.nextLine();  //Esto es para que no tome al enter como una entrada cuando apretamos al ingresar el ID
    
        System.out.println("Ingrese el nombre completo del estudiante");
        estudiante1.setNombreCompleto(input.nextLine());

        System.out.println("Ingrese el promedio del estudiante");
        estudiante1.setPromedio(input.nextFloat());

        System.out.println("Ingrese el presentismo");
        estudiante1.setPresentismo(input.nextBoolean());

        System.out.println(estudiante1.toString());
        System.out.println(estudiante2.toString());

        input.close(); 

    }
}


