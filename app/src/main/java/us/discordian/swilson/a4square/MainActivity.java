package us.discordian.swilson.a4square;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void ClickUL(View view) {
        // Do something in response to button click
        // button.setBackgroundResource(colorULlow);
        // v.setBackgroundResource(isButtonClicked ? R.drawable.btn_star_on : R.drawable.btn_star_off);

        Button buttonUL = (Button) findViewById(R.id.buttonUL);

        ColorDrawable buttonULcolor = (ColorDrawable) buttonUL.getBackground();
        int buttonULcolorint = buttonULcolor.getColor() ;
        ColorDrawable colorULbuttonlow = new ColorDrawable (ResourcesCompat.getColor(getResources(), R.color.colorULbuttonlow, null));
        ColorDrawable colorULbuttonhigh = new ColorDrawable (ResourcesCompat.getColor(getResources(), R.color.colorULbuttonhigh, null));
        int colorULbuttonlowint = colorULbuttonlow.getColor() ;
        int colorULbuttonhighint = colorULbuttonhigh.getColor() ;

        if (buttonULcolorint == colorULbuttonlowint) {
            buttonUL.setBackgroundResource(R.color.colorULbuttonhigh);
            Log.d("myTag", "turning color up");
        } else if (buttonULcolorint == colorULbuttonhighint) {
            buttonUL.setBackgroundResource(R.color.colorULbuttonlow);
            Log.d("myTag", "turning color down");
        } else {
            Log.d("myTag", "We should not be here");
            Log.d("myTag", Integer.toString(buttonULcolorint));
            Log.d("myTag", Integer.toString(colorULbuttonlowint));
            Log.d("myTag", Integer.toString(colorULbuttonhighint));
        }


        //buttonUL.setBackgroundResource(R.color.colorULbuttonlow);
    }
    public void ClickUR(View view) {
        // Do something in response to button click
        Button buttonUR = (Button) findViewById(R.id.buttonUR);
        //buttonUR.setBackgroundResource(R.color.colorURbuttonlow);

        ColorDrawable buttonURcolor = (ColorDrawable) buttonUR.getBackground();
        int buttonURcolorint = buttonURcolor.getColor() ;
        ColorDrawable colorURbuttonlow = new ColorDrawable (ResourcesCompat.getColor(getResources(), R.color.colorURbuttonlow, null));
        ColorDrawable colorURbuttonhigh = new ColorDrawable (ResourcesCompat.getColor(getResources(), R.color.colorURbuttonhigh, null));
        int colorURbuttonlowint = colorURbuttonlow.getColor() ;
        int colorURbuttonhighint = colorURbuttonhigh.getColor() ;

        if (buttonURcolorint == colorURbuttonlowint) {
            buttonUR.setBackgroundResource(R.color.colorURbuttonhigh);
            Log.d("myTag", "turning color up");
        } else if (buttonURcolorint == colorURbuttonhighint) {
            buttonUR.setBackgroundResource(R.color.colorURbuttonlow);
            Log.d("myTag", "turning color down");
        } else {
            Log.d("myTag", "We should not be here");
            Log.d("myTag", Integer.toString(buttonURcolorint));
            Log.d("myTag", Integer.toString(colorURbuttonlowint));
            Log.d("myTag", Integer.toString(colorURbuttonhighint));
        }
    }
    public void ClickLL(View view) {
        // Do something in response to button click
        Button buttonLL = (Button) findViewById(R.id.buttonLL);
        //buttonLL.setBackgroundResource(R.color.colorLLbuttonlow);
        ColorDrawable buttonLLcolor = (ColorDrawable) buttonLL.getBackground();
        int buttonLLcolorint = buttonLLcolor.getColor() ;
        ColorDrawable colorLLbuttonlow = new ColorDrawable (ResourcesCompat.getColor(getResources(), R.color.colorLLbuttonlow, null));
        ColorDrawable colorLLbuttonhigh = new ColorDrawable (ResourcesCompat.getColor(getResources(), R.color.colorLLbuttonhigh, null));
        int colorLLbuttonlowint = colorLLbuttonlow.getColor() ;
        int colorLLbuttonhighint = colorLLbuttonhigh.getColor() ;

        if (buttonLLcolorint == colorLLbuttonlowint) {
            buttonLL.setBackgroundResource(R.color.colorLLbuttonhigh);
            Log.d("myTag", "turning color up");
        } else if (buttonLLcolorint == colorLLbuttonhighint) {
            buttonLL.setBackgroundResource(R.color.colorLLbuttonlow);
            Log.d("myTag", "turning color down");
        } else {
            Log.d("myTag", "We should not be here");
            Log.d("myTag", Integer.toString(buttonLLcolorint));
            Log.d("myTag", Integer.toString(colorLLbuttonlowint));
            Log.d("myTag", Integer.toString(colorLLbuttonhighint));
        }
    }
    public void ClickLR(View view) {
        // Do something in response to button click
        Button buttonLR = (Button) findViewById(R.id.buttonLR);
        //buttonLR.setBackgroundResource(R.color.colorLRbuttonlow);
        ColorDrawable buttonLRcolor = (ColorDrawable) buttonLR.getBackground();
        int buttonLRcolorint = buttonLRcolor.getColor() ;
        ColorDrawable colorLRbuttonlow = new ColorDrawable (ResourcesCompat.getColor(getResources(), R.color.colorLRbuttonlow, null));
        ColorDrawable colorLRbuttonhigh = new ColorDrawable (ResourcesCompat.getColor(getResources(), R.color.colorLRbuttonhigh, null));
        int colorLRbuttonlowint = colorLRbuttonlow.getColor() ;
        int colorLRbuttonhighint = colorLRbuttonhigh.getColor() ;

        if (buttonLRcolorint == colorLRbuttonlowint) {
            buttonLR.setBackgroundResource(R.color.colorLRbuttonhigh);
            Log.d("myTag", "turning color up");
        } else if (buttonLRcolorint == colorLRbuttonhighint) {
            buttonLR.setBackgroundResource(R.color.colorLRbuttonlow);
            Log.d("myTag", "turning color down");
        } else {
            Log.d("myTag", "We should not be here");
            Log.d("myTag", Integer.toString(buttonLRcolorint));
            Log.d("myTag", Integer.toString(colorLRbuttonlowint));
            Log.d("myTag", Integer.toString(colorLRbuttonhighint));
        }
    }
}
