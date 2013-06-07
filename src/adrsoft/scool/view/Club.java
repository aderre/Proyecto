package adrsoft.scool.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JToolBar;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

import adrsoft.scool.club.Enlaces;
import adrsoft.scool.club.Fotos;
import adrsoft.scool.club.Informacion;
import adrsoft.scool.club.Inventario;
import adrsoft.scool.club.Miembros;
import adrsoft.scool.club.Normas;
import adrsoft.scool.club.Noticias;



/**
 * Clase que recoge el club del alumno y renderiza un portal donde puede interactuar con las caracteristicas
 * del club, así como con sus miembros.
 * 
 * @author adrSoft
 *@version 1.0
 */
public class Club extends JInternalFrame {

    	/*
    	 * Campos
    	 */
    	private static final long serialVersionUID = 1L;
	private JButton btnNewButton;
	private JButton btnNewButton_6;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JDesktopPane clubDesktopPane;
	private int mClub;



	/**
	 *Constructor que inicializa la clase habiendole pasado el id del club a mostrar.
	 *@author adrSoft
	 *@version 1.0
	 *@param clu = idclub(identificador del club del alumno)
	 */
	public Club(int clu) {
		getContentPane().setBackground(new Color(153, 204, 255));
		((javax.swing.plaf.basic.BasicInternalFrameUI) 
				getUI()).setNorthPane(null);
		this.mClub = clu;
		init();
		createEvents();
		System.out.print("Club/ club:" +mClub);

	}

	
	/**
	 * Método encargado de crear los eventos asignados a los botones y otros controles interactivos.
	 * @author adrSoft
	 * @version 1.0
	 */
	private void createEvents() {
	    
	    	//Boton Información
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Informacion info = new Informacion(mClub);
				info.setVisible(true);
				clubDesktopPane.add(info);
					try {
						info.setMaximum(true);
					} catch (PropertyVetoException e2) {
						e2.printStackTrace();
					}
					info.setUI(null);
			}
		});
		
		//Botón normas
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				Normas normas = new Normas(mClub);
				normas.setVisible(true);
				clubDesktopPane.add(normas);
					try {
					    normas.setMaximum(true);
					} catch (PropertyVetoException e2) {
						e2.printStackTrace();
					}
					normas.setUI(null);
			
			}
		});
		
		//Botón noticias
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    Noticias notis = new Noticias();
			    notis.setVisible(true);
			    clubDesktopPane.add(notis);
			    try {
				notis.setMaximum(true);
			    } catch (PropertyVetoException e1) {
				e1.printStackTrace();
			    }
			    notis.setUI(null);
			}
		});
		
		//Botón miembros
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    Miembros miem = new Miembros();
			    miem.setVisible(true);
			   clubDesktopPane.add(miem);
			   try {
			    miem.setMaximum(true);
			} catch (PropertyVetoException e1) {
			    e1.printStackTrace();
			}
			   miem.setUI(null);
			}
		});
		
		//Botón inventario
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    Inventario inven = new Inventario();
			    inven.setVisible(true);
			    clubDesktopPane.add(inven);
			    try {
				inven.setMaximum(true);
			    } catch (PropertyVetoException e1) {
				e1.printStackTrace();
			    }
			    inven.setUI(null);
			}
		});
		
		//Botón fotos
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    Fotos fots = new Fotos();
			    fots.setVisible(true);
			    clubDesktopPane.add(fots);
			    try {
				fots.setMaximum(true);
			    } catch (PropertyVetoException e1) {
				e1.printStackTrace();
			    }
			    fots.setUI(null);
			}
		});
		
		//Botón enlaces
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    Enlaces enla = new Enlaces();
			    enla.setVisible(true);
			    clubDesktopPane.add(enla);
			    try {
				enla.setMaximum(true);
			    } catch (PropertyVetoException e1) {
				e1.printStackTrace();
			    }
			    enla.setUI(null);
			}
		});
	
		
	}

	/**
	 * Inicializador de los componentes en el JFrame.
	 * @author adrSoft
	 * @version 1.0
	 */
	private void init() {
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 204, 255));
		
		clubDesktopPane = new JDesktopPane();
		clubDesktopPane.setBackground(new Color(153, 204, 255));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
				.addComponent(clubDesktopPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(clubDesktopPane, GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE))
		);
		GroupLayout gl_clubDesktopPane = new GroupLayout(clubDesktopPane);
		gl_clubDesktopPane.setHorizontalGroup(
			gl_clubDesktopPane.createParallelGroup(Alignment.LEADING)
				.addGap(0, 708, Short.MAX_VALUE)
		);
		gl_clubDesktopPane.setVerticalGroup(
			gl_clubDesktopPane.createParallelGroup(Alignment.LEADING)
				.addGap(0, 439, Short.MAX_VALUE)
		);
		clubDesktopPane.setLayout(gl_clubDesktopPane);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBorder(null);
		toolBar.setBackground(UIManager.getColor("textHighlight"));
		toolBar.setFloatable(false);
		panel.add(toolBar);
		
		btnNewButton = new JButton("Informaci\u00F3n");

		
		btnNewButton.setFont(new Font("Verdana", Font.BOLD, 12));
		btnNewButton.setBackground(UIManager.getColor("activeCaption"));
		toolBar.add(btnNewButton);
		
		JSeparator separator = new JSeparator();
		toolBar.add(separator);
		
		btnNewButton_6 = new JButton("Normas");

		btnNewButton_6.setFont(new Font("Verdana", Font.BOLD, 12));
		btnNewButton_6.setBackground(UIManager.getColor("activeCaption"));
		toolBar.add(btnNewButton_6);
		
		btnNewButton_1 = new JButton("Noticias");
	
		btnNewButton_1.setFont(new Font("Verdana", Font.BOLD, 12));
		btnNewButton_1.setBackground(UIManager.getColor("activeCaption"));
		toolBar.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Miembros");
	
		btnNewButton_2.setFont(new Font("Verdana", Font.BOLD, 12));
		btnNewButton_2.setBackground(UIManager.getColor("activeCaption"));
		toolBar.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Inventario");

		btnNewButton_3.setFont(new Font("Verdana", Font.BOLD, 12));
		btnNewButton_3.setBackground(UIManager.getColor("activeCaption"));
		toolBar.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("Fotos");
	
		btnNewButton_4.setFont(new Font("Verdana", Font.BOLD, 12));
		btnNewButton_4.setBackground(UIManager.getColor("activeCaption"));
		toolBar.add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("Enlaces");
	
		btnNewButton_5.setFont(new Font("Verdana", Font.BOLD, 12));
		btnNewButton_5.setBackground(UIManager.getColor("activeCaption"));
		toolBar.add(btnNewButton_5);
		getContentPane().setLayout(groupLayout);
		setBorder(new LineBorder(new Color(0, 0, 0)));
		setBounds(100, 100, 710, 523);
		
		
	}
}
