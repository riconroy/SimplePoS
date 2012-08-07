package ca.riffer.pos;

import android.app.Activity;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdminAddProduct extends Activity {

	// this is where we'll store the colour variables
	private TypedArray colourValues;
	int currentColour;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_add_product);

		// we'll need the colours array from the resources
		colourValues = getResources().obtainTypedArray(R.array.colors);
		findViewById(R.id.icon_colour).setOnClickListener(myColourListener);
    }

	/**
	 *  Listeners
	 */

	// this cycles through the colours for each category
	Button.OnClickListener myColourListener = new Button.OnClickListener() {
		@Override
		public void onClick(View v) {
			Button clickOn = (Button) v;

			currentColour++;
			if (currentColour >= colourValues.length())
				currentColour = 0;
			clickOn.setBackgroundColor(colourValues.getColor(currentColour, 0));
		}
	};

}
