package com.regex;

import java.util.regex.Pattern;
public class Matchs {

	public static void main(String[] args) {
		// TODO Auto-generated method stubSystem.out.println("===>"+Pattern.matches("s", "mk"));
/*System.out.println("===>"+Pattern.matches(".s", "ms"));
System.out.println("===>"+Pattern.matches(".s", "sk"));
System.out.println("===>"+Pattern.matches("..s", "mks"));
System.out.println("===>"+Pattern.matches(".s", "msk"));
System.out.println("===>"+Pattern.matches("s.", "sk"));
Pattern.matches("s", "mk");*/
		/*Pattern p=Pattern.compile("Zeba");
		Matcher m=p.matcher("Zeba");
		System.out.println(m.find());*/
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2"));
		System.out.println(Pattern.matches("[789]{2}[0-9]{9}", "99530389492"));

}
}

