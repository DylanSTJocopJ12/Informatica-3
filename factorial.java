import java.util.*;
/* Dylan Jocop 25001120 Seccion C */
class factorial {

    static int calculos(int n, String acu, boolean primero){
        if (n <= 1) {
            System.out.println("   = " + acu + "1");
            return 1;
        }
        if (primero){
            System.out.println(n + "! = " + n + " * " + (n-1) +"!");
        } 
        else{
            System.out.println("   = " + acu + n + " * " + (n-1) +"!");
        }
        return n * calculos(n-1 , acu + n+ " * ", false);
    }

    public static void main(String[] args) {
        Scanner opcion = new Scanner(System.in);
        Scanner numfac= new Scanner(System.in);

        while (true) {
            System.out.println("----------- Menu -----------");
            System.out.println("1. Realizar factorial de un numero");
            System.out.println("2. Salir");
            System.out.print("Ingrese opcion deseada: ");

            try{
                String input = opcion.nextLine();
                int dato = Integer.parseInt(input);
                if (dato == 1){

                    System.out.print("Ingrese el numero para hacer su factorial: ");
                    int numero = Integer.parseInt(numfac.nextLine());
                    System.out.println();

                    if (numero < 0) {
                        System.out.println("No negativos.");
                    } else if ( numero == 0){
                        System.out.println("0! = 1");
                    } else {
                        int resultado = calculos(numero, "", true);
                        System.out.println(numero+"! = " + resultado);
                    }
                }

                else if (dato == 2){
                    System.out.println("Terminando simulador");
                    break;
                }
                } catch (Exception e ){
                System.out.println("Ingrese un numero");
                System.out.println();
            }
        }
        
    }
}