package thememeteam.com.yummycrummyapp5;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;import thememeteam.com.yummycrummyapp5.R;


public class HomeScreen extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        Button addProfileButton;
        addProfileButton = (Button) findViewById(R.id.addProfileButton);
        addProfileButton.setOnClickListener(this);

        Button viewEditProfilesButton;
        viewEditProfilesButton = (Button) findViewById(R.id.viewEditProfilesButton);
        viewEditProfilesButton.setOnClickListener(this);

        Button lookUpRestaurantButton;
        lookUpRestaurantButton = (Button) findViewById(R.id.lookUpRestaurantButton);
        lookUpRestaurantButton.setOnClickListener(this);

        Button userSettingsButton;
        userSettingsButton = (Button) findViewById(R.id.userSettingsButton);
        userSettingsButton.setOnClickListener(this);
    }

    private void addProfileClick()
    {
        startActivity(new Intent("thememeteam.com.yummycrummyapp5.AddProfile"));
    }

    private void viewEditProfileClick()
    {
        startActivity(new Intent("thememeteam.com.yummycrummyapp5.ViewEditProfile"));
    }


    private void lookUpRestaurantClick()
    {
        startActivity(new Intent("thememeteam.com.yummycrummyapp5.LookUpRestaurant"));
    }


    private void userSettingsClick()
    {
        startActivity(new Intent("thememeteam.com.yummycrummyapp5.UserSettings"));
    }

    @Override
    public void onClick(View view)
    {
        switch(view.getId())
        {
            case R.id.addProfileButton:
                addProfileClick();
                break;
            case R.id.viewEditProfilesButton:
                viewEditProfileClick();
                break;
            case R.id.lookUpRestaurantButton:
                lookUpRestaurantClick();
                break;
            case R.id.userSettingsButton:
                userSettingsClick();
                break;
        }
    }

}
