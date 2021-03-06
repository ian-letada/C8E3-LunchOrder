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
		System.out.format("Each hamburger has %.1fg of fat, %.1fg of carbs and %.1fg of fiber%n",
				hamburger.getFat(), hamburger.getCarbs(), hamburger.getFiber());

		System.out.print("Enter number of salads: ");
		int saladQuantity = scan.nextInt();
		System.out.format("Each salad has %.1fg of fat, %.1fg of carbs and %.1fg of fiber%n", salad.getFat(),
				salad.getCarbs(), salad.getFiber());

		System.out.print("Enter number of french fries: ");
		int frenchFriesQuantity = scan.nextInt();
		System.out.format("French fries have %.1fg of fat, %.1fg of carbs and %.1fg of fiber%n",
				frenchFries.getFat(), frenchFries.getCarbs(), frenchFries.getFiber());

		System.out.print("Enter number of soda: ");
		int sodaQuantity = scan.nextInt();
		System.out.format("Each soda has %.1fg of fat, %.1fg of carbs and %.1fg of fiber%n", soda.getFat(),
				soda.getCarbs(), soda.getFiber());

		BigDecimal total = BigDecimal.valueOf(0);
		total = total.add(hamburger.getPrice().multiply(BigDecimal.valueOf(hamburgerQuantity)));
		total = total.add(salad.getPrice().multiply(BigDecimal.valueOf(saladQuantity)));
		total = total.add(frenchFries.getPrice().multiply(BigDecimal.valueOf(frenchFriesQuantity)));
		total = total.add(soda.getPrice().multiply(BigDecimal.valueOf(sodaQuantity)));

		System.out.format("Your order comes to $%.2f", total);
	}
}
