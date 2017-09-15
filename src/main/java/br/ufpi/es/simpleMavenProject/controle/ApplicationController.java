package br.ufpi.es.simpleMavenProject.controle;

import java.util.ArrayList;
import br.ufpi.es.simpleMavenProject.dados.UserList;
import br.ufpi.es.simpleMavenProject.entidade.User;

/**
 * Created by LucaCDO on 14/09/17.
 */
public class ApplicationController {

    private UserList listOfUsers;

    public ApplicationController()
    {
        this.listOfUsers = new UserList();
    }

    public boolean addNewUser(User u)
    {
        return listOfUsers.addUser(u);
    }

    public String listAllUsers()
    {
        String msg = "\nID \t|\t NOME \t|\n";

        ArrayList<User> list = listOfUsers.listUsers();

        for(int i = 0; i < list.size(); i++)
        {
            msg += "\n"+list.get(i).getId()+"\t|\t"+list.get(i).getName();
        }

        return msg;
    }
}
