/******************************************************************
estadisticas.java
Autor: Diego Morales
Última modificación: 2021-05-09

Modelo de estadisticas para uso del Controlador.
******************************************************************/
import java.util.ArrayList;
import java. util. Collection;
public class estadisticas{
  public estadisticas(){

  }
  /*Metodo calcular el tiempo promedio en el que los autos se estacionan
  */
  public void tiempo_promedio(ArrayList<Float> tiempo){
    float sum=0;
    int cont=0;
    for (int i=0;i<tiempo.size(); i++) {
      sum+=tiempo.get(i);
      cont++;
    }
    float promedio=sum/cont;
    System.out.println("El tiempo promedio del uso del parqueo es de: "+promedio);
  }
  /*Metodo calcular los vehículos que son rechazados
  */
  public void vehiculos_rechazados(int cont){
    System.out.println("Los vehículos rechazados fueron: "+cont);
  }
}
