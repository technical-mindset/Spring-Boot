package com.example.demo.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "ROOM")
public class Room {
    @Id
    @Column(name = "ROOM_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "ROOM_NUMBER")
    private String roomNumer;
    @Column(name = "BED_INFO")
    private String bedInfo;

    public Room() {
    }

    public Room(long id, String name, String roomNumer, String bedInfo) {
        this.id = id;
        this.name = name;
        this.roomNumer = roomNumer;
        this.bedInfo = bedInfo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoomNumer() {
        return roomNumer;
    }

    public void setRoomNumer(String roomNumer) {
        this.roomNumer = roomNumer;
    }

    public String getBedInfo() {
        return bedInfo;
    }

    public void setBedInfo(String bedInfo) {
        this.bedInfo = bedInfo;
    }
}
