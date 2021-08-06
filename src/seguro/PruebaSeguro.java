
package seguro;

import java.util.ArrayList;
import java.util.Scanner;

public class PruebaSeguro {
    
    public static void main(String[] args) {
        ArrayList<Persona> jubilados = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        JubiladoVejez jubiladoVejez;
        JubiladoDiscapacidad jubiladoDiscapacidad;
        JubiladoPatronal jubiladoPatronal;

        int opcion;
        String dato;

        do {            
            System.out.println("1) Agregar jubilado por vejez");
            System.out.println("2) Agregar jubilado por discapacidad");
            System.out.println("3) Agregar jubilado patronal");
            System.out.println("4) Imprimir");
            System.out.println("5) Salir");
            System.out.print("Ingrese la opcion deseada: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:

                    jubiladoVejez = new JubiladoVejez();
                    System.out.print("Ingrese cedula: ");
                    dato = sc.nextLine();
                    jubiladoVejez.setCedula(dato);

                    System.out.print("Ingrese nombre: ");
                    dato = sc.nextLine();
                    jubiladoVejez.setNombre(dato);

                    System.out.print("Ingrese salario base: ");
                    dato = sc.nextLine();
                    jubiladoVejez.setSalarioBase(Float.parseFloat(dato));

                    System.out.print("Ingrese años de aporte: ");
                    dato = sc.nextLine();
                    jubiladoVejez.setAniosAporte(Integer.parseInt(dato));
                    jubilados.add(jubiladoVejez);
                    break;
                case 2:
                    jubiladoDiscapacidad = new JubiladoDiscapacidad();
                    System.out.print("Ingrese cedula: ");
                    dato = sc.nextLine();
                    jubiladoDiscapacidad.setCedula(dato);

                    System.out.print("Ingrese nombre: ");
                    dato = sc.nextLine();
                    jubiladoDiscapacidad.setNombre(dato);

                    System.out.print("Ingrese salario base: ");
                    dato = sc.nextLine();
                    jubiladoDiscapacidad.setSalarioBase(Float.parseFloat(dato));

                    System.out.print("Ingrese años de aporte: ");
                    dato = sc.nextLine();
                    jubiladoDiscapacidad.setAniosAporte(Integer.parseInt(dato));

                    System.out.print("Ingrese porcentaje inflacion: ");
                    dato = sc.nextLine();
                    jubiladoDiscapacidad.setPorcentajeDiscapacidad(Float.parseFloat(dato));
                    jubilados.add(jubiladoDiscapacidad);
                    break;
                case 3:
                    jubiladoPatronal = new JubiladoPatronal();
                    System.out.print("Ingrese cedula: ");
                    dato = sc.nextLine();
                    jubiladoPatronal.setCedula(dato);

                    System.out.print("Ingrese nombre: ");
                    dato = sc.nextLine();
                    jubiladoPatronal.setNombre(dato);

                    System.out.print("Ingrese salario base: ");
                    dato = sc.nextLine();
                    jubiladoPatronal.setSalarioBase(Float.parseFloat(dato));

                    System.out.print("Ingrese años de aporte: ");
                    dato = sc.nextLine();
                    jubiladoPatronal.setAniosAporte(Integer.parseInt(dato));

                    System.out.print("Ingrese porcentaje inflacion: ");
                    dato = sc.nextLine();
                    jubiladoPatronal.setPorcentajeInfalcion(Float.parseFloat(dato));

                    System.out.print("Trabaja en empresa privada (1. Si 2.No): ");
                    dato = sc.nextLine();
                    if (Integer.parseInt(dato) == 1) {
                        jubiladoPatronal.setEmpresaPrivada(true);
                    } else {
                        jubiladoPatronal.setEmpresaPrivada(false);
                    }
                    jubilados.add(jubiladoPatronal);
                    break;
                case 4:
                    for (Persona jubilado : jubilados) {
                        System.out.println(jubilado);
                    }
                    break;
                case 5:
                    System.out.println("Gracias por usar el programa");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        } while (opcion != 5);
    }    
}
