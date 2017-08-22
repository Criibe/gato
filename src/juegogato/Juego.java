
package juegogato;

import java.awt.Color;
import java.awt.Label;
import java.awt.List;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Juego extends javax.swing.JFrame {

    
    private Boolean isPressedC1;
    private Boolean isPressedC2;
    private Boolean isPressedC3;
    private Boolean isPressedC4;
    private Boolean isPressedC5;
    private Boolean isPressedC6;
    private Boolean isPressedC7;
    private Boolean isPressedC8;
    private Boolean isPressedC9;
    
    private String jugadorUnoGana = "¡Jugador UNO gana!";
    private String jugadorDosGana = "¡Jugador DOS gana!";
    private String jugadorUnoTexto = "Jugador Uno";
    private String jugadorDosTexto = "Jugador Dos";
    
    private int empate;
    
    private Boolean tirarJugadorUno = true;
    private Boolean isPc=true;
    private Usuario jugadorUno = new Usuario("X");
    private Usuario jugadorDos = new Usuario("O");
    public JPanel Cuadro;

    

    public Juego() {
        initComponents();             
        dibujarTablero();
       
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Linea1 = new javax.swing.JLabel();
        Linea2 = new javax.swing.JLabel();
        Linea3 = new javax.swing.JLabel();
        Linea4 = new javax.swing.JLabel();
        Linea5 = new javax.swing.JLabel();
        Cuadro6 = new javax.swing.JLabel();
        Cuadro7 = new javax.swing.JLabel();
        Cuadro8 = new javax.swing.JLabel();
        Cuadro1 = new javax.swing.JLabel();
        Cuadro4 = new javax.swing.JLabel();
        Cuadro2 = new javax.swing.JLabel();
        Cuadro5 = new javax.swing.JLabel();
        Cuadro3 = new javax.swing.JLabel();
        Cuadro9 = new javax.swing.JLabel();
        textoJugador = new javax.swing.JLabel();
        labelTurnoGana = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 188, 212));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Linea1.setBackground(new java.awt.Color(0, 151, 167));
        Linea1.setText("3");
        jPanel1.add(Linea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 5, 300));
        Linea1.getAccessibleContext().setAccessibleName("Linea1");

        Linea2.setBackground(new java.awt.Color(0, 151, 167));
        jPanel1.add(Linea2, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 6, 10, 188));

        Linea3.setBackground(new java.awt.Color(0, 151, 167));
        Linea3.setText("4");
        jPanel1.add(Linea3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 300, 5));

        Linea4.setBackground(new java.awt.Color(0, 151, 167));
        Linea4.setText("1");
        jPanel1.add(Linea4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 5, 300));

        Linea5.setBackground(new java.awt.Color(0, 151, 167));
        Linea5.setText("2");
        jPanel1.add(Linea5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 300, 5));

        Cuadro6.setBackground(new java.awt.Color(204, 255, 204));
        Cuadro6.setFont(new java.awt.Font("Lucida Grande", 0, 75)); // NOI18N
        Cuadro6.setForeground(new java.awt.Color(0, 151, 167));
        Cuadro6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cuadro6.setText("x");
        Cuadro6.setAlignmentX(0.5F);
        Cuadro6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(Cuadro6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 80, 80));

        Cuadro7.setBackground(new java.awt.Color(204, 255, 204));
        Cuadro7.setFont(new java.awt.Font("Lucida Grande", 0, 75)); // NOI18N
        Cuadro7.setForeground(new java.awt.Color(0, 151, 167));
        Cuadro7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cuadro7.setText("x");
        Cuadro7.setAlignmentX(0.5F);
        Cuadro7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(Cuadro7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 80, 80));

        Cuadro8.setBackground(new java.awt.Color(204, 255, 204));
        Cuadro8.setFont(new java.awt.Font("Lucida Grande", 0, 75)); // NOI18N
        Cuadro8.setForeground(new java.awt.Color(0, 151, 167));
        Cuadro8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cuadro8.setText("x");
        Cuadro8.setAlignmentX(0.5F);
        Cuadro8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(Cuadro8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 80, 80));

        Cuadro1.setBackground(new java.awt.Color(204, 255, 204));
        Cuadro1.setFont(new java.awt.Font("Lucida Grande", 0, 75)); // NOI18N
        Cuadro1.setForeground(new java.awt.Color(0, 151, 167));
        Cuadro1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cuadro1.setText("x");
        Cuadro1.setAlignmentX(0.5F);
        Cuadro1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Cuadro1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cuadro1MouseClicked(evt);
            }
        });
        jPanel1.add(Cuadro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 80));

        Cuadro4.setBackground(new java.awt.Color(204, 255, 204));
        Cuadro4.setFont(new java.awt.Font("Lucida Grande", 0, 75)); // NOI18N
        Cuadro4.setForeground(new java.awt.Color(0, 151, 167));
        Cuadro4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cuadro4.setText("x");
        Cuadro4.setAlignmentX(0.5F);
        Cuadro4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(Cuadro4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 80, 80));

        Cuadro2.setBackground(new java.awt.Color(204, 255, 204));
        Cuadro2.setFont(new java.awt.Font("Lucida Grande", 0, 75)); // NOI18N
        Cuadro2.setForeground(new java.awt.Color(0, 151, 167));
        Cuadro2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cuadro2.setText("x");
        Cuadro2.setAlignmentX(0.5F);
        Cuadro2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(Cuadro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 80, 80));

        Cuadro5.setBackground(new java.awt.Color(204, 255, 204));
        Cuadro5.setFont(new java.awt.Font("Lucida Grande", 0, 75)); // NOI18N
        Cuadro5.setForeground(new java.awt.Color(0, 151, 167));
        Cuadro5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cuadro5.setText("x");
        Cuadro5.setAlignmentX(0.5F);
        Cuadro5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(Cuadro5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 80, 80));

        Cuadro3.setBackground(new java.awt.Color(204, 255, 204));
        Cuadro3.setFont(new java.awt.Font("Lucida Grande", 0, 75)); // NOI18N
        Cuadro3.setForeground(new java.awt.Color(0, 151, 167));
        Cuadro3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cuadro3.setText("x");
        Cuadro3.setAlignmentX(0.5F);
        Cuadro3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(Cuadro3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 80, 80));

        Cuadro9.setBackground(new java.awt.Color(204, 255, 204));
        Cuadro9.setFont(new java.awt.Font("Lucida Grande", 0, 75)); // NOI18N
        Cuadro9.setForeground(new java.awt.Color(0, 151, 167));
        Cuadro9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cuadro9.setText("x");
        Cuadro9.setAlignmentX(0.5F);
        Cuadro9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(Cuadro9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 80, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 300, 300));

        textoJugador.setFont(new java.awt.Font("Lucida Grande", 0, 46)); // NOI18N
        textoJugador.setForeground(new java.awt.Color(178, 235, 242));
        textoJugador.setText("Jugador Uno");
        getContentPane().add(textoJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        labelTurnoGana.setFont(new java.awt.Font("Lucida Grande", 0, 60)); // NOI18N
        labelTurnoGana.setForeground(new java.awt.Color(0, 151, 167));
        labelTurnoGana.setText("Turno");
        getContentPane().add(labelTurnoGana, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Cuadro1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cuadro1MouseClicked
      
    }//GEN-LAST:event_Cuadro1MouseClicked

    public static void main(String args[]) {
   
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });
    }
    
    public void dibujarTablero(){
        
        getContentPane().setBackground(new Color(200,188,212)); 

        empate=0;
        Cuadro6.setText("");
        Cuadro7.setText("");
        Cuadro8.setText("");
        Cuadro1.setText("");
        Cuadro4.setText("");
        Cuadro2.setText("");
        Cuadro5.setText("");
        Cuadro3.setText("");
        Cuadro9.setText(""); 
          
        Linea1.setOpaque(true);
        Linea2.setOpaque(true);
        Linea3.setOpaque(true);
        Linea4.setOpaque(true);
        Linea5.setOpaque(true);
        
        Linea1.setText("");
        Linea2.setText("");
        Linea3.setText("");
        Linea4.setText("");
        Linea5.setText("");
   
        Cuadro1.setName("Cuadro1");
        Cuadro2.setName("Cuadro2");
        Cuadro3.setName("Cuadro3");
        Cuadro4.setName("Cuadro4");        
        Cuadro5.setName("Cuadro5");
        Cuadro6.setName("Cuadro6"); 
        Cuadro7.setName("Cuadro7");
        Cuadro8.setName("Cuadro8");        
        Cuadro9.setName("Cuadro9");
        
            isPressedC1 = false;
            isPressedC2 = false;
            isPressedC3 = false;
            isPressedC4 = false;
            isPressedC5 = false;
            isPressedC6 = false;
            isPressedC7 = false;
            isPressedC8 = false;
            isPressedC9 = false;
        
        labelTurnoGana.setText("Turno");

        
 Cuadro6.addMouseListener(new MouseAdapter(){  
                public void mouseClicked(MouseEvent e)  
                {  
                    
                    if (!isPressedC6) {
                        tirarFicha(Cuadro6);
                        
                        if(tirarJugadorUno){
                            verificarSiGana(Cuadro6, jugadorUno);
                            
                        if(isPc==true){
                             isPressedC6 = true;
                            jugarPc();
                             isPressedC6 = false;
                             
                            verificarSiGana(Cuadro6, jugadorDos);
                              
                        }
                        }
                        else{
                            
                            verificarSiGana(Cuadro6, jugadorDos);
                        }

                         tirarJugadorUno = !tirarJugadorUno; 
                            
                                                   
                      
                        isPressedC6 = true;
                        
                    }
                }  
                });    
        
        Cuadro7.addMouseListener(new MouseAdapter(){  
        public void mouseClicked(MouseEvent e)  
                {  
                  if (!isPressedC7) {
                        tirarFicha(Cuadro7);
                        
                        if(tirarJugadorUno){
                            verificarSiGana(Cuadro7, jugadorUno);
                                 
                            if(isPc==true){
                            isPressedC7 = true;
                            jugarPc();
                           isPressedC7 = false;
                            verificarSiGana(Cuadro7, jugadorDos);
                            
                        }
                        }
                        else{

                             verificarSiGana(Cuadro7, jugadorDos);
                             
                        }
                        

                         tirarJugadorUno = !tirarJugadorUno; 
                        isPressedC7 = true;
                    }
                }  
                }); 
        
        Cuadro8.addMouseListener(new MouseAdapter(){  
        public void mouseClicked(MouseEvent e)  
                {  
                if (!isPressedC8) {
                        tirarFicha(Cuadro8);
                        
                        if(tirarJugadorUno){
                            verificarSiGana(Cuadro8, jugadorUno);
                             if(isPc==true){
                             isPressedC8 = true;
                            jugarPc();
                            isPressedC8 = false;
                            verificarSiGana(Cuadro8, jugadorDos);
                            
                        }
                        }
                        else{
 
                            verificarSiGana(Cuadro8, jugadorDos);
                        }
                        
                        isPressedC8 = true;
                        
                        
                        tirarJugadorUno = !tirarJugadorUno; 

                    }
                }  
                }); 
        
        Cuadro1.addMouseListener(new MouseAdapter(){  
        public void mouseClicked(MouseEvent e)  
                {  
                if (!isPressedC1) {
                        tirarFicha(Cuadro1);
                        
                        if(tirarJugadorUno){
                            verificarSiGana(Cuadro1, jugadorUno);
                          if(isPc==true){
                            isPressedC1 = true;
                            jugarPc();
                            isPressedC1 = false;
                            verificarSiGana(Cuadro1, jugadorDos);
                          
                        }
                          
                        }
                        else{
                         verificarSiGana(Cuadro1, jugadorDos);
                        
                        }
                        
                        isPressedC1 = true;
                        tirarJugadorUno = !tirarJugadorUno; 

                    }
                }  
                }); 
        
        
        Cuadro4.addMouseListener(new MouseAdapter(){  
        public void mouseClicked(MouseEvent e)  
                {  
             if (!isPressedC4) {
                        tirarFicha(Cuadro4);
                        
                      
                       if(tirarJugadorUno){
                            verificarSiGana(Cuadro4, jugadorUno);
                               if(isPc==true){
                                isPressedC4 = true;
                                jugarPc();
                                isPressedC4 = false;
                                verificarSiGana(Cuadro4, jugadorDos);
                                
                                
                            }
                       }
 
                       else{
                         verificarSiGana(Cuadro4, jugadorDos);
                       }
                        
                        isPressedC4 = true;
                        tirarJugadorUno = !tirarJugadorUno; 

                    }
                }  
                }); 
        
         
        Cuadro2.addMouseListener(new MouseAdapter(){  
        public void mouseClicked(MouseEvent e)  
                {  
                  if (!isPressedC2) {
                        tirarFicha(Cuadro2);
                        
                        if(tirarJugadorUno){
                            verificarSiGana(Cuadro2, jugadorUno);
                            if(isPc==true){
                            isPressedC2 = true;
                            jugarPc();
                           isPressedC2 = false;
                            verificarSiGana(Cuadro2, jugadorDos);
                            
                        }
                        }
                        else{

                            verificarSiGana(Cuadro2, jugadorDos);
                                
                        }
                        
                        isPressedC2 = true;
                        tirarJugadorUno = !tirarJugadorUno; 

                    }
                }  
                }); 
        
        
        Cuadro5.addMouseListener(new MouseAdapter(){  
        public void mouseClicked(MouseEvent e)  
                {  
               if (!isPressedC5) {
                        tirarFicha(Cuadro5);
                        
                        if(tirarJugadorUno)
                            verificarSiGana(Cuadro5, jugadorUno);
                            if(isPc==true){
                            isPressedC5 = true;
                            jugarPc();
                           isPressedC5 = false;
                            verificarSiGana(Cuadro5, jugadorDos);
                            
                        }
                        else{
                             verificarSiGana(Cuadro5, jugadorDos);
                        }
                        
                        
                        isPressedC5 = true;
                        tirarJugadorUno = !tirarJugadorUno; 
                    }
                }  
                }); 
        
        
        Cuadro3.addMouseListener(new MouseAdapter(){  
        public void mouseClicked(MouseEvent e)  
                {  
                 if (!isPressedC3) {
                        tirarFicha(Cuadro3);
                        
                        if(tirarJugadorUno){
                            verificarSiGana(Cuadro3, jugadorUno);
                            if(isPc==true){
                                 isPressedC3 = true;
                            jugarPc();
                            isPressedC3 = false;
                            verificarSiGana(Cuadro3, jugadorDos);
                            
                        }
                        }
                        else{
                            verificarSiGana(Cuadro3, jugadorDos);
                        }
                        
                        isPressedC3 = true;
                        tirarJugadorUno = !tirarJugadorUno; 
                    }
                }  
                }); 
        
                
        Cuadro9.addMouseListener(new MouseAdapter(){  
        public void mouseClicked(MouseEvent e)  
                {  
               if (!isPressedC9) {
                        tirarFicha(Cuadro9);
                        
                        if(tirarJugadorUno){
                            verificarSiGana(Cuadro9, jugadorUno);
                         if(isPc==true){
                               isPressedC9 = true;
                            jugarPc();
                          isPressedC9 = false;
                        verificarSiGana(Cuadro9, jugadorDos);
                            
                        }
                        }
                        else{
 
                            verificarSiGana(Cuadro9, jugadorDos);
                        }
                        
                        isPressedC9 = true;
                        tirarJugadorUno = !tirarJugadorUno; 
                    }
                }  
                }); 

    }
    

    
    public void tirarFicha(JLabel cuadro){
        
        if(tirarJugadorUno){
            cuadro.setText(jugadorUno.getFicha());
            textoJugador.setText(jugadorDosTexto);
        }
        else{
            cuadro.setText(jugadorDos.getFicha());
            textoJugador.setText(jugadorUnoTexto);
        }

        empate++;
    }
    
    public int verificarSiGana(JLabel cuadro, Usuario jugador){
        
        String tiro = jugador.getFicha();
        System.out.println("Name: " + cuadro.getName());
        System.out.println("Ficha:"+tiro);
        if(empate==9){
            labelTurnoGana.setText("¡Empate!");
            return -1;
        }

        switch(cuadro.getName()){
            
            case "Cuadro1":
                //Buscar victoria a la derecha
                if(Cuadro2.getText().equals(tiro) && Cuadro3.getText().equals(tiro))
                    ganarJuego(tirarJugadorUno);
                
                else if(Cuadro4.getText().equals(tiro) && Cuadro7.getText().equals(tiro))
                    ganarJuego(tirarJugadorUno);
                
                else if(Cuadro5.getText().equals(tiro) && Cuadro9.getText().equals(tiro))
                    ganarJuego(tirarJugadorUno);
                                
                break;
                
                
            case "Cuadro2":
                
                if(Cuadro1.getText().equals(tiro) && Cuadro3.getText().equals(tiro))
                    ganarJuego(tirarJugadorUno);
                
                else if(Cuadro5.getText().equals(tiro) && Cuadro8.getText().equals(tiro))
                    ganarJuego(tirarJugadorUno);
                
                break;

                
            case "Cuadro3":
                
                if(Cuadro2.getText().equals(tiro) && Cuadro1.getText().equals(tiro))
                    ganarJuego(tirarJugadorUno);
                
                else if(Cuadro6.getText().equals(tiro) && Cuadro9.getText().equals(tiro))
                    ganarJuego(tirarJugadorUno);

                else if(Cuadro5.getText().equals(tiro) && Cuadro7.getText().equals(tiro))
                    ganarJuego(tirarJugadorUno);

                break;
                
                
            case "Cuadro4":

                if(Cuadro1.getText().equals(tiro) && Cuadro7.getText().equals(tiro))
                    ganarJuego(tirarJugadorUno);
                else if(Cuadro5.getText().equals(tiro) && Cuadro6.getText().equals(tiro))
                    ganarJuego(tirarJugadorUno);

                break;


            case "Cuadro5":

                if(Cuadro2.getText().equals(tiro) && Cuadro8.getText().equals(tiro)){
                                        ganarJuego(tirarJugadorUno);
                }
                else if(Cuadro4.getText().equals(tiro) && Cuadro6.getText().equals(tiro)){
                    ganarJuego(tirarJugadorUno);
                }
                else if(Cuadro1.getText().equals(tiro) && Cuadro9.getText().equals(tiro)){
                    ganarJuego(tirarJugadorUno);
                }
                else if(Cuadro7.getText().equals(tiro) && Cuadro3.getText().equals(tiro)){
                    ganarJuego(tirarJugadorUno);
                }


                break;


            case "Cuadro6":

                if(Cuadro3.getText().equals(tiro) && Cuadro9.getText().equals(tiro))
                    ganarJuego(tirarJugadorUno);
                else if(Cuadro4.getText().equals(tiro) && Cuadro5.getText().equals(tiro))
                    ganarJuego(tirarJugadorUno);
                break;  


            case "Cuadro7":

            if(Cuadro4.getText().equals(tiro) && Cuadro1.getText().equals(tiro))
                    ganarJuego(tirarJugadorUno);
            else if(Cuadro8.getText().equals(tiro) && Cuadro9.getText().equals(tiro))
                    ganarJuego(tirarJugadorUno);
            else if(Cuadro5.getText().equals(tiro) && Cuadro3.getText().equals(tiro))
                    ganarJuego(tirarJugadorUno);

                break;

            case "Cuadro8":

            if(Cuadro5.getText().equals(tiro) && Cuadro2.getText().equals(tiro))
                    ganarJuego(tirarJugadorUno);
            else if(Cuadro7.getText().equals(tiro) && Cuadro9.getText().equals(tiro))
                    ganarJuego(tirarJugadorUno);

                break;

            case "Cuadro9":

            if(Cuadro6.getText().equals(tiro) && Cuadro3.getText().equals(tiro))
                    ganarJuego(tirarJugadorUno);
            else if(Cuadro5.getText().equals(tiro) && Cuadro1.getText().equals(tiro))
                    ganarJuego(tirarJugadorUno);
            else if(Cuadro8.getText().equals(tiro) && Cuadro7.getText().equals(tiro))
                    ganarJuego(tirarJugadorUno);

                break;
            
        }
        return 0;
       
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cuadro1;
    private javax.swing.JLabel Cuadro2;
    private javax.swing.JLabel Cuadro3;
    private javax.swing.JLabel Cuadro4;
    private javax.swing.JLabel Cuadro5;
    private javax.swing.JLabel Cuadro6;
    private javax.swing.JLabel Cuadro7;
    private javax.swing.JLabel Cuadro8;
    private javax.swing.JLabel Cuadro9;
    private javax.swing.JLabel Linea1;
    private javax.swing.JLabel Linea2;
    private javax.swing.JLabel Linea3;
    private javax.swing.JLabel Linea4;
    private javax.swing.JLabel Linea5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelTurnoGana;
    private javax.swing.JLabel textoJugador;
    // End of variables declaration//GEN-END:variables

    private void ganarJuego(Boolean jugadorUnoGano) {
        
        labelTurnoGana.setText("¡GANA!");
        
        if(jugadorUnoGano)
            System.out.println("¡El jugador UNO ha ganado!");
        else
            System.out.println("¡El jugador DOS ha ganado!");               
    }
    
    
    
   private void jugarPc(){

    int Rand;
    boolean Otravez=false;
    tirarJugadorUno=!tirarJugadorUno;
    if(isPressedC1==false||isPressedC3==false||isPressedC7==false||isPressedC9==false)
    {
        do{
            Otravez=true;
            Rand=(int)( Math.random()*4);

        System.out.println(""+Rand);

               if(Rand==0&&isPressedC1==false){
                   tirarFicha(Cuadro1);
                   Otravez=false;
                    isPressedC1=true;
                   System.out.println("si");
                }

               if(Rand==1&&isPressedC3==false){
                   tirarFicha(Cuadro3);
                   Otravez=false;
                    isPressedC3=true;
                       System.out.println("si");
               }

               if(Rand==2&&isPressedC7==false){
                   tirarFicha(Cuadro7);
                   Otravez=false;
                    isPressedC7=true;
                     System.out.println("si");
               }

                if(Rand==3&&isPressedC9==false){
                   tirarFicha(Cuadro9);
                   isPressedC9=true;
                   Otravez=false;
                       System.out.println("si");
               }    


        }while(Otravez==true);

    }
    
    else{
        System.out.println("Segunda opcion");
        
        do{
            Otravez=true;
            Rand=(int)( Math.random()*6);

        System.out.println(""+Rand);

              


               if(Rand==0&&isPressedC2==false){
                   tirarFicha(Cuadro2);
                   Otravez=false;
                }

               if(Rand==1&&isPressedC3==false){
                   tirarFicha(Cuadro3);
                   Otravez=false;
               }

               if(Rand==2&&isPressedC4==false){
                   tirarFicha(Cuadro4);
                   Otravez=false;
               }

                if(Rand==3&&isPressedC5==false){
                   tirarFicha(Cuadro5);
                   Otravez=false;
               }  
               
               if(Rand==4&&isPressedC6==false){
                   tirarFicha(Cuadro6);
                   Otravez=false;
               }   

               if(Rand==5&&isPressedC8==false){
                   tirarFicha(Cuadro8);
                   Otravez=false;
               }   

        }while(Otravez==true);
        
    
    
    }
    
   }
}
