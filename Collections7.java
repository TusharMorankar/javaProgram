import java.util.*;

class Collections7
{
    public static void main(String arg[])
    {
        Stack <Character> sobj = new Stack<Character>();

        sobj.push('a');
        sobj.push('b');
        sobj.push('c');
        sobj.push('d');
        sobj.push('e');

        System.out.println("Element of stack :"+sobj);

        System.out.println("poped elements is: "+sobj.pop());

        System.out.println("pushed elements is: "+sobj.push());

    }
}