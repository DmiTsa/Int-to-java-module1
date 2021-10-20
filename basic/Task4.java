package module1.basic;

//Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами 
//дробную и целую части числа и вывести полученное значение числа.
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		int integerPart;
		double rezultNumber;
		double value;

		System.out.println("Введите число вида ххх.ххх");
		value = getDoubleFromConsole();

		integerPart = (int) value;
		rezultNumber = (int) Math.round( ((value - integerPart) * 1000) );
		rezultNumber += integerPart / 1000d;
		System.out.println("Результат = " + rezultNumber);
	}

	private static double getDoubleFromConsole() {
		double value;

		System.out.print(">");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		while (!scanner.hasNextDouble()) {
			scanner.next();
			System.out.print(">");
		}

		value = scanner.nextDouble();

		return value;
	}

}

