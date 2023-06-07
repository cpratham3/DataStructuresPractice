package dataStructures.Array;

import java.util.Scanner;

public class Array {
    private int count;
    private int[] items;


    public Array(int length) {
        items = new int[length];
    }

    public void print() {
        for (int i = 0; i < count; i++){
            System.out.println(items[i]);
        }

    }
    public void addElement(int element){
    if(items.length==count) {
        int[] newArray = new int[count*2];
        for(int i=0;i<count;i++){
           // Scanner sc = new Scanner(System.in);
            newArray[i]=items[i];
        }
    items= newArray;
    }
    items[count] = element;
    count++;
    }
    public void removeAt(int index){


            if (index < 0 || index >= count) {
                throw new IndexOutOfBoundsException(" Index is out of Bounds");
            }
            for (int i = index; i < count; i++) {
                items[i] = items[i + 1];
            }
            count--;

    }

    public int indexOf(int item){
        for(int i =0;i<count;i++){
            if(items[i]==item){
                return i;
            }

        }
        return -1;
    }
}
