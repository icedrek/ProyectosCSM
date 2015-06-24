package consum.gbs.visual;

import consum.gbs.control.Coordinador;
//import consum.gbs.modelo.UAcceso;
//import consum.gbs.modelo.Proyecto;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

public class VentanaPrincipal extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	private Coordinador c;	
	private JPanel panelPrincipal = new JPanel();
	private JPanel panelNuevo = new JPanel();
	private JPanel panelBuscar = new JPanel();
	private JPanel panelProyecto = new JPanel();
	private JPanel panelSalir = new JPanel();
	private JButton btnNuevoEjercicio, btnNuevoUsuario, btnBuscaUsuario, btnNuevaRutina, btnSalir;
	private JTextField txtUsuario;
	private JTable tbProyectos;
	/*
	private JScrollPane barra;
	private DefaultTableModel model;
	private JTable table;
	*/	
	public VentanaPrincipal() 
	{ 		
		// final VentanaPrincipal v = this;
        setTitle("Control de Proyectos");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setBounds(1, 1, 800, 600);
                       
     	// Panel de Botones para insertar usuarios, ejercicios o rutinas. 
        panelNuevo.setLayout(new GridLayout(20,1,20,1));
        {
            // Botón para nuevo usuario
           	btnNuevoUsuario = new JButton("Nuevo Proyecto");                    
           	btnNuevoUsuario.addActionListener(this);                	
           	panelNuevo.add(btnNuevoUsuario);
           	

           
            // Botón para nuevo ejercicio
           	btnNuevoEjercicio = new JButton("Nuevo Programa");  
           	btnNuevoEjercicio.addActionListener(this);           	
           	panelNuevo.add(btnNuevoEjercicio);
           
            // Botón para nueva rutina
           	btnNuevaRutina = new JButton("Nuevo Fichero");
           	btnNuevaRutina.addActionListener(this);
           	panelNuevo.add(btnNuevaRutina);            
        }
        
        // Panel de Busqueda        
        panelBuscar.setLayout(new FlowLayout(FlowLayout.CENTER));
        {
        	
        	// Cuadro de busqueda de usuarios
        	txtUsuario = new JTextField(20);
        	panelBuscar.add(txtUsuario);                	
            
        	// Botón de busqueda de usuarios
        	btnBuscaUsuario = new JButton("Buscar Proyecto");
        	btnBuscaUsuario.setPreferredSize(new Dimension(150,20));
        	panelBuscar.add(btnBuscaUsuario);                             
        }
        
     // Panel de Tabla        
        panelProyecto.setLayout(new FlowLayout(FlowLayout.CENTER));
        {
        	TableModel dataModel = new AbstractTableModel() {
                /**
				 * 
				 */
				private static final long serialVersionUID = -6588663548651016583L;
				public int getColumnCount() { return 10; }
                public int getRowCount() { return 10;}
                public Object getValueAt(int row, int col) { return new Integer(row*col); }
            };
        	
        	// Cuadro de busqueda de usuarios
        	tbProyectos = new JTable(dataModel);
        	JScrollPane scrollpane = new JScrollPane(tbProyectos);
        	panelBuscar.add(scrollpane);
        	
        }
        
        // Panel de Salida        
        panelSalir.setLayout(new FlowLayout(FlowLayout.RIGHT));
        {
        	// Botón de fin de ejecución
        	btnSalir = new JButton("Salir");
            btnSalir.addActionListener(this);
            btnSalir.setActionCommand("Salir"); 
            panelSalir.add(btnSalir);
        }
        
        getContentPane().setLayout(new BorderLayout());
        panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
        panelPrincipal.setLayout(new BorderLayout());
        panelPrincipal.add(panelNuevo, BorderLayout.WEST);
        panelPrincipal.add(panelBuscar, BorderLayout.NORTH);
        panelPrincipal.add(panelBuscar, BorderLayout.CENTER);
        panelPrincipal.add(panelSalir, BorderLayout.SOUTH);
        getContentPane().add(panelPrincipal);                              
	}
	
	public void setCoordinador(Coordinador c) 
	{
		this.c=c;
	}

	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if(e.getSource().equals(btnNuevoUsuario))
		{
			VentanaProyecto nuevoUsuario = new VentanaProyecto();
    		nuevoUsuario.setVisible(true);   
    		
		} else if (e.getSource().equals(btnNuevoEjercicio))	{
			btnNuevoEjercicio.setText("Cambia1");
			
		} else if (e.getSource().equals(btnNuevaRutina))	{
			btnNuevaRutina.setText("Cambia2");
			
		} else {
			System.exit(0);
		}		
	}		
}
