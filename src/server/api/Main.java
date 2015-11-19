package server.api;

import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import com.sun.net.httpserver.HttpServer;
import server.model.Config;
import server.tui.Tui;
import server.model.User;

import java.io.IOException;

/**
 * Created by Simon DonGill on 06/11/2015.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        User user = new User();
        user.setUsername("321");
        user.setPassword("123");
        user.setType(0);
        System.out.println("test");
        Config.init();
        HttpServer server = HttpServerFactory.create("http://localhost:" + Config.getServerPort() + "/");
        server.start();
        System.out.println("Server running");
        System.out.println("Visit: http://localhost:" + Config.getServerPort() + "/server/api");
        Tui.serverMenu();
        System.out.println("Hit return to confirm to stop...");
        System.in.read();
        System.out.println("Stopping server");
        server.stop(0);
        System.out.println("Server stopped");

    }
}
