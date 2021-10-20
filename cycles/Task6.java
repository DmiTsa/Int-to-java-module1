package module1.cycles;

// Вывести на экран соответствие между символами и их численными обозначениями в памяти компьютера.
public class Task6 {

	public static void main(String[] args) {
		final char BEGIN_RANGE = 'А';
		final char END_RANGE = 'я'; 
		
		System.out.println("Буква\t|Обозначение");
		for (int i = BEGIN_RANGE; i <= END_RANGE; i++) {
			System.out.println((char) i + "\t| " + i);
		}
	}
}