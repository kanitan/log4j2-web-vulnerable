package hello;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Greeting {

    private long id;
    private String content;

    private static final Logger LOGGER = LogManager.getLogger(Greeting.class);
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        System.setProperty("com.sun.jndi.ldap.object.trustURLCodebase", "true");
        LOGGER.error("Got Info error log message: "+content);
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
