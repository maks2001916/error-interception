package org.example;

import org.example.exception.NewException;

public class Main {
    public static void main(String[] args) {
        try {
            car.go();
        } catch(NewException e) {
            e.getMessage("возникла ошибка ");
        }
    }
}