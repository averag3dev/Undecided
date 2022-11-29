package com.averag3dev.undecided.model;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestRecord {

    Record mockRecord;
    Properties properties;
    private int idToSet;
    private int correctId;
    private String titleToSet;
    private String correctTitle;
    private int ratingToSet;
    private int correctRating;

    @Before
    public void init() {
        try {
            mockRecord = new Record();
            properties = new Properties();
            properties.load(new FileInputStream("src/test/java/resources/TestRecord.properties"));
            idToSet = Integer.parseInt(properties.getProperty("idToSet"));
            correctId = Integer.parseInt(properties.getProperty("correctId"));
            titleToSet = properties.getProperty("titleToSet");
            correctTitle = properties.getProperty("correctTitle");
            ratingToSet = Integer.parseInt(properties.getProperty("ratingToSet"));
            correctRating = Integer.parseInt(properties.getProperty("correctRating"));
        } catch (IOException e) { e.printStackTrace(); }
    }

    @Test
    public void setsId_correctly() {
        mockRecord.setId(idToSet);
        assertEquals(mockRecord.id, correctId);
    }

    @Test
    public void getsId_correctly() {
        mockRecord.id = idToSet;
        assertEquals(mockRecord.getId(), correctId);
    }

    @Test
    public void setsTitle_correctly() {
        mockRecord.setTitle(titleToSet);
        assertEquals(mockRecord.title, correctTitle);
    }

    @Test
    public void getsTitle_correctly() {
        mockRecord.title = titleToSet;
        assertEquals(mockRecord.getTitle(), correctTitle);
    }

    @Test
    public void setsRating_correctly() {
        mockRecord.setRating(ratingToSet);
        assertEquals(mockRecord.rating, correctRating);
    }

    @Test
    public void getsRating_correctly() {
        mockRecord.rating = ratingToSet;
        assertEquals(mockRecord.getRating(), correctRating);
    }

    // Mock Record object
    private static class Record {
        private int id;
        private String title;
        private int rating;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getRating() {
            return rating;
        }

        public void setRating(int rating) {
            this.rating = rating;
        }
    }
}