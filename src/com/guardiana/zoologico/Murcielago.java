package com.guardiana.zoologico;

public class Murcielago extends Mamifero
{

	public Murcielago() 
	{
		super();
		setNivelDeEnergia(300);
	}
	
	public void volar()
	{
		int energia = getNivelDeEnergia()-50;
		setNivelDeEnergia(energia);
		System.out.println("El murci�lago utilizo ecolacaci�n");
	}
	
	public void comerHumanos()
	{
		int energia = getNivelDeEnergia()+25;
		setNivelDeEnergia(energia);
		System.out.println("Murci�lago utilizo ecolacaci�n");
	}
	
	public void atarcarPueblo()
	{
		int energia = getNivelDeEnergia()-100;
		setNivelDeEnergia(energia);
		System.out.println("El pueblo esta en llamas");
	}

}
