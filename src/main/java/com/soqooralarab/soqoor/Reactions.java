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


}
