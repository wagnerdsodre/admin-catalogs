package com.codelabs.admin.catalogs.domain.category;

import com.codelabs.admin.catalogs.domain.Identifier;
import java.util.Objects;
import java.util.UUID;

public class CategoryId extends Identifier {

  private final String value;

  public CategoryId(String value) {
    Objects.requireNonNull(value);
    this.value = value;
  }

  public static CategoryId unique() {
    return new CategoryId(UUID.randomUUID().toString().toLowerCase());
  }

  public static CategoryId from(final String anId) {
    return new CategoryId(anId);
  }

  public static CategoryId from(final UUID anId) {
    return new CategoryId(anId.toString().toLowerCase());
  }

  public String getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    final CategoryId that = (CategoryId) o;
    return Objects.equals(getValue(), that.getValue());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getValue());
  }
}
