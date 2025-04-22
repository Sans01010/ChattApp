package com.mycompany.chattapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NewLoginTest {

    public static void main(String[] args) {
    }

    @Test
    public void testValidUsername() {
        NewLogin login = new NewLogin("kyl_1", "Ch&&sec@ke99!", "+27838968976");
        String message = login.registerUser();
        assertEquals("Welcome <user first name>, <user last name> it is great to see you.", message.split("\n")[0]);
    }

    @Test
    public void testInvalidUsername() {
        NewLogin login = new NewLogin("kyle!!!!!!!", "Ch&&sec@ke99!", "+27838968976");
        String message = login.registerUser();
        assertEquals("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.", message);
    }

    @Test
    public void testValidPassword() {
        NewLogin login = new NewLogin("kyl_1", "Ch&&sec@ke99!", "+27838968976");
        String message = login.registerUser();
        assertEquals("Password successfully captured.", message.split("\n")[1]);

    }

    @Test
    public void testInvalidPassword() {
        NewLogin login = new NewLogin("kyl_1", "Password", "+27838968976");
        String message = login.registerUser();
        assertEquals("Password is not correctly formatted, please ensure that the password contains atleast eight characters, a capital letter, a number, and a special character.", message);
    }

    @Test
    public void testValidCellPhoneNumber() {
        NewLogin login = new NewLogin("kyl_1", "Ch&&sec@ke99!", "+27838968976");
        String message = login.registerUser();
        assertEquals("Cell number correctly captured.", message.split("\n")[2]);
    }

    @Test
    public void testInvalidCellPhoneNumber() {
        NewLogin login = new NewLogin("kyl_1", "Ch&&sec@ke99!", "o838968976");
        String message = login.registerUser();
        assertEquals("Cell number is incorrectly formatted or does not contain an international code, please correct the number and try again.", message);
    }

    @Test
    public void testTrueUsername() {
        NewLogin login = new NewLogin("kyl_1", "Ch&&sec@ke99!", "+27838968976");
        login.registerUser();
        assertTrue(login.loginUser("kyl_1", "Ch&&sec@ke99!", "+27838968976"));
    }

    @Test
    public void testFalseUsername() {
        NewLogin login = new NewLogin("kyle!!!!!!!", "Ch&&sec@ke99!", "+27838968976");
        login.registerUser();
        assertFalse(login.loginUser("kyl_1", "Ch&&sec@ke99!", "0838968976"));
    }

    @Test
    public void testTruePassword() {
        NewLogin login = new NewLogin("kyl_1", "Ch&&sec@ke99!", "+27838968976");
        assertTrue(login.checkUsername());

    }

    @Test
    public void testFalsePassword() {
        NewLogin login = new NewLogin("kyl_1!!!!!!!", "Password", "+27838968976");
        assertFalse(login.checkUsername());
    }

    @Test
    public void testTrueCellPhoneNumber() {
        NewLogin login = new NewLogin("kyl_1", "Ch&&sec@ke99!", "+27838968976");
        assertTrue(login.checkUsername());
    }

    @Test
    public void testFalseCellPhoneNumber() {
        NewLogin login = new NewLogin("kyl_1", "password", "+27838968976");
        assertFalse(login.checkUsername());
    }

    @Test
    public void testTrueUserLogin() {
        NewLogin login = new NewLogin("kyl_1", "Ch&&sec@ke99!", "+27838968976");
        assertTrue(login.checkUsername());
    }

    @Test
    public void testFalseUserLogin() {
        NewLogin login = new NewLogin("kyl_1", "Ch&&sec@ke99!", "0838968976");
        assertFalse(login.checkUsername());
    }
}
