package gmbh.conteco.SpringSchulungDB30052023.aop;

import java.util.ArrayList;

public class StreamMain {
    public static void main(String[] args) {
        ArrayList<Long> list = new ArrayList<>();
        list.add(1L);
        list.add(2L);
        list.add(3L);
        list.add(1L);
        list.add(2L);
        list.add(3L);

        long sum = list.stream().map(l -> l * 2)
                .filter(aLong -> aLong < 5)
                .mapToLong(Long::longValue)
                .sum();
        System.out.println(sum);
    }
}
