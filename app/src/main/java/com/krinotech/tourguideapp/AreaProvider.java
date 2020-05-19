package com.krinotech.tourguideapp;

import android.content.res.Resources;

import java.util.ArrayList;
import java.util.List;

public class AreaProvider {
    public static final int NO_PICTURE = -1;

    public static List<Area> getSohoAreas(Resources resources) {
        List<Area> areas = new ArrayList<>();
        areas.add(createArea(
                resources.getString(R.string.balthazar),
                resources.getString(R.string.balthazar_address),
                resources.getString(R.string.balthazar_contact),
                R.mipmap.ic_balthazar_foreground));
        areas.add(createArea(
                resources.getString(R.string.the_dutch),
                resources.getString(R.string.the_dutch_address),
                resources.getString(R.string.the_dutch_contact),
                R.mipmap.ic_dutch_foreground));
        areas.add(createArea(
                resources.getString(R.string.the_dominique_ansel),
                resources.getString(R.string.the_dominique_ansel_address),
                resources.getString(R.string.the_dominique_ansel_contact),
                R.mipmap.ic_dominic_foreground));
        return areas;
    }

    public static List<Area> getChinaTownAreas(Resources resources) {
        List<Area> areas = new ArrayList<>();
        areas.add(createArea(
                resources.getString(R.string.green_village),
                resources.getString(R.string.green_village_address),
                resources.getString(R.string.green_village_contact),
                NO_PICTURE));
        areas.add(createArea(
                resources.getString(R.string.yi),
                resources.getString(R.string.yi_adress),
                resources.getString(R.string.yi_contact),
                NO_PICTURE));
        areas.add(createArea(
                resources.getString(R.string.wah),
                resources.getString(R.string.wah_address),
                resources.getString(R.string.wah_contact),
                NO_PICTURE));
        return areas;
    }

    public static List<Area> getTribecaAreas(Resources resources) {
        List<Area> areas = new ArrayList<>();
        areas.add(createArea(
                resources.getString(R.string.china_blue),
                resources.getString(R.string.china_blue_address),
                resources.getString(R.string.china_blue_contact),
                NO_PICTURE));
        areas.add(createArea(
                resources.getString(R.string.the_greek),
                resources.getString(R.string.the_greek_adress),
                resources.getString(R.string.the_greek_contact),
                NO_PICTURE));
        areas.add(createArea(
                resources.getString(R.string.sushi),
                resources.getString(R.string.sushi_address),
                resources.getString(R.string.sushi_contact),
                NO_PICTURE));
        return areas;
    }

    public static List<Area> getLittleItalyAreas(Resources resources) {
        List<Area> areas = new ArrayList<>();
        areas.add(createArea(
                resources.getString(R.string.le_coucou),
                resources.getString(R.string.le_coucou_address),
                resources.getString(R.string.le_coucou_contract),
                NO_PICTURE));
        areas.add(createArea(
                resources.getString(R.string.emilio_ballato),
                resources.getString(R.string.emilio_ballato_address),
                resources.getString(R.string.emilio_ballato_contact),
                NO_PICTURE));
        areas.add(createArea(
                resources.getString(R.string.parm),
                resources.getString(R.string.parm_address),
                resources.getString(R.string.parm_contact),
                NO_PICTURE));
        return areas;
    }

    private static Area createArea(String name, String address, String contact, int picture) {
        return new Area(name, address, contact, picture);
    }
}
