import java.util.Scanner;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        String b = sc.nextLine();
        String c = sc.nextLine();
        String[] d = b.split(" ");
        String[] e = c.split(" ");
        double[] f =  new double[d.length];
        double[] g =  new double[e.length];
        double h = 0;
        for(int i = 0;i<a;i++){
            f[i] = Double.parseDouble(d[i]);
            g[i] = Double.parseDouble(e[i]);
            h += Math.abs((g[i]-f[i]))*Math.abs((g[i]-f[i]));
        }
        double x = Math.sqrt(h);
        System.out.printf("%.2f\n",Double.valueOf(x));
    }
}