public class PrimeNumber {
    public static boolean checkPrime(int number){
        if (number == 2){
            return true;
        }

        if (number <= 1){
            return false;
        }

        for (int i=2; i<number; i++){
            if (number % i == 0){
                return false;
            }
        }

        return true;
    }
    
    public static void printPrimeFromAToB(int numA, int numB){
        for (int i = numA; i<= numB; i++){
            if (checkPrime(i)){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int num = 9;
        
//        if (checkPrime(num)){
//            System.out.println("Bilangan Prima");
//        }
//        else {
//            System.out.println("Bukan Bilangan Prima");
//        }
        int a = 3;
        int b = 7;
        for (int i = a; i<=b; i++){
            if (checkPrime(i)){
                System.out.println(i);
            }
        }
        



    }

}

