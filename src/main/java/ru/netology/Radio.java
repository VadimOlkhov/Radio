package ru.netology;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    private int maxStation = 9;
    private int minStation = 0;
    private int currentStation;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            this.currentStation = maxStation;
            return;
        }
        if (currentStation < minStation) {
            this.currentStation = minStation;

import java.security.PrivateKey;

public class Radio {
    private int minNumberStation = 0;
    private int maxNumberStation = 9;
    private int minSoundVolume = 0;
    private int maxSoundVolume = 100;
    private int currentNumberStation = 5;
    private int currentSoundVolume = 50;


    public void setCurrentNumberStation(int currentNumberStation) {
        this.currentNumberStation = currentNumberStation;
    }

    public int getCurrentNumberStation() {
        return currentNumberStation;
    }

    public void setCurrentSoundVolume(int currentSoundVolume) {
        this.currentSoundVolume = currentSoundVolume;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public int getMaxNumberStation() {
        return maxNumberStation;
    }

    public Radio(int maxNumberStation) {
        this.maxNumberStation = maxNumberStation;
    }

    public void numberStationEntered(int currentNumberStation) {
        if (currentNumberStation >= maxNumberStation) {
            this.currentNumberStation = maxNumberStation;
            return;
        }
        if (currentNumberStation <= minNumberStation) {
            this.currentNumberStation = minNumberStation;

            return;
        }
        this.currentNumberStation=currentNumberStation;
    }



    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        if (currentVolume <  minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseStation() {
        if (currentStation == maxStation) {
            this.currentStation = minStation;
            return;
        }
        currentStation++;
    }

    public void decreaseStation() {
        if (currentStation == minStation) {
            this.currentStation = maxStation;
            return;
        }
        currentStation--;
    }

    public void increaseVolume() {
        if (currentVolume == maxVolume) {

    public void numberStationNext() {
        if (currentNumberStation == maxNumberStation) {
            this.currentNumberStation = minNumberStation;
            return;
        }
        currentNumberStation++;
        return;
    }

    public void numberStationPrev() {
        if (currentNumberStation == minNumberStation) {
            currentNumberStation = maxNumberStation + 1;
        }
        currentNumberStation--;
        return;
    }

    public void volumeStationUp() {
        if (currentSoundVolume >= maxSoundVolume) {
            currentSoundVolume = maxSoundVolume;
            return;
        } else {
            currentSoundVolume++;
            return;
        }

    }

    public void volumeStationDoun() {
        if (currentSoundVolume <= minSoundVolume) {
            currentSoundVolume = minSoundVolume;
            return;
        } else {
            currentSoundVolume--;

            return;
        }
        currentVolume++;
    }


    public void decreaseVolume() {
        if (currentVolume == minVolume) {
            return;
        }
        currentVolume--;
    }

}
