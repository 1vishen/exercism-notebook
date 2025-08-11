public class Lasagna {
    private static int EXPECTED_OVEN_TIME = 40;
    private static int ONE_LAYER_PREPARATION_TIME = 2;
    public int expectedMinutesInOven() {
        return EXPECTED_OVEN_TIME;
    }

    public int remainingMinutesInOven(int min) {
        return expectedMinutesInOven() - min;
    }

    public int preparationTimeInMinutes(int layers) {
        return layers * ONE_LAYER_PREPARATION_TIME;
    }

    public int totalTimeInMinutes(int layers, int min) {
        return preparationTimeInMinutes(layers) + min;
    }
}
