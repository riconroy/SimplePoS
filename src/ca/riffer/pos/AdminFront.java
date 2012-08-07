package ca.riffer.pos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AdminFront extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_front);
    }
    
    public void goAddProduct(View v) {
		Intent myIntent = new Intent(AdminFront.this, AdminAddProduct.class);
		
		// myIntent.putExtra("buttonCount", buttonCount);
		startActivityForResult(myIntent, 0);
    }

}
