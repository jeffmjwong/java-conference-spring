package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
    private SpeakerRepository repository;

    public SpeakerServiceImpl() {
        System.out.println("no args constructor is used!");
    }

    public SpeakerServiceImpl(SpeakerRepository repository) {
        System.out.println("arg constructor is used!");
        this.repository = repository;
    }

    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }

    public List<Speaker> findAll() {
        return repository.findAll();
    }
}
