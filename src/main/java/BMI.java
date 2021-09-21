public class BMI {
    private static final int MIN_WEIGHT = 2;
    private static final int MAX_WEIGHT = 200;

    private static final int MIN_HEIGHT = 1;
    private static final int MAX_HEIGHT = 3;
    public static double calculateBMI(int weigh, int height) throws InvalidWeightException, InvalidHeightException {
        if (weigh <= MIN_WEIGHT || weigh > MAX_WEIGHT) {
            throw new InvalidWeightException();
        }

        if (height < MIN_HEIGHT || height > MAX_HEIGHT) {
            throw new InvalidHeightException();
        }

        return weigh / (height * height);
    }


}
