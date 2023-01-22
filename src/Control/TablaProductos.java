package Control;
import Model.Producto;
import java.util.ArrayList;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author Andres
 */

public class TablaProductos implements TableModel{

    private ArrayList<Producto> productos;
    
    public TablaProductos(ArrayList<Producto> lista){
        productos = lista;
    }
    
    @Override
    public int getRowCount() {
        return productos.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String titulo = null;
        switch (columnIndex){
            case 0: {
                titulo = "PRODUCTO" ;
                break;
            } case 1: {
                titulo = "PRECIO";
                break;
            } case 2: {
                titulo = "CANTIDAD";
                break;
            }  case 3: {
                titulo = "CATEGORIA";
                break;
            }
        }
        return titulo;
    }


    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex == 2;
    }
    

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Producto p = productos.get(rowIndex);
        Object valor = null;
       // int valor = null;

        switch (columnIndex){
            case 0: {
                valor = p.getNombre() ;
                break;
            } case 1: {
                valor = p.getPrecio();
                break;
            } case 2: {
                valor = p.getCantidad();
                break;
            }  case 3: {
                valor = p.getCategoria();
                break;
            }
        }
        return valor;
    }
    

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
       Producto p = productos.get(rowIndex);

       switch(columnIndex){
            case 0: {
                p.setNombre(aValue.toString()) ;
                break;
            } case 1: {
                p.setPrecio(Integer.valueOf((String)aValue)) ;
            } case 2: {
                p.setCantidad(Integer.valueOf((String)aValue)) ;
                break;
            }  case 3: {
                p.setCategoria(aValue.toString()) ;
                break;
            }
        }
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
        
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }

}
