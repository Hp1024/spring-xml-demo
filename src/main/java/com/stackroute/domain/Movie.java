package com.stackroute.domain;

public class Movie {
    private Actor actor;

    public void setActor(Actor actor) {
        this.actor = actor;
    }
    public void display(){
        System.out.println(this.actor.getName()+","+this.actor.getGender()+","+this.actor.getAge());
    }
}
