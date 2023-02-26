package com.frankmoley.lil.lq;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.sql.DataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.jboss.logging.Logger;
import io.quarkus.arc.Arc;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class CommandRunner implements QuarkusApplication {

    private static final Logger LOG = Logger.getLogger(CommandRunner.class);

    @ConfigProperty(defaultValue = "Students", name = "application.greeting.recipient")
    String recipient;

    @Inject
    EntityManager entityManager;

    @Override
    public int run(String... args) throws Exception {
        LOG.debug("Starting application");
        Arc.container().requestContext().activate();
        List<Room> rooms = entityManager.createQuery("select r from Room r", Room.class).getResultList();
        rooms.forEach(System.out::println);
        Arc.container().requestContext().deactivate();
        LOG.debug("Completing application");
        return 0;
    }
}
