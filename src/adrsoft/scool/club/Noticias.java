package adrsoft.scool.club;


import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;

public class Noticias extends JInternalFrame {

    private static final long serialVersionUID = 1L;

	/**
	 * Constructor vacío de la clase.
	 * @author adrSoft
	 * @version 1.0
	 */
	public Noticias() {
	    init();
	    }

	/**
	 * Inicializador de los componentes en el JFrame.
	 * @author adrSoft
	 * @version 1.0
	 */
	private void init() {

	    
		setBounds(100, 100, 450, 300);
		JLabel lblNoticias = new JLabel("Noticias");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(166)
					.addComponent(lblNoticias)
					.addContainerGap(228, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(91)
					.addComponent(lblNoticias)
					.addContainerGap(160, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);

	}

}

