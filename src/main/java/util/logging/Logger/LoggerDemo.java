package util.logging.Logger;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * static Logger getLogger(String name):为指定子系统查找或创建一个 logger。 
 * static Logger getLogger(String name, String resourceBundleName):为指定子系统查找或创建一个 logger。 
 * 注意：name是Logger的名称，当名称相同时候，同一个名称的Logger只创建一个。
 */
public class LoggerDemo {
	public static void main(String[] args) throws SecurityException, IOException {
		Logger log = Logger.getLogger("abel");
		log.setLevel(Level.INFO);

		ConsoleHandler consoleHandler = new ConsoleHandler();
		consoleHandler.setLevel(Level.ALL);
		log.addHandler(consoleHandler);
		FileHandler fileHandler = new FileHandler("D:/logg.log");
		fileHandler.setLevel(Level.ALL);
		fileHandler.setFormatter(new MyLogHander());
		log.addHandler(fileHandler);

		log.severe("这是1000Severe");
		log.warning("这是900Warning");
		log.info("这是800Info");
		log.config("这是700Config");
		log.fine("这是500Fine");
		log.finer("这是400Finer");
		log.finest("这是300Finest");
	}
}
