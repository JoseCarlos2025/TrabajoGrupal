import java.util.Comparator;

public class FirstComparator implements Comparator<Carpeta>{
    @Override public int compare(Carpeta c1, Carpeta c2){
        return c1.nombre.compareTo(c2.nombre);
    }
}