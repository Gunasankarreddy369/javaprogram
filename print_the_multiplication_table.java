import java.util.Scanner;
public class print_the_multiplication_table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        for(int i=1;i<=1010;i++){
            System.out.println(s+"*"+i+"="+s*i);
        }
    }
}
