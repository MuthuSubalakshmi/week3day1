package week3.day1;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome to chennai";
		String vowels=str.toLowerCase();
		int strlen=vowels.length();
		int count=0;
		for(int i=0;i<=strlen;i++)
		{
			if(vowels.charAt(i)=='e')
			{
				System.out.println("Number of vowels present is"+" "+vowels.charAt(i)+" "+i);
				count++;
				System.out.println(count);
			}
			
		}
		
	}

}
