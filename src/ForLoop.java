public class ForLoop {
    public static void main(String[] args) {
//        printOddNumber(2, 40);
//        FizzBuzz(5, 100);
//        if (checkPerfectSquare(25))
//            System.out.println("Là số chính phương");
//        else
//            System.out.println("Không phải là số chính phương");
    }


    //Bài 3
    public static void printOddNumber(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void FizzBuzz(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println(i + " Fizz");
            } else if (i % 5 == 0) {
                System.out.println(i + " Buzz");
            }
        }
    }

    public static boolean checkPerfectSquare(double n) {
        double sq = Math.sqrt(n);
        return ((sq - Math.floor(sq)) == 0);
    }

    //Bài 4
    public static int sum(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sumEven(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static int sumPow(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += (int) Math.pow(i, 2);
        }
        return sum;
    }

    //Bài 5
    public static int sumS(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += n * (n + 1);
        }
        return sum;
    }

    public static int sumS2(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += (2 * n + 1) / (2 * n + 2);
        }
        return sum;
    }

    public static int sumS3(int n) {
        int sum = 100;
        for (int i = 1; i <= n; i++) {
            sum += n * (n + 1) / (n + 1) * (n + 2);
        }
        return sum;
    }

    //Bài 6
    public static void divisors(int a){
        for (int i=1;i<a;i++){
            if(a%i==0){
                System.out.print(i + " ");
            }
        }
    }
    public static void multiples(int a){
        for (int i = 1; i < 100; i++) {
            if (i % a == 0) {
                System.out.print(i + " ");
            }
        }
    }
    public static int findLargestOddDivisor(int number) {
        for (int i = number; i >= 1; i--) {
            if (number % i == 0 && i % 2 != 0) {
                return i;
            }
        }
        return -1;
    }
    public static int findSmallestEvenMultiple(int number) {
        return number *2;
    }
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int findLCM(int a, int b) {
        return  (a*b)/findGCD(a,b);
    }


}
