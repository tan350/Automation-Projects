public class A {
 int x = 20;
}
public class B extends A {
 int x = 30;
}
public class Test {
public static void main(String[] args)
{
 B b = new B();
 System.out.println(b.x);
 A a = new A();
 System.out.println(a.x);
 A a2 = new B();
 System.out.println(a2.x);
 }
}

