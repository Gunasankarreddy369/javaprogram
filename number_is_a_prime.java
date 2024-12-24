import java.util.Scanner;
public class number_is_a_prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        boolean flag=true;
        for(int i=2;i<s;i++){
            if(s%i==0){
                flag=false;
                break;
            }
        }
        if(flag==false && s>1){
            System.out.println("nunber is prime");

        }else{
            System.out.println("not prime");
        }
    }
}
