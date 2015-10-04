package com.jmc.demoencuestas;

//import com.jmc.demoencuestas.SegmentedButton.OnClickListenerSegmentedButton;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity
{
	
	Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button10;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Spinner dropdown = (Spinner) findViewById(R.id.spinner1);
		String[] items = new String[]{"uno", "dos", "tres", "cuatro", "cinco", "seis", "siete"};
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,
		        items);
		dropdown.setAdapter(adapter);
		
		Spinner dropdown1 = (Spinner) findViewById(R.id.spinner2);
		String[] items1 = new String[]{"1", "2", "3", "4", "5", "6", "7"};
		ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,
		        items1);
		dropdown1.setAdapter(adapter1);
		
		button1 = (Button) findViewById(R.id.button1);
		button1.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				// TODO Auto-generated method stub
				button1.setBackgroundResource(R.drawable.btn_x);
				button2.setBackgroundResource(R.drawable.btn_default);
			}
		});
		button2 = (Button) findViewById(R.id.button2);
		button2.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				// TODO Auto-generated method stub
				button2.setBackgroundResource(R.drawable.btn_x);
				button1.setBackgroundResource(R.drawable.btn_default);
			}
		});
		
		button3 = (Button) findViewById(R.id.button3);
		button3.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				// TODO Auto-generated method stub
				button3.setBackgroundResource(R.drawable.btn_x);
				button4.setBackgroundResource(R.drawable.btn_default);
			}
		});
		button4 = (Button) findViewById(R.id.button4);
		button4.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				// TODO Auto-generated method stub
				button4.setBackgroundResource(R.drawable.btn_x);
				button3.setBackgroundResource(R.drawable.btn_default);
			}
		});
		button5 = (Button) findViewById(R.id.button5);
		button5.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				// TODO Auto-generated method stub
				button5.setBackgroundResource(R.drawable.btn_x);
				button6.setBackgroundResource(R.drawable.btn_default);
			}
		});
		button6 = (Button) findViewById(R.id.button6);
		button6.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				// TODO Auto-generated method stub
				button6.setBackgroundResource(R.drawable.btn_x);
				button5.setBackgroundResource(R.drawable.btn_default);
			}
		});
		
		button7 = (Button) findViewById(R.id.button7);
		button7.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				// TODO Auto-generated method stub
				button7.setBackgroundResource(R.drawable.btn_x);
				button8.setBackgroundResource(R.drawable.btn_default);
				button9.setBackgroundResource(R.drawable.btn_default);
				button10.setBackgroundResource(R.drawable.btn_default);
			}
		});
		button8 = (Button) findViewById(R.id.button8);
		button8.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				// TODO Auto-generated method stub
				button8.setBackgroundResource(R.drawable.btn_x);
				button7.setBackgroundResource(R.drawable.btn_default);
				button9.setBackgroundResource(R.drawable.btn_default);
				button10.setBackgroundResource(R.drawable.btn_default);
			}
		});
		button9 = (Button) findViewById(R.id.button9);
		button9.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				// TODO Auto-generated method stub
				button9.setBackgroundResource(R.drawable.btn_x);
				button8.setBackgroundResource(R.drawable.btn_default);
				button7.setBackgroundResource(R.drawable.btn_default);
				button10.setBackgroundResource(R.drawable.btn_default);
			}
		});
		button10 = (Button) findViewById(R.id.button10);
		button10.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				// TODO Auto-generated method stub
				button10.setBackgroundResource(R.drawable.btn_x);
				button8.setBackgroundResource(R.drawable.btn_default);
				button9.setBackgroundResource(R.drawable.btn_default);
				button7.setBackgroundResource(R.drawable.btn_default);
			}
		});
		
	}
	
	public void BtnSiguiente(View v)
	{
		startActivity(new Intent(this, Pantalla1.class));
		finish();
	}
}
