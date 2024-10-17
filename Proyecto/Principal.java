import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class  Principal extends JFrame implements  ActionListener{
    private JLabel nombre , apellidoP,apellidoM,Lantigue,Ldepa,resul,img,bienvenido ;
    String nombres ="";

  
    private JTextField textNombre , textApellidoP, textApellidoM ;
    private JTextArea textArea ;
    private JScrollPane scrollPane ;
    private JComboBox  depa ,antiguedad ;
    private JMenuBar bar ;
    private JMenuItem rojo,morado,Salir,nuevo,Vacaciones,acerca ;
    private JMenu  op,cal,micolor;
   

    public Principal(){
        setLayout(null);
        setTitle("pantalla Principal");
        getContentPane().setBackground(Color.RED);
        setIconImage(new ImageIcon(getClass().getResource("images/1.png")).getImage());
        nombres =Bienvenida.texto ;
        bar =new JMenuBar();
        bar.setBackground(new Color(255,0,0));
        setJMenuBar(bar);

        op= new JMenu("Opciones") ;
        op.setBackground(Color.red);
        op.setFont(new Font("Arial",2,13));
        op.setForeground(Color.white);
        bar.add(op ) ;

            nuevo=new JMenuItem("Nuevo");
            nuevo.setBackground(Color.red);
            nuevo.setFont(new Font("Arial",2,13));
            nuevo.setForeground(Color.white);
            op.add(nuevo);
            nuevo.addActionListener(this);

            micolor = new JMenu("Cambiar Color") ;
            micolor.setFont(new Font("Arial",2,13));
            micolor.setBackground((Color.BLUE));
            micolor.setForeground(Color.darkGray);
            op.add(micolor);
    
            //colores cambiar
            rojo= new JMenuItem("rojo") ;
           
            rojo.setFont(new Font("Arial",2,13));
            rojo.setForeground(Color.white);    
            rojo.addActionListener(this);
            micolor.add(rojo);
           
            morado= new  JMenuItem("Morado");
            morado.setBackground((Color.red));
            morado.setFont(new Font("Arial",2,13));
            morado.setForeground((Color.white));
            morado.addActionListener(this);
            micolor.add(morado);
            morado.addActionListener(this);


            
           
    
                
    
    
    
    
    



       
       
       
       
       
       
         cal = new JMenu("Calcular") ;
        cal.setBackground(Color.white);
        cal.setForeground(Color.red);
        cal.setFont(new Font("Andale mono",3,13));
        bar.add(cal);

        Vacaciones= new JMenuItem("vACACIONES");
        Vacaciones.setBackground(Color.white);
        Vacaciones.setForeground(Color.red);
        Vacaciones.setFont(new Font("Andale mono",3,13));
        Vacaciones.addActionListener(this);
        cal.add(Vacaciones);

        
        
        acerca= new JMenuItem("Acerca") ;
        acerca.setBackground(Color.red);
        acerca.setFont(new Font("Arial",2,13));
        
        acerca.setForeground(Color.white);
        bar.add(acerca );
        acerca.addActionListener(this);

        Salir = new JMenuItem("Salir") ;
        Salir.setBackground(Color.red);
        Salir.setFont(new Font("Arial",2,13));
        Salir.setForeground(Color.white);
        
        bar.add(Salir);
        Salir.addActionListener(this);

       
       
       
        nombre =new JLabel ("nombre compeleto") ;
        nombre.setForeground(Color.white);
        nombre.setBounds(25,100,180,25);
        nombre.setFont(new Font("Arial",2,15));

        add(nombre);

        textNombre= new JTextField() ;
        textNombre.setBounds(25,125,180,25);
        add(textNombre);
        

        apellidoP = new JLabel("Apellido paterno") ;
        apellidoP.setForeground(Color.white);
        apellidoP.setBounds(25,150,180,25);
        add(apellidoP);
        
        textApellidoP=new JTextField() ;
        textApellidoP.setBounds(25,175,180,25);
        add(textApellidoP);



      

        apellidoM=new JLabel("Apellido materno");
        apellidoM.setForeground(Color.white);
        apellidoM.setBounds(25, 200, 180, 25);
        add(apellidoM);

        textApellidoM=new JTextField();
        textApellidoM.setBounds(25,225,180,25);
        add(textApellidoM);


        Ldepa = new JLabel("Selecciona el departamento");
        Ldepa.setForeground(Color.white);
        Ldepa.setBounds(300,100,180,25);
        add(Ldepa);
        
        depa=new JComboBox() ;
        depa.setBounds(300,125,180,25);
        depa.setBackground(Color.white);
        add(depa);
        depa.addItem("atencion al cliente");
        depa.addItem("departameto de logistica");
        depa.addItem("Departamento de gerencioa");


        Lantigue= new JLabel("antiguiedad ");
        Lantigue.setForeground(Color.white); 
        Lantigue.setBounds(300,175,180,25);
        add(Lantigue);

        antiguedad= new JComboBox () ;
        antiguedad.setBackground(Color.white);
        antiguedad.setBounds(300,200,180,25);
        add(antiguedad);
        antiguedad.addItem("1 año de servio :3");
        antiguedad.addItem("2 a 6 años de servicio :v");
        antiguedad.addItem("7 a mas años de servicio >:v");

        
        resul=new JLabel("EL RESULTADO ES:");
        resul.setFont(new Font("Arial", 3,20) );
        resul.setForeground(Color.DARK_GRAY);
        resul.setBounds(250,290,250,50);
        add(resul);

        textArea = new JTextArea("\n los resultados del calculo") ;
        textArea.setForeground(Color.red);
        textArea.setBackground(Color.white);
        textArea.setFont(new Font ("Andale mono " ,1,11));
        scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(220,330,385,95);
        add(scrollPane);
        
        ImageIcon image = new ImageIcon("images/logo-coca.png");
        img = new JLabel(image);
        img.setBounds(5,5,250,80);
        add(img);

        bienvenido= new JLabel("Bienvenido " + nombres);
        bienvenido.setBounds(280,20,300,30);
        bienvenido.setFont(new Font("Andale mono",3,29));
        bienvenido.setForeground(Color.white);
        add(bienvenido);

    }
 
    public void actionPerformed(ActionEvent e){
                 if (e.getSource() == Vacaciones) {
                    String Nombre = textNombre.getText();
                    String Apellidop = textApellidoP.getText() ;
                    String Apellidom = textApellidoM.getText() ;
                    String departamento = depa.getSelectedItem().toString();
                    String  añosServicio =  antiguedad.getSelectedItem().toString();

                            if (Nombre.equals("") ||Apellidop.equals("")||Apellidom.equals("")||departamento.equals("")||añosServicio.equals("")) {
                            JOptionPane.showMessageDialog(null,"debes llenar todos los recuadros");  }
                            else{
                            if(departamento.equals("atencion al cliente")){
                                    if(añosServicio.equals("1 año de servio :3")){
                                    textArea.setText("  \n El trabajador con nombre " +Nombre+"" + Apellidop+
                                                        "\n "+Apellidom+" del de partamento de " + departamento+
                                                        "\n con "+añosServicio+"tiene 6 dias de vacaciones " );
                                    }
                            
                                    else if(añosServicio.equals("2 a 6 años de servicio :v")){
                                    textArea.setText("  \n El trabajador con nombre " +Nombre+"" + Apellidop+
                                    "\n "+Apellidom+" del de partamento de " + departamento+
                                    "\n con "+añosServicio+"tiene 14 dias de vacaciones " );
                                    }
                                
                                    else if(añosServicio.equals("7 a mas años de servicio >:v")){
                                    textArea.setText("  \n El trabajador con nombre " +Nombre+"" + Apellidop+
                                    "\n "+Apellidom+" del de partamento de " + departamento+
                                    "\n con "+añosServicio+"tiene 20 dias de vacaciones " );
                                }


                        }
                        
                            if(departamento.equals("departameto de logistica")){

                                            if(añosServicio.equals("1 año de servio :3")){
                                                textArea.setText("  \n El trabajador con nombre " +Nombre+"" + Apellidop+
                                                "\n "+Apellidom+" del de partamento de " + departamento+
                                                "\n con "+añosServicio+"tiene 7 dias de vacaciones " );
                                                }
                                            else if(añosServicio.equals("2 a 6 años de servicio :v")){
                                                    textArea.setText("  \n El trabajador con nombre " +Nombre+"" + Apellidop+
                                                    "\n "+Apellidom+" del de partamento de " + departamento+
                                                    "\n con "+añosServicio+"tiene 15 dias de vacaciones " );
                                                }
                                                
                                            else  if(añosServicio.equals("7 a mas años de servicio >:v")){
                                                    textArea.setText("  \n El trabajador con nombre " +Nombre+"" + Apellidop+
                                                    "\n "+Apellidom+" del de partamento de " + departamento+
                                                    "\n con "+añosServicio+"tiene 22 dias de vacaciones " );
                                                }

                        }
                        
                            if(departamento.equals("Departamento de gerencioa")){
                                if(añosServicio.equals("1 año de servio :3")){
                                    textArea.setText("  \n El trabajador con nombre " +Nombre+"" + Apellidop+
                                                        "\n"+Apellidom+" del de partamento de " + departamento+
                                                        "\n con "+añosServicio+"tiene 8 dias de vacaciones " );
                                }
                            
                                else if(añosServicio.equals("2 a 6 años de servicio :v")){
                                    textArea.setText("  \n El trabajador con nombre " +Nombre+"" + Apellidop+
                                    "\n"+Apellidom+" del de partamento de " + departamento+
                                    "\n con "+añosServicio+"tiene 17 dias de vacaciones " );
                                }
                                
                               else if(añosServicio.equals("7 a mas años de servicio >:v")){
                                    textArea.setText("  \n El trabajador con nombre " +Nombre+"" + Apellidop+
                                    "\n"+Apellidom+" del de partamento de " + departamento+
                                    "\n con "+añosServicio+"tiene 24 dias de vacaciones " );
                                }

                        
         

                        }
                    }
                    
                    }
                    if(e.getSource()==rojo){
                        getContentPane().setBackground(Color.blue);
                    }
                    if(e.getSource()==morado){
                        getContentPane().setBackground(Color.pink);
                    }
                    if(e.getSource()==nuevo){
                        textNombre.setText("");
                        textApellidoM.setText("");
                        textApellidoP.setText("");
                        depa.setSelectedIndex(0);
                        antiguedad.setSelectedIndex(0);
                    }if(e.getSource()==acerca){
                        JOptionPane.showMessageDialog( null,"cRETIDOS RESERVADO A tugatiga sheyshey");
                    }
                    if(e.getSource()==Salir){
                        System.exit(0);
                    }
        
        


                        }

        
        
        

               
                    
                       

          
      
    



    
    
        
        
        
        
        
         public static void main(String[] args) {
        Principal principal = new Principal();
        principal.setBounds(0,0,640,535);
        principal.setLocationRelativeTo(null);
        principal.setVisible(true);
    }


}