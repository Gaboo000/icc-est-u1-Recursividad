public class App {
    public static void main(String[] args) throws Exception {
        Recursividad rec = new Recursividad();
        int resultado = rec.factorial(5);
        System.out.println(resultado);
        int resultado2 = rec.sumaConsecutivos(5);
        System.out.println(resultado2);


    }
}
