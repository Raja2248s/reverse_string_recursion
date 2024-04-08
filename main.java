
public class Main {
  public static void main(String[] args) {
    //Input String 
    String s1= "Gaurav";

    //converting string to array
    char []s = s1.toCharArray();

    //function call
    reverse(0,s.length-1,s);

    // output string array to string
    String s2= new String(s);
    System.out.println(s2);
  }
  static void reverse(int i , int j,char[] s){
 // i= first index  , j=last index
    
    //Base case
    if(i>j){
      return ;
    }
    //swap the values in index i and j
    swap(i , j , s);

    //increse the front value and decresase the tail value
    i++;
    j--;

    //recursive call
    reverse(i , j,s);
  }

   static void swap(int i , int j , char[] s){
     //swapping using temporrary variable
      char temp = s[i];
       s[i] = s[j];
       s[j] = temp;
    }
  
}
