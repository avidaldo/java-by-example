package revisar.EjemploFechasLocalDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class ConvertirFechas {

	public static String localDateToString(LocalDate fec) {
		try {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/LLLL/yyyy");
			String formattedString = fec.format(formatter);
			return formattedString;
		} catch (NullPointerException np) {
			JOptionPane.showMessageDialog(null, "Sin fecha");
		}
		return null;
	}

	public static LocalDate stringToLocalDate(String fecNac) {
		try {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

			LocalDate localDate = LocalDate.parse(fecNac, formatter);
			return localDate;
		} catch (Exception pe) {
			JOptionPane.showMessageDialog(null, "Error al introducir la fecha.", "Informaci�n",
				JOptionPane.INFORMATION_MESSAGE);
		}
		return null;
	}

	public static java.sql.Date javaLocalDateToSqlDate(LocalDateTime dateTime) {
		java.sql.Date sqlDate = java.sql.Date.valueOf(dateTime.toLocalDate());
		return sqlDate;
	}

	public static String fechaActualString() {
		try {
			LocalDate date = LocalDate.now();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/LLLL/yyyy");
			String formattedString = date.format(formatter);
			return formattedString;
		} catch (NullPointerException np) {
			JOptionPane.showMessageDialog(null, "Sin fecha");
		}
		return null;
	}

}
