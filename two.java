import java.lang.*;
import java.util.*;

public class two {
    public static void main(String[] args){
        ArrayList<Integer> uno = new ArrayList<>();
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
                break;
            }
        }
        if(than == false) {
            System.out.println("The time it takes to not find the number in the array is " + (System.nanoTime()-first));
        }
    }
}


