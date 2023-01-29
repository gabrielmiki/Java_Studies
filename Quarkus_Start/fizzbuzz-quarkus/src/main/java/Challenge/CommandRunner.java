package Challenge;

import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import org.jboss.logging.Logger;

import javax.inject.Inject;

@QuarkusMain
public class CommandRunner implements QuarkusApplication {

    private final FizzBuzz fizzBuzz;
    private final Logger LOG = Logger.getLogger(CommandRunner.class);

    @Inject
    public CommandRunner(FizzBuzz fizzBuzz) {
        super();
        this.fizzBuzz = fizzBuzz;
    }

    @Override
    public int run(String... args) throws Exception {
        LOG.debug("Starting Application");
        fizzBuzz.execute();
        LOG.debug("Ending Application");
        return 0;
    }
}
