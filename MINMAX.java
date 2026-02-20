import java.util.Scanner;

public class MINMAX {

    public static int min(int[] arr){
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static int max(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int[] findMinMax(int[] arr){
        int min = arr[0];
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {

        int[] numbers;

        if(args.length > 0){

            numbers = new int[args.length];

            for(int i = 0; i < args.length; i++){
                numbers[i] = Integer.parseInt(args[i]);
            }

        } else {

            Scanner sc = new Scanner(System.in);

            System.out.print("How many numbers? ");
            int n = sc.nextInt();

            numbers = new int[n];

            for(int i = 0; i < n; i++){
                System.out.print("Enter number: ");
                numbers[i] = sc.nextInt();
            }

            sc.close();
        }

        int minValue = min(numbers);
        int maxValue = max(numbers);

        System.out.println("Using separate methods:");
        System.out.println("Minimum = " + minValue);
        System.out.println("Maximum = " + maxValue);

        int[] result = findMinMax(numbers);

        System.out.println("Using single method:");
        System.out.println("Minimum = " + result[0]);
        System.out.println("Maximum = " + result[1]);
    }
}