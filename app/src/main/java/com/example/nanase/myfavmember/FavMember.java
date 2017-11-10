package com.example.nanase.myfavmember;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by nanase on 2017/11/10.
 */

public class FavMember extends RealmObject {
    @PrimaryKey
    private long id;
    private String team;
    private String leader;
    private String actor;
    private String music;
    private String detail;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getMusic() {
        return music;
    }

    public void setMusic(String music) {
        this.music = music;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
