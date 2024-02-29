package objeto;

import java.util.Scanner;

public class Muniemon {
	private String nombre;
	private int vida;
	private int ataque;
	private int defensa;
	private Tipo tipo;
	public String getNombre() {
		return nombre;
}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getVida() {
		return vida;
}
	public void setVida(int vida) {
		this.vida = vida;
}
	public int getAtaque() {
		return ataque;	
}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
}
	public int getDefensa() {
		return defensa;
}
	public void setDefensa(int defensa) {
		this.defensa = defensa;	}
	public Tipo getTipo() {
		return tipo;
}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
}
	public Muniemon(String nombre, int vida, int ataque, int defensa, Tipo tipo) {
		this.nombre = nombre;
		this.vida = vida;
		this.ataque = ataque;
		this.defensa = defensa;
		this.tipo = tipo;
	}
	public String toString() {
		return "greninja [nombre=" + nombre + ", vida=" + vida + ", ataque=" + ataque + ", defensa=" + defensa + ", tipo="
				+ tipo + "]";
	}
	public int atacar(Scanner sc) {
		int nuevaVida = 0;
		System.out.println("¿Seguro? 1 > si, 2 > no :");
		int seguro = sc.nextInt();
		
		while(seguro < 2 && seguro > 1) {
			if(seguro == 1) {
				defensa -= ataque;
				vida += defensa;
				nuevaVida = vida;
			}else break;
		}
		if(nuevaVida == 0) {
			
		}
		return nuevaVida;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}