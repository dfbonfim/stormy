package com.example.diego.stormy;

import android.support.annotation.NonNull;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

/**
 * Created by diego on 28/06/16.
 */
public class CurrentWeather {
    private String mIcon;
    private long mTime;
    private double mTemperature;
    private double mHumidity;
    private double mPreciptChance;
    private String mSummary;
    private String mTimeZone;

    public String getFormattedTime(){
        SimpleDateFormat format = new SimpleDateFormat("h:mm a");
        format.setTimeZone(TimeZone.getTimeZone(getTimeZone()));
        return format.format(new Date(getTime() * 1000));
    }

    public String getIcon() {
        return mIcon;
    }

    public int getIconId(){
        Map<String, Integer> map = new HashMap<>();
        map.put("clear-day", R.drawable.clear_day);
        map.put("clear-night", R.drawable.clear_night);
        map.put("rain", R.drawable.rain);
        map.put("snow", R.drawable.snow);
        map.put("sleet", R.drawable.sleet);
        map.put("wind", R.drawable.wind);
        map.put("fog", R.drawable.fog);
        map.put("cloudy", R.drawable.cloudy);
        map.put("partly-cloudy-day", R.drawable.partly_cloudy);
        map.put("partly-cloudy-night", R.drawable.partly_cloudy);

        return map.get(mIcon);
    }

    public void setIcon(String icon) {
        mIcon = icon;
    }

    public long getTime() {
        return mTime;
    }

    public void setTime(long time) {
        mTime = time;
    }

    public int getTemperature() {
        return (int) Math.round(mTemperature);
    }

    public void setTemperature(double temperature) {
        mTemperature = temperature;
    }

    public double getHumidity() {
        return mHumidity;
    }

    public void setHumidity(double humidity) {
        mHumidity = humidity;
    }

    public int getPreciptChance() {
        Double preciptPercentage = mPreciptChance * 100;
        return (int) Math.round(preciptPercentage);
    }

    public void setPreciptChance(double preciptChance) {
        mPreciptChance = preciptChance;
    }

    public String getSummary() {
        return mSummary;
    }

    public void setSummary(String summary) {
        mSummary = summary;
    }

    public String getTimeZone() {
        return mTimeZone;
    }

    public void setTimeZone(String timeZone) {
        mTimeZone = timeZone;
    }
}
