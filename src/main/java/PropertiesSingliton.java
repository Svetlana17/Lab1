import javax.naming.Name;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesSingliton {
    //приватные статитические доступны только изнутри, сущ. в ед. экземпляре
    private static PropertiesSingliton propertiesSingliton;
    private static Properties properties;
///приватный конструктор для того, чтобы нельзя создать экземпляр класса снаружи
     private PropertiesSingliton(){


     }
     //утилитнй метод
     //Глобальная точка доступа к единственному
     public  static Properties getProperties(){
         if(properties==null){
             properties=new Properties();
             try {

                 FileInputStream fileInputStream=new FileInputStream("src/main/resources/singliton.properties");
                 properties.load(fileInputStream);
                 System.out.println(properties.getProperty("Name"));
             } catch (IOException e) {
                 e.printStackTrace();
             }
         }
         return  properties;
     }
}
