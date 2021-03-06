/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prog07;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import prog07.Model.Calculadora;

/**
 *
 * @author jfunez
 */
public class PROG07 extends JFrame {
   // Inicializacion de los diferentes componentes 
    
        Calculadora calcu = new Calculadora();  
        private JPanel panel;
        private JTextField BarDisplay1;
        private JTextField BarDisplay2;
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
        private JButton btnIcon;
         
//Variables utiles para la calculadora
static String operacion = "";

//Controlamos si la cuenta sigue abierta y asignamos el resultado como el primer factor
static boolean abierta = false;
static double resul = 0;

    
        public PROG07(){
            
            BarDisplay1 = new JTextField();
            BarDisplay2 = new JTextField();
            BarDisplay2.setEditable(false);
   
        
            // Construccion de botonera
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
            
        // Panel de botonera
        panel = new JPanel();
        // Absolute Layout (colocaci??n manual)
        panel.setLayout(null);
        BarDisplay1.setBounds(70, 25, 306, 20);
        Font font1 = new Font("SansSerif", Font.BOLD, 15);
        BarDisplay1.setFont(font1);
        BarDisplay1.setToolTipText("Escribe aqui");
        BarDisplay2.setBounds(70, 50, 306, 20);
        BarDisplay2.setToolTipText("Observa");
        suma.setBounds(125, 100, 35, 45);
        suma.setToolTipText("Suma");
        resta.setBounds(125, 140, 35, 45);
        resta.setToolTipText("Resta");
        multi.setBounds(125, 180, 35, 45);
        multi.setToolTipText("Multiplicacion");
        div.setBounds(125,  220, 35, 45);
        div.setToolTipText("Division");
        btn1.setBounds(190, 100, 35, 45);
        btn1.setToolTipText("uno");
        btn2.setBounds(225, 100, 35, 45);
        btn2.setToolTipText("dos");
        btn3.setBounds(260, 100, 35, 45);
        btn3.setToolTipText("tres");
        btn4.setBounds(190, 140, 35, 45);
        btn4.setToolTipText("cuatro");
        btn5.setBounds(225, 140, 35, 45);
        btn5.setToolTipText("cinco");
        btn6.setBounds(260, 140, 35, 45);
        btn6.setToolTipText("seis");
        btn7.setBounds(190, 180, 35, 45);
        btn7.setToolTipText("siete");
        btn8.setBounds(225, 180, 35, 45);
        btn8.setToolTipText("ocho");
        btn9.setBounds(260, 180, 35, 45);
        btn9.setToolTipText("nueve");
        btn0.setBounds(225, 220, 35, 45);
        btn1.setToolTipText("cero");
        resultado.setBounds(260, 220, 35, 45);
        resultado.setToolTipText("Calcular resultado");
        btnBorrar.setBounds(190, 220, 35, 45);
        btnBorrar.setToolTipText("Borrar todo");
        

        
        
        // Creo los listeners de la botonera
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
     
        
      
        // A??ado los componentes al Panel
        panel.add(BarDisplay1);
        panel.add(BarDisplay2);
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
        
        //Seteamos los botones en el panel
        setContentPane(panel);
        
       BarDisplay1.setText("0");
       BarDisplay2.setText("Hagamos cuentas...");
       
            // T??tulo de la ventana
       setTitle("ilCalculattoreNovissimo??");
       
       // Posici??n de la ventana: x, y, width, height
       setBounds(400, 200, 450, 300);
       // Centra la ventana en el monitor
       setLocationRelativeTo(null);
    
       

       
        }
        

        
//Funcion para quitar el 0 inicial        
void QuitarCero(String s){
    
    if("0".equals(s)){
    BarDisplay1.setText("");
    };
    
}

//Funcion para des/activar todos los botones salvo los de operacion
        
void ActivarBotones(boolean v){

            BarDisplay1.setEditable(v);
            btn1.setEnabled(v);
            btn2.setEnabled(v);
            btn3.setEnabled(v);
            btn4.setEnabled(v);
            btn5.setEnabled(v);
            btn6.setEnabled(v);
            btn7.setEnabled(v);
            btn8.setEnabled(v);
            btn9.setEnabled(v);
            btn0.setEnabled(v);
            resultado.setEnabled(v);           
}

//Funcion para des/activar los botones de operacion
void ActivarOps(boolean v){
            suma.setEnabled(v);
            resta.setEnabled(v);
            div.setEnabled(v);
            multi.setEnabled(v);
}





//Escucho la accion del boton 
ActionListener sumas = new ActionListener(){
    
        public void actionPerformed(ActionEvent e){
            
           operacion = e.getActionCommand(); //Seteo el tipo de operacion [+,-,*./]
           ActivarBotones(true);       //Activo la botonera
           String factor1 = BarDisplay1.getText(); //Tomo el primer factor
           double fact1 = Long.parseLong(factor1);
           
          
            
            if(fact1 > 0){ //Pedimos el segundo factor si existe el primero
                ActivarOps(false); //Desactiva el resto de operaciones 
                calcu.setFactor1(fact1);//Setea el primer factor
                BarDisplay2.setText("+ " + fact1 ); //Dibujamos el primer factor
            }

            
            if(abierta == true){ //Si existe un resultado anterior lo seteamos como el factor 1 y lo ponemos en la barra de abajo 
                calcu.setFactor1(resul);
                BarDisplay2.setText("+ " + resul);
            }

            //Dejamos en blanco para el siguiente factor

            BarDisplay1.setText("");

            }
       
   };     

ActionListener restas = new ActionListener(){
    
        public void actionPerformed(ActionEvent e){
            
                operacion = e.getActionCommand();   
                ActivarBotones(true);   
                String factor1 = BarDisplay1.getText();
                double fact1 = Double.parseDouble(factor1);
        
        
               if(fact1 > 0) {
                   ActivarOps(false);
                   calcu.setFactor1(fact1);
                   BarDisplay2.setText("- "+ fact1);
               }

               if(abierta == true){
                   calcu.setFactor1(resul);
                   BarDisplay2.setText("- " + resul);
               }

               BarDisplay1.setText("");


}
       
   };     




ActionListener divides = new ActionListener(){
    
        public void actionPerformed(ActionEvent e){ 
        
            operacion = e.getActionCommand();
            ActivarBotones(true);
            String factor1 = BarDisplay1.getText();
            double fact1 = Long.parseLong(factor1);
            
            if(fact1 > 0){

                 ActivarOps(false);
                 calcu.setFactor1(fact1);
                 BarDisplay2.setText(" / "+ fact1);
            }

            if((abierta == true )){
                calcu.setFactor1(resul);
                BarDisplay2.setText("/ "+ resul);

            }


            BarDisplay1.setText("");



}
       
   };   

ActionListener multiplicas = new ActionListener(){
        public void actionPerformed(ActionEvent e){

            operacion = e.getActionCommand();
            ActivarBotones(true);
            String factor1 = BarDisplay1.getText();
            double fact1 = Long.parseLong(factor1);

            if(fact1 > 0){
                ActivarOps(false);
                calcu.setFactor1(fact1);
                BarDisplay2.setText("* " + fact1);
            }


            if(abierta == true){
                calcu.setFactor1(resul);
                BarDisplay2.setText("* "+ resul);
            }

            BarDisplay1.setText("");

}
       
   };     


ActionListener resultados = new ActionListener(){
        public void actionPerformed(ActionEvent e){

            //Cancelamos la edicion mediante teclado de la barra de arriba
            BarDisplay1.setEditable(false);
            //Tomamos el segundo factor
            
            String factor2 = BarDisplay1.getText();
            double fact2 = Long.parseLong(factor2);
           
            //Seteamos el segundo factor
            calcu.setFactor2(fact2);
            
            double f1 = calcu.getFactor1();
            double f2 = calcu.getFactor2();
            
            
            //Desactivamos botones y activamos operaciones
            
            ActivarBotones(false); 
            ActivarOps(true);
         
            
            //Ahora se elige el tipo
            switch (operacion) {
            
                case "+":
                     resul = f1 + f2;
                     calcu.setResultado(resul);
                     String valResultado = String.valueOf(resul);
                     BarDisplay2.setText( f1 + " + " + f2 + " = "+valResultado);    
                     calcu.setFactor1(0);
                     calcu.setFactor2(0);
                     abierta = true;
                                break;         
                case "-":
                    
                     resul = f1 - f2;
                     calcu.setResultado(resul);
                     String valResultadoResta = String.valueOf(resul);
                     BarDisplay2.setText(f1 + " - " + f2 + " = "+valResultadoResta);     
                     calcu.setFactor1(0);
                     calcu.setFactor2(0);
                    break;
                
                case "/":
                    if ((f1 == 0)||(f2 == 0)){
                    resul = 0;
                    calcu.setResultado(resul);
                    BarDisplay2.setText("Error");
                             ActivarBotones(false);
                             ActivarOps(false);
                    }else{
                     resul = f1 / f2;
                     calcu.setResultado(resul);
                     String valResultadodiv = String.valueOf(resul);
                     BarDisplay2.setText(f1 + " / " + f2 + " = "+valResultadodiv);}       
                     calcu.setFactor1(0);
                     calcu.setFactor2(0);
                     abierta = true;
                    break;
                    
                case "*":
                     
                     resul = f1 * f2;
                     calcu.setResultado(resul);
                     String valResultadoMul = String.valueOf(resul);
                     BarDisplay2.setText(f1 + " * " + f2 + " = "+ valResultadoMul);
                     calcu.setFactor1(0);
                     calcu.setFactor2(0);
                     abierta = true;
                    break;
            
            }
}
        
     };  
        

ActionListener boton0 = new ActionListener(){
    
        public void actionPerformed(ActionEvent e){
        
        QuitarCero(BarDisplay1.getText()); 

String Display = BarDisplay1.getText() + btn0.getText();

BarDisplay1.setText(Display);


}
};
ActionListener boton1 = new ActionListener(){
    
        public void actionPerformed(ActionEvent e){
            
          QuitarCero(BarDisplay1.getText()); 

String Display = BarDisplay1.getText() + btn1.getText();



BarDisplay1.setText(Display);
}
        
};       
ActionListener boton2 = new ActionListener(){
    
        public void actionPerformed(ActionEvent e){
            
        QuitarCero(BarDisplay1.getText()); 
        String Display = BarDisplay1.getText() + btn2.getText();
        BarDisplay1.setText(Display);
        }
        
 };


ActionListener boton3 = new ActionListener(){
    
        public void actionPerformed(ActionEvent e){
        
        QuitarCero(BarDisplay1.getText()); 
        String Display = BarDisplay1.getText() + btn3.getText();
        BarDisplay1.setText(Display);


}
        };

ActionListener boton4 = new ActionListener(){
    
        public void actionPerformed(ActionEvent e){
            
          
        QuitarCero(BarDisplay1.getText()); 
        String Display = BarDisplay1.getText() + btn4.getText();
        BarDisplay1.setText(Display);


}
        };
ActionListener boton5 = new ActionListener(){
    
        public void actionPerformed(ActionEvent e){
       
        QuitarCero(BarDisplay1.getText()); 
        String Display = BarDisplay1.getText() + btn5.getText();
        BarDisplay1.setText(Display);


}
        };
ActionListener boton6 = new ActionListener(){
    
        public void actionPerformed(ActionEvent e){

        QuitarCero(BarDisplay1.getText()); 
        String Display = BarDisplay1.getText() + btn6.getText();
        BarDisplay1.setText(Display);


}
        };
ActionListener boton7 = new ActionListener(){
    
        public void actionPerformed(ActionEvent e){

        QuitarCero(BarDisplay1.getText()); 
        String Display = BarDisplay1.getText() + btn7.getText();
        BarDisplay1.setText(Display);


}
        };
ActionListener boton8 = new ActionListener(){
    
        public void actionPerformed(ActionEvent e){

        QuitarCero(BarDisplay1.getText()); 
        String Display = BarDisplay1.getText() + btn8.getText();
        BarDisplay1.setText(Display);


}
        };
ActionListener boton9 = new ActionListener(){
    
        public void actionPerformed(ActionEvent e){

        QuitarCero(BarDisplay1.getText()); 
        String Display = BarDisplay1.getText() + btn9.getText();
        BarDisplay1.setText(Display);

        }
};
        
ActionListener borrar = new ActionListener(){
    
        public void actionPerformed(ActionEvent e){
            
            //Ponemos por defecto todo y cerramos la cuenta
                    ActivarBotones(true);
                    ActivarOps(true);
                    abierta = false;
           
                    BarDisplay1.setText("0");
                    BarDisplay2.setText("Hagamos cuentas...");
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
        
    }
    
}
