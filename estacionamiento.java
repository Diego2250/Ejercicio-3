/******************************************************************
estacionamiento.java
Autor: Diego Morales
Última modificación: 2021-05-09

Modelo de estacionamiento para uso del Controlador.
******************************************************************/
public class estacionamiento{
  String nombre, direccion="";
  int precio=0, espaciosparqueo=5;
  public estacionamiento(){
    nombre="";
    direccion="";
    precio=0;
    espaciosparqueo=5;
  }
  /*Metodo para devolver el valor de nombre
  @return valor de nombre
  */
  public String getNombre(){
    return nombre;
  }
  /*Metodo para devolver el valor de direccion
  @return valor de direccion
  */
  public String getdireccion(){
    return direccion;
  }
  /*Metodo para devolver el valor de precio
  @return valor de precio
  */
  public int getprecio(){
    return precio;
  }
  /*Metodo para devolver el valor de espacioparqueo
  @return valor de espaciosparqueo
  */
  public int getespaciosparqueo(){
    return espaciosparqueo;
  }
  /*Metodo para cambiar el valor de nombre
  @return valor de nombre
  */
  public void setNombre(String newNombre){
    nombre=newNombre;
  }
  /*Metodo para cambiar el valor de direccion
  @return valor de direccion
  */
  public void setDireccion(String newDireccion){
    direccion=newDireccion;
  }
  /*Metodo para cambiar el valor de precio
  @return valor de precio
  */
  public void setprecio(int newprecio){
    precio=newprecio;
  }
  /*Metodo para cambiar el valor de espaciosparqueo
  @return valor de espaciosparqueo
  */
  public void setEspaciosparqueo(int newEspaciosparqueo){
    espaciosparqueo=newEspaciosparqueo;
  }
}
