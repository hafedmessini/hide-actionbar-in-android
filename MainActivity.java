package com.mycompany.myapp;

import android.app.*;
import android.os.*;
import android.view.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
		//this will hide action bar

		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.main);
    }
}
