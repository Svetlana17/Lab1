import java.util.Properties;

public class Main {
    public  static  void main(String[] args){
        Singliton singliton=Singliton.getSingliton();
        System.out.println(singliton);
        Singliton singlitona=Singliton.getSingliton();
        System.out.println(singlitona);
        Singliton singlitonf=Singliton.getSingliton();
        System.out.println(singlitonf);
        Singliton singlitony=Singliton.getSingliton();
        System.out.println(singlitony);
        Singliton singlitonc=Singliton.getSingliton();
        System.out.println(singlitonc);
        Singliton singlitonm=Singliton.getSingliton();
        System.out.println(singlitonm);
        Properties properties =PropertiesSingliton.getProperties();
        Properties properties1 =PropertiesSingliton.getProperties();
        Properties properties2 =PropertiesSingliton.getProperties();
        System.out.println(properties.getProperty("Name"));

    }
}
