import java.util.Scanner;

public class GCD {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int temp1 = n1;
                int temp2 = n2;
        while(n1 % n2 == 0) {
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }
        int gcd = n2;
        int lcm = (temp1 * temp2) / gcd;
        System.out.println(gcd);
        System.out.println(lcm);

        }

    }

