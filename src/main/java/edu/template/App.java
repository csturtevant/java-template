package edu.template;

import edu.template.server.Server;
import java.io.IOException;

public class App {

    private static final int PORT = 8124;

    // FIXME :: TK :: Need to handle this exception
    public static void main( String[] args ) throws IOException {
        Server server = new Server();
        server.start(PORT);
    }
}
