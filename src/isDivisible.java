import java.util.Scanner;

public class isDivisible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int size = scanner.nextInt();
        int array[] = new int[size];

        System.out.println("Enter elements of the array: ");
        for(int i=0; i<size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter a divisor: ");
        int divisor = scanner.nextInt();

        int result = isDivisible(array, divisor);
        System.out.println("The result is " + result);
    }
    static int isDivisible(int[]a, int divisior){
        for(int index=0; index<a.length; index++){
            if(a[index]%divisior !=0){
                return 0;
            }
        }
        return 1;
    }
}