public class IfElse {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap n: ");
//        int n = sc.nextInt();

//        Bài 1
//        System.out.println(checkNumberEven(n) ? "Là số chẵn" : "Là số lẻ");
//        System.out.println(findMax(4, 5, 6));
//        System.out.println(triangleType(3,4,5));

        //Bài 2
//        System.out.println(numOfGrills(21));

    }

    public static boolean checkNumberEven(int n) {
        return n % 2 == 0;
    }

    public static int findMax(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public static String triangleType(double a, double b, double c) {
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                return "Tam giác đều";
            } else if (a == b || b == c || a == c) {
                return "Tam giác cân";
            } else {
                return "Tam giác thường";
            }
        } else {
            return "Không phải tam giác";
        }
    }

    public static int numOfGrills(int n){
        return n%9 ==0? n/9 : n/9 +1;
    }


}
