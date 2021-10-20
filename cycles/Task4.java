package module1.cycles;

//Составить программу нахождения произведения квадратов первых двухсот чисел.
public class Task4 {

	public static void main(String[] args) {
		final int MAXNUMBER = 200;
		long rezult;
		int count;

		rezult = 1;
		count = 1;

		while (count <= MAXNUMBER) {
			rezult *= count * count;
			count++;
			
			if (rezult < 0) {
				System.out.println("Ошибка! Превышение максимального значения!");
				count = MAXNUMBER + 1;
				rezult = 0;
			}
		}
		System.out.println(rezult);
	}
}
