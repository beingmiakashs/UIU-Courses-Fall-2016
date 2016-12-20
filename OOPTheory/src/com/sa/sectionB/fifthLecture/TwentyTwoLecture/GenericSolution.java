package com.sa.sectionB.fifthLecture.TwentyTwoLecture;

/**
 * Created by akashs on 12/20/16.
 */
public class GenericSolution {
    public static void main(String[] args) {

        Integer[] ai = new Integer[]{10,12,5};
        Double[] di = new Double[]{5.5,12.6,5.5};
        printArray(ai);
        printArray(di);

        InnerGenClass<Double> gen = new InnerGenClass<Double>();
    }

    public static class InnerGenClass<M>{
        public M fun(M a, double d){
            return a;
        }
    }

    public static <T extends Comparable<T> > T max(T a, T b){
        int num;
        if(a.compareTo(b)>0) return a;
        return b;
    }

    public static  <T,M> void printArray(T ar[]){
        M res;
        for(T temp: ar){
            System.out.println(temp);
        }
    }
}
