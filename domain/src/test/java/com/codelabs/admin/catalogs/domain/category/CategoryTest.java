package com.codelabs.admin.catalogs.domain.category;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CategoryTest {

  @Test
  public void TestNewCategory() {
    final var expectedName = "Filmes";
    final var expectedDescription = "Terror";
    final var expectedAtivated = true;

    final var actualCategory = Category.newCategory(expectedName, expectedDescription,
        expectedAtivated);

    Assertions.assertNotNull(actualCategory);
    Assertions.assertNotNull(actualCategory.getId());
    Assertions.assertEquals(expectedName, actualCategory.getName());
    Assertions.assertEquals(expectedDescription, actualCategory.getDescription());
    Assertions.assertEquals(expectedAtivated, actualCategory.getActive());
    Assertions.assertNotNull(actualCategory.getCreatedAt());
    Assertions.assertNotNull(actualCategory.getUpdateAt());
    Assertions.assertNull(actualCategory.getDeletedAt());
  }

}
