package birger.screentester;

import java.text.DecimalFormat;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class ScreenTester extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        
        DecimalFormat two_decimals = new DecimalFormat("0.00");
        
        String text = "";
        text += "Screen width:\n";
        text += "\t" + metrics.widthPixels + " pixels\n";
        text += "\t" + two_decimals.format(metrics.xdpi) + " dpi\n";
        text += "\t" + two_decimals.format(metrics.heightPixels/metrics.ydpi) + " inches\n";
        text += "\t" + two_decimals.format(metrics.heightPixels/metrics.ydpi*25.4) + " mm\n";
        text += "\n";
        
        text += "Screen height:\n";
        text += "\t" + metrics.heightPixels + " pixels\n";
        text += "\t" + two_decimals.format(metrics.ydpi) + " dpi\n";
        text += "\t" + two_decimals.format(metrics.widthPixels/metrics.xdpi) + " inches\n";
        text += "\t" + two_decimals.format(metrics.widthPixels/metrics.xdpi*25.4) + " mm\n";
        
        ((TextView) findViewById(R.id.text_field)).setText(text);
    }
}