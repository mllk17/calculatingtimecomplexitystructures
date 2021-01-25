import java.lang.*;
import java.util.*;

public class three {
    public static void main(String[] args){
        List<Integer> uno = new LinkedList<>();
        for(int x = 0; x < 1000; x++){
            uno.add((int)(Math.random()*1000));
        }
        double first = System.nanoTime();
        System.out.println("The time it takes to populate the array in nanoseconds is " + first);
        int chosen = (int)(Math.random()*1000);
        boolean than = false;
        for(int y : uno){
            if(y == chosen){
                System.out.println("The time it takes to find the number in the array is " + (System.nanoTime()-first));
                than = true;
            }
        }
        if(than == false) {
            System.out.println("The time it takes to not find the number in the array is " + (System.nanoTime()-first));
        }
    }
}
