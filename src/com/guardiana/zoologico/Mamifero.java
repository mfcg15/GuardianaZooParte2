package com.guardiana.zoologico;

public class Mamifero 
{
	private int nivelDeEnergia;

	public Mamifero() 
	{
		this.nivelDeEnergia = 100;
	}

	public int getNivelDeEnergia() 
	{
		return nivelDeEnergia;
	}

	public void setNivelDeEnergia(int nivelDeEnergia) 
	{
		this.nivelDeEnergia = nivelDeEnergia;
	}
	
	public int mostrarEnergia() 
	{
		System.out.println("Nivel de energia actual:"+this.nivelDeEnergia);
		return this.nivelDeEnergia;
	}
}
