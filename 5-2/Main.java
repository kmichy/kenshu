import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        String b = sc.nextLine();
        String[] c = b.split("[\\s]+");
        int[] y = new int[c.length];
        int e = 0;
        for(int i = 0;i<c.length;i++){
            y[i] = Integer.parseInt(c[i]);
        }
        List<Integer> list = new ArrayList<>();
        for (int num : y) {
            if (!list.contains(num)) {
               list.add(num);
            }
        }
 
        int[] d = new int[list.size()];
            for (int j = 0; j < d.length; j++) {
            d[j] = list.get(j);
        }
        // Arrays.sort(d);
        if(d.length == 1){
            e += 1;
        }
        else if(d.length == 2){
            if(Math.abs(d[0]-d[1]) <=2){
                e += 2;
            }else{
                e += 1;
            }
        }else if(d.length >= 3){
            int x = 0;
            for(int i = 0;i<d.length-2;i++){
                int f = Math.abs(d[i]-d[i+1]);
                if(f <= 2){
                    int g = Math.abs(d[i+2]-d[i]);
                    if(x == 0){
                        x += 1;
                        e += 2;
                    }
                    if(x == 1 && g <= 2){
                        x += 1;
                        e += 1;
                    }
                }
                if(i == d.length-3 && x == 0){
                    int h = Math.abs(d[i+2]-d[i+1]);
                    if(h <= 2){
                        e+= 1;
                    }
                }
            }
            if(x == 0){
                e += 1;
            }
        }
    System.out.println(Integer.valueOf(e));
    }
}