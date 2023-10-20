package org.ulpgc.is1.model;

public class Phone {
    private String number;

    public Phone(String number) {
        this.number = isValid(number) ? number : "XXXX";
    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = isValid(number) ? number : "XXXX";
    }

    public boolean isValid(String proposedNumber) {
        return proposedNumber.matches("\\d{9}");
    }
}
