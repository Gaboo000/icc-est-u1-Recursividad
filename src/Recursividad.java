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

    //calcular la potencia de numero

    public int potencia (int base, int exponente){
        if (exponente  == 0){
            return 1;
        }
        return base * potencia(base, exponente-1);
        
    }
    
    //CREAR UN METODO QUE SUME LOS DIGITOS DE UN NUMERO
    //SI MANDO 456 SEA IGUAL A 15
    // 4 + 5 + 6 =15
    //PISTA DE USA EL % MOD
    public int sumaDigitos (int n){
        if(n<10){
            return n;
        }
        return n % 10 +sumaDigitos(n/10);


    }

    public int fibonacci (int n){
        if(n == 0) return 0;

        if(n == 1) return 1;

        return fibonacci(n-1) + fibonacci(n-2);

        
    }
}
