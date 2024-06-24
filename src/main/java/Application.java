import javax.imageio.ImageTranscoder;
import java.util.Scanner;



public class Application {
    public static void inputArray(int[] Arr, int ArrSize){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < ArrSize; i++)
            Arr[i] = sc.nextInt();
    }

    public static int getMin(int[] Arr, int ArrSize){
        int min = Arr[0];
        for(int i = 0; i < ArrSize; i++){
            if(min > Arr[i])
                min = Arr[i];
        }

        return min;
    }

    public static void main(String[] args) {
        int Na, Nb, Nc;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Na: ");
        Na = sc.nextInt();
        System.out.print("Enter Nb: ");
        Nb = sc.nextInt();
        System.out.print("Enter Nc: ");
        Nc = sc.nextInt();

        int[] A = new int[Na];
        int[] B = new int[Nb];
        int[] C = new int[Nc];
        System.out.print("Enter A: ");
        inputArray(A, Na);
        System.out.print("Enter B: ");
        inputArray(B, Nb);
        System.out.print("Enter C: ");
        inputArray(C, Nc);

        System.out.println("Min A: " + getMin(A, Na));
        System.out.println("Min B: " + getMin(B, Nb));
        System.out.println("Min C: " + getMin(C, Nc));
    }
}