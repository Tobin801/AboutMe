package ctec.aboutme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class GamesActivity extends AppCompatActivity
{
    private Button goToScreen4;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games);
        goToScreen4 = (Button) findViewById(R.id.goToScreen4);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_games, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    private void setupListeners()
    {
        goToScreen4.setOnClickListener(new View.OnClickListener()
        {
           public void onClick(View buttonView)
           {
               Intent changeScreen = new Intent(buttonView.getContext(), FoodActivity.class);
               startActivityForResult(changeScreen, 0);
               finish();
           }
        });
    }
}
