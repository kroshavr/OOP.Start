public class Car {
    final private String brand;
    final private String model;
    private double engineVolume;
    private String color;
    final private int year;
    final private String country;
    private String transmission;
    final private String carBody;
    private String numberOfTheCar;
    final private int numberOfSeats;
    private boolean  tires;

    class Key {
        final private boolean remoteEngineStart;
        final private boolean keylessAccess;

        public Key (boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        @Override
        public String toString() {
            return "Удаленный запуск двигателя - " + remoteEngineStart +
                    ", бесключевой доступ - " + keylessAccess;
        }
    }

    public Car(String brand, String model, double engineVolume, String color, int year, String country, String transmission,
               String carBody, String numberOfTheCar,int numberOfSeats, boolean tires) {
        this.brand = brand == null || brand.isBlank() ? "Default" : brand;
        this.model = model;
        this.engineVolume = engineVolume <= 0 ? 1.5 : engineVolume;
        this.color = color == null || color.isBlank() ? "белый" : color;
        this.year = year <= 0 ? 2000 : year;
        this.country = country;
        this.transmission = transmission == null || transmission.isBlank() ? "механический" : transmission;
        this.carBody = carBody == null || carBody.isBlank() ? "седан" : carBody;
        this.numberOfTheCar = numberOfTheCar == null || numberOfTheCar.isBlank() ? "Default" : numberOfTheCar;
        this.numberOfSeats = numberOfSeats <= 0 ? 5 : numberOfSeats;
        this.tires = tires;
    }

    public void choiceOfTires (int month) {
        if (month >= 4 || month <= 10) {
            setTires(false);
        }
        else setTires(true);
    }
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getCarBody() {
        return carBody;
    }

    public String getNumberOfTheCar() {
        return numberOfTheCar;
    }

    public void setNumberOfTheCar(String numberOfTheCar) {
        this.numberOfTheCar = numberOfTheCar;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean isTires() {
        return tires;
    }

    public void setTires(boolean summer) {
        this.tires = summer;
    }

    @Override
    public String toString() {
        return getBrand() + " " + getModel() + ", объем двигателя - " +
                getEngineVolume() + "л., цвет кузова - " + getColor() +
                ", год выпуска - " + getYear() + ", страна-производитель - " + getCountry() +
                ", коробка передач - " + getTransmission() + ", тип кузова - " + getCarBody() +
                ", номер мащины - " + getNumberOfTheCar() + ", количество мест - " + getNumberOfSeats() + ", резина -" + isTires();
    }
}
