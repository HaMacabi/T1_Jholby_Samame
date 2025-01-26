package Interfaces;
import java.util.List;
import model.TblUsuario;

public interface IUsuario {

	// M�todos
	void newUser(TblUsuario tblusuario);

	void updateUser(TblUsuario tblusuario);

	void removeUser(TblUsuario tblusuario);

	TblUsuario findUser(TblUsuario tblusuario);

	List<TblUsuario> listUsers();

}
