
package vektor;


public class Main {


    public static void main(String[] args) {
        Vektor v1=new Vektor(1,0,0);
        Vektor v2=new Vektor(0,1,0);
        
        System.out.println(v1.kreuzProdukt(v2).normiert());
    }
    
}
