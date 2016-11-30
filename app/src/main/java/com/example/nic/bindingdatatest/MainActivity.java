package com.example.nic.bindingdatatest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.nic.mylib.LibActivity;
import com.example.nic.mylib.ViewModelForLib;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.layout_main);
    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);
  }

  public void goToLibActivity(View view) {
    ViewModelForLib viewModelForLib = new ViewModelForLib();
    long currentTime = System.currentTimeMillis();

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
    viewModelForLib.currentDate = sdf.format(new Date(currentTime));

    sdf = new SimpleDateFormat("HH:mm:ss", Locale.US);
    viewModelForLib.currentTime = sdf.format(new Date(currentTime));

    Intent intent = new Intent(this, LibActivity.class);
    intent.putExtra("extra", viewModelForLib);
    startActivity(intent);
  }
}
