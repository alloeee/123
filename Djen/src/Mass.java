public class Mass <T> {

    T[]a;
    Mass(T[]a){
        this.a=a.clone();
    }

    public void print(){
        System.out.println("Массив: ");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");

        }
        System.out.println();
    }

    T elemByInd(int i) throws ArrayIndexOutOfBoundsException{
        if(i<0||i>a.length)
            throw new ArrayIndexOutOfBoundsException("Выход за границы индекса");

        return a[i];
    }

    public void obr(){
    T temp;
            for(int i=0;i<a.length/2;i++)
            {
    temp=a[i];
    a[i]=a[a.length-1-i];
    a[a.length-1-i]=temp;
            }

    }

    void chast (int p) throws ArrayIndexOutOfBoundsException
    {if(p<0||p>a.length){
            throw new ArrayIndexOutOfBoundsException("Выход за границы индекса");
        }
        for(int i=0;i<p;i++){
            System.out.println(a[i]+" ");
        }
    }

}


