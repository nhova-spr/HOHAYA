package apps.coders4togo.hhaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);


        //Utilisation de Handler a la place de Thread

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run()
            {
                Intent AZE = new Intent (Splash_activity.this, StartActivity.class);
                startActivity (AZE);
                finish ();

            }
        },3000);

      /*  Thread thread = new Thread () {
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

       */

    }



}