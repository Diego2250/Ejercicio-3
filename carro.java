/******************************************************************
carro.java
Autor: Diego Morales
Última modificación: 2021-05-09

Modelo de carro para uso del Controlador.
******************************************************************/
public class carro{
  String placas, marca, modelo;
  public carro(){
    placas="";
    marca="";
    modelo="";
    }
    /*Metodo para devolver el valor de placas
    @return valor de placas
    */
  public String getPlacas(){
    return placas;
  }
  /*Metodo para devolver el valor de marca
  @return valor de marca
  */
  public String getMarca(){
    return marca;
  }
  /*Metodo para devolver el valor de caracteristicas
  @return valor de caracteristicas
  */
  public String getModelo(){
    return modelo;
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
}
