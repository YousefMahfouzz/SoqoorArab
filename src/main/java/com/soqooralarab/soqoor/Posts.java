package com.soqooralarab.soqoor;

import jakarta.persistence.*;

import java.time.LocalTime;

@Entity
public class Posts {
    @Id
    @SequenceGenerator(name = "post_sequence" , sequenceName = "post_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "post_sequence")
    private Long postId;
    @ManyToOne
    @JoinColumn (name = "user_id")
    private EndUser userId;
    private LocalTime Timestamp;

    public Posts(Long postId, EndUser userId, LocalTime timestamp) {
        this.postId = postId;
        this.userId = userId;
        Timestamp = timestamp;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
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
        return "Posts{" +
                "postId=" + postId +
                ", userId=" + userId +
                ", Timestamp=" + Timestamp +
                '}';
    }
}
