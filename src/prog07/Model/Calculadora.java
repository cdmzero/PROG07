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
    
    long resultado = 0;
    long factor1   = 0;
    long factor2   = 0;
    String operacion = null;

        
    public Calculadora() {
    }
    
      public Calculadora(long resultado, long factor1, long factor2, String operacion) {
         this.resultado = resultado;
         this.factor1 = factor1;
         this.factor2 = factor2;
         this.operacion = operacion;
    }

    
    
    @Override
    public String toString() {
        return "Calculadora{" + "resultado=" + resultado + ", factor1=" + factor1 + ", factor2=" + factor2 + ", operacion=" + operacion + '}';
    }

    public void setResultado(long resultado) {
        this.resultado = resultado;
    }

    public void setFactor1(long factor1) {
        this.factor1 = factor1;
    }

    public void setFactor2(long factor2) {
        this.factor2 = factor2;
    }

    public void setBoton(String operacion) {
        this.operacion = operacion;
    }

    

    public long getResultado() {
        return resultado;
    }

    public long getFactor1() {
        return factor1;
    }

    public long getFactor2() {
        return factor2;
    }

    public String getBoton() {
        return operacion;
    }


    
    
}
