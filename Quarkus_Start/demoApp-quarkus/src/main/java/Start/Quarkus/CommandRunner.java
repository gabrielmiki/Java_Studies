package Start.Quarkus;

import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import org.jboss.logging.Logger;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@QuarkusMain
public class CommandRunner implements QuarkusApplication {

    private static final Logger LOG = Logger.getLogger(CommandRunner.class);
    @ConfigProperty(defaultValue = "Students", name = "application.greeting.recipient")
    String recipient;

    @Override
    public int run(String... args) throws Exception {
        LOG.debug("Starting Application");
        LOG.info("Hello " + recipient);
        LOG.debug("Completing Application");
        return 0;
    }
}
