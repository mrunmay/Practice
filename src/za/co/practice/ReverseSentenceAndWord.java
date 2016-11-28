package za.co.practice;

public class ReverseSentenceAndWord
{
    public static void main(String[] args)
    {
        ReverseSentenceAndWord reverseSentenceObj = new ReverseSentenceAndWord();
        reverseSentenceObj.reverseSentence("I love India");
    }

    private void reverseSentence(String str)
    {
        ReverseSentenceAndWord reverseWordObj = new ReverseSentenceAndWord();
        String[] sentence = str.split(" ");
        String reverse = "";
        for (int i = sentence.length-1; i>=0; i--)
        {
            reverse += sentence[i] + " ";
            System.out.print(reverseWordObj.reverseWord(sentence[i]) + " ");
        }

        System.out.println();
        System.out.println(reverse);
    }

    private String reverseWord(String str)
    {
        if ((str == null) || (str.length() <= 1))
        {
            return str;
        }
        return reverseWord(str.substring(1)) + str.charAt(0);
    }
}
