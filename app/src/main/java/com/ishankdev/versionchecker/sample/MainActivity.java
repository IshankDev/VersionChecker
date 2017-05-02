package com.ishankdev.versionchecker.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.ishankdev.versionchecker.CheckVersion;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new CheckVersion(this).setOnTaskCompleteListener(new CheckVersion.ITaskComplete() {
            @Override
            public void onTaskComplete(CheckVersion.Result result) {

                //Checks if there is a new version available on Google Play Store.
                result.hasNewVersion();

                //Get the new published version code of the app.
                result.getNewVersionCode();

                //Get the app current version code.
                result.getOldVersionCode();

                //Opens the Google Play Store on your app page to do the update.
                result.openUpdateLink();
            }
        }).execute();

    }
}
