package Interfaces;

import java.util.List;
import model.TblProducto;

public interface IProducto {
	
	//M�todos
	void newProduct (TblProducto tblproducto);
	void updateProduct (TblProducto tblproducto);
	void removeProduct (TblProducto tblproducto);
	TblProducto findProduct (TblProducto tblproducto);
	List <TblProducto> listProducts();

}
