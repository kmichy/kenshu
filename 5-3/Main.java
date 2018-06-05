import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        String b = sc.nextLine();
        sc.close();
        String[] c = b.split("[\\s]+");
        Set<String> set = new TreeSet<String>();
        for(int i = 0;i<c.length;i++){
            set.add(c[i]);
        }
        Map<String,Integer> map = new HashMap<String,Integer>();
        Iterator iterator = set.iterator();
        for(int i = 0;i<set.size();i++){
            map.put(String.valueOf(iterator.next()),0);
        }

        iterator = set.iterator();
        int count[] = new int[set.size()];
        int total = 0;
        int end = 0;
        String answer = c[0];
        for(int i = 0;i<c.length;i++){
            if(set.contains(c[i])){
                total += 1;
                int t = map.get(c[i])+1;
                map.put(c[i],t);
                // System.out.println(map.get(c[i]));
                if(t > (c.length+set.size()-1) / set.size() && end == 0){
                    answer = c[i];
                    end = total;
                }if(c.length -1 == i && end == 0){
                    end = total;
                }
            }
        }
        map.entrySet().stream().sorted(java.util.Map.Entry.comparingByValue());
        List<Integer> list = new ArrayList<Integer>(map.values());
        if(map.size()>=2){
            if(list.get(0) == list.get(1)){
                System.out.println("TIE");
            }else{
                System.out.println(answer + " " + end);
            }
        }else{
            System.out.println(answer + " " + end);
        }
    }
}