package SegundaEvaluacion.Tema5;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
public class MiLogger {
    private static Logger logger;

    static {
        logger = Logger.getLogger(MiLogger.class.getName());
        FileHandler fileHandler;
        try {
            fileHandler = new FileHandler("aplicacion.log", true);
            logger.addHandler(fileHandler);
            logger.setLevel(Level.INFO);
            System.out.println("Logger configurado.");
        } catch (Exception e) {
            System.out.println("Error al configurar el logger: " + e.getMessage());
        }
    }

    public static Logger getLogger() {
        return logger;
    }
}
