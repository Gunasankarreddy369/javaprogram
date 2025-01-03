
import java.util.*;

public class same {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        //StringBuffer s2=new StringBuffer();
        for(int i=0;i<=s.length()-1;i++){
            for(int j=0;j<=s1.length()-1;j++){
                if(s.charAt(i)==s1.charAt(j)){
                    for(int k=0;k<=s2.length()-1;k++){
                        if(s.charAt(i)==s2.charAt(k))
                        {
                            System.out.println(s.charAt(i));
                        }
                    }
                }
            }
        }

    }
}
