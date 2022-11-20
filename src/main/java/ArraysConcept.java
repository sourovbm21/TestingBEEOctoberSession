import java.util.ArrayList;
import java.util.LinkedList;

public class ArraysConcept {


    public static void main(String[] args) {

        String s = "Sahana";
        String s1 = "Fahmida";
        String s2 = "Bably";
        String s3 = "Anika";
        String s4 = "Rubina";
        //Static , Dynamic,2D,3D
        //Static 1D ARRAY
                int a[] = new int[4];//Static 1D
                a[0] = 1;
                a[1] = 5;
                a[2] = 10;
                a[3] =4;

                for (int i=0;i<a.length;i++){
                    System.out.println(a[i]);
                }
           //Static 2D ARRAY
                //arraylist [Dynamic]
        ArrayList   al = new ArrayList();

                al.add("Sahana");
                al.add(2);
                al.add(true);
                al.add(2.5);
                al.add('d');
                al.add(2.5);
        System.out.println(al.get(3));

        System.out.println("$$$$$$$$$$$$$$$$$$");

              for (int k=0;k<al.size();k++) {
                  System.out.println(al.get(k));
              }

        LinkedList lk = new LinkedList();
        lk.add(4);
        lk.add("good");
        lk.add(5.5);
        lk.add(5.5);
        for (int i=0;i<lk.size();i++) {
            System.out.println(lk.get(i));
        }














    }
}
