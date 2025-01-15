public class Timer {
    private int hours, minutes, seconds;

    Timer() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    Timer(int hours, int minutes, int seconds) {
        if (hours < 0)
            hours = 0;
        if (minutes < 0)
            minutes = 0;
        if (seconds < 0)
            seconds = 0;
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void setHours() {
        if (hours < 0)
            hours = 0;
        this.hours = hours;
    }

    public void setMinutes() {
        if (minutes < 0)
            minutes = 0;
        this.minutes = minutes;
    }

    public void setSeconds() {
        if (seconds < 0)
            seconds = 0;
        this.seconds = seconds;
    }

    public int getHours() {
        return this.hours;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public int getSeconds() {
        return this.seconds;
    }
}