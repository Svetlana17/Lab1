public class Singliton {
  private  static Singliton singliton;



    private Singliton() {
        System.out.println("Singliton");
    }
    public static Singliton getSingliton() {
       if(singliton==null){
           singliton=new Singliton();
       }

    return  singliton;
    }

}
