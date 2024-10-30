public class App {
    public static void main(String[] args) throws Exception {
        Recursividad rec = new Recursividad();


        int resultadoFact = rec.factorial(5);
        System.out.println(resultadoFact);


        int resultadoSumasConsecutivos = rec.sumaConsecutivos(5);
        System.out.println(resultadoSumasConsecutivos);


        int resultadoPotencia = rec.potencia(9, 8);
        System.out.println(resultadoPotencia);


        int resultadoSumaDigitos = rec.sumaDigitos(456);
        System.out.println(resultadoSumaDigitos);


        int resultadoFibonacci= rec.fibonacci(8);
        System.out.println(resultadoFibonacci);


        RenombrarDirectorios rd = new RenombrarDirectorios();
        rd.renombrarDirectorios("src/directorios");




    }
}
