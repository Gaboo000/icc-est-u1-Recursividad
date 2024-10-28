public class Recursividad {

    public int factorial(int n){
        System.out.println("Calculando el factorial de: "+n);
        //Caso base: n sea 0! y 1! SON IGUALES A 1 
        if(n == 0 || n ==1){
            System.out.println("Caso base alcanzado el factorial de "+n+" es 1");
            return 1;
        
        }
        int resultado = n *factorial(n-1);
        System.out.println("Resultado parcial para "+n+" * factorial ("+(n-1)+") = "+resultado);
        return resultado;
        //return n *factorial(n-1)

    }

    //calcular la suma de los numeros consecutivos 
    //n= 5 resultado = 5+4+3+2+1 = 15
    public int sumaConsecutivos(int n){
        if (n == 1 ){
            return 1;
        }

        return (n+sumaConsecutivos(n-1));
    }
    
}
