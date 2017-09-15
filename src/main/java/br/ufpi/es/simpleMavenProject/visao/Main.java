package br.ufpi.es.simpleMavenProject.visao;

import br.ufpi.es.simpleMavenProject.controle.ApplicationController;
import br.ufpi.es.simpleMavenProject.entidade.User;

public class Main {

    public static void main(String[] args)
    {
        User user1 = new User(1, "Luca");
        User user2 = new User(2, "Armando");
        User user3 = new User(3, "Pedro");
        ApplicationController ctrl = new ApplicationController();

        ctrl.addNewUser(user1);
        ctrl.addNewUser(user2);
        ctrl.addNewUser(user3);

        System.out.println(ctrl.listAllUsers());


    }
}
