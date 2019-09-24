package com.stackroute.domain;

public class Movie {

    private Actor actorbean1;
    public Movie() {
    }
    public Movie(Actor actorbean1) {
        this.actorbean1 = actorbean1;
    }

    public void setActorbean1(Actor actorbean1) {
        this.actorbean1 = actorbean1;
    }

    public void display(){
        System.out.println(this.actorbean1.getName()+","+this.actorbean1.getGender()+","+this.actorbean1.getAge());
    }
}
