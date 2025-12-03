public class Djen {
    public static void main(String[]args){
//        Integer[]m1={1,2,3,4,5};
//        Mass<Integer> mi=new Mass<>(m1);
//        try{
//            System.out.println(mi.elemByInd(3));
//            mi.print();
//            mi.obr();
//            mi.print();
//            mi.chast(2);
//        }
//        catch(ArrayIndexOutOfBoundsException e)
//        {
//            System.out.println(e.getMessage());
//        }
//        Double[]m2={1.1,2.2,3.3,4.4,5.5};
//        Mass <Double> md=new Mass<>(m2);
//        try{
//            System.out.println(md.elemByInd(3));
//            md.obr();
//            md.print();
//            md.chast(2);
//        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e.getMessage());
//        }
//        String[]m3={"123","234","345"};
//        Mass<String> ms=new Mass<>(m3);
//        try{
//            System.out.println(ms.elemByInd(2));
//            ms.obr();
//            ms.print();
//            ms.chast(2);
//        }
//        catch(ArrayIndexOutOfBoundsException e)
//        {
//            System.out.println(e.getMessage());
//        }



        Vector<Double>a=new Vector<>();
        a.add(0,3.5);
        a.add(4.0);
        a.add(2.0);
        a.print();
        a.add(2,7.0);
        a.print();
        System.out.println(a.remove(1));
        a.print();
        a.reverse();
        a.print();

        Vector<String>b=new Vector<>();
        b.add(0,"THREE");
        b.add("FOUR");
        b.add("TWO");
        b.print();
        b.add(2,"SEVEN");
        b.print();
        System.out.println(b.remove(1));
        b.print();
        b.reverse();
        b.print();

    }
}
