package adrsoft.scool.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JEditorPane;
import javax.swing.JScrollPane;
import javax.swing.UIManager;

/**
 * Clase encargada de cargar la web y la intranet del instituto del alumno
 * @author adrSoft
 * @version 1.0
 *
 */
public class Webs extends JInternalFrame {
    
    /*
     * Campos
     */
    private static final long serialVersionUID = 1L;
    private JEditorPane editorPane;
    @SuppressWarnings("unused")
    private JScrollPane scrollPane;
    private String ruta =  "http://www.iesmiguelherrero.com/";
    private JButton mWeb;
    private JButton mIntra;
	
	/**
	 * Constructor vacio. Se encarga de inicializar los componentes del frame.
	 * @author adrSoft
	 * @version 1.0
	 */
	public Webs() {
		init();
		cargarWeb(ruta);
		createEvents();

	  }

	/**
	 * Método que carga una web en un JEditorPane. La ruta de la web se pasa como argumento.
	 * @author adrSoft
	 * @version 1.0
	 * @param rut = Ruta o URL de la web a mostrar.
	 */
	private void cargarWeb(String rut) {
		editorPane = new JEditorPane();
		editorPane.setBackground(UIManager.getColor("textHighlight"));
		editorPane.setEditable(false);
		try {
		    editorPane.setPage(new URL(rut));
		} catch (MalformedURLException e) {
		    e.printStackTrace();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		scrollPane = new JScrollPane();
		this.getContentPane().add(editorPane);
		
	}

	/**
	 * Método encargado de crear los eventos asignados a los botones y otros controles interactivos.
	 * @author adrSoft
	 * @version 1.0
	 */
	private void createEvents() {
	    
	    	//Botón WEB
		mWeb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cargarWeb("http://www.iesmiguelherrero.com/");
				
			}
		});
		
		//Botón INTRANET
		mIntra.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cargarWeb("http://chamilo.iesmiguelherrero.com/");
				
			}
		});
		
	}

	/**
	 * Inicializador de los componentes en el JFrame.
	 * @author adrSoft
	 * @version 1.0
	 */
	private void init() {
		setBounds(100, 100, 710, 612);
		((javax.swing.plaf.basic.BasicInternalFrameUI) 
				getUI()).setNorthPane(null);
		 JPanel buttonPane = new JPanel();
		 buttonPane.setBackground(UIManager.getColor("textHighlight"));
		    buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
		    getContentPane().add(buttonPane, BorderLayout.SOUTH);
		    {
			mWeb = new JButton("WEB");
			mWeb.setActionCommand("WEB");
			buttonPane.add(mWeb);
			getRootPane().setDefaultButton(mWeb);
		    }
		    {
			mIntra = new JButton("INTRANET");
			mIntra.setActionCommand("INTRANET");
			buttonPane.add(mIntra);
		    }
	
	}
	}

