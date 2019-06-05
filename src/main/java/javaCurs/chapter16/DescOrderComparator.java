package javaCurs.chapter16;

import java.util.Comparator;

public class DescOrderComparator implements Comparator<Double>{

    @Override
    public int compare(Double arg1, Double arg2) {
        if(arg1 > arg2) {
            return -1;
        } else if (arg1 < arg2) {
            return 1;
        } else return 0;
    }
}
