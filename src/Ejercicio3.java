public class Ejercicio3 {

    public static void main(String[] args) {

        String[] nombres = {"Hera", "Hércules", "Venus"}; //Esto es un array, una lista
        System.out.println("Los nombres son los siguientes: ");

        for (int i = 0; i< nombres.length; i++) {
            System.out.print(nombres[i]);
            //Si no es el último nombre del array escibir una coma "," y un espacio.
            if ( i < (nombres.length - 1) ) {
                System.out.print("," + " ");
            }
        }
    }
}