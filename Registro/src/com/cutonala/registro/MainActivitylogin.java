package com.cutonala.registro;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivitylogin extends ActionBarActivity {

private Button btningresar;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activitylogin);
		
		this.btningresar=(Button)findViewById(R.id.btningresar);
		
	

	}
	
	
	public void btningresarOnclick(View v){
		String usuario =((EditText) findViewById(R.id.usuario)).getText().toString();
		String password =((EditText) findViewById(R.id.password)).getText().toString();		
		if(usuario.equals("root")&& password.equals("moviles")){
			
			Intent envio =new Intent(MainActivitylogin.this,correo.class);
			startActivity (envio);
		}else{
			Toast.makeText(getApplicationContext(), "Usuario o Contraseña Incorrectos", Toast.LENGTH_SHORT).show();
		}
		
	}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activitylogin, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
