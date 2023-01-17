public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
    }

    public String getBrand() {
        if (brand == "" || brand == "null") {
            brand = "default";
        }
        return brand;
    }

    public void setBrand() {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineVolume() {
        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        if (color == "" || color == "null") {
            color = "белый";
        }
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        if (year <= 0) {
            year = 2000;
        }
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return getBrand() + " " + getModel() + ", объем двигателя - " +
                getEngineVolume() + "л., цвет кузова - " + getColor() +
                ", год выпуска - " + getYear() + ", страна-производитель - " + getCountry();
    }
}
