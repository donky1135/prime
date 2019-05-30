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
        loop: for(;;) {
            fillSieve();
            System.out.println("Put in a number, observe if prime");
            Scanner k = new Scanner(System.in);
            System.out.println(isPrime(k.nextInt()));
            System.out.println("Do you want to run again?");
            switch (k.next()){
                case "yes":
                case "Yes":
                    continue;
                case "No":
                case "no":
                    break loop;
                default:
                    System.out.println("You didn't say the right word, you're dumb, you get to see the program again, I'm tired");
            }
        }
    }

}
