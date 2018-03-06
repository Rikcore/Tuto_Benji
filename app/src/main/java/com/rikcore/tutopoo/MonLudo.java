package com.rikcore.tutopoo;

/**
 * Created by rikcore on 06/03/2018.
 */

public class MonLudo {
    int mLevel;
    int mLife;
    int mPower;
    int mSpeed;
    int mStamina;


    //Constructeur
    public MonLudo(int level, int life, int power, int speed, int stamina){
        mLevel = level;
        mLife = life;
        mPower = power;
        mSpeed = speed;
        mStamina = stamina;
    }

    public int getmLevel() {
        return mLevel;
    }

    public void setmLevel(int mLevel) {
        this.mLevel = mLevel;
    }

    public int getmLife() {
        return mLife;
    }

    public void setmLife(int mLife) {
        this.mLife = mLife;
    }

    public int getmPower() {
        return mPower;
    }

    public void setmPower(int mPower) {
        this.mPower = mPower;
    }

    public int getmSpeed() {
        return mSpeed;
    }

    public void setmSpeed(int mSpeed) {
        this.mSpeed = mSpeed;
    }

    public int getmStamina() {
        return mStamina;
    }

    public void setmStamina(int mStamina) {
        this.mStamina = mStamina;
    }

    public void evolution(int niveau){
        mLevel = niveau;
        int bonus = 22 * (niveau - 1);
        mLife = 100 + bonus;
        mSpeed = 50 + bonus;
        mPower = 50 + bonus;
        mStamina = 50 + bonus;

    }
}
