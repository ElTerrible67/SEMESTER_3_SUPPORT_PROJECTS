package com.example.room304.firebasetutorialapp.models;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by room3.04 on 21/06/2017.
 */
@IgnoreExtraProperties
public class Comment {
    String uid;
    String username;
    String pid;
    String comment;

    public Comment() {
    }

    public Comment(String uid, String username, String pid, String comment) {
        this.uid = uid;
        this.username = username;
        this.pid = pid;
        this.comment = comment;
    }

    public String getUid() {
        return uid;
    }

    public String getUsername() {
        return username;
    }

    public String getPid() {
        return pid;
    }

    public String getComment() {
        return comment;
    }
}
