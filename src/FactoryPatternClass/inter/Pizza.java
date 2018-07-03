package FactoryPatternClass.inter;

import java.util.ArrayList;

public abstract class Pizza {

    /**
     * name为名称
     * dough为面团名称
     * sauce为酱料类型
     * toppings为一套佐料
     */
    public String name;
    public String dough;
    public String sauce;
    public ArrayList toppings = new ArrayList();

    public String getName() {
        return name;
    }

    public String getDough() {
        return dough;
    }

    public String getSauce() {
        return sauce;
    }

    public ArrayList getToppings() {
        return toppings;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
    }

    public void bake() {
        System.out.println("Baking " + name);
    }

    public void cut() {
        System.out.println("Cutting " + name);
    }

    public void box() {
        System.out.println("Boxing " + name);
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", toppings=" + toppings +
                '}';
    }
}
