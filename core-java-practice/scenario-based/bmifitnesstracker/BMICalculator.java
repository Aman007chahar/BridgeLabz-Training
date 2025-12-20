package bmifitnesstracker;

public class BMICalculator {
    public int bmiCalculator(int weight, int height){
        int bmi = weight / (height*height);
        return bmi;
    }
}
