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

static String operacion = "";
static double resul = 0;
    
        public PROG07(){
            
  
        
        txtDisplay = new JTextField();
       
        
        txtSecondDisplay = new JTextField();
        
        txtSecondDisplay.setEditable(false);
   
        
       
     
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
        txtDisplay.setBounds(70, 25, 306, 20);
        txtSecondDisplay.setBounds(70, 50, 306, 20);
        
        suma.setBounds(125, 100, 35, 45);
        resta.setBounds(125, 140, 35, 45);
        multi.setBounds(125, 180, 35, 45);
        div.setBounds(125,  220, 35, 45);
        
        btn1.setBounds(190, 100, 35, 45);
        btn2.setBounds(225, 100, 35, 45);
        btn3.setBounds(260, 100, 35, 45);
        
        btn4.setBounds(190, 140, 35, 45);
        btn5.setBounds(225, 140, 35, 45);
        btn6.setBounds(260, 140, 35, 45);
        
        btn7.setBounds(190, 180, 35, 45);
        btn8.setBounds(225, 180, 35, 45);
        btn9.setBounds(260, 180, 35, 45);
        
        btn0.setBounds(225, 220, 35, 45);
        
        resultado.setBounds(260, 220, 35, 45);
        btnBorrar.setBounds(190, 220, 35, 45);
        
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
        
       txtSecondDisplay.setText("Calculadora INC");
       
            // Título de la ventana
       setTitle("ilCalculattoreNovissimo");
       
       // Posición de la ventana: x, y, width, height
       setBounds(400, 200, 450, 300);
       // Centra la ventana en el monitor
       setLocationRelativeTo(null);
    
       

       
        }
        
            


ActionListener sumas = new ActionListener(){
    
        public void actionPerformed(ActionEvent e){
            
           operacion = e.getActionCommand(); 
           String varSumas = txtSecondDisplay.getText();
            txtDisplay.setEditable(true);
            btn1.setEnabled(true);
            btn2.setEnabled(true);
            btn3.setEnabled(true);
            btn4.setEnabled(true);
            btn5.setEnabled(true);
            btn6.setEnabled(true);
            btn7.setEnabled(true);
            btn8.setEnabled(true);
            btn9.setEnabled(true);
            btn0.setEnabled(true);
            resultado.setEnabled(true);
           
            
if("Calculadora INC".equals(varSumas) ){
    
    
      suma.setEnabled(false);
      resta.setEnabled(false);
      div.setEnabled(false);
      multi.setEnabled(false);
    
  String factor1 = txtDisplay.getText();

long fact1 = Long.parseLong(factor1);

calcu.setFactor1(fact1);
txtSecondDisplay.setText("Suma");





}else{
        
    calcu.setFactor1(resul);
    txtSecondDisplay.setText("+ " + resul);

}

txtDisplay.setText("");

}
       
   };     

ActionListener restas = new ActionListener(){
    
        public void actionPerformed(ActionEvent e){
            
            operacion = e.getActionCommand();
            String varRestas = txtSecondDisplay.getText();
            txtDisplay.setEditable(true);
            btn1.setEnabled(true);
            btn2.setEnabled(true);
            btn3.setEnabled(true);
            btn4.setEnabled(true);
            btn5.setEnabled(true);
            btn6.setEnabled(true);
            btn7.setEnabled(true);
            btn8.setEnabled(true);
            btn9.setEnabled(true);
            btn0.setEnabled(true);
            resultado.setEnabled(true);
        
           

            

 if( "Calculadora INC".equals(varRestas)){
     
      suma.setEnabled(false);
      resta.setEnabled(false);
      div.setEnabled(false);
      multi.setEnabled(false);
     
                
    String factor1 = txtDisplay.getText();
    long fact1 = Long.parseLong(factor1);
    calcu.setFactor1(fact1);
    txtSecondDisplay.setText("Resta");

}else{
     
  
    calcu.setFactor1(resul);
    txtSecondDisplay.setText("- " + resul);
 
}

txtDisplay.setText("");


}
       
   };     




ActionListener divides = new ActionListener(){
    
        public void actionPerformed(ActionEvent e){ 
        
            operacion = e.getActionCommand();
            String varDivides = txtSecondDisplay.getText();
            txtDisplay.setEditable(true);
            btn1.setEnabled(true);
            btn2.setEnabled(true);
            btn3.setEnabled(true);
            btn4.setEnabled(true);
            btn5.setEnabled(true);
            btn6.setEnabled(true);
            btn7.setEnabled(true);
            btn8.setEnabled(true);
            btn9.setEnabled(true);
            btn0.setEnabled(true);
            resultado.setEnabled(true);
            
if( "Calculadora INC".equals(varDivides)){
    
      suma.setEnabled(false);
      resta.setEnabled(false);
      div.setEnabled(false);
      multi.setEnabled(false);
    
     String factor1 = txtDisplay.getText();
     long fact1 = Long.parseLong(factor1);
     calcu.setFactor1(fact1);
     txtSecondDisplay.setText("Division");
                
}else{
    
    
    calcu.setFactor1(resul);
    txtSecondDisplay.setText("/ "+ resul);
    
    
    

}


txtDisplay.setText("");



}
       
   };   

ActionListener multiplicas = new ActionListener(){
    
    
    

    
        public void actionPerformed(ActionEvent e){
            
String varMultiplicas = txtSecondDisplay.getText();

            operacion = e.getActionCommand();
            txtDisplay.setEditable(true);
            btn1.setEnabled(true);
            btn2.setEnabled(true);
            btn3.setEnabled(true);
            btn4.setEnabled(true);
            btn5.setEnabled(true);
            btn6.setEnabled(true);
            btn7.setEnabled(true);
            btn8.setEnabled(true);
            btn9.setEnabled(true);
            btn0.setEnabled(true);
            resultado.setEnabled(true);

if( "Calculadora INC".equals(varMultiplicas)){
    

      suma.setEnabled(false);
      resta.setEnabled(false);
      div.setEnabled(false);
      multi.setEnabled(false);
      
    String factor1 = txtDisplay.getText();
    long fact1 = Long.parseLong(factor1);
    calcu.setFactor1(fact1);
    txtSecondDisplay.setText("Multiplicacion");

}else{
    
    calcu.setFactor1(resul);
    txtSecondDisplay.setText("* "+ resul);
    
    
}

txtDisplay.setText("");


}
       
   };     


ActionListener resultados = new ActionListener(){
    
        public void actionPerformed(ActionEvent e){

            String factor2 = txtDisplay.getText();
            
            txtDisplay.setEditable(false);

            long fact2 = Long.parseLong(factor2);
            

           
            
            calcu.setFactor2(fact2);
            
           double f1 = calcu.getFactor1();
           System.out.println(f1);
           double f2 = calcu.getFactor2();
           
           if (f1 == 0);
            resul = 0;
            
            if (f2 == 0);
            resul = 0;
            
           System.out.println(f2);
            
            
            var op = txtSecondDisplay.getText();
            
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
            btn0.setEnabled(false);
            resultado.setEnabled(false);
            suma.setEnabled(true);
            resta.setEnabled(true);
            div.setEnabled(true);
            multi.setEnabled(true);
            
         
            
            switch (operacion) {
            
                case "+":
                    
                     resul = f1 + f2;
                     String valResultado = String.valueOf(resul);
                     txtSecondDisplay.setText( f1 + " + " + f2 + " = "+valResultado);
                     
                     calcu.setFactor1(0);
                     calcu.setFactor2(0);
                                break;
                                
                    
              
                
                case "-":
                    
                     resul = f1 - f2;
                     String valResultadoResta = String.valueOf(resul);
                     txtSecondDisplay.setText(f1 + " - " + f2 + " = "+valResultadoResta);
                     
                     calcu.setFactor1(0);
                     calcu.setFactor2(0);
                    break;
                
                case "/":
                    if ((f1 == 0)||(f2 == 0)){
                    resul = 0;
                    txtSecondDisplay.setText("Error");
                                btn1.setEnabled(false);
                                btn2.setEnabled(false);
                                btn3.setEnabled(false);
                                btn4.setEnabled(false);
                                btn5.setEnabled(false);
                                btn6.setEnabled(false);
                                btn7.setEnabled(false);
                                btn8.setEnabled(false);
                                btn9.setEnabled(false);
                                btn0.setEnabled(false);
                                resultado.setEnabled(false);
                                suma.setEnabled(false);
                                resta.setEnabled(false);
                                div.setEnabled(false);
                                multi.setEnabled(false);
                    }else{
                    resul = f1 / f2;
                     String valResultadodiv = String.valueOf(resul);
                     txtSecondDisplay.setText(f1 + " / " + f2 + " = "+valResultadodiv);}
                     
                     
                     calcu.setFactor1(0);
                     calcu.setFactor2(0);
                    break;
                    
                case "*":
                     
                     resul = f1 * f2;
                     String valResultadoMul = String.valueOf(resul);
                     txtSecondDisplay.setText(f1 + " * " + f2 + " = "+ valResultadoMul);
                     
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
            
                    btn1.setEnabled(true);
                    btn2.setEnabled(true);
                    btn3.setEnabled(true);
                    btn4.setEnabled(true);
                    btn5.setEnabled(true);
                    btn6.setEnabled(true);
                    btn7.setEnabled(true);
                    btn8.setEnabled(true);
                    btn9.setEnabled(true);
                    btn0.setEnabled(true);
                    resultado.setEnabled(true);
                    txtDisplay.setText("");
                    suma.setEnabled(true);
                    resta.setEnabled(true);
                    div.setEnabled(true);
                     multi.setEnabled(true);
                    txtSecondDisplay.setText("Calculadora INC");
                    calcu.setFactor1(0);
                    calcu.setFactor2(0);

                    resul = 0;

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
