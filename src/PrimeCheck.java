public class PrimeCheck {
    public static void main(String[] args) {
        int num = 100;
        int count = 0;
        //boolean isPrime = isPrime(num);
        /*if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }*/
        /*if (num <= 1) {
            System.out.println("non - prime number");
        }*/
        /*for (int i = 1; i<=100;i++){
            //System.out.println(i);
            if(i%i==0){
                count++;
            }
            if(count==2){
                System.out.println(i);
            }
        }*/

        for(int i = 0; i<=100;i++){
            if(isPrime(i)){
                System.out.println("prime number"+ i);
            }
        }

    }

   /* public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        *//*for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }*//*
        *//*for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

    }*//*
        *//*for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count += 1;
        }*//*
        return true;
    }*/
    public static boolean isPrime(int n ){
        int count =0;
        for(int i=1; i<=n;i++){
            if(n%i==0){
                count+=1;
            }
        }
        if(count==2) {
            return true;
        }
        return false;
    }
}