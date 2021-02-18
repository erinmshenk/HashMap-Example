import java.util.*;
/*
	Erin Shenk
	This is a code I wrote from a prompt on the coding website firecode.io
	The prompt was to write a code that returns the first nonrepeating character in a string.
*/

public class NonDup
{
	public static void main(String[] args)
	{
		String a = "aabbcddee";
		String b = "a";
		String c = "hjh";
		String d = "aabb";
		String e = "abbccdeef";

		//f = firstNonRepeatedCharacter(a);
		System.out.println(firstNonRepeatedCharacter(a));

		//f = firstNonRepeatedCharacter(b);
		System.out.println(firstNonRepeatedCharacter(b));

		//f = firstNonRepeatedCharacter(c);
		System.out.println(firstNonRepeatedCharacter(c));

		//f = firstNonRepeatedCharacter(d);
		System.out.println(firstNonRepeatedCharacter(d));

		//f = firstNonRepeatedCharacter(e);
		System.out.println(firstNonRepeatedCharacter(e));
	}

	public static Character firstNonRepeatedCharacter(String str) 
	{
		//new instance of HashMap with character key and integer value
    	HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
    
    	//iterates through string
    	for(int i = 0; i <= str.length()-1; i++)
    	{
    		//if key does not exist in HashMap then add it with a value of 1
        	if(hm.get(str.charAt(i)) == null)
        	{
            	hm.put(str.charAt(i), 1);
        	}
        	//increment value at key by 1
        	else
        	{
            	hm.put(str.charAt(i), hm.get(str.charAt(i)) + 1);
        	}
    	}
    
    	//iterates through string
    	for(int j = 0; j <= str.length()-1; j++)
    	{
    		//sets current character to c
        	char c = str.charAt(j);
        
        	//if value at c (key) is 1 then return c
        	if(hm.get(c) == 1)
        	{
            	return c;
        	}
    	}
    	
    	//if no nonrepeating characters return null
    	return null;
	}
}