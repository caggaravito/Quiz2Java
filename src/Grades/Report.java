package Grades;

import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class Report {

	public static void main(String[] args) {

		String input ="Yes";
		Scanner scanner = new Scanner(System.in);
		Scanner grade = new Scanner(System.in);
		
		List<Integer> list=new ArrayList<Integer>();

		List<Integer> listSorted =new ArrayList<Integer>();
		
		
		while(!input.equals("no")) {
			System.out.println("Hello! Please enter a Grade");
			list.add(grade.nextInt());
				
			System.out.println("Do you want to enter another grade? (Yes/No): ");
			input = scanner.next().toLowerCase();
		}
		
			
		Collections.sort(list);
		System.out.println( list);	
		
		int last = list.get(list.size()-1);
		
		System.out.println("The Lowest score is: "+list.get(0));
		System.out.println("The Higest score is: "+ last);
		
		int sum = 0;
		int aStudent =0;
		int bStudent =0;
		int cStudent =0;
		int fStudent =0;
		
				
		for(int i=0; i < list.size();i++) {
			sum=sum+list.get(i);
			if (list.get(i)>=90)
				aStudent++;
			else if ((list.get(i)>=80)&&(list.get(i)<90))
				bStudent++;
			else if ((list.get(i)>=70)&&(list.get(i)<80))
				cStudent++;
			else
				fStudent++;
		}
		System.out.println("The Average is "+ sum/list.size());
		System.out.println(" A Students " + aStudent);
		System.out.println(" B Students " + bStudent);
		System.out.println(" C Students " + cStudent);
		System.out.println("Students that failed " + fStudent);
		
	}

		
	}
