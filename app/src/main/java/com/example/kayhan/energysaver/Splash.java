 package com.example.kayhan.energysaver;

 import android.os.Bundle;
 import android.support.v7.app.ActionBarActivity;
 import android.view.Menu;
 import android.view.MenuItem;


public class Splash extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }
    public void testApp(){
        int i = 0;

        int kayhan = 0;
        int pushed = 0;

        //asdadssa
        // test push from kayhan
        // git push from Rahim
        //test 4 from kayhan to check that rahim's merge working fine
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_splash, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
