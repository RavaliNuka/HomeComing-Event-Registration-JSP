/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homecoming;

import java.util.ArrayList;

/**
 *
 * @author S522575
 */
public class Event {
    private String userAccountName;
    private String password;
    
    int numberOfParticipants;
    private String groupLeader;
    private long groupLeaderContact;
    
    private ArrayList<Participant> participants;
    
    private String themeName;
    private String themeDescription;

    public Event(String userAccountName, String password, int numberOfParticipants, String groupLeader, long groupLeaderContact, ArrayList<Participant> participants, String themeName, String themeDescription) {
        this.userAccountName = userAccountName;
        this.password = password;
        this.numberOfParticipants = numberOfParticipants;
        this.groupLeader = groupLeader;
        this.groupLeaderContact = groupLeaderContact;
        this.participants = participants;
        this.themeName = themeName;
        this.themeDescription = themeDescription;
    }

    public String getUserAccountName() {
        return userAccountName;
    }

    public String getPassword() {
        return password;
    }

    public int getNumberOfParticipants() {
        return numberOfParticipants;
    }

    public void setNumberOfParticipants(int numberOfParticipants) {
        this.numberOfParticipants = numberOfParticipants;
    }
    
    
    
    public String getGroupLeader() {
        return groupLeader;
    }

    public long getGroupLeaderContact() {
        return groupLeaderContact;
    }

    public ArrayList<Participant> getParticipants() {
        return participants;
    }

    public String getThemeName() {
        return themeName;
    }

    public String getThemeDescription() {
        return themeDescription;
    }

    public void setUserAccountName(String userAccountName) {
        this.userAccountName = userAccountName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setGroupLeader(String groupLeader) {
        this.groupLeader = groupLeader;
    }

    public void setGroupLeaderContact(long groupLeaderContact) {
        this.groupLeaderContact = groupLeaderContact;
    }

    public void setParticipants(ArrayList<Participant> participants) {
        this.participants = participants;
    }

    public void setThemeName(String themeName) {
        this.themeName = themeName;
    }

    public void setThemeDescription(String themeDescription) {
        this.themeDescription = themeDescription;
    }

    @Override
    public String toString() {
        String temp = "";
        for(Participant part : participants){
            temp += part + " * ";
        }       
        temp = temp.substring(0, temp.length()-2);
        return userAccountName + " , " + password + " , " + numberOfParticipants + " , " + groupLeader + " , " + groupLeaderContact + " , " + temp + ", " + themeName + " , " + themeDescription + " ****";
    }
}
