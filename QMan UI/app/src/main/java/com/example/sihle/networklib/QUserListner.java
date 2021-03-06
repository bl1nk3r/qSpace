package com.example.sihle.networklib;

/**
 * Created by sihle on 9/19/15.
 */
public interface QUserListner {
    public void userRegistered(String string);
    public void qJoined(String string);
    public void qLeft(String string);
    public void updated(String string);
    public void categoriesReady(String string);
    public void allQsReady(String string);

    //Errors
    public void userRegistrationError(String err);
    public void qJoinedError(String err);
    public void qLeftError(String err);
    public void updateError(String err);
    public void categoriesError(String err);
    public void allQError(String err);
}
