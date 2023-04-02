package consultation_30_03_2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer>ints = Arrays.asList(4, 3, 2, 1);
       // System.out.println( numbers(ints,3));
        //Есть список лист с целыми числами Нужно написать метод который вернет
        //чисел но без єлементов которые больше заданного числа n
        //3.1.6.8 меньше или равні числу 3
    }
    public  List<Integer>numbers(List<Integer> ints,int n) {
    List<Integer>result = new ArrayList<Integer>();
    for(int i :ints){
        if(i<=n){
            result.add(i);
        }
    }
        return result;
    }

    public static String findMinOrMax(List<String>strings, int j){
        String min = strings.get(0);
        int index =0;
        String max = strings.get(0);
        int indexMax =0;
        for(int i =0;i<strings.size();i++){
            if(strings.get(i).length()<min.length()){
                min = strings.get(i);
                index =i;
            }else if (strings.get(i).length()>max.length()){
                max=strings.get(i);
                indexMax=i;
            }
        }
        if(index<indexMax){
            return min;
        }
        return max;
    }

    }

