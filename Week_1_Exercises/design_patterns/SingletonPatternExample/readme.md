
The `Logger` class provided in here follows the Singleton pattern. Since:

- **Private Static Instance**: `private static Logger instance;` ensures that the class can control the creation of the instance.
- **Private Constructor**: `private Logger()` prevents instantiation from outside the class.
- **Public Static Method**: `public static Logger getInstance()` provides access to the single instance. It uses lazy initialization (i.e., the instance is created only when it is first needed) and double-checked locking for thread safety.

See `LoggerTest.java` for usage examples.
