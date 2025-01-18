package com.midagama.moviles.tonalpohualli.correlacion;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ObtenerNemontemis {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Ilhuitl> listaDias = new ArrayList<Ilhuitl>(20);
		
		Ilhuitl diaT = null;
		
		diaT = new Ilhuitl("CIPACTLI", "Cocodrilo", "", "Oriente", 1);
		listaDias.add(0, diaT);
		
		diaT = new Ilhuitl("EHECATL", "Viento", "", "Norte", 2);
		listaDias.add(1, diaT);
		
		diaT = new Ilhuitl("CALLI", "Casa", "", "Poniente", 3);
		listaDias.add(2, diaT);
		
		diaT = new Ilhuitl("CUETZPALLIN", "Lagartija", "", "Sur", 4);
		listaDias.add(3, diaT);
		
		diaT = new Ilhuitl("COATL", "Serpiente", "", "Oriente", 5);
		listaDias.add(4, diaT);
		
		diaT = new Ilhuitl("MIQUIZTLI", "Muerte", "", "Norte", 6);
		listaDias.add(5, diaT);
		
		diaT = new Ilhuitl("MAZATL", "Venado", "", "Poniente", 7);
		listaDias.add(6, diaT);
		
		diaT = new Ilhuitl("TOCHTLI", "Conejo", "", "Sur", 8);
		listaDias.add(7, diaT);
		
		diaT = new Ilhuitl("ATL", "Agua", "", "Oriente", 9);
		listaDias.add(8, diaT);
		
		diaT = new Ilhuitl("ITZCUINTLI", "Perro", "", "Norte", 10);
		listaDias.add(9, diaT);
		
		diaT = new Ilhuitl("OZOMATLI", "Mono", "", "Poniente", 11);
		listaDias.add(10, diaT);
		
		diaT = new Ilhuitl("MALINALLI", "Hierba", "", "Sur", 12);
		listaDias.add(11, diaT);
		
		diaT = new Ilhuitl("ACATL", "Carrizo", "", "Oriente", 13);
		listaDias.add(12, diaT);
		
		diaT = new Ilhuitl("OCELOTL", "Ocelote", "", "Norte", 14);
		listaDias.add(13, diaT);
		
		diaT = new Ilhuitl("CUAUHTLI", "Aguila", "", "Poniente", 15);
		listaDias.add(14, diaT);
		
		diaT = new Ilhuitl("COZCACUAHTLI", "Aguila de collar", "", "Sur", 16);
		listaDias.add(15, diaT);
		
		diaT = new Ilhuitl("OLLIN", "Movimiento", "", "Oriente", 17);
		listaDias.add(16, diaT);
		
		diaT = new Ilhuitl("TECPATL", "Pedernal", "", "Norte", 18);
		listaDias.add(17, diaT);
		
		diaT = new Ilhuitl("QUIAHUITL", "Lluvia", "", "Poniente", 19);
		listaDias.add(18, diaT);
		
		diaT = new Ilhuitl("XOCHITL", "Flor", "", "Sur", 20);
		listaDias.add(19, diaT);
		
		
		
		final GregorianCalendar fechaGregoriana = new GregorianCalendar();		
		fechaGregoriana.clear();
		fechaGregoriana.set(2014, Calendar.MARCH, 12, 0, 43);
		
		int numeralDia = 5;
		int signoDia = 20;
		
		int numeralDiaNemontemi = 1;
		int sigoDiaNemontemi = 1;
		
		while(fechaGregoriana.get(Calendar.YEAR) > 1584)
		{
			if( (fechaGregoriana.get(Calendar.MONTH) == Calendar.MARCH) && fechaGregoriana.get(Calendar.DAY_OF_MONTH) > 6 && fechaGregoriana.get(Calendar.DAY_OF_MONTH) < 12)
			{
				System.out.println(fechaGregoriana.get(Calendar.YEAR) + "/" + (fechaGregoriana.get(Calendar.MONTH) + 1) + "/" + fechaGregoriana.get(Calendar.DAY_OF_MONTH));
				System.out.println("El numeral es: " + numeralDia + " " + listaDias.get(signoDia - 1).getNombre());
				numeralDia--;
				signoDia--;
				if( numeralDia == 0) numeralDia = 13;
				if( signoDia == 0) signoDia = 20;
			}
			fechaGregoriana.add(Calendar.DAY_OF_YEAR, -1);
		}

	}

}
