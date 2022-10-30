package AccessModifier;
public class ClassOne {

    int x =100;
    String s = "sourov";
    public  void sum(){
       int s=3;
       int b =5;
       int  c = s+b;//8
      System.out.println("This is from sum method: "+c);
  }
    public  int sum1(){
        int s=5;
        int b =5;
        int  c = s+b;//10
        return c;
    }
    public  boolean sum2(){
        int s = 5;
        int b = 15;
        if (s == b){
            return true;
        }else {
            return false;
        }
    }
    public  int sum3(){
        int s=5;
        int b =5;
        int  c = s+b;//10
        return c;
    }
    public  int  one(int x,int y ){
        int c = x+y;
        return c;
    }
    public  int  two(int x,int y,int z ){
        int c = x+y/z;
        return c;
    }
    public  void three(int x, String s,boolean b){
        System.out.println("Th");
    }
    public  void four(int x, String s,boolean b,double d){

    }



}
