package com.stringhandling;


public class StringHandling {

	public static void main(String[] args) {
		
		String networkerror = "Network Error";
		System.out.println(networkerror);
		
		String networkerror2 = new String("network Error");
		System.out.println(networkerror2);
		
		//StringHandling st = new StringHandling();
		//st.countVowelsCharacter(networkerror);
		
		System.out.println(networkerror.equals(networkerror2));
		System.out.println(networkerror.equalsIgnoreCase(networkerror2));
		System.out.println(networkerror.compareTo(networkerror2));
		String netwrkModifed = networkerror.concat(" not occured");
		System.out.println(networkerror);
		System.out.println(netwrkModifed);
		System.out.println(networkerror.contains("Error"));
		System.out.println(networkerror.indexOf("r"));
		System.out.println(networkerror.lastIndexOf('r'));
		System.out.println(networkerror.isEmpty());
		//System.out.println(networkerror.trim());
		System.out.println(networkerror.substring(5)); //including this no.
		System.out.println(networkerror.substring(1, 4)); // end no. will not include
		String netwReplaced = networkerror.replace("Network", "Absolute");
		System.out.println(networkerror);
		System.out.println(netwReplaced);
	}
	int countVowelsCharacter(String str) {
		
		int countVowelNo = 0;
		
		for(int i=0;i<str.length();i++) {
			//System.out.println(str.charAt(i));
			char lowerCase = Character.toLowerCase(str.charAt(i));
			if(lowerCase == 'a' || lowerCase == 'e' || lowerCase == 'i' || lowerCase == 'o' || lowerCase == 'u') {
				System.out.println(lowerCase);
				countVowelNo++;
			}
			
		}
		System.out.println(countVowelNo);
		return countVowelNo;
	}

}
