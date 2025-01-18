package com.midagama.moviles.tonalpohualli.correlacion;

public class RelacionPorCuartos {
	
	public static void main(String args[])
	{
		int cuarto = 6;
		int dia = cuarto * 4;
		int veintena = dia * 20;
		int nemontemi = dia * 5;
		int anioVeintenas = veintena * 18;
		int anioCompleto = anioVeintenas + nemontemi + cuarto;
		
		System.out.println("Cuarto= " + cuarto + " horas // D�a= " + dia + " horas // veintena= " + veintena + " horas // nemontemi= " + 
		nemontemi + " horas // Atado de veintenas= " + anioVeintenas + " horas // A�o completo= " + anioCompleto + " horas.");
		 
		int l = 0;
		
		//Engrane para de cu�ntos a�os queremos saber
		for(int m=1; m<=1; m++)
		{
			System.out.println("Inicia a�o: " + m);
			//Engrane para generar la a�o de la veintena en base a 18 veintenas
			for(int k=1; k<=18; k++)
			{
				System.out.println("	Inicia veintena: " + k);
				//Engrane para generar la veintena en base a 20 d�as
				for(int j=1; j<=20; j++)
				{
					System.out.println("		Inicia d�a: " + j);
					//Engrane para generar el d�a en base a 4 cuartos
					for(int i=1; i <=4; i++)
					{
						
						System.out.println("			Inicia cuarto de d�a " + i);
						for(int h=1; h<=5; h++)
						{
							System.out.println("				Inicia hora " + h);
							for(int g=1; g<=72; g++)
							{
								l++;
								System.out.println("					Minuto " + g);
							}
							System.out.println("				Finaliza hora " + h);
						}
						System.out.println("			Finaliza cuarto de d�a " + i);
						//System.out.println("				Numero de cuarto: " + l);
						
					}//Fin del ciclo de dias por cuarto				
					System.out.println("		Finaliza d�a: " + j);
				}//Find el ciclo de veintenas por d�as
				System.out.println("	Finaliza veintena: " + k);
			}//Fin del ciclo del a�o por veintenas
			
			//Engrane para generar los nemontemi en base a dias
			for(int j=1; j<=5; j++)
			{
				System.out.println("	Inicia d�a nemontemi: " + j);
				//Engrane para generar el d�a en base a 4 cuartos
				for(int i=1; i <=4; i++)
				{
					
					System.out.println("			Inicia cuarto de d�a " + i);
					for(int h=1; h<=5; h++)
					{
						System.out.println("				Inicia hora " + h);
						for(int g=1; g<=72; g++)
						{
							l++;
							System.out.println("					Minuto " + g);
						}
						System.out.println("				Finaliza hora " + h);
					}
					System.out.println("			Finaliza cuarto de d�a " + i);
					//System.out.println("				Numero de cuarto: " + l);
					
				}//Fin del ciclo de dias por cuarto				
				System.out.println("	Finaliza d�a nemontemi: " + j);
			}//Find el ciclo de veintenas por d�as
			
			//Se agrega el cuarto de d�a del calendario
			l =  l + 360; //Se suman 360 minutos que son 5 horas de 72 minutos cada una (que ser�a lo mismo en una hora de 60 minutos agregar 6 horas)
			//System.out.println("Cuartos " + l);
			System.out.println("Finaliza A�o " + m);
			
		}//Fin del ciclo de a�os
		
		//Impresion final de la cantidad de horas en un a�o:
		System.out.println("Minutos totales del a�o: " + l);
		System.out.println("Horas totales del a�o: " + (l / 60));
		
	}//Fin del main

}//Fin de la clase
