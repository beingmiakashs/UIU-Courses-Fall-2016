package com.sa.sectionA.fifthLecture.twentyOneLecture;

/**
 * Created by akashs on 12/18/16.
 */
public class GenericsSolution {
    public static void main(String[] args) {
        int r1 = (Integer) max(10,15);
        Double r2 = (Double)max(10.12,15.5);
        Integer[] ar = new Integer[]{10,5,12};
        printArray(ar);
        Double[] dr = new Double[]{10.0,5.0,12.0};
        printArray(dr);
        max(10,12);

        InnerGenClass<Integer> in = new InnerGenClass<Integer>();
    }

    public static class InnerGenClass<T extends Number>{
        public T fun(T num){

            Integer tempVal = num.intValue();
            tempVal+=10;
            return (T)tempVal;
        }
    }


    public static <V extends Comparable<V>> V max(V a, V b){
        int res;
        if(a.compareTo(b)>0) return a;
        return b;
    }

    public static <MN, H, G,K> void printArray(MN ar[]){
        for(MN temp: ar){
            System.out.println(temp);
        }
    }

//    public static Object max(Object a, Object b){
//        return a;
//    }

//    public static Integer max(Integer a, Integer b){
//        if(a>b) return a;
//        return b;
//    }
//
//    public static Double max(Double a, Double b){
//        if(a>b) return a;
//        return b;
//    }
//
//    public static String max(String a, String b){
//        if(a.compareTo(b)>0) return a;
//        return b;
//    }
}
