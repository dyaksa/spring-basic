package belajar.sprint.boot.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DatabaseTest {

    @Test
    public void testDatabase() {
        var database1 = Database.getInstance();
        var database2 = Database.getInstance();


        Assertions.assertSame(database1, database2);
    }
}
