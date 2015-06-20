package com.example.dmitriy.sunshine;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class SunshineJSONParser {
    public static double getMaxTemperatureForDay(String weatherJsonStr, int dayIndex)
            throws JSONException {
        JSONObject parsedJSONResponse = new JSONObject(weatherJsonStr);
        JSONArray daylist = parsedJSONResponse.getJSONArray("list");
        return daylist.getJSONObject(dayIndex - 1).getJSONObject("temp").getDouble("max");
    }
}
