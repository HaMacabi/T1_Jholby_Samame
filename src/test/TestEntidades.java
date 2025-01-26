package test;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import Dao.TblProductoImp;
import Dao.TblUsuarioImp;
import model.TblProducto;
import model.TblUsuario;

public class TestEntidades {

	public static void main(String[] args) {

		//EXAMEN T1
		
		//Objeto Producto
		TblProducto prod = new TblProducto();
		TblProductoImp proimp = new TblProductoImp();

		/*
		 //CREAR
		 prod.setNombre("Avena 3 Ositos 2 kg");
		 prod.setPrecio(12);
		 prod.setDescripcion("Reforzada con hierro y calcio");
		 prod.setEstado("Activo");
		 
		 Date fecha = new Date();
		 Date fechafab = new Date(fecha.getTime());
		 prod.setFechafabricacion(fechafab);
		 
		 Calendar fechaven = Calendar.getInstance();
		 fechaven.setTime(fechafab);
		 fechaven.add(fechaven.YEAR,2);
		 Date ven = new Date (fechaven.getTimeInMillis());
		 prod.setFechavencimiento(ven);
		
		 // Llamar método y enviarle objeto seteado
		 proimp.newProduct(prod); 
		 System.out.println("Producto registrado exitosamente");
		 */
		
		
		/*
		// EDITAR
		 prod.setIdproducto(24);
		 prod.setNombre("Avena 3 Ositos 1 kg");
		 prod.setPrecio(7);
		 prod.setDescripcion("Reforzado con hierro");
		 prod.setEstado("Inactivo");
		Date fecha = new Date();
		Date fechafab = new Date(fecha.getTime());
		prod.setFechafabricacion(fechafab);
		
		 Calendar fechaven = Calendar.getInstance();
		 fechaven.setTime(fechafab);
		 fechaven.add(fechaven.YEAR,2);
		 Date ven = new Date (fechaven.getTimeInMillis());
		 prod.setFechavencimiento(ven);

		// Llamar método y enviarle objeto seteado
		proimp.updateProduct(prod);
		System.out.println("Producto editado exitosamente");
		*/
		
		 
		/*
		//ELIMINAR
		prod.setIdproducto(24);
		proimp.removeProduct(prod);
		System.out.println("Producto Eliminado exitosamente");
		*/
		 
		/*
		//BUSCAR
		 
		 prod.setIdproducto(16); // enviar id
		 TblProducto tblproducto = proimp.findProduct(prod);
		 
		 System.out.println(
				 "ID: " + tblproducto.getIdproducto() +
				 "Nombre: " + tblproducto.getNombre() +
				 "Precio: " + tblproducto.getPrecio() + 
				 "Descripción: " + tblproducto.getDescripcion() + 
				 "Estado: " + tblproducto.getEstado() +
				 "Fecha Vencimiento: " + tblproducto.getFechavencimiento() + 
				 "Fecha Fabricación: " + tblproducto.getFechafabricacion());
		 
		 System.out.println("Producto encontrado exitosamente");
		 */

		/*
		//LISTAR
		 
		List<TblProducto> listadopro = proimp.listProducts();
		for (TblProducto lis : listadopro) {
			System.out.println(
					"ID: " + lis.getIdproducto() + 
					"Nombre: " + lis.getNombre() +
					"Precio: " + lis.getPrecio() + 
					"Descripción: " + lis.getDescripcion() + 
					"Estado: " + lis.getEstado() +
					"Fecha Vencimiento: " + lis.getFechavencimiento() + 
					"Fecha Fabricación: " + lis.getFechafabricacion()
					);

		}
		*/

		 
		// Objeto Usuario
		
		
		 TblUsuario user = new TblUsuario();
		 TblUsuarioImp userimp = new TblUsuarioImp();
		 
		 /*
		//CREAR
		user.setUsuario("Admin");
		user.setPassword("123");
		
		// Llamar método y enviarle objeto seteado
		userimp.newUser(user); 
		System.out.println("Usuario registrado exitosamente");
		*/
		
		 /*
		//EDITAR
		user.setIdusuario(7);
		user.setUsuario("Administrador");
		user.setPassword("1234");
		
		// Llamar método y enviarle objeto seteado
		userimp.updateUser(user); 
		System.out.println("Usuario editado exitosamente");
		*/
		
		 /*
		//ELIMINAR
		user.setIdusuario(7);
		userimp.removeUser(user);
		
		System.out.println("Usuario Eliminado exitosamente");
		*/
		 
		 /*
		 //BUSCAR
		 user.setIdusuario(4); // enviar id
		 TblUsuario tblusuario = userimp.findUser(user);
		 
		 System.out.println(
				 "ID: " + tblusuario.getIdusuario() +
				 "Usuario : " + tblusuario.getUsuario() +
				 "Clave : " + tblusuario.getPassword());
		 
		 System.out.println("Usuario encontrado exitosamente");
		 */
		 
		 /*
		// LISTAR
		List<TblUsuario> listado = userimp.listUsers();
		for (TblUsuario lis : listado) {
			System.out.println(
					"ID: " + lis.getIdusuario() + 
					" Usuario: " + lis.getUsuario() +
					" Clave: " + lis.getPassword()
					);
		}
		*/
		
	}

}
