public class StringConcept {


    public static void main(String[] args) {


        String s = "Seleneium"; //1. String literal , 2.By creating string object(String Buffer, String builder)

        System.out.println("It will give us total length of sting : "+s.length());
        System.out.println("It will give us char at that index "+s.charAt(2));
        System.out.println("It will give us index of that specific char "+s.indexOf('e'));
        System.out.println("It will give us last occurance "+s.lastIndexOf('e'));
        System.out.println(""+s.indexOf('e',s.indexOf('e')+1));


    }







}
