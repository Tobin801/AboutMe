package ctec.aboutme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class CartoonsActivity extends AppCompatActivity
{
    private Button goToScreen3Button;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cartoons);
        goToScreen3Button = (Button) findViewById(R.id.goToScreen3);

        setupListeners();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_cartoons, menu);
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
        goToScreen3Button.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View buttonView)
            {
                Intent changeScreen = new Intent(buttonView.getContext(), GamesActivity.class);
                startActivityForResult(changeScreen, 0);
            }
        });
    }
}
