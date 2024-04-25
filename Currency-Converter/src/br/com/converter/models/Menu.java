package br.com.converter.models;

public class Menu {
    private String message;

    public Menu() {
        this.message = """
                \n** Which option do you want? **
                1 - Check balance
                2 - Transfer
                3 - Deposit
                4 - Exit
                
                Enter your option :""";
    }

    public String getMessage() {
        return message;
    }


}
