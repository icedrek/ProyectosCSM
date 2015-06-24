package consum.gbs.visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class VentanaProyecto extends JDialog implements ActionListener
{
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private final JTextField nomUsuario, ap1Usuario, ap2Usuario;
	private JButton btnGuardar, btnCancelar;
    
    public VentanaProyecto() 
    {
        setResizable(false);
        setTitle("Nuevo Usuario");
        setBounds(100, 100, 450, 229);
        
        getContentPane().setLayout(new BorderLayout());
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(contentPanel, BorderLayout.CENTER); 
        contentPanel.setLayout(null);
        {
        	JLabel lbNomUsuario = new JLabel("NOMBRE");
        	lbNomUsuario.setBounds(10, 10, 300, 25);
            contentPanel.add(lbNomUsuario);
            
            nomUsuario = new JTextField();            
            nomUsuario.setBounds(100, 10, 300, 25);
            contentPanel.add(nomUsuario);
            
            JLabel lbAp1Usuario = new JLabel("APELLIDO 1");            
            lbAp1Usuario.setBounds(10, 40, 300, 25);
            contentPanel.add(lbAp1Usuario);
            
            ap1Usuario = new JTextField();            
            ap1Usuario.setBounds(100, 40, 300, 25);
            contentPanel.add(ap1Usuario);
            
            JLabel lbAp2Usuario = new JLabel("APELLIDO 2");            
            lbAp2Usuario.setBounds(10, 70, 300, 25);
            contentPanel.add(lbAp2Usuario);
            
            ap2Usuario = new JTextField();            
            ap2Usuario.setBounds(100, 70, 300, 25);
            contentPanel.add(ap2Usuario);
        }             
       
        {
            JPanel buttonPane = new JPanel();
            buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
            getContentPane().add(buttonPane, BorderLayout.SOUTH);
            {
                btnGuardar = new JButton("Guardar");
                btnGuardar.addActionListener(this);
                btnGuardar.setActionCommand("Guardar");
                buttonPane.add(btnGuardar);
                getRootPane().setDefaultButton(btnGuardar);
            }
            
            {
                btnCancelar = new JButton("Cancelar");
                btnCancelar.addActionListener(this);
                btnCancelar.setActionCommand("Cancelar");
                buttonPane.add(btnCancelar);
            }
        }
    }
    
    public void actionPerformed(ActionEvent e) 
	{    	
    	if(e.getSource().equals(btnGuardar))
		{
    		btnGuardar.setText("Cambia");  
		} else {				
			dispose();   
		}		
	}
}

