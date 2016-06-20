/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homecoming;

/**
 *
 * @author S522575
 */
public class Participant {
    private String nameOfParticipant;
    private long contactOfParticipant;

    public Participant(String nameOfParticipant, long contactOfParticipant) {
        this.nameOfParticipant = nameOfParticipant;
        this.contactOfParticipant = contactOfParticipant;
    }

    public String getNameOfParticipant() {
        return nameOfParticipant;
    }

    public long getContactOfParticipant() {
        return contactOfParticipant;
    }

    public void setNameOfParticipant(String nameOfParticipant) {
        this.nameOfParticipant = nameOfParticipant;
    }

    public void setContactOfParticipant(long contactOfParticipant) {
        this.contactOfParticipant = contactOfParticipant;
    }

    @Override
    public String toString() {
//        return "Name Of the Participant= " + nameOfParticipant + "" + "Contact Number Of the Participant= " + contactOfParticipant;
        return nameOfParticipant + " * " + contactOfParticipant;

    }
    
    
    
}
