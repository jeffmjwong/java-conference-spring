package com.pluralsight.repository;

import com.pluralsight.model.Speaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Repository("speakerRepository")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {
    @Autowired
    private Calendar calendar;

    @Value("#{ T(java.lang.Math).random() * 100 }")
    private double seedNumber;

    public List<Speaker> findAll() {
        final List<Speaker> speakers = new ArrayList<>();

        final Speaker speaker = new Speaker();
        speaker.setFirstName("Bryan");
        speaker.setLastName("Hansen");
        speaker.setSeedNumber(seedNumber);

        System.out.println("calendar: " + calendar.getTime());
        System.out.println(seedNumber);

        speakers.add(speaker);

        return speakers;
    }
}
