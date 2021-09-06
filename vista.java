/***************************************************
Vista.java			Autor: Diego Morales
					Fecha: 22/08/2021

Vista. Responsable de toda interaccion con el usuario.
***************************************************/
import java.util.Scanner;
/*Metodo para elegír una opción
@return número de opción
*/
public class vista{
	private Scanner scan;

	public vista(){
		scan = new Scanner(System.in);
	}

	public int menuOpciones(){
		int op=0;
		try{
			String s = "¿Que desea hacer?\n" +
					"1. Ingreso de nuevo carro\n" +
					"2. Agregar más espacios de parqueo\n" +
					"3. Estadisticas\n" +
					"4. Leer datos del archivo\n" +
					"5. Salir";

		System.out.println(s);
		op = scan.nextInt();
	}catch (Exception e){
				e.printStackTrace();
		}

		return op;
	}
	/*Metodo para pedir datos del carro
	@return Datos del carro
	*/
	public String[] pedirdatoscarro(){
		String[] resultado={"","","",""};
		try{
		System.out.println("Por favor ingrese el número de placas del vehiculo: ");
		resultado[0] = scan.next();
		System.out.println("Por favor ingrese la marca del vehículo: ");
		resultado[1] = scan.next();
		System.out.println("Por favor ingrese el modelo del vehículo: ");
		resultado[2]= scan.next();
		System.out.println("Por favor ingrese espacio de parqueo en el que se estacionará el vehiculo: ");
		resultado[3]= scan.next();
	}
	catch (Exception e){
		e.printStackTrace();
	}
	return resultado;
	}
	/*Metodo para pedir datos del carro
	@return Datos del carro
	*/
	public int[] pedirdatostiempo(){
		int[] resultadoint= {0,0,0,0};
		try{
		System.out.println("Por favor ingrese las horas que el vehículo a estado estacionado: ");
		resultadoint[0]= scan.nextInt();
		System.out.println("Por favor ingrese los minutos que el vehículo a estado estacionado: ");
		resultadoint[1]= scan.nextInt();
		}
		catch (Exception e){
			e.printStackTrace();
		}
				return resultadoint;
	}
	/*Metodo para pedir datos del parqueo
	@return Datos del parqueo
	*/
	public String[] pedirdatosparqueo(){
			String[] resultado={"","",""};
			try{
		System.out.println("Por favor ingrese el nombre del parqueo: ");
		resultado[0] = scan.nextLine();
		System.out.println("Por favor ingrese la dirección del parqueo: ");
		resultado[1] = scan.nextLine();
		System.out.println("Por favor ingrese el precio por hora del parqueo: ");
		resultado[2] = scan.nextLine();
			}
		catch (Exception e){
			e.printStackTrace();
		}
		return resultado;
	}
	/*Metodo para pedir datos de los espacios de parqueo
	@return Datos de los espacios de parqueo
	*/
	public String[] pedirdatosespacioparqueo(){
		String[] resultado={"","","", ""};
		try{
		System.out.println("Por favor ingrese el ancho del parqueo: ");
		resultado[0] = scan.next();
		System.out.println("Por favor ingrese el largo del parqueo: ");
		resultado[1] = scan.next();
		System.out.println("Por favor ingrese la altura del parqueo: ");
		resultado[2] = scan.next();
		System.out.println("Por favor ingrese si el parqueo es techado o aéreo: ");
		resultado[3] = scan.next();
		}
		catch (Exception e){
			e.printStackTrace();
		}
		return resultado;
	}
	/*Metodo para mostrar mensaje de despedida al usuario
	*/
	public void despedida(){
		System.out.println("Gracias por usar este programa, adios");
	}
	/*Metodo para mostrar mensaje de bienvenida al usuario
	*/
	public void bienvenida(){
		System.out.println("Bienvendi@!");
	}
	/*Metodo para mostrar mensaje
	*/
	public void carroAgregadaExitosamente(){
		System.out.println("El vehículo ha sido ingresado con éxito");
	}
	/*Metodo para mostrar mensaje
	*/
	public void opcionInvalida(){
		System.out.println("Ha elegido una opción inválida.");
	}

	/*Metodo para mostrar mensaje
	*/
	public void Sinespacio(){
		System.out.println("No hay más espacio en el parqueo");
	}
}
