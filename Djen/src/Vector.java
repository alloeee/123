public class Vector <T> {

    private T[] array;
    private int size;
    private int capacity;

    Vector(){
        this.capacity=1;
        this.size=0;
        this.array=(T[]) new Object[this.capacity];
    }

    private void resize(){
        this.capacity*=2;
        T[]temp=(T[]) new Object[this.capacity];
        System.arraycopy(this.array,0,temp,0,this.size);
        this.array=temp;
    }

    public void add(int index,T elem){
        if(size>=capacity){
            resize();
        }
        for(int i=index;i<size;i++){
            array[i+1]=array[i];
        }
        array[index]=elem;
        size++;
    }

    public void add(T elem){

        if(size>=capacity){
            resize();
        }
        array[size]=elem;
        size++;
    }

    public T remove(int index){
        T temp=array[index];
        for(int i=index;i<size-1;i++){
            array[i]=array[i+1];
        }
        size--;
        return temp;
    }


    public void print(){
        System.out.print("Вектор: ");
        for(int i=0;i<size;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public void reverse(){
        T temp;
        for(int i=0;i<size/2;i++){
            temp=array[i];
            array[i]=array[size-i-1];
            array[size-i-1]=temp;
        }
    }

}
