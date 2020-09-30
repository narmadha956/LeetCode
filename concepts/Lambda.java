interface FuncInterface
{
    // An abstract function 
    void abstractFun(int x, int y);

    // A non-abstract (or default) function 
    default void normalFun()
    {
        System.out.println("Hello");
    }
}

class Test
{
    public static void main(String args[])
    {
        // lambda expression to implement above 
        // functional interface. This interface 
        // by default implements abstractFun() 
        FuncInterface fobj = (int x, int y)->System.out.println(2*x*y);

        // This calls above lambda expression and prints 10. 
        fobj.abstractFun(5,5);

    }

    public static void checkIfAllAreCharacters(String word)
    {
        word.chars().allMatch(Character::isLetter);
    }
} 