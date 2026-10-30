
package com.tennis.model;

import java.util.ArrayList;
import java.util.List;

public class ExhibitionSet {
    private int setNumber;
    private String setName;
    private String setType;
    private String matchStyle;
    private List<Integer> group1PlayerIds = new ArrayList<>();
    private List<Integer> group2PlayerIds = new ArrayList<>();
    private String setStatus;
    private String setWinnerGroup;
    private int group1Score = 0;
    private int group2Score = 0;
    private Integer group1ServingPlayerId;
    private Integer group2ServingPlayerId;

    public int getGroup1Score() { return group1Score; }
    public void setGroup1Score(int group1Score) { this.group1Score = group1Score; }
    public int getGroup2Score() { return group2Score; }
    public void setGroup2Score(int group2Score) { this.group2Score = group2Score; }
    public int getSetNumber() { return setNumber; }
    public void setSetNumber(int setNumber) { this.setNumber = setNumber; }
    public String getSetName() { return setName; }
    public void setSetName(String setName) { this.setName = setName; }
    public String getSetType() { return setType; }
    public void setSetType(String setType) { this.setType = setType; }
    public String getMatchStyle() { return matchStyle; }
    public void setMatchStyle(String matchStyle) { this.matchStyle = matchStyle; }
    public List<Integer> getGroup1PlayerIds() { return group1PlayerIds; }
    public void setGroup1PlayerIds(List<Integer> group1PlayerIds) { this.group1PlayerIds = group1PlayerIds; }
    public List<Integer> getGroup2PlayerIds() { return group2PlayerIds; }
    public void setGroup2PlayerIds(List<Integer> group2PlayerIds) { this.group2PlayerIds = group2PlayerIds; }
    public String getSetStatus() { return setStatus; }
    public void setSetStatus(String setStatus) { this.setStatus = setStatus; }
    public String getSetWinnerGroup() { return setWinnerGroup; }
    public void setSetWinnerGroup(String setWinnerGroup) { this.setWinnerGroup = setWinnerGroup; }
    public Integer getGroup1ServingPlayerId() { return group1ServingPlayerId; }
    public void setGroup1ServingPlayerId(Integer group1ServingPlayerId) { this.group1ServingPlayerId = group1ServingPlayerId; }
    public Integer getGroup2ServingPlayerId() { return group2ServingPlayerId; }
    public void setGroup2ServingPlayerId(Integer group2ServingPlayerId) { this.group2ServingPlayerId = group2ServingPlayerId; }
}
