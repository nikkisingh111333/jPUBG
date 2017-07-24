package pro.lukasgorny.dto;

import pro.lukasgorny.enums.PUBGMode;
import pro.lukasgorny.enums.PUBGRegion;
import pro.lukasgorny.enums.PUBGSeason;

/**
 * Created by Łukasz "Husar" Górny on 2017-07-11.
 */
public class FilterCriteria {
    private PUBGMode mode = null;
    private PUBGRegion region = null;
    private PUBGSeason season = null;

    public PUBGMode getMode() {
        return mode;
    }

    public void setMode(PUBGMode mode) {
        this.mode = mode;
    }

    public PUBGRegion getRegion() {
        return region;
    }

    public void setRegion(PUBGRegion region) {
        this.region = region;
    }

    public PUBGSeason getSeason() {
        return season;
    }

    public void setSeason(PUBGSeason season) {
        this.season = season;
    }
}
