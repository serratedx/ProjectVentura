package ventura.android.com;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ProjectVenturaActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("Hello World!");
        setContentView(tv);
    }
}

/** committing a new change to the src */
/** This comment is to show a commit from another PC */
/** One more commit to check the main PC push and Laptop pull */