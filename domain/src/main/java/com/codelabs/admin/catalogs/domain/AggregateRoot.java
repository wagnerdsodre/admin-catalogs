package com.codelabs.admin.catalogs.domain;

public class AggregateRoot<ID extends Identifier> extends Entity<ID> {
    public AggregateRoot(final ID id) {
        super(id);
    }
}
