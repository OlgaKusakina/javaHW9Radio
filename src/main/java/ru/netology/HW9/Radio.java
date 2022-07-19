package ru.netology.HW9;

public class Radio {
    private int stationCounts = 10;
    private int currentStation;
    private int currentVolume;


    public Radio (int stationCounts){
        this.stationCounts = stationCounts;
    }
    public Radio (){

    }

    public int getCurrentStation()
    {
        return currentStation;
    }

    public void setCurrentStation(int newStation) {
        if (newStation < stationCounts && newStation >= 0) {
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
        if (currentStation == stationCounts -1) {
            currentStation = 0;
        } else {
            currentStation += 1;
        }
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = stationCounts -1;
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

