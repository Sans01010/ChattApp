package com.mycompany.chattapp;

public class NewLogin {

    final String username, password, number;

    public NewLogin(String username, String password, String number) {
        this.username = username;
        this.password = password;
        this.number = number;
    }

    // Title: Regex Username Validation
    // Author: ChatGPT
    // Date: 22 April 2025
    // Version: GPT-4o
    // Available at: https://chatgpt.com/c/68077c51-7d74-8002-ac4a-d86bcab44143 
    public boolean checkUsername() {

        final String pattern = "^(?=.*_).{1,5}$";
        return this.username.matches(pattern);

    }

    // Title: Regex Password Validation
    // Author: Chattgpt
    // Date: 22 April 2025
    // Version: GPT-4o
    // Available at https://chatgpt.com/c/68078004-adc8-8002-abe6-812504bf5e05
    public boolean checkPassword() {

        final String checkPassword = "^(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*])[A-Za-z\\d!@#$%^&*]{8,}$";
        return this.password.matches(password);
        // Title: Regex CellPhone Number
        // Author: ChattGPT
        // Date: 22 April 2025
        // Version: GPT-4o
        // Available at https://chatgpt.com/c/68078307-1580-8002-b446-cdf208e9d10e
    }

    public boolean checkCellPhoneNumber() {

        final String pattern = "^\\+27\\d{9}$";
        return this.number.matches(pattern);

    }

    public String registerUser() {
        if (!checkPassword() && !checkUsername()) {
            return "Usernsme and password not valid.";
        } else if (!checkCellPhoneNumber() && !checkUsername()) {
            return "Username and number not valid.";
        } else if (!checkCellPhoneNumber() && !checkPassword()) {
            return "Password and number not valid.";
        } else if (!checkUsername()) {
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.";
        } else if (!checkPassword()) {
            return "Password is not formatted properly, please ensure that your password has 8 characters atleast, a capital letter and a special characters.";
        } else if (!checkCellPhoneNumber()) {
            return "Cell phone number is not formatted properly or does not have an international code, please correct your number and retry.";
        } else {
            return "Username has been captured successfully.\nPassword has been successfully captured. \nCellphone number has been successfully captured.";
        }
    }

    public boolean loginUser(String username, String password, String number) {
        return username.equals(this.username) && password.equals(this.password) && number.equals(this.number);
    }

    public String LoginStatus(boolean status) {
        if (status) {
            return "Successful";
        } else {
            return "Unsuccessful";
        }
    }
}
