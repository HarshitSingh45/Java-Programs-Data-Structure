package classesAndObjects;

public class test1 extends test{
    public static void main(String[] args) {
        test v = new test();
        v.colour = "white";
        v.set(1010) ;
        System.out.println(v.colour + " " + v.get());
    }
}

