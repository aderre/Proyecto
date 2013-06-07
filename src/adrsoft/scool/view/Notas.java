package adrsoft.scool.view;
import java.awt.BorderLayout;
import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class Notas extends JInternalFrame {
    
    	/*
    	 * Campos
    	 */
    	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JButton btnContacta;
	private JTable table;



	/**
	 * Constructor vacio.
	 * @author adrSoft
	 * @version 1.0
	 */
	public Notas() {
		setBorder(null);
		setBounds(100, 100, 710, 622);
		
		JPanel panel = new JPanel();
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
		((javax.swing.plaf.basic.BasicInternalFrameUI)getUI()).setNorthPane(null);
		init();
		createEvents();
	}

	/**
	 * Método encargado de crear los eventos asignados a los botones y otros controles interactivos.
	 * @author adrSoft
	 * @version 1.0
	 */
	private void createEvents() {
	    	//Botón contactar
		btnContacta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showConfirmDialog(null, "Función no implementada aún.\nEstará disponible en un corto periodo de tiempo.","Oops..",JOptionPane.DEFAULT_OPTION);

			}
		});
		
		//Click en row
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				int row = table.getSelectedRow();
				btnContacta.setEnabled(true);
				switch(row){
				case 0:
					btnContacta.setText("Contacta con el profesor de Matemáticas");
					break;
				case 1:
					btnContacta.setText("Contacta con el profesor de Lenguaje");
					break;
				case 2:
					btnContacta.setText("Contacta con el profesor de Física");
					break;
				case 3:
					btnContacta.setText("Contacta con el profesor de Educación Física");
					break;
				case 4:
					btnContacta.setText("Contacta con el profesor de Dibujo");
					break;
				case 5:
					btnContacta.setText("Contacta con el tutor");
					break;
				}
			}
		});
	}

	/**
	 * Inicializador de los componentes en el JInternalFrame.
	 * @author adrSoft
	 * @version 1.0
	 */
	private void init() {
	
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		Object[][] datos = {
				{"Matemáticas", new Float(6.5), new Float(7)},
				{"Lenguaje", new Float(8), new Float(8.3) },
				{"Física", new Float(7), new Float(6.2)},
				{"Educación Física", new Float(7), new Float(6.2)},
				{"Dibujo", new Float(6.2), new Float(7)},
				};
				String[] columnNames = {"Materia","1ª Evaluación","2ª Evaluación",};
				 DefaultTableModel dtm= new DefaultTableModel(datos,columnNames);
				// Agregar nueva columna
				String[] columnaNueva1= {"4","2","7.3","6.25","10"};
				dtm.addColumn("3º Evaluación",columnaNueva1);
				// Agregar nueva fila
				Object[] newRow={"Tutoría", new String("Presentado"), new String("Presentado"), new String("No Presentado")};
				dtm.addRow(newRow);
				// Modificar celda especifica
				dtm.setValueAt("5", 3, 3); // Row/Col
				
				
			
				
				
				JPanel panel = new JPanel();
				panel.setBackground(new Color(153, 204, 255));
				contentPane.add(panel, BorderLayout.NORTH);
				table = new JTable(dtm);
			
//				table.setPreferredScrollableViewportSize(new Dimension(250, 100));
				scrollPane = new JScrollPane(table);
				panel.add(scrollPane);
				scrollPane.setBackground(new Color(153, 204, 255));
				
				btnContacta = new JButton("Selecciona una materia");
				btnContacta.setEnabled(false);
				btnContacta.setFont(new Font("Tahoma", Font.BOLD, 11));
			
				contentPane.add(btnContacta, BorderLayout.SOUTH);
			
				 
	}

}
