import java.util.TreeSet;

public class Carpeta {
  public String nombre;
  Archivo archivo;
  TreeSet<Carpeta> carp = new TreeSet<>(new FirstComparator());
  TreeSet<Archivo> arch = new TreeSet<>(new SecondComparator());

  public Carpeta(String nombre) {
    this.nombre = nombre;
  }

  public void mostrarDirectorio() {
    System.out.println("Carpetas:");
    carp.forEach(value -> System.out.println(value.nombre));
    System.out.println("Archivos:");
    arch.forEach(value -> System.out.println(value.nombre));
  }

  public void agregarArchivo(Archivo a1) {
    this.arch.add(a1);
  }

  public void agregarCarpeta(Carpeta c1) {
    this.carp.add(c1);
  }
}