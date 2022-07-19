package ru.netology.HW9;

public class Radio {

    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newStation) {
        if (newStation < 10 && newStation >= 0) {
            currentStation = newStation;
        }
    }

    public void setCurrentVolume(int newVolume) {
        if (newVolume >= 0 && newVolume <= 10) {
            currentVolume = newVolume;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void next() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation += 1;
        }
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation -= 1;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

}

