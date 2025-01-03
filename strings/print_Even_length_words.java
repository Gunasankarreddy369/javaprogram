import java.util.Scanner;
public class print_Even_length_words{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        for(String w:s1.split("\\s+")){
            if(w.length()%2==0){
                System.out.println(w);
            }
        }
    }
        
 }


