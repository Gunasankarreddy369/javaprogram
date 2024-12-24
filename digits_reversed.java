import java.util.Scanner;
public class digits_reversed {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int reverse=0;
        int temp=0;
        while(number>0)
        {
            temp=number%10;
            reverse=reverse*10+temp;
            number/=10;
        }
        System.out.println(reverse);
    }
}
