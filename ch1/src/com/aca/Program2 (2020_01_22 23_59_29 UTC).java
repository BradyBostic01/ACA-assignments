package com.aca;

public class Program2 {

	public static void main(String[] args) {
		String p, q;			//create references p and q
		p = new String("hello");//create object
		q = p.toUpperCase();	//create second object		
		System.out.println(p);	//display p-string
		System.out.println(q);	//display q-string
		String r = new String("bye");//create ref r and object
		String s = "all done";	//create ref s and object	
		System.out.println(r);	//display r string
		System.out.println(s);	//display s-string

	}

}
