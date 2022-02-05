/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prog07;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import prog07.Model.Calculadora;

/**
 *
 * @author jfunez
 */
public class PROG07 extends JFrame {
    
        Calculadora calcu = new Calculadora();  
        private JPanel panel;
        private JTextField txtDisplay;
        private JTextField txtSecondDisplay;
        private JButton suma;
        private JButton resta;
        private JButton div;
        private JButton multi;
        private JButton btn0;
        private JButton btn1;
        private JButton btn2;
        private JButton btn3;
        private JButton btn4;
        private JButton btn5;
        private JButton btn6;
        private JButton btn7;
        private JButton btn8;
        private JButton btn9;
        private JButton btnBorrar;
        private JButton resultado;


        
private static final long serialVersionUID =
6364109492657918782L;
    
        public PROG07(){
            
  
        
        txtDisplay = new JTextField();
       
        
        txtSecondDisplay = new JTextField();
        
        txtSecondDisplay.setEditable(false);
   
        
        
        //bucle para generar numero del 0 al 9

     
            suma    = new JButton("+");
            resta   = new JButton("-");
            multi   = new JButton("*");
            div     = new JButton("/");
            btn0    = new JButton("0");
            btn1    = new JButton("1");
            btn2    = new JButton("2");
            btn3    = new JButton("3");
            btn4    = new JButton("4");
            btn5    = new JButton("5");
            btn6    = new JButton("6");
            btn7    = new JButton("7");
            btn8    = new JButton("8");
            btn9    = new JButton("9");
            btnBorrar = new JButton("C");
            resultado = new JButton("=");
           
            
            
            
 
       

           
        
        panel = new JPanel();
        // Absolute Layout (colocación manual)
        panel.setLayout(null);
        txtDisplay.setBounds(100, 25, 206, 20);
        txtSecondDisplay.setBounds(100, 50, 206, 20);
        
        suma.setBounds(105, 100, 35, 45);
        resta.setBounds(105, 140, 35, 45);
        multi.setBounds(105, 180, 35, 45);
        div.setBounds(105,  220, 35, 45);
        
        btn1.setBounds(155, 100, 35, 45);
        btn2.setBounds(190, 100, 35, 45);
        btn3.setBounds(225, 100, 35, 45);
        
        btn4.setBounds(155, 140, 35, 45);
        btn5.setBounds(190, 140, 35, 45);
        btn6.setBounds(225, 140, 35, 45);
        
        btn7.setBounds(155, 180, 35, 45);
        btn8.setBounds(190, 180, 35, 45);
        btn9.setBounds(225, 180, 35, 45);
        
        btn0.setBounds(190, 220, 35, 45);
        
        resultado.setBounds(225, 220, 35, 45);
        btnBorrar.setBounds(155, 220, 35, 45);
        
        suma.addActionListener(sumas);
        resta.addActionListener(restas);
        div.addActionListener(divides);
        multi.addActionListener(multiplicas);
        btn0.addActionListener(boton0);
        btn1.addActionListener(boton1);
        btn2.addActionListener(boton2);
        btn3.addActionListener(boton3);
        btn4.addActionListener(boton4);
        btn5.addActionListener(boton5);
        btn6.addActionListener(boton6);
        btn7.addActionListener(boton7);
        btn8.addActionListener(boton8);
        btn9.addActionListener(boton9);
        btnBorrar.addActionListener(borrar);
        resultado.addActionListener(resultados);
     
        
      
        // Añado los componentes al Panel
        panel.add(txtDisplay);
        panel.add(txtSecondDisplay);
        panel.add(suma);
        panel.add(resta);
        panel.add(multi);
        panel.add(div);
        panel.add(btn0);
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn4);
        panel.add(btn5);
        panel.add(btn6);
        panel.add(btn7);
        panel.add(btn8);
        panel.add(btn9);
        panel.add(btnBorrar);
        panel.add(resultado);
  
        
        
     

   
        
        setContentPane(panel);
        
       txtSecondDisplay.setText("Calculadora Inteligente");
       
            // Título de la ventana
       setTitle("Algo se esta cocinando");
       
       // Posición de la ventana: x, y, width, height
       setBounds(400, 200, 450, 300);
       // Centra la ventana en el monitor
       setLocationRelativeTo(null);
    
       
       
       
        }
        
            


ActionListener sumas = new ActionListener(){
    
        public void actionPerformed(ActionEvent e){


           
            
           String varSumas = txtSecondDisplay.getText();
            
if("Calculadora Inteligente".equals(varSumas) ){
    
  String factor1 = txtDisplay.getText();

long fact1 = Long.parseLong(factor1);

calcu.setFactor1(fact1);
txtSecondDisplay.setText("Suma");




}else{
    
    String factor1 = txtSecondDisplay.getText();

long fact1 = Long.parseLong(factor1);
    
calcu.setFactor1(fact1);
txtSecondDisplay.setText("Suma++");

    
    
    
    

}

txtDisplay.setText("");








}
       
   };     

ActionListener restas = new ActionListener(){
    
        public void actionPerformed(ActionEvent e){
            
            
 String varRestas = txtSecondDisplay.getText();
            

 if( "Calculadora Inteligente".equals(varRestas)){
     
                
    String factor1 = txtDisplay.getText();
    long fact1 = Long.parseLong(factor1);
    calcu.setFactor1(fact1);
    txtSecondDisplay.setText("Resta");

}else{
     
    String factor1 = txtSecondDisplay.getText();
    long fact1 = Long.parseLong(factor1);   
    calcu.setFactor1(fact1);
    txtSecondDisplay.setText("Resta++");
 
}

txtDisplay.setText("");


}
       
   };     




ActionListener divides = new ActionListener(){
    
        public void actionPerformed(ActionEvent e){    
        String varDivides = txtSecondDisplay.getText();

if( "Calculadora Inteligente".equals(varDivides)){
    
     String factor1 = txtDisplay.getText();
     long fact1 = Long.parseLong(factor1);
     calcu.setFactor1(fact1);
     txtSecondDisplay.setText("Division");
                
}else{
    
    
    String factor1 = txtSecondDisplay.getText();
    long fact1 = Long.parseLong(factor1);
    calcu.setFactor1(fact1);
    txtSecondDisplay.setText("Division++");
    
    
    

}


txtDisplay.setText("");



}
       
   };   

ActionListener multiplicas = new ActionListener(){
    

    
        public void actionPerformed(ActionEvent e){
            
String varMultiplicas = txtSecondDisplay.getText();

if( "Calculadora Inteligente".equals(varMultiplicas)){
    

    String factor1 = txtDisplay.getText();
    long fact1 = Long.parseLong(factor1);
    calcu.setFactor1(fact1);
    txtSecondDisplay.setText("Mulplicacion");

}else{
       
     String factor1 = txtSecondDisplay.getText();
    long fact1 = Long.parseLong(factor1);    
    calcu.setFactor1(fact1);
    txtSecondDisplay.setText("Multiplicacion++");
    
    
}

txtDisplay.setText("");


}
       
   };     


ActionListener resultados = new ActionListener(){
    
        public void actionPerformed(ActionEvent e){

            String factor2 = txtDisplay.getText();

            long fact2 = Long.parseLong(factor2);


            calcu.setFactor2(fact2);
            
           long f1 = calcu.getFactor1();
           System.out.println(f1);
           long f2 = calcu.getFactor2();
           System.out.println(f2);
            
            
            String op = txtSecondDisplay.getText();
            
            switch (op){
            
                case "Suma", "Suma++":
                    
                     long resultado = f1 + f2;
                     String valResultado = String.valueOf(resultado);
                     txtSecondDisplay.setText(valResultado);
                     
                     calcu.setFactor1(0);
                     calcu.setFactor2(0);
                                break;
                          
                
                case "Resta", "Resta++":
                    
                     long resultadoResta = f1 - f2;
                     String valResultadoResta = String.valueOf(resultadoResta);
                     txtSecondDisplay.setText(valResultadoResta);
                     
                     calcu.setFactor1(0);
                     calcu.setFactor2(0);
                    break;
                
                case "Division", "Division++":
                    
                    long resultadodiv = f1 / f2;
                     String valResultadodiv = String.valueOf(resultadodiv);
                     txtSecondDisplay.setText(valResultadodiv);
                     
                     calcu.setFactor1(0);
                     calcu.setFactor2(0);
                    break;
                    
                case "Multiplicacion", "Multiplicacion++":
                     
                    long resultadoMul = f1 * f2;
                     String valResultadoMul = String.valueOf(resultadoMul);
                     txtSecondDisplay.setText(valResultadoMul);
                     
                     calcu.setFactor1(0);
                     calcu.setFactor2(0);
                    break;
            
            }
}
        
     };  
        

ActionListener boton0 = new ActionListener(){
    
        public void actionPerformed(ActionEvent e){

String Display = txtDisplay.getText() + btn0.getText();

txtDisplay.setText(Display);


}
};
ActionListener boton1 = new ActionListener(){
    
        public void actionPerformed(ActionEvent e){

String Display = txtDisplay.getText() + btn1.getText();

txtDisplay.setText(Display);


}
};       
ActionListener boton2 = new ActionListener(){
    
        public void actionPerformed(ActionEvent e){

String Display = txtDisplay.getText() + btn2.getText();

txtDisplay.setText(Display);


}
        };
ActionListener boton3 = new ActionListener(){
    
        public void actionPerformed(ActionEvent e){

String Display = txtDisplay.getText() + btn3.getText();

txtDisplay.setText(Display);


}
        };
ActionListener boton4 = new ActionListener(){
    
        public void actionPerformed(ActionEvent e){

String Display = txtDisplay.getText() + btn4.getText();

txtDisplay.setText(Display);


}
        };
ActionListener boton5 = new ActionListener(){
    
        public void actionPerformed(ActionEvent e){

String Display = txtDisplay.getText() + btn5.getText();

txtDisplay.setText(Display);


}
        };
ActionListener boton6 = new ActionListener(){
    
        public void actionPerformed(ActionEvent e){

String Display = txtDisplay.getText() + btn6.getText();

txtDisplay.setText(Display);


}
        };
ActionListener boton7 = new ActionListener(){
    
        public void actionPerformed(ActionEvent e){

String Display = txtDisplay.getText() + btn7.getText();

txtDisplay.setText(Display);


}
        };
ActionListener boton8 = new ActionListener(){
    
        public void actionPerformed(ActionEvent e){

String Display = txtDisplay.getText() + btn8.getText();

txtDisplay.setText(Display);


}
        };
ActionListener boton9 = new ActionListener(){
    
        public void actionPerformed(ActionEvent e){

String Display = txtDisplay.getText() + btn9.getText();

txtDisplay.setText(Display);

        }
};
        
ActionListener borrar = new ActionListener(){
    
        public void actionPerformed(ActionEvent e){
            
                     txtDisplay.setText("");
                     txtSecondDisplay.setText("Calculadora Inteligente");
                     calcu.setFactor1(0);
                     calcu.setFactor2(0);


        }
        
};




    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     

       
        
       
        
        
        
        PROG07 ventanaApp = new PROG07();
        
       
        
        ventanaApp.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        ventanaApp.setVisible(true);
  
        // TODO code application logic here
        
        
      
        
    }
    
}
