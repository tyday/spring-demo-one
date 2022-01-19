package com.luv2code.springdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomFortuneService implements FortuneService{
    private final List<String> fortunes = new ArrayList<>();

    public RandomFortuneService() {
        this.fortunes.add("You will meet a mysterious person.");
        this.fortunes.add("A dream you have will come true.");
        this.fortunes.add("Traveling this year will bring your life into greater perspective.");
    }

    @Override
    public String getFortune() {
        Random random = new Random();
        return fortunes.get(random.nextInt(fortunes.size()));
    }
}
