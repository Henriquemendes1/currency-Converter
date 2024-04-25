package br.com.converter.models;

public class Coin {
    private String name;
    private int value;
    private int currentValue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(int currentValue) {
        this.currentValue = currentValue;
    }
    public void exibeValorAtual(){
        System.out.println("Current value: ");
    }

}
