package com.example.hw5_4;

class hw5_4 {
    public static void main(String[] args) {

        try {
            System.out.println("Делим число на ноль!");
            System.out.println(55/0);
            System.out.println("число");
            System.out.println("целое");

        }catch (ArithmeticException e){
            System.out.println("Ошибка! Делить на ноль нельзя!");
        }
    }
}