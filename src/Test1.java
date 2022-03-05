import java.util.*;

public class Test1 {
    public static int strToInt(String str) {
        char[] arr = str.trim().toCharArray();
        int sign = 0, i = 1, bin = Integer.MAX_VALUE/10, res = 0;
        if (arr[0] == '-') {
            sign = -1;
        } else if (arr[0] != '+') {
            i = 0;
        }
        for (int j = i; j < arr.length; j++) {
            if (arr[j] < '9' && arr[j] > '0') {
                res = res*10 +(arr[j]-'0');
                if (res > bin || ((res == bin) && (arr[j] > '7'))) {
                    return sign == 0 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
            } else {
                break;
            }
        }
        return sign*res;
    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String[] str1 = sc.nextLine().split("\\s+");
//        String[] str2 = sc.nextLine().split("\\s+");
//        int h = Integer.parseInt(str1[0]);
//        int n = Integer.parseInt(str1[1]);
//
//        ArrayList<Integer> list = new ArrayList<>();
//        for(String s:str2){
//            list.add(Integer.parseInt(s));
//        }
//
//        list.sort(new Comparator<Integer>(){
//            @Override
//            public int compare(Integer h1,Integer h2){
//                int d1 = h1-h;
//                int d2 = h2-h;
//                d1 = d1>0?d1:-d1;
//                d2 = d2>0?d2:-d2;
//                if(d1!=d2) return d1-d2;
//                else return h1-h2;   //Integer 可以直接相减，String 或其它类型自然排序得用 o1.compareTo(o2) 了
//            }
//        });
//
//        StringBuilder bu = new StringBuilder();
//        for(int i=0; i<list.size(); i++){
//            bu.append(list.get(i)).append(" ");
//        }
//        System.out.println(bu.toString());

        System.out.println(strToInt("4193 with words"));


    }
}
