/**
 * author: Marcel Genzmehr
 * 17.11.2011
 */
package org.freeplane.plugin.workspace.components.dialog;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.RowSpec;

/**
 * 
 */
public class NewDirectoryDialogPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	private JTextField txtParentPath;
	private JTextField txtDirectoryName;
	/***********************************************************************************
	 * CONSTRUCTORS
	 **********************************************************************************/
	
	public NewDirectoryDialogPanel(String parentPath) {
		setMinimumSize(new Dimension(240,120));
		setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("36px"),
				FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("86px:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormFactory.LINE_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		JLabel lblIn = new JLabel("In:");
		add(lblIn, "3, 2, right, center");
		
		txtParentPath = new JTextField();
		txtParentPath.setEditable(false);
		txtParentPath.setText(parentPath);
		add(txtParentPath, "5, 2, fill, top");
		txtParentPath.setColumns(10);
		
		JLabel lblName = new JLabel("Name:");
		add(lblName, "3, 4, right, default");
		
		txtDirectoryName = new JTextField();
		txtDirectoryName.setText("");
		txtDirectoryName.requestFocus();
		add(txtDirectoryName, "5, 4, fill, top");
		txtDirectoryName.setColumns(10);
		
	}

	/***********************************************************************************
	 * METHODS
	 **********************************************************************************/

	public String getDirectoryName() {
		return txtDirectoryName.getText();
	}
	
}
