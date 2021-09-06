/***************************************************
Controlador.java			Autor: Diego Morales
							Fecha: 05/09/2021

Driver program. Instancia la vista y el modelo,
y los comunica de acuerdo con las elecciones del
usuario.
***************************************************/
import java.io.*;
import java.util.ArrayList;
class controlador{
	public static void main(String[] args){
		ArrayList<Integer> parqueos= new ArrayList<Integer>();
		parqueos.add(1);
		parqueos.add(2);
		parqueos.add(3);
		parqueos.add(4);
		parqueos.add(5);
		ArrayList <String> marcas=new ArrayList<String>();
		ArrayList <Float> tiempo= new ArrayList<Float>();
		int contrechazados=0;
		int cont=0;
		estadisticas e=new estadisticas();
		vista v = new vista();
		espacioparqueo ep = new espacioparqueo();
		carro c = new carro();
		archivo a = new archivo();
		v.bienvenida();
		String nombre, direccion, precio;
		String[] dato=v.pedirdatosparqueo();
		nombre=dato[0];
		direccion=dato[1];
		precio=dato[2];
		a.crearchivo();
		a.escribirdatosparqueo(nombre, direccion, precio);
		int opcion = 0;
		System.out.println(parqueos.size());
		while (opcion != 5){
			opcion = v.menuOpciones();
			switch(opcion){
				case 1:
				if(cont<=parqueos.size()){
					String placas, modelo, marca, espacio="";
					int horas, minutos=0;
					float tiempototal=0;
					String[] datos=v.pedirdatoscarro();
					int[] datosint=v.pedirdatostiempo();
					placas=datos[0];
					marca=datos[1];
					modelo=datos[2];
					horas=datosint[0];
					minutos=datosint[1];
					espacio=datos[3];
					ep.setMarca(marca);
					ep.setPlacas(placas);
					ep.setModelo(modelo);
					ep.setHoras(horas);
					ep.setMinutos(minutos);
					c.setMarca(marca);
					c.setModelo(modelo);
					c.setPlacas(placas);
					v.carroAgregadaExitosamente();
					cont++;
					tiempototal=horas+(minutos/60);
					marcas.add(marca);
					tiempo.add(tiempototal);
					a.crearchivo();
					a.escribirdatoscarros(placas, modelo, marca, espacio, horas, minutos);
				}else{
						v.Sinespacio();
						contrechazados++;
				}


				break;
				case 2:
				String ancho, largo, alto, caracteristicas;
				String[] datos=v.pedirdatosespacioparqueo();
				ancho=datos[0];
				largo=datos[1];
				alto=datos[2];
				caracteristicas=datos[3];
				cont++;
				parqueos.add(cont);
				break;
				case 3:
				e.tiempo_promedio(tiempo);
				e.vehiculos_rechazados(contrechazados);
				break;
				case 4:
				a.leer();
				break;
				case 5:
				v.despedida();
				break;
				default:
				v.opcionInvalida();
				break;
			}
	}
 }
}
