package com.soqooralarab.soqoor;

import jakarta.persistence.*;

import java.time.LocalTime;

@Entity
public class Relationship {


    @Id
    @ManyToOne
    @JoinColumn (name = "senderId")
    private EndUser sender;
    @Id
    @ManyToOne
    @JoinColumn (name = "receiverId")
    private EndUser receiver;
    private Character relaitonshipType;
    private LocalTime timestamp;

    public Relationship(EndUser userId, EndUser userId1, Character relaitonshipType, LocalTime timestamp) {
        this.sender = userId;
        this.receiver = userId1;
        this.relaitonshipType = relaitonshipType;
        this.timestamp = timestamp;
    }

    public EndUser getUserId() {
        return sender;
    }

    public void setUserId(EndUser userId) {
        this.sender = userId;
    }

    public EndUser getUserId1() {
        return receiver;
    }

    public void setUserId1(EndUser userId1) {
        this.receiver = userId1;
    }

    public Character getRelaitonshipType() {
        return relaitonshipType;
    }

    public void setRelaitonshipType(Character relaitonshipType) {
        this.relaitonshipType = relaitonshipType;
    }

    public LocalTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalTime timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Relationship{" +
                "sender=" + sender +
                ", receiver=" + receiver +
                ", relaitonshipType=" + relaitonshipType +
                ", timestamp=" + timestamp +
                '}';
    }
}
