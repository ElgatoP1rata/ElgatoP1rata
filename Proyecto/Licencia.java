import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Licencia extends JFrame implements ActionListener, ChangeListener {
    private JTextArea terminos ;
    private JScrollPane pane ;
    private JCheckBox acepto  ;
    private JButton bacepto ,bnoAcepto ;
    private JLabel img , tituloTerminos ;
    String nombreb ="";

    public Licencia(){
        setLayout(null);
        setTitle("termnos de uso");
        setIconImage(new ImageIcon(getClass().getResource("images/1.png")).getImage());
        nombreb =Bienvenida.texto ;
        tituloTerminos=new JLabel ("TERMINOS Y CONDICIONES") ;
        tituloTerminos.setBounds(50,5,250,30);
        tituloTerminos.setFont(new Font("Arial", 3, 18));
       tituloTerminos.setForeground(new Color(0,0,0));
        add(tituloTerminos );

    
        terminos = new JTextArea() ;
        terminos.setEditable(false);
        terminos.setFont(new Font("Arial", 2, 11));
        terminos.setText("\n\n       terminos y condiciones"+
                         "\n\n       La Geekipedia de Ernesto "+
                         "\n\n       ➞ Facebook   / lageekipediadeernesto "+
                         "\n\n       ➞ Instagram   / lageekipedia  "+
                         "\n\n       ➞ Twitter   / lageekipedia  ")  ;
       
        pane= new  JScrollPane(terminos);

        pane.setBounds(15,40,575,200);
        add(pane );


        acepto =new JCheckBox("yo " + nombreb +" Acepto terminos y condiciones");
        acepto.setFont(new Font("Arial", 0, 12));
        acepto.setBounds(10,250,300,30);
        acepto.addChangeListener(this);
        add(acepto);


        bacepto = new JButton("ACEPTO") ;
        bacepto.setBounds(10,290,100,30);
        bacepto.addActionListener(this);
        bacepto.setEnabled(false);
        add(bacepto);
        

        
        bnoAcepto=new JButton("No acepto");
        bnoAcepto.setBounds(120,290,100,30);
        bnoAcepto.addActionListener(this);
        bnoAcepto.setEnabled(true);
        add(bnoAcepto);

        ImageIcon imagen = new ImageIcon("images/coca-cola.png");

        img= new JLabel(imagen) ;
        img.setBounds(315,135,300,300);
        add(img);
    }

    public void stateChanged(ChangeEvent e){
        if(acepto.isSelected()== true){
            bacepto.setEnabled(true);
            bnoAcepto.setEnabled(false);
        }
        else{
            bacepto.setEnabled(false);
            bnoAcepto.setEnabled(true);
        }

    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()== bacepto){
            Principal principal = new Principal();
            principal.setBounds(0,0,640,535);
            principal.setLocationRelativeTo(null);
            principal.setVisible(true);
            this.setVisible(false);

        }else if(e.getSource()== bnoAcepto){
            Bienvenida bienvenida= new Bienvenida()  ;
             bienvenida.setBounds(0,0,350,450);
             bienvenida.setVisible(true);
             bienvenida.setLocationRelativeTo(null);
             this.setVisible(false);
      



        }

        
        
    }

 public static void main(String[] args) {
      Licencia licena1= new Licencia();
        licena1.setBounds(0,0,600,400);
        licena1.setVisible(true);
        licena1.setLocationRelativeTo(null);



    }

}