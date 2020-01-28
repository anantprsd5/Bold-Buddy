package com.social.boldbuddy.Firebase_Notification;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;

import com.social.boldbuddy.SimpleClasses.Variables;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by AQEEL on 5/22/2018.
 */

public class Notification_Receive extends FirebaseMessagingService {


    SharedPreferences sharedPreferences;

    @SuppressLint("WrongThread")
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {

        }


        // this will store the user firebase token in local storage
    @Override
    public void onNewToken(String s) {
        super.onNewToken(s);
        sharedPreferences=getSharedPreferences(Variables.pref_name,MODE_PRIVATE);

        if(s==null){

        }else if(s.equals("null")){

        }
        else if(s.equals("")){

        }
        else if(s.length()<6){

        }
        else {
            sharedPreferences.edit().putString(Variables.device_token, s).commit();
        }

    }



}
