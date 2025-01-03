import java.util.Scanner;
public class string_is_a_Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s2=palindrom(s);
        if(s.equals(s2)){
            System.out.println("palindrome");

        }else{
            System.out.print("not palindrome");
        }

    }
    public static String palindrom(String s1){
        String s11=new String();
        for(int i=s1.length()-1;i>=0;i--){
            s11=s11+s1.charAt(i);
        }
        

        return s11;

    }
}
