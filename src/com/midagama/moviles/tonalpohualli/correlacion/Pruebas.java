package com.midagama.moviles.tonalpohualli.correlacion;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Pruebas {
	
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
	private static final int DIA_MALINALLO = 11;
	private static final int DIA_ACATL = 12;
	private static final int DIA_OCELOTL = 13;
	private static final int DIA_CUAUHTLI = 14;
	private static final int DIA_COZCACUAHTLI = 15;
	private static final int DIA_OLLIN = 16;
	private static final int DIA_TECPATL = 17;
	private static final int DIA_QUIAHUITL = 18;
	private static final int DIA_XOCHITL = 19;
	
	private static final int ANIO_TOCHTLI = 1;
	private static final int ANIO_ACATL = 2;
	private static final int ANIO_TECPATL = 3;
	private static final int ANIO_CALLI = 4;

	
	public static void main (String args[])
	{
		
		ArrayList<Ilhuitl> listaDias = new ArrayList<Ilhuitl>(20);
		
		Ilhuitl dia = null;
		
		dia = new Ilhuitl("CIPACTLI", "Cocodrilo", "", "Oriente", 1);
		listaDias.add(0, dia);
		
		dia = new Ilhuitl("EHECATL", "Viento", "", "Norte", 2);
		listaDias.add(1, dia);
		
		dia = new Ilhuitl("CALLI", "Casa", "", "Poniente", 3);
		listaDias.add(2, dia);
		
		dia = new Ilhuitl("CUETZPALLIN", "Lagartija", "", "Sur", 4);
		listaDias.add(3, dia);
		
		dia = new Ilhuitl("COATL", "Serpiente", "", "Oriente", 5);
		listaDias.add(4, dia);
		
		dia = new Ilhuitl("MIQUIZTLI", "Muerte", "", "Norte", 6);
		listaDias.add(5, dia);
		
		dia = new Ilhuitl("MAZATL", "Venado", "", "Poniente", 7);
		listaDias.add(6, dia);
		
		dia = new Ilhuitl("TOCHTLI", "Conejo", "", "Sur", 8);
		listaDias.add(7, dia);
		
		dia = new Ilhuitl("ATL", "Agua", "", "Oriente", 9);
		listaDias.add(8, dia);
		
		dia = new Ilhuitl("ITZCUINTLI", "Perro", "", "Norte", 10);
		listaDias.add(9, dia);
		
		dia = new Ilhuitl("OZOMATLI", "Mono", "", "Poniente", 11);
		listaDias.add(10, dia);
		
		dia = new Ilhuitl("MALINALLI", "Hierba", "", "Sur", 12);
		listaDias.add(11, dia);
		
		dia = new Ilhuitl("ACATL", "Carrizo", "", "Oriente", 13);
		listaDias.add(12, dia);
		
		dia = new Ilhuitl("OCELOTL", "Ocelote", "", "Norte", 14);
		listaDias.add(13, dia);
		
		dia = new Ilhuitl("CUAUHTLI", "Aguila", "", "Poniente", 15);
		listaDias.add(14, dia);
		
		dia = new Ilhuitl("COZCACUAHTLI", "Aguila de collar", "", "Sur", 16);
		listaDias.add(15, dia);
		
		dia = new Ilhuitl("OLLIN", "Movimiento", "", "Oriente", 17);
		listaDias.add(16, dia);
		
		dia = new Ilhuitl("TECPATL", "Pedernal", "", "Norte", 18);
		listaDias.add(17, dia);
		
		dia = new Ilhuitl("QUIAHUITL", "Lluvia", "", "Poniente", 19);
		listaDias.add(18, dia);
		
		dia = new Ilhuitl("XOCHITL", "Flor", "", "Sur", 20);
		listaDias.add(19, dia);
		
		
		
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
		
		
/*		ArrayList<Cempohualtonalli> veintenas = new ArrayList<Cempohualtonalli>(18);
		
		Cempohualtonalli veintena = null;
		Calendar inicioVeintena = Calendar.getInstance();
		Calendar finalVeintena = Calendar.getInstance();
		inicioVeintena.clear();
		finalVeintena.clear();
		
		inicioVeintena.set(1521, 2, 12);
		finalVeintena.set
		veintena = new Cempohualtonalli("Atlacahualo", "En los acahuales")*/
		
		
		Calendar fechaInicial = Calendar.getInstance();
		fechaInicial.clear();
		fechaInicial.set(1521, Calendar.AUGUST, 13);
		Calendar fechaFinal = Calendar.getInstance();
		fechaFinal.clear();
		fechaFinal.set(1977, Calendar.AUGUST, 25);
		
		Calendar tempDate = (Calendar) fechaInicial.clone();
		long diasCalculados = 0;
		while(tempDate.before(fechaFinal))
		{
			tempDate.add(Calendar.DAY_OF_MONTH, 1);
			diasCalculados++;
		}
		
		System.out.println("Dias de diferencia en calendar: " + diasCalculados);
		
		int numDiaInicial = 1;
		int diaInicial = DIA_COATL;
		
		int numAnioInicial = 3;
		int anioInicial = ANIO_CALLI;
		
		int j = numDiaInicial + 1;
		int k = diaInicial + 1;
		
		tempDate = (Calendar) fechaInicial.clone();
		
		int i = 0;
		int nemontemiInt = 1;
		int bisiestos = 0;
		
		int primerDiaNemontemi = 7;
		int ultimoDiaNemontemi = 11;
		
		String veintena = "";
		
		while(tempDate.before(fechaFinal))
		{
			tempDate.add(Calendar.DAY_OF_MONTH, 1);
			System.out.println("Año: " + tempDate.get(Calendar.YEAR) + " // Mes: " + (tempDate.get(Calendar.MONTH) +1 ) + " // Día: " + tempDate.get(Calendar.DAY_OF_MONTH));
			
			if (tempDate.get(Calendar.MONTH) == 2 && ( tempDate.get(Calendar.DAY_OF_MONTH) >= 12 && tempDate.get(Calendar.DAY_OF_MONTH) <= 31) )
				veintena = "ATLACAHUALO";
			else if (tempDate.get(Calendar.MONTH) == 3 && ( tempDate.get(Calendar.DAY_OF_MONTH) >= 1 && tempDate.get(Calendar.DAY_OF_MONTH) <= 20) )
				veintena = "TLACAXIPEHUALIZTLI";
			else if (tempDate.get(Calendar.MONTH) == 3 && ( tempDate.get(Calendar.DAY_OF_MONTH) >= 21 && tempDate.get(Calendar.DAY_OF_MONTH) <= 30) )
				veintena = "TOZOZTONTLI";
			else if (tempDate.get(Calendar.MONTH) == 4 && ( tempDate.get(Calendar.DAY_OF_MONTH) >= 1 && tempDate.get(Calendar.DAY_OF_MONTH) <= 10) )
				veintena = "TOZOZTONTLI";
			else if (tempDate.get(Calendar.MONTH) == 4 && ( tempDate.get(Calendar.DAY_OF_MONTH) >= 11 && tempDate.get(Calendar.DAY_OF_MONTH) <= 30) )
				veintena = "HUEYTOZOZTLI";
			else if (tempDate.get(Calendar.MONTH) == 4 && tempDate.get(Calendar.DAY_OF_MONTH) == 31 )
				veintena = "TOXCATL";
			else if (tempDate.get(Calendar.MONTH) == 5 && ( tempDate.get(Calendar.DAY_OF_MONTH) >= 1 && tempDate.get(Calendar.DAY_OF_MONTH) <= 19) )
				veintena = "TOXCATL";
			else if (tempDate.get(Calendar.MONTH) == 5 && ( tempDate.get(Calendar.DAY_OF_MONTH) >= 20 && tempDate.get(Calendar.DAY_OF_MONTH) <= 30) )
				veintena = "ETZACUALIZTLI";
			else if (tempDate.get(Calendar.MONTH) == 6 && ( tempDate.get(Calendar.DAY_OF_MONTH) >= 1 && tempDate.get(Calendar.DAY_OF_MONTH) <= 9) )
				veintena = "ETZACUALIZTLI";
			else if (tempDate.get(Calendar.MONTH) == 6 && ( tempDate.get(Calendar.DAY_OF_MONTH) >= 10 && tempDate.get(Calendar.DAY_OF_MONTH) <= 29) )
				veintena = "TECUILHUITONTLI";
			else if (tempDate.get(Calendar.MONTH) == 6 && ( tempDate.get(Calendar.DAY_OF_MONTH) >= 30 && tempDate.get(Calendar.DAY_OF_MONTH) <= 31) )
				veintena = "HUEY TECUILHUITL";
			else if (tempDate.get(Calendar.MONTH) == 7 && ( tempDate.get(Calendar.DAY_OF_MONTH) >= 1 && tempDate.get(Calendar.DAY_OF_MONTH) <= 18) )
				veintena = "HUEY TECUILHUITL";
			else if (tempDate.get(Calendar.MONTH) == 7 && ( tempDate.get(Calendar.DAY_OF_MONTH) >= 19 && tempDate.get(Calendar.DAY_OF_MONTH) <= 31) )
				veintena = "TLAXOCHIMACO";
			else if (tempDate.get(Calendar.MONTH) == 8 && ( tempDate.get(Calendar.DAY_OF_MONTH) >= 1 && tempDate.get(Calendar.DAY_OF_MONTH) <= 7) )
				veintena = "TLAXOCHIMACO";
			else if (tempDate.get(Calendar.MONTH) == 8 && ( tempDate.get(Calendar.DAY_OF_MONTH) >= 8 && tempDate.get(Calendar.DAY_OF_MONTH) <= 27) )
				veintena = "XOCOTL HUETZI";
			else if (tempDate.get(Calendar.MONTH) == 8 && ( tempDate.get(Calendar.DAY_OF_MONTH) >= 28 && tempDate.get(Calendar.DAY_OF_MONTH) <= 30) )
				veintena = "OCHPANIZTLI";
			else if (tempDate.get(Calendar.MONTH) == 9 && ( tempDate.get(Calendar.DAY_OF_MONTH) >= 1 && tempDate.get(Calendar.DAY_OF_MONTH) <= 17) )
				veintena = "OCHPANIZTLI";
			else if (tempDate.get(Calendar.MONTH) == 9 && ( tempDate.get(Calendar.DAY_OF_MONTH) >= 18 && tempDate.get(Calendar.DAY_OF_MONTH) <= 31) )
				veintena = "TEOTLECO";
			else if (tempDate.get(Calendar.MONTH) == 10 && ( tempDate.get(Calendar.DAY_OF_MONTH) >= 1 && tempDate.get(Calendar.DAY_OF_MONTH) <= 6) )
				veintena = "TEOTLECO";
			else if (tempDate.get(Calendar.MONTH) == 10 && ( tempDate.get(Calendar.DAY_OF_MONTH) >= 7 && tempDate.get(Calendar.DAY_OF_MONTH) <= 26) )
				veintena = "TEPEILHUITL";
			else if (tempDate.get(Calendar.MONTH) == 10 && ( tempDate.get(Calendar.DAY_OF_MONTH) >= 27 && tempDate.get(Calendar.DAY_OF_MONTH) <= 30) )
				veintena = "QUECHOLLI";
			else if (tempDate.get(Calendar.MONTH) == 11 && ( tempDate.get(Calendar.DAY_OF_MONTH) >= 1 && tempDate.get(Calendar.DAY_OF_MONTH) <= 16) )
				veintena = "QUECHOLLI";
			else if (tempDate.get(Calendar.MONTH) == 11 && ( tempDate.get(Calendar.DAY_OF_MONTH) >= 17 && tempDate.get(Calendar.DAY_OF_MONTH) <= 31) )
				veintena = "PANQUETZALIZTLI";
			else if (tempDate.get(Calendar.MONTH) == 0 && ( tempDate.get(Calendar.DAY_OF_MONTH) >= 1 && tempDate.get(Calendar.DAY_OF_MONTH) <= 5) )
				veintena = "PANQUETZALIZTLI";
			else if (tempDate.get(Calendar.MONTH) == 0 && ( tempDate.get(Calendar.DAY_OF_MONTH) >= 6 && tempDate.get(Calendar.DAY_OF_MONTH) <= 25) )
				veintena = "ATEMOZTLI";
			else if (tempDate.get(Calendar.MONTH) == 0 && ( tempDate.get(Calendar.DAY_OF_MONTH) >= 26 && tempDate.get(Calendar.DAY_OF_MONTH) <= 31) )
				veintena = "TITITL";
			else if (tempDate.get(Calendar.MONTH) == 1 && ( tempDate.get(Calendar.DAY_OF_MONTH) >= 1 && tempDate.get(Calendar.DAY_OF_MONTH) <= 14) )
				veintena = "TITITL";
			else if (tempDate.get(Calendar.MONTH) == 1 && ( tempDate.get(Calendar.DAY_OF_MONTH) >= 15 && tempDate.get(Calendar.DAY_OF_MONTH) <= 29) )
				veintena = "IZCALLI";
			else if (tempDate.get(Calendar.MONTH) == 2 && ( tempDate.get(Calendar.DAY_OF_MONTH) >= 1 && tempDate.get(Calendar.DAY_OF_MONTH) <= 6) )
				veintena = "IZCALLI";
			else //i(tempDate.get(Calendar.MONTH) == 2 && ( tempDate.get(Calendar.DAY_OF_MONTH) >= 7 && tempDate.get(Calendar.DAY_OF_MONTH) <= 11) )
				veintena = "NEMONTEMI";
			
			
			if ((tempDate.get(Calendar.YEAR) % 4 == 0) && ((tempDate.get(Calendar.YEAR) % 100 != 0) || (tempDate.get(Calendar.YEAR) % 400 == 0)))
			{
				//anio bisiesto
				primerDiaNemontemi = 6;
				ultimoDiaNemontemi = 11;	
				if (nemontemiInt == 7) nemontemiInt = 1;
			}
			else
			{
				primerDiaNemontemi = 7;
				ultimoDiaNemontemi = 11;
				if (nemontemiInt == 6) nemontemiInt = 1;
			}
			if(tempDate.get(Calendar.MONTH) == 2 && ( (primerDiaNemontemi <= tempDate.get(Calendar.DAY_OF_MONTH)) &&  (ultimoDiaNemontemi >= tempDate.get(Calendar.DAY_OF_MONTH))  ))
			{
				System.out.println(i+1 + " -- Día Nemontemi: " + nemontemiInt);
				nemontemiInt++;
			}

			else
			{
				if (j == 14) j=1;
				if (k == 20) k=0;
					
					//Calculo del año antes de mandar la fecha del día, esto provoca un error de no actualizar el año en el día 12 de marzo
					if(tempDate.get(Calendar.MONTH) == 2 && tempDate.get(Calendar.DAY_OF_MONTH) == 12)
					{
						numAnioInicial++;
						anioInicial++;				
						if(numAnioInicial == 14) numAnioInicial = 1;
						if(anioInicial == 5) anioInicial = 1;
						System.out.println("%%%%%%%%% Año: " + numAnioInicial + " de: " + listaAnios.get(anioInicial - 1).getNombre());							
					}				
									
				System.out.println(i+1 + " -- Día: " + j + " - " + listaDias.get(k).getNombre() + " Año: " +  numAnioInicial + " " + listaAnios.get(anioInicial - 1).getNombre() + " Veintena: " + veintena);
				j++;
				k++;
			}
			
//			if(tempDate.get(Calendar.MONTH) == 2 && tempDate.get(Calendar.DAY_OF_MONTH) == 12)
//			{
//				numAnioInicial++;
//				anioInicial++;				
//				if(numAnioInicial == 14) numAnioInicial = 1;
//				if(anioInicial == 5) anioInicial = 1;
//				System.out.println("%%%%%%%%% Año: " + numAnioInicial + " de: " + listaAnios.get(anioInicial - 1).getNombre());							
//			}
			
			
			i++;
		}
		
	}

}
