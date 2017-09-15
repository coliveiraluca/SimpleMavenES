package br.ufpi.es.simpleMavenProject.entidade;

/**
 * Created by LucaCDO on 14/09/17.
 */

public class User {

    private int id;
    private String name;

    public User(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public int getId()
    {
        return this.id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
