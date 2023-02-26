package Quarkus.REST;

import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import java.util.List;

@QuarkusMain
public class Runner implements QuarkusApplication {

    @Inject
    @RestClient
    RoomServiceRest roomServiceRest;

    @Override
    public int run(String... args) throws Exception {
        List<Room> rooms = roomServiceRest.getAllRooms();
        rooms.forEach(System.out::println);
        return 0;
    }
}
