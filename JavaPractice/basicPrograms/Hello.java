

public class Hello {
    String name;

    public Hello(){
        name = "yash";
    }
    public static void main (){
        Hello a = new Hello();
        Hello b = a;
        Hello c = new Hello();

        a.name = "piyush";

        System.out.println(c.name);

    }
}