package com.lec206.ex14_format;

import java.text.DecimalFormat;

public class DecimalFormatMain {

	public static void main(String[] args) {
	
		double num = 1234567.89;
		
		DecimalFormat df = new DecimalFormat();
		System.out.println(df.format(num));

		df = new DecimalFormat("0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0000000000.00000000");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.#");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#######.#####");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#,###.0; -#,###.0");
		System.out.println(df.format(num));
	
		df = new DecimalFormat("#.# %");
		System.out.println(df.format(num));

	}

}
