package com.codelabs.admin.catalogs.application;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UseCaseTest {
    @Test
    public void TestApplication(){
        Assertions.assertNotNull(new UseCase());
        Assertions.assertNotNull(new UseCase().Execute());
    }

}
