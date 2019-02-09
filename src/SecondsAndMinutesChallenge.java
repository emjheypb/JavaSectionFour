public class SecondsAndMinutesChallenge {

    public static String getDurationString(int minutes, int seconds) {
        if (minutes >= 0 && seconds >= 0 && seconds <= 59)
            return zeroPad(minutes / 60) + "h " + zeroPad(minutes % 60) + "m " + zeroPad(seconds) + "s";

        return "Invalid Value";
    }

    public static String getDuration(int seconds) {
        if (seconds >= 0)
            return getDurationString(seconds / 60, seconds % 60);

        return "Invalid Value";
    }

    public static String zeroPad(int num) {
        if (num / 10 < 1)
            return "0" + num;

        return Integer.toString(num);
    }

}
