package models.empleado;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HobbiesModel {
    private int priority;
    private String description;
    @JsonProperty("hours_per_day")
    private String hoursPerDay;
    private boolean active;

    public int getPriority() {
        return priority;
    }

    public String getDescription() {
        return description;
    }

    public String getHoursPerDay() {
        return hoursPerDay;
    }

    public boolean isActive() {
        return active;
    }
}
