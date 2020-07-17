public class BmiService {
    public double calculate (int weight, int height){
        double index = weight / (height * height * 0.01 * 0.01);
                return index;
    }
}
