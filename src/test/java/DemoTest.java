import org.junit.jupiter.api.Test;

public class DemoTest {

    @Test
    void testDemo() {
        System.out.println("Demo test");
    }

    //open Terminal, ls, check for gradlew, run ./gradlewclean test
    //this will clean project, will remove any leftovers from previous builds and will
    //execute test task
    //test task will automatically detect and execute all unit tests

}
