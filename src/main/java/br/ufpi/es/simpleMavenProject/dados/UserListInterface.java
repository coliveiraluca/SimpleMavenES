package br.ufpi.es.simpleMavenProject.dados;

import br.ufpi.es.simpleMavenProject.entidade.User;
import java.util.ArrayList;

/**
 * Created by LucaCDO on 14/09/17.
 */
public interface UserListInterface {

    public boolean addUser(User user);
    public ArrayList<User> listUsers();
}
