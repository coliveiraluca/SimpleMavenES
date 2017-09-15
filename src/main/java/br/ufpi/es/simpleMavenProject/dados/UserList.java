package br.ufpi.es.simpleMavenProject.dados;

import br.ufpi.es.simpleMavenProject.entidade.User;
import java.util.ArrayList;

/**
 * Created by LucaCDO on 14/09/17.
 */

public class UserList implements UserListInterface{

    private ArrayList<User> userList;

    public UserList()
    {
        this.userList = new ArrayList<User>();
    }

    public boolean addUser(User user)
    {
        if (this.userList.add(user))
            return true;
        else
            return false;
    }

    public ArrayList<User> listUsers()
    {
        return this.userList;
    }
}
