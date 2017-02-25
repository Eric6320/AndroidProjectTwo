package com.example.ejtho.androidprojecttwo;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {

    private int screenheight;
    private int screenwidth;

    //TODO Figure out all this permissions nonsense


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        String[] permissionList = {Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE};
        ActivityCompat.requestPermissions(this, permissionList, constants.cameraPermission);

        DisplayMetrics metrics = this.getResources().getDisplayMetrics();
        screenheight = metrics.heightPixels;
        screenwidth = metrics.widthPixels;

        //TODO make camera onclick thing, put these in there
//        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//        intent.putExtra(MediaStore.EXTRA_OUTPUT, outputFileUri);

    }



    @Override  protected void onActivityResult(int requestCode, int resultCode, Intent data) {

    }

    public void goBackMethod() {
        //TODO finish goBack method
    }

    public void pencilMethod() {

        //TODO finish pencil method
    }

    public void eyeMethod() {
        //TODO finish eye method
    }

    public void linkMethod() {
        //TODO finish link method
    }

    public void settingsMethod() {
        //TODO finish settings method
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.goback_button:
                goBackMethod();
                return true;

            case R.id.pencil_button:
                pencilMethod();
                return true;

            case R.id.eye_button:
                eyeMethod();
                return true;

            case R.id.link_button:
                linkMethod();
                return true;

            case R.id.action_settings:
                Intent myIntent = new Intent(this, SettingsActivity.class);
                startActivity(myIntent);
                break;
            default:
                return super.onOptionsItemSelected(item);

        }
        return true; //TODO not sure if I need to fix this
    }
}
