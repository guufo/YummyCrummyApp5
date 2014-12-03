package thememeteam.com.yummycrummyapp5;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button beginButton;
        beginButton = (Button) findViewById(R.id.beginButton);
        beginButton.setOnClickListener(this);
    }



    private void beginButtonClick()
    {
        startActivity(new Intent("thememeteam.com.yummycrummyapp4.Login_Activity"));
    }

    @Override
    public void onClick(View view)
    {
        switch(view.getId())
        {
            case R.id.beginButton:
                beginButtonClick();
                break;
        }
    }

}
