/******************************************************************
espacioparqueo.java
Autor: Diego Morales
Última modificación: 2021-05-09

Modelo de espacioparqueo para uso del Controlador.
******************************************************************/
public class espacioparqueo{
  int ancho, largo, altura, horas, minutos=0;
  String caracteristicas, placas, modelo, marca="";
  public espacioparqueo(){
    ancho=9;
    largo=20;
    altura=30;
    horas=0;
    minutos=0;
    caracteristicas="Techado";
    placas="";
    modelo="";
  }
  /*Metodo para cambiar el valor de horas
  @return valor de horas
  */
  public void setHoras(int newHoras){
    horas=newHoras;
  }
  /*Metodo para cambiar el valor de minutos
  @return valor de minutos
  */
  public void setMinutos(int newMinutos){
    minutos=newMinutos;
  }
  /*Metodo para cambiar el valor de modelo
  @return valor de modelo
  */
  public void setModelo(String newModelo){
    modelo=newModelo;
  }
  /*Metodo para cambiar el valor de placas
  @return valor de placas
  */
  public void setPlacas(String newPlacas){
    placas=newPlacas;
  }
  /*Metodo para cambiar el valor de marca
  @return valor de marca
  */
  public void setMarca(String newMarca){
    marca=newMarca;
  }
  /*Metodo para devolver el valor de caracteristicas
  @return valor de caracteristicas
  */
  public String getCaracteristicas(){
    return caracteristicas;
  }
  /*Metodo para cambiar el valor de caracteristicas
  @return valor de caracteristicas
  */
  public void setCaracteristicas(String newCaracteristicas){
    caracteristicas=newCaracteristicas;
  }
  /*Metodo para cambiar el valor de hancho
  @return valor de ancho
  */
  public void setAncho(int newAncho){
    ancho=newAncho;
  }
  /*Metodo para cambiar el valor de lago
  @return valor de largo
  */
  public void setLargo(int newLargo){
    largo=newLargo;
  }
  /*Metodo para cambiar el valor de altura
  @return valor de altura
  */
  public void setAltura(int newAltura){
    altura=newAltura;
  }
}
