package PostProcessor.Models;

import java.net.HttpURLConnection;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Connection {
    private HttpURLConnection connection;
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @PostConstruct
    public void init() {
        System.out.println("Value of property url has been injected! Inside init() method!");
        try {
            URL obj = new URL(this.url);
            this.connection = (HttpURLConnection) obj.openConnection();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Inside destroy() method!");
        if (this.connection != null) {
            this.connection.disconnect();
        }
    }

    public void readData() {
        try {
            int responseCode = this.connection.getResponseCode();
            System.out.println("Responding: " + responseCode);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
