import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = sc.next();
        System.out.println("몇 개의 수를 입력할 예정인가요?: ");

        int[] Min = new int[2];
        int[] Max = new int[2];
        int[] L = new int[time];
        time = L.length;
        for(int i = 0; i<L.length; i++){
            System.out.println("수를 입력하세요: ");
            L[i] = Scanner.next();
        }

        int min = Min[0];
        int max = Max[0];
        for(int i= 0; i < L.length; i++){
            if (L[i] < min)
                Min[0] = L[i];
            else if(L[i] > max)
                Max[0] = L[i];
        }

        System.out.println("최댓값: " + max);
        System.out.println("최솟값: " + min);
    }
}
