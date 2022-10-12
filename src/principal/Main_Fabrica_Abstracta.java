package principal;

import gestor.Fabrica_SwingComponent;

import java.util.Scanner;

public class Main_Fabrica_Abstracta {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = 0;

		do {
			opcion = mostrarMenu();
			System.out.println(Fabrica_SwingComponent.procesarFuncion(opcion));
		}while(opcion != 5);
    }

	private static int mostrarMenu() {
		String cad="";

		cad=cad+"\n";
		cad=cad+"Ingrese la opcion correspondiente: \n";
		cad=cad+"1. Crear un nuevo JLabel\n";
		cad=cad+"2. Crear un nuevo JButton\n";
		cad=cad+"3. Crear un nuevo JTextarea\n";
		cad=cad+"4. Crear un nuevo JCheckbox\n";
		cad=cad+"5. Salir \n";
		cad=cad+"\n";

		System.out.println(cad);

		return scan.nextInt();
	}
}

