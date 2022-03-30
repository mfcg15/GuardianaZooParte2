package com.guardiana.zoologico;

public class TestMurcielago 
{
	public static void main(String[]args)
	{
		Murcielago  murcielago = new Murcielago() ;
		System.out.println("El nivel de energia del murciélago es de "+murcielago.mostrarEnergia());
		murcielago.atarcarPueblo();
		murcielago.atarcarPueblo();
		murcielago.atarcarPueblo();
		murcielago.comerHumanos();
		murcielago.comerHumanos();
		murcielago.volar();
		murcielago.volar();
		System.out.println("El nivel de energia del murciélago es de "+murcielago.mostrarEnergia());
	}
}
