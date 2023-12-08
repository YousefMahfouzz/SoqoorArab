package com.soqooralarab.soqoor;

import jakarta.persistence.*;

@Entity
public class Reactions {
    @Id
    @SequenceGenerator(name = "reaction_sequence" , sequenceName = "reaction_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "reaction_sequence")
    private Long reactionId;
    @ManyToOne
    @JoinColumn (name = "user_id")
    private EndUser userId;
    @ManyToOne
    @JoinColumn (name = "post_id")
    private Posts postId;

    public Reactions(Long reactionId, EndUser userId, Posts postId) {
        this.reactionId = reactionId;
        this.userId = userId;
        this.postId = postId;
    }

    public Long getReactionId() {
        return reactionId;
    }

    public void setReactionId(Long reactionId) {
        this.reactionId = reactionId;
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
}
