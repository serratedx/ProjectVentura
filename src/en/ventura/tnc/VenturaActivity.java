package en.ventura.tnc;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class VenturaActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("Hello, Android 50000");
        setContentView(tv);
        
        tv.setText("Hello, Android 100000");
        setContentView(tv);
        
    }
}