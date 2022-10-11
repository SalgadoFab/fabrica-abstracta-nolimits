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
		}while(opcion != 6);
    }

	private static int mostrarMenu() {
		String cad="";

		cad=cad+"\n";
		cad=cad+"Ingrese la opcion correspondiente: \n";
		cad=cad+"1. Crear un nuevo JButton\n";
		cad=cad+"2. Crear un nuevo JChexbox\n";
		cad=cad+"3. Crear una nuevo  JLabel\n";
		cad=cad+"4. Crear una nuevo  JTextArea\n";
		cad=cad+"5. Imprimir Codigos existentes\n";
		cad=cad+"6. Salir \n";
		cad=cad+"\n";

		System.out.println(cad);

		return scan.nextInt();
	}
}

