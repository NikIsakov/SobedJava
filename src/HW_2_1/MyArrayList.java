package HW_2_1;

public class MyArrayList<E> {
    private int SIZE = 10;
    private Object[] array = new Object[SIZE];
    private int pointer = 0;

    public void add(E item){
        if (pointer==array.length-1){
            int newLenth = array.length*2;
            Object[] newArray = new Object[newLenth];
            System.arraycopy(array,0, newArray, 0,pointer);
        }
        array[pointer++]=item;
    }

    public E get(int index){
       return (E) array[index];
    }

    public int size(){
        return pointer;
    }

    public void delete(int index){
        for (int i=index; i<pointer;i++){
            array[i]=array[i+1];
            array[pointer]=null;
            pointer--;
        }
    }
}
