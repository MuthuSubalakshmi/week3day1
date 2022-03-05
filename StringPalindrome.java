package week3.day1;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="madam";
String strrev="";
int slen=str.length();

for(int i=slen-1;i>=0;i--)
{
	strrev=strrev+str.charAt(i);

}
	if(str.equals(strrev))
	
		System.out.println("palindrome");
	
	else
	
		System.out.println("not palindrome");
	
}


	}

