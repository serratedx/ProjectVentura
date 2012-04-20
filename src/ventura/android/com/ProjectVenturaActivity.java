package ventura.android.com;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;

public class ProjectVenturaActivity extends Activity {
	
    /** Called when the activity is first created. */
    @Override
    
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        Button myButton = (Button) findViewById(R.id.my_button);
        
        Button mySecondButton = (Button) findViewById(R.id.my_button_two);
        
        setContentView(R.layout.main);                   
    }
}

/** committing a new change to the src */
/** This comment is to show a commit from another PC */
/** One more commit to check the main PC push and Laptop pull */