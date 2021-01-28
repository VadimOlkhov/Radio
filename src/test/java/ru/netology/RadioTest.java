package ru.netology;

import org.junit.jupiter.api.Test;

import ru.netology.Radio;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


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


    Radio station = new Radio(9);

    @Test
    public void enteredMaxNumberStation() {
        int maxNumberStation = 3;
        Radio station = new Radio(maxNumberStation);
        int actual = station.getMaxNumberStation();
        int expected = maxNumberStation;
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "NumberStationEnter,0,0",
            "NumberStationEnter,6,6",
            "NumberStationEnter,9,9",
            "NumberStationEnter,-1,0",
            "NumberStationEnter,10,9"
    })
    public void numberStationEntered(String name, int enteredNumberStation, int expected) {
        station.setCurrentNumberStation(enteredNumberStation);
        station.numberStationEntered(enteredNumberStation);
        int actual = station.getCurrentNumberStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "NumberStationFrom_0Forward,0,1",
            "NumberStationFrom_5Forward,5,6",
            "NumberStationFrom_9Forward,9,0",
    })
    public void numberStationNext(String name, int currentNumberStation, int expected) {
        station.setCurrentNumberStation(currentNumberStation);
        station.numberStationNext();
        int actual = station.getCurrentNumberStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "NumberStationFrom_0Forward,0,9",
            "NumberStationFrom_5Forward,5,4",
            "NumberStationFrom_9Forward,9,8"
    })
    public void numberStationPrev(String name, int currentNumberStation, int expected) {
        station.setCurrentNumberStation(currentNumberStation);
        station.numberStationPrev();
        int actual = station.getCurrentNumberStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "volumeUpFrom_0,0,1",
            "volumeUpFrom_5,65,66",
            "volumeUpFrom_max,100,100"

    })
    public void volumeStationUp(String name, int currentSoundVolume, int expected) {
        station.setCurrentSoundVolume(currentSoundVolume);
        station.volumeStationUp();
        int actual = station.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "volumeDownFrom_100,100,99",
            "volumeDownFrom_60,60,59",
            "volumeDownFrom_min,0,0"
    })
    public void volumeStationDoun(String name, int currentSoundVolume, int expected) {
        station.setCurrentSoundVolume(currentSoundVolume);
        station.volumeStationDoun();
        int actual = station.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }
}

