package com.codelabs.admin.catalogs.domain.category;

import java.time.Instant;
import java.util.UUID;


public class Category {
    private String id;
    private String name;
    private String description;
    private Boolean active;
    private Instant createrAt;
    private Instant updateAt;
    private Instant deletedAt;

    private Category(final String id, final String name, final String description, final Boolean active, final Instant createrAt, final Instant updateAt, final Instant deletedAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.active = active;
        this.createrAt = createrAt;
        this.updateAt = updateAt;
        this.deletedAt = deletedAt;
    }

    public static Category newCategory(final String aName, final String aDescription, final boolean isActive) {
        final var id = UUID.randomUUID().toString();
        final var now = Instant.now();
        return new Category(id, aName, aDescription, isActive==true, now, now, null);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Instant getCreaterAt() {
        return createrAt;
    }

    public void setCreaterAt(Instant createrAt) {
        this.createrAt = createrAt;
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
