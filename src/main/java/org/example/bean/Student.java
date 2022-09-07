package org.example.bean;

import lombok.ToString;

import java.util.List;
import java.util.Map;

@ToString
public class Student {
    String name;
    int age;
    Card card;
    List<String> listFriends;
    Map<String,Integer> mapScore;

    public Student(){}
    public Student(String name){
        this.name=name;
//        System.out.println("我是student！！构造");
    }
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public void setListFriends(List<String> listFriends) {
        this.listFriends = listFriends;
    }

    public void setMapScore(Map<String, Integer> mapScore) {
        this.mapScore = mapScore;
    }
    public void say(String text){
        System.out.println("My name is "+this.name+" and I Say "+text);
    }
    @Deprecated
    public void text(){
        System.out.println("我是text方法");
    }
}
