/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog07.Model;




/**
 *
 * @author jfunez
 */
public class Calculadora {
    
    double resultado = 0;
    double factor1   = 0;
    double factor2   = 0;

        
    public Calculadora() {
    }
    
      public Calculadora(double resultado, double factor1, double factor2) {
         this.resultado = resultado;
         this.factor1 = factor1;
         this.factor2 = factor2;
         
    }

    
    
    @Override
    public String toString() {
        return "Calculadora{" + "resultado=" + resultado + ", factor1=" + factor1 + ", factor2=" + factor2 +'}';
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public void setFactor1(double factor1) {
        this.factor1 = factor1;
    }

    public void setFactor2(double factor2) {
        this.factor2 = factor2;
    }



    

    public double getResultado() {
        return resultado;
    }

    public double getFactor1() {
        return factor1;
    }

    public double getFactor2() {
        return factor2;
    }



    
    
}
