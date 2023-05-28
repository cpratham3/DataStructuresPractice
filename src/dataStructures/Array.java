package dataStructures;
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
            newArray[i]=items[i];

        }
    items= newArray;
    }

    else {
        items[count] = element;
        count++;
    }


        }
    }
