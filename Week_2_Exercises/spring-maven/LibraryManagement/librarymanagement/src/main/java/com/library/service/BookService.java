package com.library.service;

import com.library.repository.Repository;

public class BookService {
    private Repository repository;

    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    public BookService(Repository repository) {
        this.repository = repository;
    }

    public void read() {
        System.out.println("this is Book service");
        repository.repo();
    }
}
