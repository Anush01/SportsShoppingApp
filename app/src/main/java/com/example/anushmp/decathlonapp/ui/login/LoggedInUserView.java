package com.example.anushmp.decathlonapp.ui.login;

/**
 * Class exposing authenticated user details to the UI.
 */
class LoggedInUserView {
     String displayName;
    //... other data fields that may be accessible to the UI

    LoggedInUserView(String displayName) {
        this.displayName = displayName;
    }

}