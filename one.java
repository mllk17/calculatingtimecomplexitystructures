import java.lang.*;
import java.util.*;

public class one {
    public static void main(String[] args){
        int[] uno = new int[1000];
        for(int x = 0; x < uno.length; x++){
            uno[x] = (int)(Math.random()*1000);
        }

        long first = System.nanoTime();
        System.out.println("The time it takes to populate the array in nanoseconds is " + first);

        ArrayList<Integer> dos = new ArrayList<>();
        for(int x = 0; x < 1000; x++){
            dos.add((int)(Math.random()*1000));
        }
        long second = System.nanoTime();
        System.out.println("The time it takes to populate the arraylist in nanoseconds is " + (second-first));

        List<Integer> tres = new LinkedList<>();
        for(int x = 0; x < 1000; x++){
            tres.add((int)(Math.random()*1000));
        }
        long third = System.nanoTime();
        System.out.println("The time it takes to populate the linkedlist in nanoseconds is " + (third-second));

        int chosen = (int)(Math.random()*1000);
        boolean than = false;

        long empty = 0;
        long empty2 = 0;

        for(int y = 0; y < uno.length; y++){
            if(uno[y] == chosen){
                long fourth = System.nanoTime();
                empty = fourth;
                System.out.println("The time it takes to find the number in the array is " + (fourth-third));
                than = true;
                break;
            }
        }
        if(than == false) {
            long four = System.nanoTime();
            empty2 = four;
            System.out.println("The time it takes to not find the number in the array is " + (four-third));
        }

        than = false;
        long empty3 = 0;
        long empty4 = 0;

        for(int y = 0; y < dos.size(); y++){
            if(dos.get(y) == chosen){
                long fifth = System.nanoTime();
                empty3 = fifth;
                if(empty != 0) {
                    System.out.println("The time it takes to find the number in the arraylist is " + (fifth - empty));
                }
                else{
                    System.out.println("The time it takes to find the number in the arraylist is " + (fifth - empty2));
                }
                than = true;
                break;
            }
        }
        if(than == false) {
            long five = System.nanoTime();
            empty4 = five;
            if(empty != 0) {
                System.out.println("The time it takes to find the number in the arraylist is " + (five - empty));
            }
            else{
                System.out.println("The time it takes to find the number in the arraylist is " + (five - empty2));
            }
        }

        than = false;

        for(int y = 0; y < tres.size(); y++){
            if(tres.get(y) == chosen){
                long sixth = System.nanoTime();
                if(empty3 != 0) {
                    System.out.println("The time it takes to find the number in the linkedlist is " + (sixth - empty3));
                }
                else{
                    System.out.println("The time it takes to find the number in the linkedlist is " + (sixth - empty4));
                }
                than = true;
                break;
            }
        }
        if(than == false) {
            long six = System.nanoTime();
            if(empty3 != 0) {
                System.out.println("The time it takes to find the number in the linkedlist is " + (six - empty3));
            }
            else{
                System.out.println("The time it takes to find the number in the linkedlist is " + (six - empty4));
            }
        }
    }
}