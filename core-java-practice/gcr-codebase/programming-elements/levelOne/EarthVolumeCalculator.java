package levelOne;

public class EarthVolumeCalculator {
    public static void main(String[] args) {

        double earthRadiusKm = 6378;
        double piValue = Math.PI;

        double volumeInKmCube = (4.0 / 3.0) * piValue * Math.pow(earthRadiusKm, 3);

        double kmToMiles = 0.621371;
        double earthRadiusMiles = earthRadiusKm * kmToMiles;

        double volumeInMilesCube = (4.0 / 3.0) * piValue * Math.pow(earthRadiusMiles, 3);

        System.out.println(
                "The volume of earth in cubic kilometers is " + volumeInKmCube +
                        " and cubic miles is " + volumeInMilesCube
        );
    }
}
