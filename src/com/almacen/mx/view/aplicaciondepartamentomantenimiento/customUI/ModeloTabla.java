/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciondepartamentomantenimiento.customUI;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo Legion
 */
public class ModeloTabla extends DefaultTableModel{
	boolean editable;
	String[] titulos;
	Object[][] datos;
	
	/**
	 * Determina el modelo con el que se va a construir la tabla
	 * @param datos
	 * @param titulos
	 */
	public ModeloTabla(Object[][] datos, String[] titulos, boolean editable) {
		super();
		this.titulos=titulos;
		this.datos=datos;
                this.editable = editable;
		setDataVector(datos, titulos);
	}
	
	public ModeloTabla() {
		// TODO Auto-generated constructor stub
	}
        
	public boolean isCellEditable (int row, int column)
	{
            if(editable){
                return true;
            }
            return false;
	}

}
