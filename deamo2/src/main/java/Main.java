import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    public static Logger log= LogManager.getLogger(Main.class);
    public static void main(String[] args){
        log.error("Hiiiiii-------------------");
        log.fatal("Hiiiiii-------------------");
        log.debug("Hiiiiii-------------------");
        log.info("Hiiiiii-------------------");
    }
}
