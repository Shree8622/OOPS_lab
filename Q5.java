package Practice;
interface Animal
{
     void eat();
    void sound();
}
interface Tired_Animal extends Animal
{
    void tired();
}
class Lion implements Animal
{
    public void eat()
    {
        System.out.println("I like meat");
    }
    public void sound()
    {
        System.out.println("Roar");
    }
}
class Snake implements Tired_Animal
{
    public void eat()
    {
        System.out.println("Rats....tasty!");
    }
    public void sound()
    {
        System.out.println("Hiss");
    }
    public void tired()
    {
        System.out.println("I cant crawl around more!");
    }
}
public class Q5 {
    Lion l = new Lion();

}
