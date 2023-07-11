public class Pola {
    public static void main(String[] args) {
//        Pola1();
//        Pola2();
//        Pola3();
//        Pola4();
//        Pola5();
//        Pola6();
//        Pola();
//        Pola1A();
//        Pola1C();
//        Pola1D();
        Pola1E();
    }


    static void Pola1(){
        int n = 5;

        for(int i=0; i<=n-1; i++){
            for (int j=0; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

//    *
//    **
//    ***
//    ****
//    *****
//    ******
//    *******

//
    static void Pola1A(){
        int n = 5;
        for(int i=0; i<=n-1; i++){
            for (int j=1; j<=i+1 ; j++){

                if(j%2==0){
                    System.out.print("*");
                }
                else {
                    System.out.print(j);
                }

            }
            System.out.println();
        }
    }
//    *
//    *1
//    *1*
//    *1*3
//    *1*3*5
//    static void Pola1B(){
//        int n = 9;
//        for (int i=1; i<=n; i++){
//            for (int j=1; j<=i; j++){
//                System.out.print();
//            }
//        }
//    }
static void Pola1D() {
    int n = 10;
    for (int i = 1; i <= n; i++) {
        for (int j = 0; j <= i - 1; j++) {
           if(j==0||j==i-1){
               System.out.print("*");
           }

           else {
               if (j % 5 == 1) {
                   System.out.print("e");
               } else if (j % 5 == 2) {
                   System.out.print("s");
               } else if (j % 5 == 3) {
                   System.out.print("t");
               } else if (j % 5 == 4) {
                   System.out.print("e");
               } else if (j % 5 == 0) {
                   System.out.print("r");
               }
           }
        }
        System.out.println();
    }
}
    static void Pola1E() {
        int n = 10;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= i - 1; j++) {
                if (j == 0 || j == i - 1) {
                    System.out.print("*");
                } else {
                    if (j % 3 == 1) {
                        System.out.print("b");
                    } else if (j % 3 == 2) {
                        System.out.print("l");
                    } else if (j % 3 == 0) {
                        System.out.print("i");
                    }
                }
            }
                System.out.println();
            }
    }

    static void Pola1C(){
        int n = 10;
        for (int i=1; i<=n; i++){
            for (int j=0; j<=i-1; j++){
                if(j%5==0){
                    System.out.print("e");
                }
                else if(j%5==1){
                    System.out.print("s");
                }
                else if(j%5==2){
                    System.out.print("t");
                }
                else if(j%5==3){
                    System.out.print("e");
                }
                else if(j%5==4){
                    System.out.print("r");
                }
            }
            System.out.println();


        }
    }


//    0
//    01
//    012
//    0123
//    01234


    static void Pola2(){
        int n = 5;

        for(int i=1; i<=n; i++){
            for (int j=n-1; j>=i; j--){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void Pola3(){
        int n = 5;

        for(int i=1; i<=n; i++){
            for(int j=n; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void Pola4() {
        int n = 5;

        for (int i=1; i<=n; i++){
            for (int j=n-1; j>=i; j--){
                System.out.print(" ");
            }
            for (int j=1; j<=i*2-1; j++){
                System.out.print("X");
            }
            System.out.println();
        }

    }

    static void Pola5(){
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = i-1; j < 2*n - i; j++) {
                System.out.print("x");
            }

            System.out.println();
        }
    }

    static void Pola6(){
        int n = 5;

        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("X");
            }
            for (int j=i-1; j<=2*n-i;j++){
                System.out.print("#");
            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void Pola(){
        int n = 9;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=1; j++ ){
                System.out.print("*");
            }
            for (int j=1; j<=1; j++){
                System.out.print("b");
            }
            System.out.println();
        }
    }
}

