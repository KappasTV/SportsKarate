package com.example.demo.viewModels;

import com.example.demo.models.Gym;

public class GymViewModel {
    private String frame;

    private String address;

    private String phone1;

    private String phone2;

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public GymViewModel(){};

    public GymViewModel(Gym gym) {
        this.setFrame(gym.getFrame());
        this.setAddress(gym.getAdress());
        this.setPhone1(gym.getPhone1());
        this.setPhone2(gym.getPhone2());
    }
}
