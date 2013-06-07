package adrsoft.scool.club;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;


public class Miembros extends JInternalFrame {

        /*
         *Campos 
         */
    	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
    	private JScrollPane scrollPane;
    	private JPanel panel;
    	private JPanel panelTabla;


	/**
	 * Constructor vacío de la clase.
	 * @author adrSoft
	 * @version 1.0
	 */
	public Miembros() {
		setBorder(null);
		setBounds(100, 100, 710, 622);
		
		((javax.swing.plaf.basic.BasicInternalFrameUI) 
		getUI()).setNorthPane(null);
		init();
	}


	/**
	 * Inicializador de los componentes en el JFrame.
	 * @author adrSoft
	 * @version 1.0
	 */
	private void init() {
	    
	        panel = new JPanel();
		panel.setBackground(new Color(153, 204, 255));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
		);
		getContentPane().setLayout(groupLayout);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		Object[][] datos = {
				{"Andres", "Lopez", "Presidente"},
				{"Juan", "De Dios", "Tesorero" },
				{"Marta", "Sanchez", "Miembro"},
				};
				String[] columnNames = {"Nombre","Apellidos","Cometido", "Contacto"};
				 DefaultTableModel dtm= new DefaultTableModel(datos,columnNames);
	
				
				panelTabla = new JPanel();
				panelTabla.setBackground(new Color(153, 204, 255));
				contentPane.add(panelTabla, BorderLayout.NORTH);
				final JTable table = new JTable(dtm);

				table.setEnabled(true);
				scrollPane = new JScrollPane(table);
				panelTabla.add(scrollPane);
				scrollPane.setBackground(new Color(153, 204, 255));
				
				@SuppressWarnings("unused")
				ButtonColumn bot = new ButtonColumn(table, null, 3);
	
	}

}

