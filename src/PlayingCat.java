public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (temperature >= 25 && temperature <= 45) {
            if (!summer && temperature > 35)
                return false;

            return true;
        }

        return false;
    }

}
