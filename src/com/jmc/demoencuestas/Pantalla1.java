package com.jmc.demoencuestas;



import android.app.Activity;
import android.content.Intent;
import android.media.ExifInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

public class Pantalla1 extends Activity
{
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pantalla1);
	}
	
	public void BtnOK(View v) {
		startActivity(new Intent(this, Pantalla2.class));
		finish();
	}
	
	public void btnError(View v) {
		startActivity(new Intent(this, Pantalla2.class));
		finish();
	}
	
	public void onBackPressed()
	{
		
	}
	
	@Override
	public void onWindowFocusChanged(boolean hasFocus)
	{
		super.onWindowFocusChanged(hasFocus);
		// if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
		if (Build.VERSION.SDK_INT >= 19)
		{
			if (hasFocus)
			{
				getWindow().getDecorView().setSystemUiVisibility(
				        View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
				                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
				                | View.SYSTEM_UI_FLAG_FULLSCREEN | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
			}
		}
	}
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event)
	{
		if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0)
		{
			// Esto es lo que hace mi botï¿½n al pulsar ir a atrï¿½s
			
			startActivity(new Intent(this, MainActivity.class));
			finish();
			
			return true;
		}
		else if (keyCode == KeyEvent.KEYCODE_HOME && event.getRepeatCount() == 0)
		{
			
		
			return true;
		}
		return super.onKeyDown(keyCode, event);
	}
}
