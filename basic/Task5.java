package module1.basic;

//Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести 
//данное значение длительности в часах, минутах и секундах в следующей форме:
//ННч ММмин SSc.
public class Task5 {

	public static void main(String[] args) {
		int time = 24554;
		int h;
		int m;
		int s;

		h = time / 3600;
		m = (time - h * 3600) / 60;
		s = time - h * 3600 - m * 60;

		String sh = "0" + h;
		String sm = "0" + m;
		String ss = "0" + s;

		System.out.print(sh.substring(sh.length() - 2) + " ч. ");
		System.out.print(sm.substring(sm.length() - 2) + " мин. ");
		System.out.print(ss.substring(ss.length() - 2) + " с.");
	}
}
