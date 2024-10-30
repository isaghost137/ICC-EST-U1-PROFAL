public class App {
    public static void main(String[] args) throws Exception {
        Recursividad recursividad = new Recursividad();

        System.out.println("Suma de consecutivos de 5: " + recursividad.sumaConsecutivos(5));
        System.out.println("Potencia de 7: " + recursividad.potencia(7, 2));
        System.out.println("Suma de digitos del 456: " + recursividad.sumaDigitos(456));

        String pathBase = "src/directorios";
        GeneratorDirecorios generador = new GeneratorDirecorios();
        generador.crearEstructuraDirectorios(pathBase);


    }
}