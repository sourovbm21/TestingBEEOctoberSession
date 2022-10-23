public class LoopingConcept {


    public static void main(String[] args) {

        String s = "sourov";
        System.out.println("***** For Loop  ************");
//i++//i=i+1//0//0+1=1/1+1=2//2+1=3//3+1=4
      for(int i=0;i<=5;i++) {
          System.out.println(i);
      }
        System.out.println("***** For Loop in reverse order ************");
        for(int j=5;j>=0;j--) {
            System.out.println(j);
        }
        System.out.println("***** While Loop ************");
         int k =0;
        while (k<=5){
            System.out.println(k);
           k++;
        }
        System.out.println("***** out side While Loop ************");
        System.out.println("***** Inside do While Loop ************");
         int l =85;
        do{
            System.out.println(l);
            l++;
        }while (l<=90);
        System.out.println("***** out side do While Loop ************");






    }



}
