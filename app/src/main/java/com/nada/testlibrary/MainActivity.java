package com.nada.testlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.nada.toastlibrary.ToastLib;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ToastLib.showTestLib(getApplicationContext(), "Nada");
    }
}