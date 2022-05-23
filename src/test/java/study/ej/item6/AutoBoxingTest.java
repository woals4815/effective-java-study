package study.ej.item6;

import org.junit.jupiter.api.Test;

public class AutoBoxingTest {
    @Test
    public void autoBoxingTest() {
        long startTime = System.currentTimeMillis();
        long result = sum();
        long finishTime = System.currentTimeMillis();

        System.out.println("elapsed time = " + (finishTime - startTime));
        // elapsed time = 6235
    }

    @Test
    public void fixAutoBoxingTest() {
        long startTime = System.currentTimeMillis();
        long result = fixSum();
        long finishTime = System.currentTimeMillis();

        System.out.println("elapsed time = " + (finishTime - startTime));
        // elapsed time = 684
    }

    private static long sum() {
        Long sum = 0L;
        for(long i=0; i< Integer.MAX_VALUE; i++) {
            //long인 i가 Long 클래스에 더해지면서 오토 박싱 됨
            sum += i;
        }
        return sum;
    }

    private static long fixSum() {
        long sum = 0L;

        for(long i=0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }

        return sum;
    }
}
