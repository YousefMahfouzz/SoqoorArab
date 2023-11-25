package com.soqooralarab.soqoor;

import jakarta.persistence.*;

import java.time.LocalTime;

@Entity
public class Comments {

    @Id
    @SequenceGenerator(name = "comment_sequence" , sequenceName = "comment_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "comment_sequence")
    private Long commentId;
    @ManyToOne
    @JoinColumn (name = "user_id")
    private EndUser userId;
    @ManyToOne
    @JoinColumn (name = "post_id")
    private Posts postId;
    private LocalTime Timestamp;

    public Comments(Long commentId, EndUser userId, Posts postId, LocalTime timestamp) {
        this.commentId = commentId;
        this.userId = userId;
        this.postId = postId;
        Timestamp = timestamp;
    }

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public EndUser getUserId() {
        return userId;
    }

    public void setUserId(EndUser userId) {
        this.userId = userId;
    }

    public Posts getPostId() {
        return postId;
    }

    public void setPostId(Posts postId) {
        this.postId = postId;
    }

    public LocalTime getTimestamp() {
        return Timestamp;
    }

    public void setTimestamp(LocalTime timestamp) {
        Timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Comments{" +
                "commentId=" + commentId +
                ", userId=" + userId +
                ", postId=" + postId +
                ", Timestamp=" + Timestamp +
                '}';
    }
}
