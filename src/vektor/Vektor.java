/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vektor;

/**
 *
 * @author men
 */
public class Vektor implements Addierbar<Vektor>{
    private double v1,v2,v3;
    
    public Vektor(double v1,double v2, double v3){
        this.v1=v1;
        this.v2=v2;
        this.v3=v3;
    }

    @Override
    public Vektor add(Vektor t) {
        return new Vektor(t.v1+v1,t.v2+v2, t.v3+v3);
    }
    
    public Vektor minus(Vektor t) {
        return new Vektor(-t.v1+v1,-t.v2+v2, -t.v3+v3);
    }
    
    public double skalar(Vektor t){
        return t.v1*v1+t.v2*v2+t.v3*v3;
    }
    
    public Vektor multipliziereMitDouble(double z){
        return new Vektor(v1*z,v2*z,v3*z);
    }
    
    public double betrag(){
        return Math.sqrt(this.skalar(this));
    }
    
    public Vektor kreuzProdukt(Vektor t){
        return new Vektor(t.v2*v3-t.v3*v2,t.v3*v1-t.v1*v3,t.v1*v2-t.v2*v1);
    }
    
    public Vektor normiert(){
        return multipliziereMitDouble(1/betrag());
    }
            
    
    
            
            
            
            
            
    
    @Override
    public String toString(){
        return "["+v1+","+v2+","+v3+"]";
    }
}
