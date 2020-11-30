package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.PrivateKey;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Radio {
    private int minNumberStation = 0;
    private int maxNumberStation = 9;
    private int minSoundVolume = 0;
    private int maxSoundVolume = 100;
    private int currentNumberStation = 5;
    private int currentSoundVolume = 50;

    public Radio(int currentNumberStation) {
        if (currentNumberStation == maxNumberStation) {
            this.currentNumberStation = minNumberStation;
            return;}
        currentNumberStation++;
        this.currentNumberStation = currentNumberStation;
        return;
    }

    public void numberStationPrev() {
        if (currentNumberStation == minNumberStation) currentNumberStation = maxNumberStation+1;
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
    }
}

