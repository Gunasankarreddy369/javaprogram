import java.util.Scanner;
public class insert_new_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="GreeksGreeks";
        String add="For";
        int index=5;
        String s2=AddString(s,add,index);
        System.out.println(s2);
    }
public static String AddString(String orginal,String added,int n){
    String s1=new String();
    for(int i=0;i<orginal.length();i++){
        s1=s1+orginal.charAt(i);
        if(i==n){
            s1=s1+added;
        }
    }
    return s1;

}
}
