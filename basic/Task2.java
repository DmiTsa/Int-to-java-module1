package module1.basic;

//Вычислить значение выражения по формуле (все переменные принимают действительные значения)
//:𝑏+√𝑏2+4𝑎𝑐2𝑎−𝑎3𝑐+𝑏−2
public class Task2 {

	public static void main(String[] args) {
		double a = 2.4;
		double b = 20;
		double c = 2.3;
		double rezult;

		rezult = b + Math.sqrt(Math.pow(b, 2) + 4 * a * c);
		rezult = rezult / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, (-2));

		System.out.print(rezult);
	}

}
