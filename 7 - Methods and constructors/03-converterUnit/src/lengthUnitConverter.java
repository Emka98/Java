class lengthUnitConverter {

    double metersToCentimeters(double meters){
        return meters * 100;
    }

    double metersToMillimeters(double meters){
        return metersToCentimeters(meters) * 10;
    }

    double centimetersToMeters(double centimeters){
        return centimeters / 100;
    }  

    double millimetersToMeters(double centimeters){
        return centimetersToMeters(centimeters) / 10;
    }

}
