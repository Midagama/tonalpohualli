package com.midagama.moviles.tonalpohualli.correlacion;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class RelacionPorCuartosSoloEstructura {
	
	public String FechaMexihca(int anioCalculo, int mesCalculo, int diaCalculo, int hora, int minutos)
	{
		
		
		String fechaNahuatl = null;
		
		ArrayList<Tlapohualli> listaNumerales = new ArrayList<Tlapohualli>(20);
		
		Tlapohualli numeral = null;
		
		numeral = new Tlapohualli(1, "Ce", "", "", "");
		listaNumerales.add(0,numeral);
		
		numeral = new Tlapohualli(2, "Ome", "", "", "");
		listaNumerales.add(1,numeral);
		
		numeral = new Tlapohualli(3, "Yei", "", "", "");
		listaNumerales.add(2,numeral);
		
		numeral = new Tlapohualli(4, "Nahui", "", "", "");
		listaNumerales.add(3,numeral);
		
		numeral = new Tlapohualli(5, "Macuilli", "", "", "");
		listaNumerales.add(4,numeral);
		
		numeral = new Tlapohualli(6, "Chicoacen", "", "", "");
		listaNumerales.add(5, numeral);
		
		numeral = new Tlapohualli(7, "Chicome", "", "", "");
		listaNumerales.add(6,numeral);
		
		numeral = new Tlapohualli(8, "Chicyei", "", "", "");
		listaNumerales.add(7,numeral);
		
		numeral = new Tlapohualli(9, "Chicnahui", "", "", "");
		listaNumerales.add(8,numeral);
		
		numeral = new Tlapohualli(10, "Matlahti", "", "", "");
		listaNumerales.add(numeral);
		
		numeral = new Tlapohualli(11, "Matlahti Ihuan Ce", "", "", "");
		listaNumerales.add(10,numeral);
		
		numeral = new Tlapohualli(12, "Matlahti Ihuan Ome", "", "", "");
		listaNumerales.add(11,numeral);
		
		numeral = new Tlapohualli(13, "Matlahti Ihuan Yei", "", "", "");
		listaNumerales.add(12,numeral);
		
		numeral = new Tlapohualli(14, "Matlahti Ihuan Nahui", "", "", "");
		listaNumerales.add(13,numeral);
		
		numeral = new Tlapohualli(15, "Caxtolli", "", "", "");
		listaNumerales.add(14,numeral);
		
		numeral = new Tlapohualli(16, "Caxtolli Ihuan Ce", "", "", "");
		listaNumerales.add(15, numeral);
		
		numeral = new Tlapohualli(17, "Caxtolli Ihuan Ome", "", "", "");
		listaNumerales.add(16, numeral);
		
		numeral = new Tlapohualli(18, "Caxtolli Ihuan Yei", "", "", "");
		listaNumerales.add(17, numeral);
		
		numeral = new Tlapohualli(19, "Caxtolli Ihuan Nahui", "", "", "");
		listaNumerales.add(18, numeral);
		
		numeral = new Tlapohualli(20, "Cempohualli", "", "", "");
		listaNumerales.add(19, numeral);
		
		
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
		
		anio = new Xihuitl("TOCHTLI", "Conejo", "","Sur", 1); //6:43 AM
		listaAnios.add(0, anio);
		
		anio = new Xihuitl("ACATL", "Carrizo", "", "Oriente", 2); //12:43 PM
		listaAnios.add(1, anio);
		
		anio = new Xihuitl("TECPATL", "Pedernal", "", "Norte", 3); //6:43 PM
		listaAnios.add(2, anio);
		
		anio = new Xihuitl("CALLI", "Casa", "", "Poniente", 4); //12:43 AM
		listaAnios.add(3, anio);
		
		
		ArrayList<Cempohualtonalli> listaVeintenas = new ArrayList<Cempohualtonalli>(18);
		
		Cempohualtonalli veintenaT = null;
		
		veintenaT = new Cempohualtonalli("ATLACAHUALO", "LO DEJADO POR LAS AGUAS", "12/03", "31/03", "", 1);
		listaVeintenas.add(0,veintenaT);
		
		veintenaT = new Cempohualtonalli("TLACAXIPEHUALIZTLI", "EL CAMBIO EN LAS PERSONAS", "01/04", "20/04", "", 2);
		listaVeintenas.add(1,veintenaT);
		
		veintenaT = new Cempohualtonalli("TOZOZTONTLI", "LA PEQUE�A VELACI�N", "21/04", "10/05", "", 3);
		listaVeintenas.add(2,veintenaT);
		
		veintenaT = new Cempohualtonalli("HUEYTOZOZTLI", "LA GRAN VELACI�N", "11/05", "30/05", "", 4);
		listaVeintenas.add(3,veintenaT);
		
		veintenaT = new Cempohualtonalli("TOXCATL", "LAS COSAS SECAS", "31/05", "19/06", "", 5);
		listaVeintenas.add(4,veintenaT);
		
		veintenaT = new Cempohualtonalli("ETZACUALIZTLI", "COMER ETZALLI", "20/06", "09/07", "", 6);
		listaVeintenas.add(5,veintenaT);
		
		veintenaT = new Cempohualtonalli("TECUILHUITONTLI", "VEINTENA DE LA FIESTA DE LOS SE�ORES", "10/07", "29/07", "", 7);
		listaVeintenas.add(6,veintenaT);
		
		veintenaT = new Cempohualtonalli("HUEYTECUILHUIT", "LA GRAN FIESTA DE LOS SE�ORES", "30/07", "18/08", "", 8);
		listaVeintenas.add(7,veintenaT);
		
		veintenaT = new Cempohualtonalli("TLAXOCHIMACO", "OFRENDA DE FLORES", "19/08", "07/09", "", 9);
		listaVeintenas.add(8,veintenaT);
		
		veintenaT = new Cempohualtonalli("XOCOTLHUETZI", "LA CA�DA DE LOS FRUTOS", "08/09", "27/09", "", 10);
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
		
		
		final GregorianCalendar fechaGregoriana = new GregorianCalendar();		
		fechaGregoriana.clear();
		fechaGregoriana.set(1585, Calendar.MARCH, 12, 0, 43);
		
		int numeralDia = 10;
		int signoDia = 1;
		int numeralDiaNemontemi = 6;
		int signoDiaNemontemi = 16;		
		int signoVeintena = 1;
		int numeralAnio = 2;
		int signoAnio = 4;
		
		boolean activaSecular = true;
		 
		//La variable l es la cantidad de cuartos (6 horas) que tiene la cuenta de totalAnios que se quiera revisar
		double l = 0;
		
		int totalAnios = (anioCalculo + 10) - 1585;
		//Engrane para de cu�ntos a�os queremos saber
		for(int m=1; m<=totalAnios; m++)
		{
			//System.out.println("Inicia a�o: " + listaNumerales.get(numeralAnio - 1).getNumNahuatl().toUpperCase() + " " + listaAnios.get(signoAnio - 1).getNombre());

			//Engrane para generar la a�o de la veintena en base a 18 veintenas
			for(int k=1; k<=18; k++)
			{
				//System.out.println("	Inicia veintena: " + listaVeintenas.get(signoVeintena - 1).getNombre());
				//Engrane para generar la veintena en base a 20 d�as
				for(int j=1; j<=20; j++)
				{
					//System.out.println("		Inicia d�a: " + j);
					//System.out.println("				Dia: " + fechaGregoriana.get(Calendar.YEAR) + "/" + (fechaGregoriana.get(Calendar.MONTH) + 1) + "/" + fechaGregoriana.get(Calendar.DAY_OF_MONTH) + " " + fechaGregoriana.get(Calendar.HOUR) + ":" + fechaGregoriana.get(Calendar.MINUTE) + " " + ((fechaGregoriana.get(Calendar.AM_PM) == 0) ? "AM" : "PM"));
					//System.out.println("				Dia: " + listaNumerales.get(numeralDia - 1).getNumNahuatl().toUpperCase() + " " + listaDias.get(signoDia - 1).getNombre());
					
					if(anioCalculo == fechaGregoriana.get(Calendar.YEAR) && mesCalculo == fechaGregoriana.get(Calendar.MONTH) && diaCalculo == fechaGregoriana.get(Calendar.DAY_OF_MONTH))
					{
						final GregorianCalendar fechaAComparar = new GregorianCalendar();		
						fechaAComparar.clear();
						fechaAComparar.set(fechaGregoriana.get(Calendar.YEAR), fechaGregoriana.get(Calendar.MONTH), fechaGregoriana.get(Calendar.DAY_OF_MONTH), hora, minutos);
						
						if(fechaAComparar.before(fechaGregoriana))
						{
							numeralDia--;
							signoDia--;
							if(numeralDia == 0) numeralDia = 13;
							if(signoDia == 0) signoDia = 20;
						}
						
						fechaNahuatl = "Dia: " + listaNumerales.get(numeralDia - 1).getNumNahuatl().toUpperCase() + " " + listaDias.get(signoDia - 1).getNombre() +
									   " A�o: " + listaNumerales.get(numeralAnio - 1).getNumNahuatl().toUpperCase() + " " + listaAnios.get(signoAnio - 1).getNombre() + 
									   " Veintena: " + listaVeintenas.get(signoVeintena - 1).getNombre();
						return fechaNahuatl;
						
					}
					//Engrane para generar el d�a en base a 4 cuartos
					for(int i=1; i <=4; i++)
					{	
						l++;								
						////System.out.println("			Numero de cuarto: " + l);
						fechaGregoriana.add(Calendar.HOUR_OF_DAY, 6);
					}//Fin del ciclo de dias por cuarto	

					if( (fechaGregoriana.get(Calendar.YEAR) == 1700 || fechaGregoriana.get(Calendar.YEAR) == 1800 || fechaGregoriana.get(Calendar.YEAR) == 1900) && activaSecular)
					{
						if( fechaGregoriana.get(Calendar.MONTH) == Calendar.MARCH && fechaGregoriana.get(Calendar.DAY_OF_MONTH) == 1 )
						{
							//System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% A�O SECULAR %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%5");
							fechaGregoriana.add(Calendar.DAY_OF_YEAR, -1);
							activaSecular = false;
						}
					}
					if( (fechaGregoriana.get(Calendar.YEAR) == 1701 || fechaGregoriana.get(Calendar.YEAR) == 1801 || fechaGregoriana.get(Calendar.YEAR) == 1901) && fechaGregoriana.get(Calendar.MONTH) == Calendar.JANUARY && fechaGregoriana.get(Calendar.DAY_OF_MONTH) == 1 ) 
					{
						//System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% RE-ACTIVO SECULAR %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%5");
						activaSecular = true;
					}
					numeralDia++;
					signoDia++;
					if(numeralDia == 14) numeralDia = 1;	
					if(signoDia == 21) signoDia = 1;
					//System.out.println("		Finaliza d�a: " + j);
				}//Find el ciclo de veintenas por d�as
				//System.out.println("	Finaliza veintena: " + listaVeintenas.get(signoVeintena - 1).getNombre());
				signoVeintena++;
				if(signoVeintena == 19) signoVeintena = 1;				
			}//Fin del ciclo del a�o por veintenas
			
			//System.out.println("		Antes de nemontemi Numeral a�o: " + listaNumerales.get(numeralAnio - 1).getNumNahuatl().toUpperCase() + " Signo a�o: " + signoAnio);//listaAnios.get(signoAnio - 1).getNombre());
			//Engrane para generar los nemontemi en base a dias
			for(int j=1; j<=5; j++)
			{
				//System.out.println("	Inicia d�a nemontemi: " + j);
				//Engrane para generar el d�a en base a 4 cuartos
				//System.out.println("				Dia: " + fechaGregoriana.get(Calendar.YEAR) + "/" + (fechaGregoriana.get(Calendar.MONTH) + 1) + "/" + fechaGregoriana.get(Calendar.DAY_OF_MONTH) + " " + fechaGregoriana.get(Calendar.HOUR) + ":" + fechaGregoriana.get(Calendar.MINUTE) + " " + ((fechaGregoriana.get(Calendar.AM_PM) == 0) ? "AM" : "PM"));
				//System.out.println("				Dia: " + listaNumerales.get(numeralDiaNemontemi - 1).getNumNahuatl().toUpperCase() + " " + listaDias.get(signoDiaNemontemi - 1).getNombre());
				for(int i=1; i <=4; i++)
				{
					l++;//Dado que el ciclo suma una �ltima vez un cuarto a todo el ciclo, ese cuarto complementa el a�o
					////System.out.println("			Numero de cuarto: " + l);
					fechaGregoriana.add(Calendar.HOUR_OF_DAY, 6);								
				}//Fin del ciclo de dias por cuarto	
				
				numeralDiaNemontemi++;
				signoDiaNemontemi++;
				if(numeralDiaNemontemi == 14) numeralDiaNemontemi = 1;	
				if(signoDiaNemontemi == 21) signoDiaNemontemi = 1;
				//System.out.println("	Finaliza d�a nemontemi: " + j);
			}//Find el ciclo de veintenas por d�as
///////////////////			//Al terminar los nemontemi, el nuevo a�o debe iniciar en el siguiente numeral y signo de los d�as
			//Se agrega el cuarto de d�a del calendario
			l++;
			////System.out.println("			Numero de cuarto: " + l);
			fechaGregoriana.add(Calendar.HOUR_OF_DAY, 6);
			//System.out.println("				Dia: " + fechaGregoriana.get(Calendar.YEAR) + "/" + (fechaGregoriana.get(Calendar.MONTH) + 1) + "/" + fechaGregoriana.get(Calendar.DAY_OF_MONTH) + " " + fechaGregoriana.get(Calendar.HOUR) + ":" + fechaGregoriana.get(Calendar.MINUTE) + " " + ((fechaGregoriana.get(Calendar.AM_PM) == 0) ? "AM" : "PM"));
			
			//Hasta este momento se suma el nuevo a�o
			//System.out.println("Finaliza A�o " + listaNumerales.get(numeralAnio - 1).getNumNahuatl().toUpperCase() + " Signo a�o: " + listaAnios.get(signoAnio - 1).getNombre());
			numeralAnio++;
			signoAnio++;
			if(numeralAnio == 14) numeralAnio = 1;
			if(signoAnio == 5) signoAnio = 1;			
			
		}//Fin del ciclo de a�os
		
		return fechaNahuatl;
	}
	
	public static void main (String args[])
	{
		RelacionPorCuartosSoloEstructura clase = new RelacionPorCuartosSoloEstructura();
		System.out.println(" FECHA CALCULADA -- " + clase.FechaMexihca(1981, 4, 30, 10, 30));
	}
	

}
