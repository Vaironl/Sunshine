package com.apps.doza.sunshine;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by vairon on 7/30/15.
 */
public class WeatherDataParser {


    public static double getMaxTempForDay(String JsonStr, int dayIndex) throws JSONException {
        JSONObject object = new JSONObject(JsonStr);
        JSONArray list = object.getJSONArray("list");
        JSONObject day = list.getJSONObject(dayIndex);
        JSONObject temp = day.getJSONObject("temp");
        return temp.getDouble("max");
    }
}
