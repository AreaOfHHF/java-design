package TemplateMethodPattern_Sort;

public class Duck implements Comparable{

    String name;
    double weight;

    public Duck(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    @Override
    public int compareTo(Object o) {
        Duck otherDuck = (Duck) o;
        if(this.weight < otherDuck.weight){
            return -1;
        }
        else if(this.weight > otherDuck.weight){
            return 1;
        }
        else{
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

}
