package com.javaex.ch07;

public class MarkeReportTest {

	public static void main(String[] args) {

		MakeReport report = new MakeReport();
		String builder = report.getReport();

		System.out.println(builder);
	}

}
