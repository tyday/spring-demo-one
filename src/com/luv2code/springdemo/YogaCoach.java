package com.luv2code.springdemo;

public class YogaCoach implements Coach{

    private final FortuneService fortuneService;

    public YogaCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Stretch!";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune() + " Namaste.";
    }
}
