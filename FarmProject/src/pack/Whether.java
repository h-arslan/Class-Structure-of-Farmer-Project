package pack;

public class Whether {
    Double temp_spring;
    Double temp_summer;
    Double temp_autumn;
    Double temp_winter;

    public Whether(){

    }
    public Whether(Double temp_spring,Double temp_summer, Double temp_autumn, Double temp_winter){
        this.temp_spring = temp_spring;
        this.temp_summer = temp_summer;
        this.temp_autumn = temp_autumn;
        this.temp_winter = temp_winter;

    }

    public Double getTemp_spring() {
        return temp_spring;
    }

    public void setTemp_spring(Double temp_spring) {
        this.temp_spring = temp_spring;
    }

    public Double getTemp_summer() {
        return temp_summer;
    }

    public void setTemp_summer(Double temp_summer) {
        this.temp_summer = temp_summer;
    }

    public Double getTemp_autumn() {
        return temp_autumn;
    }

    public void setTemp_autumn(Double temp_autumn) {
        this.temp_autumn = temp_autumn;
    }

    public Double getTemp_winter() {
        return temp_winter;
    }

    public void setTemp_winter(Double temp_winter) {
        this.temp_winter = temp_winter;
    }

    @Override
    public String toString() {
        return "Whether{" +
                "temp_spring=" + temp_spring +
                ", temp_summer=" + temp_summer +
                ", temp_autumn=" + temp_autumn +
                ", temp_winter=" + temp_winter +
                '}';
    }

}
