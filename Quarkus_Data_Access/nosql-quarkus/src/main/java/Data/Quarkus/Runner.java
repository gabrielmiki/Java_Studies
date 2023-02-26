package Data.Quarkus;

import com.datastax.oss.driver.api.core.cql.ResultSet;
import com.datastax.oss.driver.api.core.cql.Row;
import com.datastax.oss.quarkus.runtime.api.session.QuarkusCqlSession;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import org.jboss.logging.Logger;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@QuarkusMain
public class Runner implements QuarkusApplication {
    @Inject
    QuarkusCqlSession cqlSession;

    private static final Logger LOG = Logger.getLogger(Runner.class);
    @Override
    public int run(String... args) throws Exception {
        LOG.debug("Starting Application");
        String sql = "select room_number, bed_info, name from lil.rooms";
        List<Room> rooms = new ArrayList<>();
        ResultSet rs = cqlSession.execute(sql);
        for (Row row:rs) {
            rooms.add(new Room(row.getString("room_number"), row.getString("bed_info"),
                    row.getString("name")));
        }
        rooms.forEach(System.out::println);
        LOG.debug("Closing Application");
        return 0;
    }
}
