package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @Column(name = "model")
    private String model;
    @Column(name = "series")
    private int series;



    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

    public Car() {
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getSeries() {
        return series;
    }
    public void setSeries(int series) {
        this.series = series;
    }

}
