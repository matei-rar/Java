public abstract class AbstractMotoare {
    public abstract void operatiaM1();
    public abstract void operatieM2();
}
class Motoare1 extends AbstractMotoare{
    Motoare1(String arg)
    {System.out.println("Model motor1: "+arg);}
    // Implementare cod pentru:
    public void operatiaM1() { };
    public void operatieM2() { };
}
class Motoare2 extends AbstractMotoare{
    Motoare2(String arg)
    {System.out.println("Model motor2: "+arg);}
    // Implementare cod pentru:
    public void operatiaM1() { };
    public void operatieM2() { };
}
