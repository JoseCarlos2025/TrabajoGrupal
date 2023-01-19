class Main {
  public static void main(String[] args) {
    Carpeta c1 = new Carpeta("Expediente");
    Carpeta c2 = new Carpeta("Alumno2");
    Carpeta c3 = new Carpeta("Alumno1");
    Carpeta c4 = new Carpeta("Blumno1");
    Archivo a1 = new Archivo("Archivo1", 330, c1);
    c1.agregarCarpeta(c2);
    c1.agregarCarpeta(c3);
    c1.agregarCarpeta(c4);
    c1.mostrarDirectorio();
  }
}