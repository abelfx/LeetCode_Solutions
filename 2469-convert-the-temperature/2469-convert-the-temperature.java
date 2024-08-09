class Solution {
    public double[] convertTemperature(double celsius) {
        double fah = (celsius * 9/5) + 32;
        double kelvin = celsius + 273.15;
        
        double[] array = {kelvin, fah};
        
        return array;
        
    }
}