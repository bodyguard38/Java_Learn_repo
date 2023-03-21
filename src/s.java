import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class s {
    public static void main(String[] args) {

        List<String> l1=new ArrayList<>(Arrays.asList("Harika eda", "Ceren", "Tugba","taha","Ismail","Murat"));

        Iterator<String> it1=l1.iterator();

        while (it1.hasNext()) {
            System.out.print(it1.next()+" ");

        }

    }
}


