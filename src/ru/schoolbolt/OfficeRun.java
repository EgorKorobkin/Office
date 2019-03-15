package ru.schoolbolt;

public class OfficeRun {
    public static void main(String[] args){
        Stepper s = new Stepper();
        while(s.step());
        s.printResult();
    }
}
