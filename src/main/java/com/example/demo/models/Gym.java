package com.example.demo.models;

import com.example.demo.viewModels.GymViewModel;

import javax.persistence.*;

@Entity
public class Gym {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long id;

    @Column(length = 2056)
    private String frame;

    @Column
    private String adress;

    @Column
    private String phone1;

    @Column
    private String phone2;

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Gym() {};

    public Gym(GymViewModel gymViewModel) {
        this.setAdress(gymViewModel.getAddress());
        this.setFrame(gymViewModel.getFrame());
        this.setPhone1(gymViewModel.getPhone1());
        this.setPhone2(gymViewModel.getPhone2());
    }
}
