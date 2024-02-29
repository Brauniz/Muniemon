package objeto;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Muniemon m1 = new Muniemon("greninja", 100, 5, 1, Tipo.AGUA);
		
		
		System.out.println("Menú, pulsa 1 para revalorizar tu muniemon, 2 mostrar muniemon datos, 3 salir del programa");
		int menuu = sc.nextInt();
		while(menuu < 4 && menuu > 0) {
			if(menuu == 1) {
				System.out.println("¿Quieres darle un nuevo nombre a tu muniemon? Introduce si o no :");
				String renombrar = sc.nextLine();
				renombrar = sc.nextLine();
				if(renombrar.equalsIgnoreCase("si")) {
					System.out.println("Introduce como quieres llamar a tu muniemon :");
					String nombreDif = sc.nextLine();
					m1.setNombre(nombreDif);
					System.out.println("Tu greninja ahora se llama :" + nombreDif);
				}else break;	
				System.out.println("Introduce la vida de tu muniemon, con un maximo de 100p :");
				int vidaa = sc.nextInt();
				System.out.println("La vida de tu muniemon es :" + vidaa);
				System.out.println("Introduce el ataque de tu muniemon, con un maximo de 5a :");
				int ataquee = sc.nextInt();
				System.out.println("El ataque de tu muniemon es :" + ataquee);
				System.out.println("Introduce la defensa de tu muniemon, con un maximo de 4d :");
				int defensaa = sc.nextInt();
				System.out.println("La defensa de tu muniemon es :" + defensaa);		
			}else if(menuu == 2) {
				System.out.println("Mostrar muniemon");
				System.out.println(m1);
			}else if(menuu == 3) {
				System.out.println("Saliste del menú");
				break;
			}
			System.out.println("Menú, pulsa 1 para renombrar pokemon, 2 mostrar muniemon datos, 3 salir del programa");
			menuu = sc.nextInt();
		}
	}
	}