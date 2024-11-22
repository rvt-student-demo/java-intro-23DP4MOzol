package lv.rvt;

public class Timer {
    private ClockHand hundredths;
    private ClockHand seconds;

    public Timer() {
        this.hundredths = new ClockHand(100); // Hundredths of a second
        this.seconds = new ClockHand(60);    // Seconds
    }

    public void advance() {
        this.hundredths.advance();

        // If the hundredths hand resets to 0, advance the seconds hand
        if (this.hundredths.value() == 0) {
            this.seconds.advance();
        }
    }

    public String toString() {
        return seconds + ":" + hundredths;
    }
}

