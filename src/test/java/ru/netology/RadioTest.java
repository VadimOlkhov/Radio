package ru.netology;

import org.junit.jupiter.api.Test;
import ru.netology.Radio;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    void setCurrentStationValid() {
        Radio music = new Radio(9,0,5,5,0,100);
        music.setCurrentStation(6);
        assertEquals(6, music.getCurrentStation());
    }

    @Test
    void setCurrentStationInvalidMax() {
        Radio music=new Radio (9,0,5,5,0,100);
        music.setCurrentStation(10);
        assertEquals(9, music.getCurrentStation());

    }

    @Test
    void setCurrentStationInvalidMin() {
        Radio music = new Radio(9,0,5,5,0,100);
        music.setCurrentStation(-5);
        assertEquals(0, music.getCurrentStation());


    }

    @Test
    void setCurrentStationIncreaseValid() {
        Radio music = new Radio(9,0,5,5,0,100);
        music.increaseStation();
        assertEquals(6, music.getCurrentStation());


    }

    @Test
    void setCurrentStationIncreaseValidMax() {
        Radio music = new Radio(9,0,9,5,0,100);
        music.increaseStation();
        assertEquals(0, music.getCurrentStation());

    }

    @Test
    void setCurrentStationDecreaseValid() {
        Radio music = new Radio(9,0,5,5,0,100);
        music.decreaseStation();
        assertEquals(4, music.getCurrentStation());


    }

    @Test
    void setCurrentStationDecreaseValidMin() {
        Radio music = new Radio(9,0,0,5,0,100);
        music.decreaseStation();
        assertEquals(9, music.getCurrentStation());

    }

    @Test
    void setCurrentVolume() {
        Radio music = new Radio(9,0,5,5,0,100);
        music.setCurrentVolume(6);
        assertEquals(6, music.getCurrentVolume());

    }

    @Test
    void setCurrentVolumeInvalidMax() {
        Radio music = new Radio(9,0,5,5,0,100);
        music.setCurrentVolume(101);
        assertEquals(100, music.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeInvalidMin() {
        Radio music = new Radio(9,0,5,5,0,100);
        music.setCurrentVolume(-5);
        assertEquals(0, music.getCurrentVolume());
    }


    @Test
    void setCurrentVolumeIncreaseMax() {
        Radio music = new Radio(9,0,5,100,0,100);
        music.increaseVolume();
        assertEquals(100, music.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeIncrease() {
        Radio music = new Radio(9,0,5,5,0,100);
        music.increaseVolume();
        assertEquals(6, music.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeDecrease() {
        Radio music = new Radio(9,0,5,5,0,100);
        music.decreaseVolume();
        assertEquals(4, music.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeDecreaseMin() {
        Radio music = new Radio(9,0,5,0,0,100);
        music.decreaseVolume();
        assertEquals(0, music.getCurrentVolume());
    }


}