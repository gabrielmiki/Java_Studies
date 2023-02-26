package Data.Quarkus;

import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import org.jboss.logging.Logger;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.inject.Inject;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@QuarkusMain
public class CommandRunner implements QuarkusApplication {

    private static final Logger LOG = Logger.getLogger(CommandRunner.class);
    @ConfigProperty(defaultValue = "Students", name = "application.greeting.recipient")
    String recipient;

    @Inject
    DataSource dataSource;

    @Override
    public int run(String... args) throws Exception {
        LOG.debug("Starting Application");
        String sql = "SELECT NAME, ROOM_NUMBER, BED_INFO FROM ROOM";
        List<Room> rooms = new ArrayList<>();
        try {
            Connection connection = dataSource.getConnection();
            try(Statement stmt = connection.createStatement()) {
                ResultSet rs = stmt.executeQuery(sql);
                while(rs.next()) {
                    rooms.add(new Room(rs.getString("NAME"), rs.getString("ROOM_NUMBER"),
                            rs.getString("BED_INFO")));
                }
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        rooms.forEach(System.out::println);
        LOG.debug("Completing Application");
        return 0;
    }
}
