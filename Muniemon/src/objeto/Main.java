package objeto;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Muniemon greninja = new Muniemon("greninja", 100, 5, 1, Tipo.AGUA);
		Muniemon sceptile = new Muniemon("sceptile", 100, 5, 1, Tipo.PLANTA);

		System.out.println("Menú");
		sc.nextLine();
		System.out.println("¿A que Muniemon quieres tocar? 1 > greninja, 2 > sceptile, 3 avanzar :");
		int elegirMuniemon = sc.nextInt();
		while(elegirMuniemon >= 1 && elegirMuniemon <=3) {
		if(elegirMuniemon == 1) {
			System.out.println("Pulsa 1 para revalorizar tu greninja, 2 mostrar muniemon datos, 3 salir del programa");
			int menuu = sc.nextInt();
			while(menuu <= 3 && menuu >= 1) {
				if(menuu == 1) {
					System.out.println("¿Quieres darle un nuevo nombre a tu muniemon? Introduce si o no :");
					String renombrar = sc.nextLine();
					renombrar = sc.nextLine();
					if(renombrar.equalsIgnoreCase("si")) {
						System.out.println("Introduce como quieres llamar a tu muniemon :");
						String nombreDif = sc.nextLine();
						greninja.setNombre(nombreDif);
						System.out.println("Tu greninja ahora se llama :" + nombreDif);
					}else {
						
					}
					System.out.println("Introduce la vida de tu muniemon, con un maximo de 100p :");
					int vidaa = sc.nextInt();
					greninja.setVida(vidaa);
					System.out.println("La vida de tu muniemon es :" + vidaa);
					
					System.out.println("Introduce el ataque de tu muniemon, con un maximo de 5a :");
					int ataquee = sc.nextInt();
					greninja.setAtaque(ataquee);
					System.out.println("El ataque de tu muniemon es :" + ataquee);
					
					System.out.println("Introduce la defensa de tu muniemon, con un maximo de 4d :");
					int defensaa = sc.nextInt();
					greninja.setDefensa(defensaa);
					System.out.println("La defensa de tu muniemon es :" + defensaa);		
				}else if(menuu == 2) {
					System.out.println("Mostrar muniemon");
					System.out.println(greninja);
				}else if(menuu == 3) {
					System.out.println("Saliste del menú");
					break;
				}
				System.out.println("Menú, pulsa 1 para revalorizar tu greninja de nuevo, 2 mostrar muniemon datos, 3 salir del programa");
				menuu = sc.nextInt();
			}
		}else if(elegirMuniemon == 2) {
			System.out.println("Menú, pulsa 1 para revalorizar tu sceptile, 2 mostrar muniemon datos, 3 salir del programa");
			int menuu = sc.nextInt();
			while(menuu < 4 && menuu > 0) {
				if(menuu == 1) {
					System.out.println("¿Quieres darle un nuevo nombre a tu muniemon? Introduce si o no :");
					String renombrar = sc.nextLine();
					renombrar = sc.nextLine();
					if(renombrar.equalsIgnoreCase("si")) {
						System.out.println("Introduce como quieres llamar a tu muniemon :");
						String nombreDif = sc.nextLine();
						sceptile.setNombre(nombreDif);
						System.out.println("Tu greninja ahora se llama :" + nombreDif);
					}else break;	
					System.out.println("Introduce la vida de tu muniemon, con un maximo de 100p :");
					int vidaa = sc.nextInt();
					sceptile.setVida(vidaa);
					System.out.println("La vida de tu muniemon es :" + vidaa);
					
					System.out.println("Introduce el ataque de tu muniemon, con un maximo de 5a :");
					int ataquee = sc.nextInt();
					sceptile.setAtaque(ataquee);
					System.out.println("El ataque de tu muniemon es :" + ataquee);
					
					System.out.println("Introduce la defensa de tu muniemon, con un maximo de 4d :");
					int defensaa = sc.nextInt();
					sceptile.setDefensa(defensaa);
					System.out.println("La defensa de tu muniemon es :" + defensaa);		
				}else if(menuu == 2) {
					System.out.println("Mostrar muniemon");
					System.out.println(sceptile);
				}else if(menuu == 3) {
					System.out.println("Saliste del menú");
					break;
				}
				System.out.println("Menú, pulsa 1 para revalorizar tu sceptile de nuevo, 2 mostrar muniemon datos, 3 salir del programa");
				menuu = sc.nextInt();
			}
			}else break;
		}
		System.out.println("Pulsa 5 para que greninja ataque a sceptile, o pulsa 6 para que secptile ataque a greninja :");
		int atacar = sc.nextInt();
		while(atacar >= 5 && atacar <= 7) {
			if(atacar == 5) {
				sceptile.atacar(sc);
				System.out.println("La vida de " + sceptile.getNombre() + " ahora es " + sceptile.getVida());

			}else if(atacar == 6) {
				greninja.atacar(sc);
				System.out.println("La vida de " + greninja.getNombre() + " ahora es " + greninja.getVida());
			}else if(atacar == 7) {
				System.out.println("Saliste del proceso de atacar");
			break;
			}
			System.out.println("Pulsa 5 para que greninja ataque a sceptile, o pulsa 6 para que secptile ataque a greninja :");
			atacar = sc.nextInt();
		}
		
	}
	}