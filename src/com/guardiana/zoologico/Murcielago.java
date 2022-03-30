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
		System.out.println("El murciélago utilizo ecolacación");
	}
	
	public void comerHumanos()
	{
		int energia = getNivelDeEnergia()+25;
		setNivelDeEnergia(energia);
		System.out.println("Murciélago utilizo ecolacación");
	}
	
	public void atarcarPueblo()
	{
		int energia = getNivelDeEnergia()-100;
		setNivelDeEnergia(energia);
		System.out.println("El pueblo esta en llamas");
	}

}
