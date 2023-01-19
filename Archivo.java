public class Archivo {
  public String nombre;
  public int tamano;
  Archivo icono;
  Carpeta carpetaPadre;
  
  public Archivo(String nombre, int tamano, Carpeta carpetaPadre) {
    this.nombre = nombre;
    this.tamano = tamano;
    this.carpetaPadre = carpetaPadre;
    this.carpetaPadre.agregarArchivo(this);
  }

  public void anadirIcono(Archivo nuevoIcono){
    this.icono = nuevoIcono;
  }

}
