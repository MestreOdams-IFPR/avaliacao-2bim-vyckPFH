public class prova {
    public static void main(String[] args) {
        int fibo = calcFibo(5);
        System.out.println("fibo de 5 é: " + fibo);
        // printPell(9);

    }

    public static int calcFibo(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 0;
        } else if (n == 2) {
            
            return 1;
        }
        
        
       return (n + calcFibo(n-1)) + (n-2 + calcFibo(n-2)) + n-3 + calcFibo(n-3);

    }

    public static void printPell(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.print(makePell(i) + " ");
        }
    }

    public static int makePell(int n) {

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        return 2 * makePell(n - 1) + makePell(n - 2);

    }

}
