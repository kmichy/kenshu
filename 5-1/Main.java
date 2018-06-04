import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = "";
        if(a.length()>1){
            if(a.length() % 2 == 0){
                String c = a.substring(1,a.length()/2);
                String d = a.substring(a.length()/2,a.length()-1);
                b = c+a.charAt(0)+a.charAt(a.length()-1)+d;
            }else{
                String c = a.substring(1,a.length()/2);
                String d = a.substring(a.length()/2+1,a.length()-1);
                //真ん中
                String e = String.valueOf(a.charAt(a.length()/2));
                b = c+a.charAt(0)+e+a.charAt(a.length()-1)+d;
            }
        }else{
            b = a;
        }
        System.out.println(b);
    }
}