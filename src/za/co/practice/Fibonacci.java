package za.co.practice;

public class Fibonacci
{
    public static void main(String[] args)
    {
        int prev = 0;
        int next = 1;
        int sum;

        for (int i = 1; i <= 10; i++)
        {
            System.out.print(prev + " ");
            sum = prev + next;
            prev = next;
            next = sum;
        }
    }
}
