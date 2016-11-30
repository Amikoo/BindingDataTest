package com.example.nic.mylib;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.nic.mylib.databinding.LayoutLibBinding;

public class LibActivity extends AppCompatActivity {

  LayoutLibBinding binding;
  ViewModelForLib viewModelForLib;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    binding = DataBindingUtil.setContentView(this, R.layout.layout_lib);
    viewModelForLib = (ViewModelForLib) getIntent().getSerializableExtra("extra");
    binding.setModel(viewModelForLib);
  }
}
