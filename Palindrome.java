public class Palindrome{
    public static boolean is_palindrome(String s)
    {
      String inverse = "";
 int length = s.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         inverse = inverse + s.charAt(i);  
      if (s.equals(inverse))  
         return true; 
      else  
         return false;
    }   
}
