package AccessModifier;
public class ClassOne {

    public static void main(String[] args) {


       // System.out.println(c);
        sum();
        sum1();
        System.out.println("This is from sum1 :  "+sum1());
        sum2();
        System.out.println("This is from sum2 :  "+sum2());
        one(100,200);
        System.out.println("This is from One :  "+one(1000,2020));
        System.out.println("This is from Two :  "+two(1000,2020,2));
    }

   public static void sum(){
       int s=3;
       int b =5;
       int  c = s+b;//8
      System.out.println("This is from sum method: "+c);
  }
    public static int sum1(){
        int s=5;
        int b =5;
        int  c = s+b;//10
        return c;
    }
    public static boolean sum2(){
        int s = 5;
        int b = 15;
        if (s == b){
            return true;
        }else {
            return false;
        }

    }
    public static int sum3(){
        int s=5;
        int b =5;
        int  c = s+b;//10
        return c;
    }
    public static int  one(int x,int y ){
        int c = x+y;
        return c;
    }
    public static int  two(int x,int y,int z ){
        int c = x+y/z;
        return c;
    }




}
