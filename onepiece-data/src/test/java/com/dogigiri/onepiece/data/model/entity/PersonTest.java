package com.dogigiri.onepiece.data.model.entity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.UUID;

class PersonTest {
    @Test
    public void createViaConstructor() {
        Person person = new Person(1L, UUID.randomUUID(), "Monkey D Dragon", "Dragon", 43, Gender.MALE);
        assertEquals(person.toString(), person.toString());
        System.out.println(person);
    }
}