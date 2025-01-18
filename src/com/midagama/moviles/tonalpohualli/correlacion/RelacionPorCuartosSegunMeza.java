package com.midagama.moviles.tonalpohualli.correlacion;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class RelacionPorCuartosSegunMeza {
	
	private static final int DIA_CIPACTLI = 0;
	private static final int DIA_EHECATL = 1;
	private static final int DIA_CALLI = 2;
	private static final int DIA_CUETZPALLIN = 3;
	private static final int DIA_COATL = 4;
	private static final int DIA_MIQUIZTLI = 5;
	private static final int DIA_MAZATL = 6;
	private static final int DIA_TOCHTLI = 7;
	private static final int DIA_ATL = 8;
	private static final int DIA_ITZCUINTLI = 9;
	private static final int DIA_OZOMATLI = 10;
	private static final int DIA_MALINALLI = 11;
	private static final int DIA_ACATL = 12;
	private static final int DIA_OCELOTL = 13;
	private static final int DIA_CUAUHTLI = 14;
	private static final int DIA_COZCACUAHTLI = 15;
	private static final int DIA_OLLIN = 16;
	private static final int DIA_TECPATL = 17;
	private static final int DIA_QUIAHUITL = 18;
	private static final int DIA_XOCHITL = 19;
	
	private static final int ANIO_TOCHTLI = 0;
	private static final int ANIO_ACATL = 1;
	private static final int ANIO_TECPATL = 2;
	private static final int ANIO_CALLI = 3;

	public static void main(String args[])
	{
		double cuarto = 6;
		double dia = cuarto * 4;
		double veintena = dia * 20;
		double nemontemi = dia * 5;
		double anioVeintenas = veintena * 18;
		double anioCompleto = anioVeintenas + nemontemi + cuarto;
		
		
		
		
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
		
		
		
		ArrayList<Xihuitl> listaAnios = new ArrayList<Xihuitl>(4);
		
		Xihuitl anio = null;
		
		anio = new Xihuitl("TOCHTLI", "Conejo", "","Sur", 1);
		listaAnios.add(0, anio);
		
		anio = new Xihuitl("ACATL", "Carrizo", "", "Oriente", 2);
		listaAnios.add(1, anio);
		
		anio = new Xihuitl("TECPATL", "Pedernal", "", "Norte", 3);
		listaAnios.add(2, anio);
		
		anio = new Xihuitl("CALLI", "Casa", "", "Poniente", 4);
		listaAnios.add(3, anio);
		
		
		ArrayList<Cempohualtonalli> listaVeintenas = new ArrayList<Cempohualtonalli>(18);
		
		Cempohualtonalli veintenaT = null;
		
		veintenaT = new Cempohualtonalli("ATLACAHUALO", "LO DEJADO POR LAS AGUAS", "12/03", "31/03", "", 1);
		listaVeintenas.add(0,veintenaT);
		
		veintenaT = new Cempohualtonalli("TLACAXIPEHUALIZTLI", "EL CAMBIO EN LAS PERSONAS", "01/04", "20/04", "", 2);
		listaVeintenas.add(1,veintenaT);
		
		veintenaT = new Cempohualtonalli("TOZOZTONTLI", "LA PEQUEÑA VELACIÓN", "21/04", "10/05", "", 3);
		listaVeintenas.add(2,veintenaT);
		
		veintenaT = new Cempohualtonalli("HUEYTOZOZTLI", "LA GRAN VELACIÓN", "11/05", "30/05", "", 4);
		listaVeintenas.add(3,veintenaT);
		
		veintenaT = new Cempohualtonalli("TOXCATL", "LAS COSAS SECAS", "31/05", "19/06", "", 5);
		listaVeintenas.add(4,veintenaT);
		
		veintenaT = new Cempohualtonalli("ETZACUALIZTLI", "COMER ETZALLI", "20/06", "09/07", "", 6);
		listaVeintenas.add(5,veintenaT);
		
		veintenaT = new Cempohualtonalli("TECUILHUITONTLI", "VEINTENA DE LA FIESTA DE LOS SEÑORES", "10/07", "29/07", "", 7);
		listaVeintenas.add(6,veintenaT);
		
		veintenaT = new Cempohualtonalli("HUEYTECUILHUIT", "LA GRAN FIESTA DE LOS SEÑORES", "30/07", "18/08", "", 8);
		listaVeintenas.add(7,veintenaT);
		
		veintenaT = new Cempohualtonalli("TLAXOCHIMACO", "OFRENDA DE FLORES", "19/08", "07/09", "", 9);
		listaVeintenas.add(8,veintenaT);
		
		veintenaT = new Cempohualtonalli("XOCOTLHUETZI", "LA CAÍDA DE LOS FRUTOS", "08/09", "27/09", "", 10);
		listaVeintenas.add(9,veintenaT);
		
		veintenaT = new Cempohualtonalli("OCHPANIZTLI", "BARRIMIENTO DE LOS CAMINOS", "28/09", "17/10", "", 11);
		listaVeintenas.add(10,veintenaT);
		
		veintenaT = new Cempohualtonalli("TEOTLECO", "LA LLEGADA DE LOS PRINCIPIOS GENERADORES DE LA NATURALEZA", "18/10", "06/11", "", 12);
		listaVeintenas.add(11,veintenaT);
		
		veintenaT = new Cempohualtonalli("TEPEILHUITL", "LA FIESTA DE LOS CERROS", "07/11", "26/11", "", 13);
		listaVeintenas.add(12,veintenaT);
		
		veintenaT = new Cempohualtonalli("QUECHOLLI", "VEINTENA DEL FLAMINGO", "27/11", "16/12", "", 14);
		listaVeintenas.add(13,veintenaT);
		
		veintenaT = new Cempohualtonalli("PANQUETZALIZTLI", "EL LEVANTAMIENTO DE LOS ESTANDARTES", "17/12", "05/01", "", 15);
		listaVeintenas.add(14,veintenaT);
		
		veintenaT = new Cempohualtonalli("ATEMOZTLI", "EL DESCENSO DE LAS AGUAS", "06/01", "25/01", "", 16);
		listaVeintenas.add(15,veintenaT);
		
		veintenaT = new Cempohualtonalli("TITITL", "VEINTENA DEL RECOGIMIENTO", "26/01", "14/02", "", 17);
		listaVeintenas.add(16,veintenaT);
		
		veintenaT = new Cempohualtonalli("IZCALLI", "VEINTENA DEL RESURGIMIENTO", "15/02", "06/03", "", 18);
		listaVeintenas.add(17,veintenaT);
		
		
		
		
		System.out.println("Cuarto= " + cuarto + " horas // Día= " + dia + " horas // veintena= " + veintena + " horas // nemontemi= " + 
		nemontemi + " horas // Atado de veintenas= " + anioVeintenas + " horas // Año completo= " + anioCompleto + " horas.");
		
		final DateFormat format = SimpleDateFormat.getDateTimeInstance();
		final GregorianCalendar fechaGregoriana = new GregorianCalendar();
		
		fechaGregoriana.clear();
		fechaGregoriana.set(1600, Calendar.MARCH, 12, 0, 0);
		
		
		//Contadoras que nos van a ayudar a llevar numeral y signo de cada elemento calendárico
		// Debo arrancar un entero antes de lo que necesito, pues mis ciclos incian incrementando los contadores.
		//Por ahora estoy tomando como referencia el 12 de marzo de 1975, que fue una fecha 10 Cipactli del año 1 Tochtli
		//dado que la cuenta seguirá el 13 de marzo de 1975, la fecha base es 
		int numeralDia = 2 - 1;
		int signoDia = 1 - 1;
		int signoVeintena = 1 - 1;
		int numeralAnio = 4 - 1;
		int signoAnio = 3 - 1 ;
		 
		//La variable l es la cantidad de cuartos (6 horas) que tiene la cuenta de totalAnios que se quiera revisar
		double l = 0;

		//Total de años que se quieren revisar en el ciclo
		int totalAnios = 378;
		
		//Engrane para de cuántos años queremos saber
		for(int m=1; m<=totalAnios; m++)
		{
			numeralAnio++;
			signoAnio++;
			if(numeralAnio == 14) numeralAnio = 1;
			if(signoAnio == 5) signoAnio = 1;
			System.out.println("Inicia año: " + numeralAnio + " " + listaAnios.get(signoAnio - 1).getNombre());
			//Engrane para generar la año de la veintena en base a 18 veintenas
			for(int k=1; k<=18; k++)
			{
				signoVeintena++;
				if(signoVeintena == 19) signoVeintena = 1;
				System.out.println("	Inicia veintena: " + listaVeintenas.get(signoVeintena - 1).getNombre());
				//Engrane para generar la veintena en base a 20 días
				for(int j=1; j<=20; j++)
				{
					numeralDia++;
					signoDia++;
					System.out.println("		Inicia día: " + j);
					System.out.println("				Dia: " + fechaGregoriana.get(Calendar.YEAR) + "/" + (fechaGregoriana.get(Calendar.MONTH) + 1) + "/" + fechaGregoriana.get(Calendar.DAY_OF_MONTH) + " " + fechaGregoriana.get(Calendar.HOUR) + ":" + fechaGregoriana.get(Calendar.MINUTE) + " " + ((fechaGregoriana.get(Calendar.AM_PM) == 0) ? "AM" : "PM"));
					//Engrane para generar el día en base a 4 cuartos
					for(int i=1; i <=4; i++)
					{																	
						l++;
						fechaGregoriana.add(Calendar.HOUR_OF_DAY, 6);
						//System.out.println("			Cuarto de día " + i);
						//System.out.println("				Numero de cuarto: " + l);
						
					}//Fin del ciclo de dias por cuarto		
					if(numeralDia == 14) numeralDia = 1;	
					if(signoDia == 21) signoDia = 1;
					System.out.println("				Dia: " + numeralDia + " " + listaDias.get(signoDia - 1).getNombre());
					//System.out.println("				Dia: " + fechaGregoriana.get(Calendar.YEAR) + "/" + (fechaGregoriana.get(Calendar.MONTH) + 1) + "/" + fechaGregoriana.get(Calendar.DAY_OF_MONTH) + " " + fechaGregoriana.get(Calendar.HOUR) + ":" + fechaGregoriana.get(Calendar.MINUTE) + " " + ((fechaGregoriana.get(Calendar.AM_PM) == 0) ? "AM" : "PM"));
					System.out.println("		Finaliza día: " + j);
				}//Find el ciclo de veintenas por días
				
				System.out.println("	Finaliza veintena: " + listaVeintenas.get(signoVeintena - 1).getNombre());
			}//Fin del ciclo del año por veintenas
			
			if(numeralAnio == 14) numeralAnio = 1;
			if(signoAnio == 5) signoAnio = 1;
			System.out.println("		Numeral año: " + numeralAnio + " Signo año: " + listaAnios.get(signoAnio - 1).getNombre());
			//Engrane para generar los nemontemi en base a dias
			for(int j=1; j<=5; j++)
			{
				System.out.println("	Inicia día nemontemi: " + j);
				//Engrane para generar el día en base a 4 cuartos
				for(int i=1; i <=4; i++)
				{
					//System.out.println("		Cuarto de día " + i);
					//System.out.println("			Numero de cuarto: " + l);
					l++;//Dado que el ciclo suma una última vez un cuarto a todo el ciclo, ese cuarto complementa el año
					System.out.println("				Dia: " + fechaGregoriana.get(Calendar.YEAR) + "/" + (fechaGregoriana.get(Calendar.MONTH) + 1) + "/" + fechaGregoriana.get(Calendar.DAY_OF_MONTH) + " " + fechaGregoriana.get(Calendar.HOUR) + ":" + fechaGregoriana.get(Calendar.MINUTE) + " " + ((fechaGregoriana.get(Calendar.AM_PM) == 0) ? "AM" : "PM"));
					fechaGregoriana.add(Calendar.HOUR_OF_DAY, 6);									
				}//Fin del ciclo de dias por cuarto				
				System.out.println("	Finaliza día nemontemi: " + j);
			}//Find el ciclo de veintenas por días
			
			//Se agrega el cuarto de día del calendario
			l++;
			fechaGregoriana.add(Calendar. HOUR_OF_DAY, 6);
			//System.out.println("Fecha gregoriana queda: Año: " + fechaGregoriana.get(Calendar.YEAR) + " Mes: " + (fechaGregoriana.get(Calendar.MONTH) + 1) + " Día: " + fechaGregoriana.get(Calendar.DAY_OF_MONTH) + " Hora: " + fechaGregoriana.get(Calendar.HOUR) + " Minutos: " + fechaGregoriana.get(Calendar.MINUTE) + " " + fechaGregoriana.get(Calendar.AM_PM));
			//System.out.println("Cuartos " + l);
			System.out.println("Finaliza Año " + numeralAnio + " Signo año: " + listaAnios.get(signoAnio - 1).getNombre());
			
		}//Fin del ciclo de años
		
		//Impresion final de la cantidad de horas en un año:
		System.out.println("Cuartos totales del conteo: " + l);
		System.out.println("Horas totales del conteo: " + (l * 6));
		System.out.println("Fecha gregoriana queda: Año: " + fechaGregoriana.get(Calendar.YEAR) + " Mes: " + (fechaGregoriana.get(Calendar.MONTH) + 1) + " Día: " + fechaGregoriana.get(Calendar.DAY_OF_MONTH) + " Hora: " + fechaGregoriana.get(Calendar.HOUR) + " Minutos: " + fechaGregoriana.get(Calendar.MINUTE) + " " + ((fechaGregoriana.get(Calendar.AM_PM) == 0) ? "AM" : "PM"));
		
	}//Fin del main
	
}
