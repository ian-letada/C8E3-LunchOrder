package norima.lunchorder;

import java.math.BigDecimal;
import java.util.Scanner;

public class LunchOrder {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Food hamburger = new Food(1.85, 9, 33, 1);
		Food salad = new Food(2.00, 1, 11, 5);
		Food frenchFries = new Food(1.30, 11, 36, 4);
		Food soda = new Food(0.95, 0, 38, 0);

		System.out.print("Enter number of hamburgers: ");
		int hamburgerQuantity = scan.nextInt();
		System.out.format("Each hamburger has %.1fg of fat, %.1fg of carbs and %.1fg of fiber",
				hamburger.getFat(), hamburger.getCarbs(), hamburger.getFiber());
		System.out.println("\n");

		System.out.print("Enter number of salads: ");
		int saladQuantity = scan.nextInt();
		System.out.format("Each salad has %.1fg of fat, %.1fg of carbs and %.1fg of fiber", salad.getFat(),
				salad.getCarbs(), salad.getFiber());
		System.out.println("\n");

		System.out.print("Enter number of french fries: ");
		int frenchFriesQuantity = scan.nextInt();
		System.out.format("French fries have %.1fg of fat, %.1fg of carbs and %.1fg of fiber",
				frenchFries.getFat(), frenchFries.getCarbs(), frenchFries.getFiber());
		System.out.println("\n");

		System.out.print("Enter number of soda: ");
		int sodaQuantity = scan.nextInt();
		System.out.format("Each soda has %.1fg of fat, %.1fg of carbs and %.1fg of fiber", soda.getFat(),
				soda.getCarbs(), soda.getFiber());
		System.out.println("\n");

		BigDecimal total = BigDecimal.valueOf(0);
		for (int i = 0; i < hamburgerQuantity; i++) {
			total = total.add(hamburger.getPrice());
		}
		for (int i = 0; i < saladQuantity; i++) {
			total = total.add(salad.getPrice());
		}
		for (int i = 0; i < frenchFriesQuantity; i++) {
			total = total.add(frenchFries.getPrice());
		}
		for (int i = 0; i < sodaQuantity; i++) {
			total = total.add(soda.getPrice());
		}

		System.out.format("Your order comes to $%.2f", total);
	}
}
