import java.util.Scanner;
public class print_1_to_10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=sc.nextInt();
        for(int i=n;i<=s;i++){
            System.out.println(i);
        }
    }
}
