package ventura.android.com;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

	public class ProjectVenturaActivity extends Activity {
		
	    private TextView textDisplay;
	    private Button jaysButton;
	    private Button codysButton;
	
    /** Called when the activity is first created. */
    
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);      
        
        // capture our View elements
        textDisplay = (TextView) findViewById(R.id.textDisplay);
        jaysButton = (Button) findViewById(R.id.jays_Button);
        codysButton = (Button) findViewById(R.id.codys_Button);

        // add a click listener to the button
        jaysButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textDisplay.setText(R.string.jay_quote);
            }
        });
        
        codysButton.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				textDisplay.setText(R.string.cody_quote);
				
			}
		});

    }

}