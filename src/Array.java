import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 11, 4, 5, 6, 7, 10, 8, 9, 12};
        int[] arr2 = new int[]{-2, -3, 4, 5, -6, 7, 8, 9, -10, 11, -12};
        int[] arr3 = new int[]{2, 1, 4, 5, 7};
        int[] arr4 = new int[]{1, 2, 4, 5, 7, 6, 8};

        
    }

    //Bài 11
    public static void printEven(int[] arr) {
        for (int i : arr) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void printNegativeNumberIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                System.out.println(i);
            }
        }
    }

    public static void printNumberBiggerThanLastOne(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                System.out.println(arr[i]);
            }
        }
    }

    //Bài 12
    public static int sumOddIndex(int[] arr) {
        int sum = 0;
        for (int i = 1; i < arr.length; i++) {
            if (i % 2 != 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    public static int sumIndexEvenNum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void compareSumEvenAndSumOdd(int[] arr) {
        int sumEven = 0;
        int sumOdd = 0;
        for (int j : arr) {
            if (j % 2 == 0) {
                sumEven += j;
            }
            if (j % 2 != 0) {
                sumOdd += j;
            }
        }
        if (sumEven > sumOdd) {
            System.out.println("Tổng phần tử chẵn lớn hơn tổng phần tử lẻ");
        } else {
            System.out.println("Tổng phần tử lẻ lớn hơn tổng phần tử chẵn");
        }
    }

    //Bài 13
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (max < i) max = i;
        }
        return max;
    }

    public static int findSecondMax(int[] arr) {
        int max = arr[0];
        int sndMax = arr[0];
        for (int i : arr) {
            if (max < i) {
                sndMax = max;
                max = i;
            }
        }
        return sndMax;
    }

    public static int findMaxMatrix(int[][] arr) {
        int max = arr[0][0];
        for (int[] i : arr) {
            for (int j : i) {
                if (max < j) max = j;
            }
        }
        return max;
    }

    //Bài 14
    public static int sum(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }

    public static int sumDivisionByThree(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            if (j % 3 == 0) {
                sum += j;
            }
        }
        return sum;
    }

    public static int avg(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum / arr.length;
    }

    //Bài 15
    public static void checkIncrementArr(int[] arr) {
        boolean isIncrement = false;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= arr[i - 1]) {
                isIncrement = true;
            } else {
                isIncrement = false;
                break;
            }
        }
        if (isIncrement) {
            System.out.println("Mảng này tăng dần");
        } else {
            System.out.println("Mảng này không tăng dần");
        }
    }

    public static boolean compareArray(int[] a, int[] b) {
        return Arrays.stream(a)
                .allMatch(element -> Arrays.stream(b).anyMatch(x -> x == element));
    }

    public static int chooseSamePiles(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);

        int count = 0;
        int i = 0, j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                count++;
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }
        return count;
    }

    //Bài 16
    public static void countAndPrintElementOccurrences(int[] arr) {
        int maxElement = Integer.MIN_VALUE;
        int minElement = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num > maxElement) {
                maxElement = num;
            }
            if (num < minElement) {
                minElement = num;
            }
        }

        int[] elementCount = new int[maxElement - minElement + 1];

        for (int num : arr) {
            elementCount[num - minElement]++;
        }

        for (int i = 0; i <= maxElement - minElement; i++) {
            if (elementCount[i] > 0) {
                System.out.println("Phần tử " + (i + minElement) + " xuất hiện " + elementCount[i] + " lần.");
            }
        }
    }

    public static void printSingleOccurrenceElements(int[] arr) {
        int maxElement = Integer.MIN_VALUE;
        int minElement = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num > maxElement) {
                maxElement = num;
            }
            if (num < minElement) {
                minElement = num;
            }
        }

        int[] elementCount = new int[maxElement - minElement + 1];

        for (int num : arr) {
            elementCount[num - minElement]++;
        }

        System.out.print("Các phần tử chỉ xuất hiện một lần: ");
        for (int i = 0; i <= maxElement - minElement; i++) {
            if (elementCount[i] == 1) {
                System.out.print((i + minElement) + " ");
            }
        }
    }



    //Bài 17
    public static void findSameElementInTwoArray(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    System.out.print(a[i] + " ");
                    break;
                }
            }
        }
    }

    public static void findLogestChildArray(int[] arr) {
        int maxLength = 0;
        int curLength = 1;

        int startIndex = 0;
        int curIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                curLength++;
            } else {
                curLength = 1;
                curIndex = i;
            }
            if (curLength > maxLength) {
                maxLength = curLength;
                startIndex = curIndex;
            }
        }
        System.out.print("Dãy con tăng dài nhất: ");
        for (int i = startIndex; i < startIndex + maxLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void isContainAll(int n, int[] arr) {
        boolean[] exists = new boolean[n + 1];
        for (int num : arr) {
            if (num >= 1 && num <= n) {
                exists[num] = true;
            }
        }
        boolean containsAll = true;
        for (int i = 1; i <= n; i++) {
            if (!exists[i]) {
                containsAll = false;
                break;
            }
        }
        if (containsAll) {
            System.out.println("Mảng chứa tất cả các số từ 1 đến " + n);
        } else {
            System.out.println("Mảng không chứa tất cả các số từ 1 đến " + n);
        }
    }

    //Bài 18
    public static void findBiggestTwoNumProduct(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Mảng không có đủ số để tìm tích lớn nhất");
            return;
        }

        int maxProduct = Integer.MIN_VALUE;
        int num1 = 0;
        int num2 = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int product = arr[i] * arr[j];
                if (product > maxProduct) {
                    maxProduct = product;
                    num1 = arr[i];
                    num2 = arr[j];
                }
            }
        }
        System.out.println("Hai số có tích lớn nhất là " + num1 + " và " + num2);
    }

    public static void findBiggestChildArraySum(int[] arr) {
        int maxSum = arr[0];
        int curSum = arr[0];
        int start = 0;
        int end = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > curSum + arr[i]) {
                curSum = arr[i];
                start = i;
            } else {
                curSum += arr[i];
            }
            if (curSum > maxSum) {
                maxSum = curSum;
                end = i;
            }
        }

        System.out.println("Dãy con liên tiếp có tổng lớn nhất:");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nTổng lớn nhất: " + maxSum);
    }

    public static void findKBiggestNumInArray(int k, int[] arr){
        if (k <= 0 || k > arr.length) {
            System.out.println("Giá trị của k không hợp lệ.");
            return;
        }

        Arrays.sort(arr);

        System.out.print("K phần tử lớn nhất là: ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //Bài 19

}


