public class StringConcept {


    public static void main(String[] args) {


        // String literal Occurance
        String s = "Selenium"; //1. String literal , 2.By creating string object(String Buffer, String builder)
        String s1 = "Seleneieum";
        System.out.println("It will give us total length of sting : " + s1.length());
        System.out.println("It will give us char at that index " + s1.charAt(2));
        System.out.println("It will give us index of that specific char " + s1.indexOf('e'));
        System.out.println("It will give us last occurance " + s1.lastIndexOf('e'));
        System.out.println("" + s1.indexOf('e', s1.indexOf('e') + 3));
        //String concat &
        String S3 = s + s1;
        System.out.println(S3);
        String s4 = s.concat("Hi");
        System.out.println(s);
        System.out.println(s4);
        // String By creating object
        StringBuffer sbf = new StringBuffer("Good");//Sychronized ( Thread Safe )
        sbf.deleteCharAt(0);
        System.out.println(sbf);
        StringBuilder sb = new StringBuilder("Java");// Non Sychronized ( Not Thread Safe )
        sb.append('s');
        System.out.println(sb);
        ////String comparison
        String p = "Java";
        String q = "Learning";
        String r = "java";
        p.equals(q);
        System.out.println(p.equals(q));//value
        System.out.println(p == q);//ref variable
        System.out.println(p.equals(r));
        System.out.println(p == r);
        System.out.println(p.equalsIgnoreCase(q));
        System.out.println(p.equalsIgnoreCase(r));
        ////Trim
        String g = " Good ";
        System.out.println(g);
        String b = g.trim();
        System.out.println(b);
        //Split
        String f = "i am Navigating to java Learning";
        String n = "MR akm sm Tohidur Rahman ltd";

        System.out.println(f);
        String f1[] = f.split(" ");

        for (int i = 0; i < f1.length; i++) {
            System.out.println(f1[i]);
        }
        //String substring method
        String j = "Java Learning";
        int l = j.length();
        System.out.println(l);
        System.out.println(j.substring(5));
        String k ="Knowledge";
        System.out.println("#########################" );
        System.out.println("I am using substring two parameter : " + k.substring(4,7));
        //Starts and End With
        String B ="Book Learning";
        System.out.println( B.startsWith("Book") );
        System.out.println( B.endsWith("Learning") );




    }


}
