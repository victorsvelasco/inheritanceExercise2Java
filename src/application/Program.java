package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.Person;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Person> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char x = sc.next().charAt(0);
			while (x != 'i' && x != 'c') {
				System.out.print("Individual or company (i/c)? ");
				x = sc.next().charAt(0);
			}
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			Double income = sc.nextDouble();
			if (x == 'i') {
				System.out.print("Health expenditures:");
				Double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, income, healthExpenditures));
			} else {
				System.out.print("Number of employees: ");
				int employees = sc.nextInt();
				list.add(new Company(name, income, employees));
			}
		}

		System.out.println();
		System.out.println("TAXES PAID:");
		double calc = 0;
		for (Person x : list) {
			calc +=x.tax();
			System.out.println(x.getName() + ": $ " + (String.format("%.2f", x.tax())));
		}
		
		System.out.println();
		System.out.println("TOTAL PAID:");
		System.out.printf("TOTAL TAXES: $ %.2f", calc);
		sc.close();
	}

	}