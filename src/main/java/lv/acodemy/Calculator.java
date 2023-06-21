package lv.acodemy;

public class Calculator {

    private String name;
    private String modelName;

    public Calculator(String name, String modelName) {
        this.name = name;
        this.modelName = modelName;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "name='" + name + '\'' +
                ", modelName='" + modelName + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int sum(int x, int y) {
        return x + y; //inline
    }

    public int substract (int x, int y) {
        return x - y;
    }

    public int divide (int x, int y) {
        return x / y;
    }

    public int multiply (int x, int y) {
        return x * y;
    }

    public int pow (int x) {
        return (int) Math.pow(x, 2);
    }


    // subtract - otnjatj
    // divide - podelitj
    // multiply - umnozitj
    // vozvesti v kvadrat
    // korenj sqr

}
