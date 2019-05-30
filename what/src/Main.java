import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static boolean[] primes=new boolean[10000];
    public static void fillSieve() {
        Arrays.fill(primes,true);
        primes[0]=primes[1]=false;
        for (int i=2;i<primes.length;i++) {
            if(primes[i]) {
                for (int j=2;i*j<primes.length;j++) {
                    primes[i*j]=false;
                    System.out.println(i*j);
                }
            }
        }
    }

    public static boolean isPrime(int n) {
        return primes[n];
    }
    public static void main(String[] args) {
        fillSieve();
        Scanner k = new Scanner(System.in);
        System.out.println(isPrime(k.nextInt()));
    }

}
