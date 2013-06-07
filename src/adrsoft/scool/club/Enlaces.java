package adrsoft.scool.club;


import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;

public class Enlaces extends JInternalFrame {

    /*
     * Campos
     */
    private static final long serialVersionUID = 1L;
    private JLabel lblEnlaces;

	/**
	 * Constructor vacio.
	 * @author adrSoft
	 * @version 1.0
	 */
	public Enlaces() {
		setBounds(100, 100, 710, 300);
		init();
	}

	/**
	 * Inicializador de los componentes en el JFrame.
	 * @author adrSoft
	 * @version 1.0
	 */
	private void init() {

		lblEnlaces = new JLabel("Enlaces");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(20)
					.addComponent(lblEnlaces)
					.addContainerGap(374, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(78)
					.addComponent(lblEnlaces)
					.addContainerGap(173, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);

	    
	}

}
