package com.codelabs.admin.catalogs.infrastructure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class infrastructureTest {
    @Test
    public void MainTest(){
        Assertions.assertNotNull(new Main());
        Main.main(new String[]{});
    }
}
