package ca.riffer.pos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.activity_main, menu);
//        return true;
//    }
    
    public void goAdmin(View v) {
		Intent myIntent = new Intent(MainActivity.this, AdminFront.class);
		
		// myIntent.putExtra("buttonCount", buttonCount);
		startActivityForResult(myIntent, 0);
    }
}
