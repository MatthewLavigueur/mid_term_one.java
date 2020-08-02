package ca.concordia.ccecejv.excersises;

public class Prime {


    public static void main(String[] args)
    {

        System.out.println("\n \n Find the Primes! \n \n");

        int startPrime = 1;               // start from 1
        int largestPrime = 100;           // up to 100
        boolean isPrime;                  // if a prime



        for (int A = startPrime; A <= largestPrime; A++) {

            // if 1 or 2, these are the basic primes
            if (A == 1 || A == 2){
                System.out.println(A + " = Prime");
            }

            //for all others, determine if they're primes
            else {
                    isPrime = true;  // all numbers smaller than the number and down to greater than 2 (already checked)

                    for (int B = A-1; B >= 2; B--) {     // if there's ever no remainder, the number is divisible = NOT a prime
                        if (A % B == 0) {
                            isPrime = false;

                            break;
                        }
                    }

                    // check the flag whether we found the number to be not a prime

                    if(isPrime) {                       // if still true, not evenly divisible = is a prime
                        System.out.println(A + " = Prime");
                    }
                    else {                              //evenly divisible = not a prime
                        System.out.println(A + " =  NOT Prime");
                    }
            }
        }
    }
}














