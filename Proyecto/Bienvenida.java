import  java.awt.*;
import java.awt.event.*;
import javax.swing.* ;

public class  Bienvenida extends JFrame implements ActionListener{
    private JTextField nombre ;
    private JLabel  ingrese,img,SCV ,abajo ;
    private JButton btingresar ;
    public static String texto ="";
    public Bienvenida(){
        setLayout(null);
        setTitle("Bienvenido :3");
        getContentPane().setBackground(new Color (255,0,0));
      setIconImage(new ImageIcon(getClass().getResource("images/1.png")).getImage());

        ImageIcon imagen = new ImageIcon("images/logo-coca.png") ;

        img = new JLabel(imagen) ;
        img.setBounds(25,15,300,150);
        add(img) ;


            SCV =new JLabel("Sistema de Control Vacional") ;
            SCV.setBounds(50,80,300,150);
            SCV.setForeground(Color.WHITE);
            SCV.setFont(new Font("Andale Mono" ,3,18 )) ;
            add(SCV) ;

            ingrese =new JLabel("ingrese su nombCV") ;
            ingrese.setBounds(45,200,2000,18);
            ingrese.setForeground(Color.WHITE);
            ingrese.setFont(new Font("Andale Mono" ,1,18)) ;
            add(ingrese) ;
        


             abajo=new JLabel("©2025 coca-cola creditos reservados") ;
            abajo.setBounds(85,375,300,30);
            SCV =new JLabel("Sistema de Control Vacional") ;
            SCV.setBounds(25,15,300,150);
            SCV.setForeground(Color.WHITE);
            SCV.setFont(new Font("Andale Mono" ,3,18 )) ;
            

            add(abajo) ;


        nombre= new JTextField() ;
        nombre.setBounds(45,240,255,25);
        nombre.setForeground(Color.RED);
       
        nombre.setFont(new Font("Andale Mono" ,0,15 )) ;
        add(nombre) ;


        
        btingresar = new JButton("ingresar") ;

        btingresar.setBounds (40,300,260,30) ;
        btingresar.setFont(new Font("Arial",1,15));
        btingresar.setForeground(Color.GREEN);
        btingresar.setBackground(new Color(255,255,255));
       
        btingresar.addActionListener(this);
            add(btingresar) ;

    }
@Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btingresar){
            texto = nombre.getText().trim() ; 
            if(texto.equals("")){
                JOptionPane.showMessageDialog(null, "ingresa tu nombre >:v");

            }else {
                Licencia licena1= new     Licencia();
            licena1.setBounds(0,0,600,400);
            licena1.setVisible(true);
            licena1.setLocationRelativeTo(null);
            this.setVisible(false);
            }
    }
    }

    public static void main(String[] args) {
      Bienvenida bienvenida= new Bienvenida()  ;
      bienvenida.setBounds(0,0,350,450);
      bienvenida.setVisible(true);
      bienvenida.setLocationRelativeTo(null);
      



    }

}