package apps.coders4togo.hhaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Splash_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);

        Thread thread = new Thread () {
            @Override
            public void run() {
                try {
                    sleep (3000);
                } catch (Exception Ex) {
                    Ex.printStackTrace ();
                } finally {
                    Intent AZE = new Intent (Splash_activity.this, Conn_activity.class);
                    startActivity (AZE);
                }
            }

        };
        thread.start ();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy ();
        finish ();
    }

    @Override
    protected void onPause() {
        super.onPause ();
        finish ();
    }

}