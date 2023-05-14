package com.codelabs.admin.catalogs.infrastructure;

import com.codelabs.admin.catalogs.application.UseCase;

public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");
        System.out.println(new UseCase().Execute());

    }

}