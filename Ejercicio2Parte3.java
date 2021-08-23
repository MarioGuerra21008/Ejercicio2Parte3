import java.util.Scanner;

/**
* Programa para asignar perritos a las nuevas familias.
* @author Mario Guerra
* @version 22/08/2021
* @see Menu
*/

class Menu{
	
	public static void main(String[] args){
		/**
		* Constructor para la clase de Menu.
		*/
		Scanner scan = new Scanner(System.in);
		Mascota pet = new Mascota();
		Familia fam = new Familia();
		int opcion = 0;
		/**
		* Fin del constructor de la clase Menu.
		*/
		while (opcion != 5){ //Menu para el programa, que sirve como la Vista del programa, por medio de un condicional While.
			System.out.println("\nBuen dia, este menu esta hecho para que pueda escoger tranquilamente entre las siguientes opciones\nque ofrece la perrera, escoja lo que quiere hacer a continuacion:\n");
			System.out.println("1. Registrar a una nueva familia.");
			System.out.println("2. Adoptar a un nuevo perro.");
			System.out.println("3. Visualizar datos de los perros disponibles.");
			System.out.println("4. Visualizar datos de las familias registradas.");
			System.out.println("5. Cerrar sesion.");
			
			opcion = scan.nextInt(); //Opcion para el programa que permitirá al usuario escoger libremente.
			if (opcion == 1){
				FamiliasRegistradas();
				System.out.println("Familia nueva registrada."); //Confirmación de que el método se realizó exitosamente.
			}
			else if (opcion == 2){
				pet.AdopcionPerritos();
			}
			else if (opcion == 3){
				System.out.println("Datos de los 20 perros que disponemos: (Tamano, Raza, Edad, Porcentaje de salud, Color y Nombre)"); //Vista de los 20 perros que se tienen registrados.
				pet.MostrarMascotas();
			}
			else if (opcion == 4){
				System.out.println("Datos de las familias registradas: (Apellido, No. Miembros, No. Hijos pequeños, No. Hijos grandes, No. Mascotas"); //Vista de las familias registradas.
				fam.MostrarFamilias();
			}
			else if (opcion == 5){
				System.out.println("Sesion cerrada con exito."); //Salida y cierre del programa.
			}
			else{
				System.out.println("Ingrese un numero de opcion valido."); //Si el usuario da un número erróneo, se le avisará para que intente nuevamente.
			}
		}
	}
	/**
	* Método FamiliasRegistradas
	* @param NuevasFamilias[] - Arreglo que permitirá inscribir a las nuevas familias del programa.
	*/
	public static void FamiliasRegistradas()
	{
		Scanner scan = new Scanner(System.in);
		String[] NuevasFamilias = new String[12]; //Arreglo para registrar a la familia que desea adoptar un perro.
		System.out.println("Escriba el apellido de su familia: ");
		System.out.println("Escriba en numeros la cantidad de miembros de su familia: ");
		System.out.println("Escriba en numeros la cantidad de hijos pequenos que hay en su familia: ");
		System.out.println("Escriba en numeros la cantidad de hijos grandes que hay en su familia: ");
		System.out.println("Escriba en numeros la cantidad de mascotas que tiene su familia: ");
		String Apellido = scan.next();
		String Miembros = scan.next();
		String NinosPequenos = scan.next();
		String NinosGrandes = scan.next();
		String NumeroMascotas = scan.next();
		NuevasFamilias[0] = Apellido; //Los datos que dé la persona interesada se colocarán en el nuevo arreglo.
		NuevasFamilias[1] = Miembros;
		NuevasFamilias[2] = NinosPequenos;
		NuevasFamilias[3] = NinosGrandes;
		NuevasFamilias[4] = NumeroMascotas;
		for (int i = 0; i <= 4; i++){
		System.out.println(NuevasFamilias[i] + " "); //Imprime la lista para mostrar los datos de la familia.
		}
	}
}

class Mascota{
	/**
	* Método MostrarMascotas
	* @param PerrosPequenos[] - Arreglo que muestra a los perros pequeños.
	* @param PerrosMedianos[] - Arreglo que muestra a los perros medianos.
	* @param PerrosGrandes[] - Arreglo que muestra a los perros grandes.
	* @param PerrosPeligrosos[] - Arreglo que muestra a los perros peligrosos.
	*/
	public static void MostrarMascotas()
	{	//Arreglos de los perros y sus distintos tamaños.
		String[][] PerrosPequenos = new String[][] {{"Pequeno", "Chihuahua", "4", "30%", "Canela", "Fifi"}, {"Pequeno", "Shiba Inu", "1", "100%", "Cafe claro", "Cheems"}, {"Pequeno", "Pug", "8", "74%", "Negro", "Lulu"}, {"Pequeno", "Shih Tzu", "8", "100%", "Blanco y negro", "Manchitas"}, {"Pequeno", "Beagle", "3", "71%", "Mayoritariamente blanco", "Cookie"}};
		String[][] PerrosMedianos = new String[][] {{"Mediano", "Dalmata", "5", "80%", "Blanco con manchas negras", "Pongo"}, {"Mediano", "Shar Pei", "10", "64%", "Cafe", "Jackie"}, {"Mediano", "Amstaff", "4", "59%", "Blanco", "Sparky"}, {"Mediano", "Sabueso", "2", "90%", "Negro", "Toby"}, {"Mediano", "Galgo", "8", "95%", "Blanco", "Arlos"}};
		String[][] PerrosGrandes = new String[][] {{"Grande", "Viejo Pastor Ingles", "3", "90%", "Negro", "Chester"}, {"Grande", "Golden Retriever", "5", "100%", "Dorado claro", "Lucky"}, {"Grande", "San Bernardo", "4", "90%", "Blanco y cafe", "Patty"}, {"Grande", "Terranova", "7", "32%", "Negro", "Sandy"}, {"Grande", "Mastin tibetano", "6", "81%", "Cafe oscuro", "George"}};
		String[][] PerrosPeligrosos = new String[][] {{"Grande", "Pit Bull Terrier", "5", "50%", "Blanco", "Max"}, {"Grande", "Dogo guatemalteco", "7", "90%", "Blanco", "Fido"}, {"Grande", "Mastin napolitano", "2", "80%", "Cafe", "Anthony"}, {"Grande", "Doberman", "3", "100%", "Negro", "Samuel"}, {"Grande", "Tosa Inu", "1", "78%", "Cafe", "Trent"}};
		System.out.println("Estos son los perros pequenos:"); //Muestra los perros pequeños primero.
		for (int i = 0; i <= 5; i++){
			System.out.println(PerrosPequenos[0][i] + " ");
		}
		System.out.println("----");
		for (int i = 0; i <= 5; i++){
			System.out.println(PerrosPequenos[1][i] + " ");
		}
		System.out.println("----");
		for (int i = 0; i <= 5; i++){
			System.out.println(PerrosPequenos[2][i] + " ");
		}
		System.out.println("----");
		for (int i = 0; i <= 5; i++){
			System.out.println(PerrosPequenos[3][i] + " ");
		}
		System.out.println("----");
		for (int i = 0; i <= 5; i++){
			System.out.println(PerrosPequenos[4][i] + " ");
		}
		System.out.println("----");
		System.out.println("Estos son los perros medianos:"); //Muestra los perros de tamaño mediano.
		for (int i = 0; i <= 5; i++){
			System.out.println(PerrosMedianos[0][i] + " ");
		}
		System.out.println("----");
		for (int i = 0; i <= 5; i++){
			System.out.println(PerrosMedianos[1][i] + " ");
		}
		System.out.println("----");
		for (int i = 0; i <= 5; i++){
			System.out.println(PerrosMedianos[2][i] + " ");
		}
		System.out.println("----");
		for (int i = 0; i <= 5; i++){
			System.out.println(PerrosMedianos[3][i] + " ");
		}
		System.out.println("----");
		for (int i = 0; i <= 5; i++){
			System.out.println(PerrosMedianos[4][i] + " ");
		}
		System.out.println("----");
		System.out.println("Estos son los perros grandes:"); //Muestra los perros de tamaño grande.
		for (int i = 0; i <= 5; i++){
			System.out.println(PerrosGrandes[0][i] + " ");
		}
		System.out.println("----");
		for (int i = 0; i <= 5; i++){
			System.out.println(PerrosGrandes[1][i] + " ");
		}
		System.out.println("----");
		for (int i = 0; i <= 5; i++){
			System.out.println(PerrosGrandes[2][i] + " ");
		}
		System.out.println("----");
		for (int i = 0; i <= 5; i++){
			System.out.println(PerrosGrandes[3][i] + " ");
		}
		System.out.println("----");
		for (int i = 0; i <= 5; i++){
			System.out.println(PerrosGrandes[4][i] + " ");
		}
		System.out.println("----");
		System.out.println("Estos son los perros peligrosos:"); //Muestra los perros de tamaño grande y que son considerados como peligrosos.
		for (int i = 0; i <= 5; i++){
			System.out.println(PerrosPeligrosos[0][i] + " ");
		}
		System.out.println("----");
		for (int i = 0; i <= 5; i++){
			System.out.println(PerrosPeligrosos[1][i] + " ");
		}
		System.out.println("----");
		for (int i = 0; i <= 5; i++){
			System.out.println(PerrosPeligrosos[2][i] + " ");
		}
		System.out.println("----");
		for (int i = 0; i <= 5; i++){
			System.out.println(PerrosPeligrosos[3][i] + " ");
		}
		System.out.println("----");
		for (int i = 0; i <= 5; i++){
			System.out.println(PerrosPeligrosos[4][i] + " ");
		}
		System.out.println("----");
	}
	public static void AdopcionPerritos()
	/**
	* Método AdopcionPerritos
	* @param hijosc - Cantidad de hijos pequeños.
	* @param hijosg - Cantidad de hijos grandes.
	* @param pets - Cantidad de mascotas de la familia.
	* @param PerroAAdoptar - El nombre del perro que la familia decidirá adoptar.
	*/
	{
		Scanner scan = new Scanner(System.in);
		int hijosc = 0;
		int hijosg = 0;
		int pets = 0;
		String PerroAAdoptar;
		String[][] PerrosPequenos = new String[][] {{"Pequeno", "Chihuahua", "4", "30%", "Canela", "Fifi"}, {"Pequeno", "Shiba Inu", "1", "100%", "Cafe claro", "Cheems"}, {"Pequeno", "Pug", "8", "74%", "Negro", "Lulu"}, {"Pequeno", "Shih Tzu", "8", "100%", "Blanco y negro", "Manchitas"}, {"Pequeno", "Beagle", "3", "71%", "Mayoritariamente blanco", "Cookie"}};
		String[][] PerrosMedianos = new String[][] {{"Mediano", "Dalmata", "5", "80%", "Blanco con manchas negras", "Pongo"}, {"Mediano", "Shar Pei", "10", "64%", "Cafe", "Jackie"}, {"Mediano", "Amstaff", "4", "59%", "Blanco", "Sparky"}, {"Mediano", "Sabueso", "2", "90%", "Negro", "Toby"}, {"Mediano", "Galgo", "8", "95%", "Blanco", "Arlos"}};
		String[][] PerrosGrandes = new String[][] {{"Grande", "Viejo Pastor Ingles", "3", "90%", "Negro", "Chester"}, {"Grande", "Golden Retriever", "5", "100%", "Dorado claro", "Lucky"}, {"Grande", "San Bernardo", "4", "90%", "Blanco y cafe", "Patty"}, {"Grande", "Terranova", "7", "32%", "Negro", "Sandy"}, {"Grande", "Mastin tibetano", "6", "81%", "Cafe oscuro", "George"}};
		String[][] PerrosPeligrosos = new String[][] {{"Grande", "Pit Bull Terrier", "5", "50%", "Blanco", "Max"}, {"Grande", "Dogo guatemalteco", "7", "90%", "Blanco", "Fido"}, {"Grande", "Mastin napolitano", "2", "80%", "Cafe", "Anthony"}, {"Grande", "Doberman", "3", "100%", "Negro", "Samuel"}, {"Grande", "Tosa Inu", "1", "78%", "Cafe", "Trent"}};
		
		System.out.println("Bienvenido a nuestro programa de adopcion de perros, para proseguir queremos saber unas cosas respecto a su familia.\nCuantos hijos pequenos tienen? ");
		hijosc = scan.nextInt(); //Dependiendo de la respuesta, el programa le mostrará al usuario el arreglo de perros pequeños y medianos para adoptar si tiene hijos pequeños.
		
		if (hijosc != 0){
		System.out.println("Estas son sus opciones de adopcion: ");
			for (int i = 0; i <= 5; i++){
				System.out.println(PerrosPequenos[0][i] + " ");
			}
			System.out.println("----");
			for (int i = 0; i <= 5; i++){
				System.out.println(PerrosPequenos[1][i] + " ");
			}
			System.out.println("----");
			for (int i = 0; i <= 5; i++){
				System.out.println(PerrosPequenos[2][i] + " ");
			}
			System.out.println("----");
			for (int i = 0; i <= 5; i++){
				System.out.println(PerrosPequenos[3][i] + " ");
			}
			System.out.println("----");
			for (int i = 0; i <= 5; i++){
				System.out.println(PerrosPequenos[4][i] + " ");
			}
			System.out.println("----");
			System.out.println("Estos son los perros medianos:");
			for (int i = 0; i <= 5; i++){
				System.out.println(PerrosMedianos[0][i] + " ");
			}
			System.out.println("----");
			for (int i = 0; i <= 5; i++){
				System.out.println(PerrosMedianos[1][i] + " ");
			}
			System.out.println("----");
			for (int i = 0; i <= 5; i++){
				System.out.println(PerrosMedianos[2][i] + " ");
			}
			System.out.println("----");
			for (int i = 0; i <= 5; i++){
				System.out.println(PerrosMedianos[3][i] + " ");
			}
			System.out.println("----");
			for (int i = 0; i <= 5; i++){
				System.out.println(PerrosMedianos[4][i] + " ");
			}
			System.out.println("----");
			System.out.println("Bueno, cuando ya haya terminado conteste, que perrito desea adoptar?");
			PerroAAdoptar = scan.next(); //Aquí el usuario decidirá qué perro adoptará para su familia.
			System.out.println("Muy bien, ha decidido adoptar a " + PerroAAdoptar + ", que felicidad que al fin encuentre un nuevo y lindo hogar, feliz dia!");
		}
		else if (hijosc == 0){
			System.out.println("Muy bien, entonces diganos, cuantos hijos grandes tiene?");
			hijosg = scan.nextInt(); //Dependiendo de la respuesta, el programa le mostrará las opciones de perros pequeños, medianos y grandes si es que tiene hijos grandes en casa.
			if (hijosg !=0){
				System.out.println("Ok, acá tiene sus opciones.");
				for (int i = 0; i <= 5; i++){
				System.out.println(PerrosPequenos[0][i] + " ");
				}
				System.out.println("----");
				for (int i = 0; i <= 5; i++){
					System.out.println(PerrosPequenos[1][i] + " ");
				}
				System.out.println("----");
				for (int i = 0; i <= 5; i++){
					System.out.println(PerrosPequenos[2][i] + " ");
				}
				System.out.println("----");
				for (int i = 0; i <= 5; i++){
					System.out.println(PerrosPequenos[3][i] + " ");
				}
				System.out.println("----");
				for (int i = 0; i <= 5; i++){
					System.out.println(PerrosPequenos[4][i] + " ");
				}
				System.out.println("----");
				System.out.println("Estos son los perros medianos:");
				for (int i = 0; i <= 5; i++){
					System.out.println(PerrosMedianos[0][i] + " ");
				}
				System.out.println("----");
				for (int i = 0; i <= 5; i++){
					System.out.println(PerrosMedianos[1][i] + " ");
				}
				System.out.println("----");
				for (int i = 0; i <= 5; i++){
					System.out.println(PerrosMedianos[2][i] + " ");
				}
				System.out.println("----");
				for (int i = 0; i <= 5; i++){
					System.out.println(PerrosMedianos[3][i] + " ");
				}
				System.out.println("----");
				for (int i = 0; i <= 5; i++){
					System.out.println(PerrosMedianos[4][i] + " ");
				}
				System.out.println("----");
				System.out.println("Estos son los perros grandes:");
				for (int i = 0; i <= 5; i++){
					System.out.println(PerrosGrandes[0][i] + " ");
				}
				System.out.println("----");
				for (int i = 0; i <= 5; i++){
					System.out.println(PerrosGrandes[1][i] + " ");
				}
				System.out.println("----");
				for (int i = 0; i <= 5; i++){
					System.out.println(PerrosGrandes[2][i] + " ");
				}
				System.out.println("----");
				for (int i = 0; i <= 5; i++){
					System.out.println(PerrosGrandes[3][i] + " ");
				}
				System.out.println("----");
				for (int i = 0; i <= 5; i++){
					System.out.println(PerrosGrandes[4][i] + " ");
				}
				System.out.println("----");
				System.out.println("Bueno, cuando ya haya terminado conteste, que perrito desea adoptar?");
				PerroAAdoptar = scan.next(); //El usuario decidirá que perro adoptar.
				System.out.println("Muy bien, ha decidido adoptar a " + PerroAAdoptar + ", que felicidad que al fin encuentre un nuevo y lindo hogar, feliz dia!");
			}
			else if (hijosg == 0){
				System.out.println("Bueno, una ultima pregunta ahora si, cuantas mascotas tiene?");
				pets = scan.nextInt(); //Si tiene 4 o más mascotas, el programa no le dejará escoger un perro para adoptar, si tiene 0 a 3 mascotas, podrá adoptar desde perros pequeños hasta perros peligrosos, al no tener hijos en casa.
				if (pets >= 0 && pets < 4){
					System.out.println("Ok, entonces como no tienen hijos, acá va la lista completa: ");
					MostrarMascotas(); //Método para mostrar el catálogo de perros al completo.
					System.out.println("Bueno, cuando ya haya terminado conteste, que perrito desea adoptar?");
					PerroAAdoptar = scan.next(); //Decidirá aquí que perro quiere adoptar.
					System.out.println("Muy bien, ha decidido adoptar a " + PerroAAdoptar + ", que felicidad que al fin encuentre un nuevo y lindo hogar, feliz dia!");
				}
				else{
					System.out.println("Por gusto pregunto, usted ya no puede tener mascotas."); //Mensaje que sale si el usuario tiene 4 o más mascotas.
				}
			}
		}
	}
}

class Familia{
	public static void MostrarFamilias()
	/**
	* Método MostrarFamilias
	* @param Familias[] - Lista de las familias ya registradas en el programa de la perrera para adopción.
	*/
	{
		String[][] Familias = new String[][] { {"Ordonez", "4", "2", "0", "1"}, {"Guerrero", "3", "0", "0", "3"}, {"Zavala", "5", "0", "3", "0"} }; //Arreglo de arreglos que muestra las familias ya registradas.
		for (int j = 0; j <= 4; j++){
			System.out.println(Familias[0][j] + " ");
		}
		System.out.println("----");
		for (int j = 0; j <= 4; j++){
			System.out.println(Familias[1][j] + " ");
		}
		System.out.println("----");
		for (int j = 0; j <= 4; j++){
			System.out.println(Familias[2][j] + " ");
		}
		System.out.println("----");
	}
}