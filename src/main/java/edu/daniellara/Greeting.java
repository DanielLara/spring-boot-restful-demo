package edu.daniellara;

/**
 * Class description
 *
 * @author Daniel Lara Diezma
 * created on 06/10/2016
 */
public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
