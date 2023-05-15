package com.codelabs.admin.catalogs.domain.category;

import com.codelabs.admin.catalogs.domain.AggregateRoot;
import java.time.Instant;
import java.util.UUID;


public class Category extends AggregateRoot<CategoryId> {

  private String name;
  private String description;
  private Boolean active;
  private Instant createdAt;
  private Instant updateAt;
  private Instant deletedAt;

  private Category(final CategoryId anId, final String anName, final String anDescription,
      final Boolean isActive, final Instant creationDateAct, final Instant updateDateAct,
      final Instant deletionDateAct) {
    super(anId);
    this.name = anName;
    this.description = anDescription;
    this.active = isActive;
    this.createdAt = creationDateAct;
    this.updateAt = updateDateAct;
    this.deletedAt = deletionDateAct;
  }

  public static Category newCategory(final String aName, final String aDescription,
      final boolean isActive) {
    final var id = CategoryId.unique();
    final var now = Instant.now();
    return new Category(id, aName, aDescription, isActive, now, now, null);
  }

  public CategoryId getId() {
    return id;
  }
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public Instant getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Instant createdAt) {
    this.createdAt = createdAt;
  }

  public Instant getUpdateAt() {
    return updateAt;
  }

  public void setUpdateAt(Instant updateAt) {
    this.updateAt = updateAt;
  }

  public Instant getDeletedAt() {
    return deletedAt;
  }

  public void setDeletedAt(Instant deletedAt) {
    this.deletedAt = deletedAt;
  }
}
