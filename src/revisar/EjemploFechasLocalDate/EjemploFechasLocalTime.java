package revisar.EjemploFechasLocalDate;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class EjemploFechasLocalTime {

	public static void main(String[] args) {
		int opcion;

		do {
			System.out.println("1.- Obtener la fecha actual.");
			System.out.println("2.- Crear una fecha LocalDate.");
			System.out.println("3.- Sumar Restar dias LocalDate.");
			System.out.println("4.- Comparar dos fechas LocalDate.");
			System.out.println("5.- Utilizar LocalTime.");
			System.out.println("6.- Utilizar LocalDateTime.");
			System.out.println("7.- Listar Zonas Horarias.");
			System.out.println("8.- Utilizar Zonas Horarias.");
			System.out.println("9.- Diferencia entre fechas.");
			System.out.println("10.- Diferencia entre horas.");
			System.out.println("11.- Salir.");
			System.out.println("Elegir opcion: ");
			opcion = Integer.parseInt(IntroducirDatos.introducirDatos("Opci�n: "));

			switch (opcion) {
				case 1 : fechaActual();
					break;
				case 2 :
					crearFecha();
					break;
				case 3 :
					sumarRestarDias();
					break;
				case 4 :
					compararDosFechas();
					break;
				case 5 :
					utilizarLocalTime();
					break;
				case 6 :
					utilizarLocalDateTime();
					break;
				case 7 :
					listarZonasHorarias();
					break;
				case 8 :
					utilizarZonasHorarias();
					break;
				case 9 :
					diferenciaEntreFechas();
					break;
				case 10 :
					diferenciaEntreHoras();
					break;
				case 11 :
					System.exit(0);
				default :
					System.out.println("Error en la opcion.");
			}
		} while (opcion != 11);
	}

	private static void diferenciaEntreHoras() {
		// Duration es el equivalente a Period pero para las horas.

		LocalTime startLocalTime = LocalTime.of(8, 30);
		LocalTime endLocalTime = startLocalTime.plus(Duration.ofHours(3)); // 11:30

		long diffSeconds = Duration.between(startLocalTime, endLocalTime).getSeconds();
		System.out.println(diffSeconds); // 10800 seconds
	}

	private static void diferenciaEntreFechas() {
		LocalDate startLocalDate = LocalDate.of(2018, 05, 01);
		LocalDate endLocalDate = startLocalDate.plus(Period.ofDays(10)); // suma 10 días
		// Calcula la diferencia de dias entre las dos fechas
		int diffDays = Period.between(startLocalDate, endLocalDate).getDays();
		System.out.println(diffDays); // 10
		// Calcula la diferencia de meses entre las dos fechas
		int diffMonths = Period.between(startLocalDate, endLocalDate).getMonths();
		System.out.println(diffMonths);
	}

	private static void utilizarZonasHorarias() {
		ZoneId zoneId = ZoneId.of("America/Panama");
		LocalDateTime localDateTimeOf = LocalDateTime.of(2018, Month.AUGUST, 20, 8, 30);
		ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTimeOf, zoneId);
		System.out.println(zonedDateTime); // 2018-08-20T08:30-05:00[America/Panama]
		// cambiamos a Asia/Tokyo
		ZonedDateTime tokyoDateTime = localDateTimeOf.atZone(ZoneId.of("Asia/Tokyo"));
		System.out.println(tokyoDateTime); // 2018-08-20T08:30+09:00[Asia/Tokyo]

		// cambiamos a Europe/Madrid
		ZonedDateTime madridDateTime = localDateTimeOf.atZone(ZoneId.of("Europe/Madrid"));
		System.out.println(madridDateTime); // 2018-08-20T08:30+09:00[Asia/Tokyo]
	}

	private static void listarZonasHorarias() {
		// ZonedDateTime
		// Si necesitamos trabajar con zonas horarias podemos utilizar
		// la clase ZonedDateTime que provee el manejo de fechas con hora
		// para la zona que determines.
		// La lista de zonas disponibles las podemos consultar desde la clase ZoneId

		System.out.println("Listado Zonas Horarias");
		ZoneId.getAvailableZoneIds().forEach(z -> System.out.println(z));
		System.out.println("__________________________________________");
		ZoneId zoneId = ZoneId.of("America/Panama");
		System.out.println("IdZona: " + zoneId);

	}

	private static void utilizarLocalDateTime() {
		// LocalDateTime es la combinaci�n del la fecha y la hora.
		// Al igual que con LocalDate y LocalTime puedes crear instancias

		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);

		LocalDateTime localDateTimeOf = LocalDateTime.of(2018, Month.AUGUST, 20, 8, 30);
		System.out.println(localDateTimeOf); // 2018-08-20 T08:30

		// Igual que como vimos en LocalDate y LocalTime, podemos sumar o restar
		// utilizando diferentes unidades de tiempo

		LocalDateTime localDateTimePlus = localDateTimeOf.plusDays(5);
		System.out.println(localDateTimePlus); // 2017-08-25T08:30
		LocalDateTime localDateTimeMinus = localDateTimePlus.minusMinutes(10);
		System.out.println(localDateTimeMinus); // 2017-08-25T08:20

	}

	private static void utilizarLocalTime() {
		// LocalTime es similar a LocalDate en su uso y representa
		// la hora sin la fecha.

		LocalTime horaActual = LocalTime.now();
		System.out.println("Hora actual: " + horaActual);

		LocalTime hora = LocalTime.of(16, 30);
		System.out.println(hora); // 16:30

		// Sumar o restar horas o cualquier otro tipo de unidad como minutos

		// sumar una hora
		LocalTime localTimePlus = hora.plus(1, ChronoUnit.HOURS);
		System.out.println(localTimePlus); // 17:30
		// resta 60 segundos
		LocalTime localTimeMinus = hora.minus(17, ChronoUnit.MINUTES);
		System.out.println(localTimeMinus); // 16:15

		// Tambi�n podemos comparar para saber si alguna hora es mayor o no que otra.

		boolean isBeforeHora = LocalTime.parse("08:30")
			.isBefore(LocalTime.parse("10:20"));
		System.out.println(isBeforeHora); // true

	}

	private static void compararDosFechas() {
		// Determina que fecha es anterior o posterior
		// respecto a otra

		boolean isBefore = LocalDate.of(2018, 02, 15)
			.isBefore(LocalDate.of(2018, 8, 16));
		System.out.println("Primera menor Before: " + isBefore); // true

		boolean isBefore01 = LocalDate.of(2018, 8, 15)
			.isBefore(LocalDate.of(2018, 2, 16));
		System.out.println("La primera mayor Before: " + isBefore01); // false

		boolean isAfter = LocalDate.of(2018, 10, 03)
			.isAfter(LocalDate.of(2018, 8, 16));
		System.out.println("Primera mayor After: " + isAfter); // true

		boolean isAfter01 = LocalDate.of(2018, 8, 8)
			.isAfter(LocalDate.of(2018, 11, 16));
		System.out.println("Primera menor After: " + isAfter01); // false
	}

	private static void sumarRestarDias() {
		// sumar o restar d�as

		// Suma 10 d�as a la fecha de hoy
		LocalDate hoy = LocalDate.now();
		LocalDate hoyMas10Dias = hoy.plusDays(10);
		System.out.println("Suma: " + hoyMas10Dias.toString()); //

		// Resta 10 d�as a la fecha de hoy
		LocalDate hoyMenos10Dias = hoy.minusDays(10);
		System.out.println("Resta: " + hoyMenos10Dias.toString()); //
	}

	private static void crearFecha() {
		// Crear una fecha tipo LocalDate a partir de 3 parametros enteros: a�o, mes d�a
		LocalDate localDateOf = LocalDate.of(2018, 05, 10);
		System.out.println("Fecha creada; " + localDateOf.toString()); // 2018-05-10

	}

	private static void fechaActual() {
		// LocalDate representa la fecha sin la hora.

		// recuperar la fecha actual
		LocalDate hoy = LocalDate.now();
		System.out.println("Hoy es: " + hoy);

		// LocalDateTime representa la fecha con la hora.
		// recuperar la fecha y la hora actual
		LocalDateTime hoyHora = LocalDateTime.now();
		System.out.println("D�a y hora actuales: " + hoyHora);

		System.out.println("cambio formato: " + ConvertirFechas.localDateToString(hoy));

	}

}
