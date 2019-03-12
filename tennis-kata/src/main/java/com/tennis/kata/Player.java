/*
 * Written by Steven Yeoh
 *
 * Copyright (c) 2019.
 */

package com.tennis.kata;

public class Player
{
    private String name;
    private int score;

    public Player(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setScore(int score)
    {
        this.score = score;
    }

    public int getScore()
    {
        return score;
    }

    public void winBall()
    {
        score++;
    }
}
