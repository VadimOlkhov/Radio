package ru.netology;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void numberStationEntered() {
        int enteredNumberStation = 7;
        int expected = 7;
        Radio station = new Radio();
        station.setCurrentNumberStation(enteredNumberStation);
        int actual = station.getCurrentNumberStation();
        assertEquals(expected, actual);
    }

    Radio station = new Radio();

    @ParameterizedTest
    @CsvSource({
            "NumberStationFrom_0Forward,0,1",
            "NumberStationFrom_5Forward,5,6",
            "NumberStationFrom_9Forward,9,0",
    })
    public void numberStationNext(String name, int currentNumberStation, int expected) {
        Radio radio = new Radio(
                currentNumberStation
        );
        int actual = radio.getCurrentNumberStation();
        assertEquals(expected, actual);
    }


    Radio radTest = new Radio();
    Radio radioTest = new Radio();
    @Test
    public void test1() {
        radioTest.setCurrentNumberStation(888);
        Radio radio = new Radio(63);
        System.out.println(radio.getCurrentNumberStation());
        System.out.println(radTest.getCurrentNumberStation());
        System.out.println(radioTest.getCurrentNumberStation());
    }

    @ParameterizedTest
    @CsvSource({
            "NumberStationFrom_0Forward,0,9",
            "NumberStationFrom_5Forward,5,4",
            "NumberStationFrom_9Forward,9,8"
    })
    public void numberStationPrev(String name, int currentNumberStation, int expected) {
        Radio station = new Radio();
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
        Radio station = new Radio();
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
        Radio station = new Radio();
        station.setCurrentSoundVolume(currentSoundVolume);
        station.volumeStationDoun();
        int actual = station.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }
}