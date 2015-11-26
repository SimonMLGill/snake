package client.sdk;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import server.api.Api;

/**
 * Created by Simon DonGill on 12-11-2015.
 */
public class ServerConnection {

    Api api = new Api();
    public ServerConnection(){
        this.hostAddress = "http://localhost";
        this.port = 8999;
    }

    private String hostAddress;
    private int port;

    public void setHostAddress(String hostAddress) {
        this.hostAddress = hostAddress;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getHostAddress() {
        return hostAddress;
    }

    public int getPort() {
        return port;
    }

    public void get(String path){

        Client client = Client.create();

        WebResource webResource = client.resource(getHostAddress() + ":" + getPort() + "/server/" + path);
        ClientResponse response = webResource.type("application/json").get(ClientResponse.class);


        String output = response.getEntity(String.class);
        System.out.println(output);


    }

    public String post(String json, String path){
        String message = "";

        Client client = Client.create();

        WebResource webResource = client.resource(getHostAddress() + ":" + getPort() + "/server/api/" + path);
        ClientResponse response = webResource.type("application/json").post(ClientResponse.class, json);

        if (response != null){
            message = response.getEntity(String.class);
        }

        return message;
    }
}
