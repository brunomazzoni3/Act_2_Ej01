
public class Act_2_Ej01 {

	public static void main(String[] args) {

		int horasTotales = 1500;

		int semanas = (horasTotales / 24) / 7;

		int tmphoras = horasTotales - (24 * 7 * semanas);
		int dias = tmphoras / 24;

		int horas = tmphoras - (dias * 24);

		System.out.println("Cantidad de horas totales: " + horasTotales);
		System.out.println("Semanas:" + semanas);
		System.out.println("Dias: " + dias);
		System.out.println("Horas:" + horas);

	}

}
