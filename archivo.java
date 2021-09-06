/******************************************************************
archivo.java
Autor: Diego Morales
Última modificación: 2021-05-09

Modelo de archivo para uso del Controlador.
******************************************************************/
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;
public class archivo{
  public archivo(){

  }
  /*Metodo crear un archivo de texto
  */
  public void crearchivo() {
      try {
        File myObj = new File("parqueo.txt");
        if (myObj.createNewFile()) {
          System.out.println("Archivo creado: " + myObj.getName());
        } else {
          System.out.println("El archivo ya existe");
        }
      } catch (IOException e) {
        System.out.println("Un error ha ocurrido");
        e.printStackTrace();}
      }
      /*Metodo para escribir en el archivo
      */
  public void escribirdatoscarros(String placas, String modelo, String marca, String espacio, int horas, int minutos){
    try {
      FileWriter myWriter = new FileWriter("parqueo.txt", true);
      myWriter.write("El carro con las caracteristicas: "+"Placas "+placas+", "+"Modelo "+modelo+", "+" Marca "+marca+" Se parqueo durante: "+ horas+ " horas y "+minutos+" minutos"+" en el espacio de parqueo: "+espacio+"\n");
      myWriter.close();
      System.out.println("Se escribió correctamente la información");
    } catch (IOException e) {
      System.out.println("Ocurrió un error");
      e.printStackTrace();
  }
    }
    /*Metodo para escribir en el archivo
    */
    public void escribirdatosparqueo(String nombre, String direccion, String precio){
      try {
        FileWriter myWriter = new FileWriter("parqueo.txt", true);
        myWriter.write("Este es el archivo del parqueo: "+nombre+" con dirección"+direccion+" y con un precio por hora de Q"+precio);
        myWriter.close();
        System.out.println("Se escribió correctamente la información");
      } catch (IOException e) {
        System.out.println("Un error ha ocurrido");
        e.printStackTrace();
    }
      }
      /*Metodo para leer el archivo
      */
  public void leer(){
    try {
      File myObj = new File("parqueo.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("Un error ha ocurrido");
      e.printStackTrace();
    }
  }
}
