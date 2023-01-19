import java.util.Comparator;

public class SecondComparator implements Comparator<Archivo> {
 @Override public int compare(Archivo a1, Archivo a2)
 {
 return a1.nombre.compareTo(a2.nombre);
 }
}