package com.soqooralarab.soqoor;

import jakarta.persistence.*;

import java.time.LocalTime;

@Entity
public class ProfilePicture {
    @Id
    @SequenceGenerator(name = "pfp_sequence" , sequenceName = "pfp_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pfp_sequence")
    private Long pfpId;
    @OneToOne
    @JoinColumn (name = "user_id")
    private EndUser userId;
    private LocalTime Timestamp;

    public ProfilePicture(Long pfpId, EndUser userId, LocalTime timestamp) {
        this.pfpId = pfpId;
        this.userId = userId;
        Timestamp = timestamp;
    }

    public Long getPfpId() {
        return pfpId;
    }

    public void setPfpId(Long pfpId) {
        this.pfpId = pfpId;
    }

    public EndUser getUserId() {
        return userId;
    }

    public void setUserId(EndUser userId) {
        this.userId = userId;
    }

    public LocalTime getTimestamp() {
        return Timestamp;
    }

    public void setTimestamp(LocalTime timestamp) {
        Timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "ProfilePicture{" +
                "pfpId=" + pfpId +
                ", userId=" + userId +
                ", Timestamp=" + Timestamp +
                '}';
    }
}
