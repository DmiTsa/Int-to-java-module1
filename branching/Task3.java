package module1.branching;

// Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
public class Task3 {

	public static void main(String[] args) {
		int x1, y1;
		int x2, y2;
		int x3, y3;
		boolean isOneLine;
		
		x1= 1;
		y1= 1;
		x2 = 2;
		y2 = 2;
		x3 = 3;
		y3 = 3;

		
		isOneLine = ((((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1)) / 2) == 0);

		if (isOneLine) {
			System.out.println("На одной прямой");
		} else {
			System.out.println("Не на одной прямой");
		}
	}
}
