package com.example.random;

import java.util.Random;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View.OnClickListener;


public class MainActivity extends Activity {
	private EditText txt;
	private Button check;
	String userTxt;
	int userNumber=0;
	int random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //user text
         txt =(EditText) findViewById(R.id.gess);
        //button to check the user text
        check=(Button) findViewById(R.id.check);
        
       
        
      // final int userNumber=Integer.parseInt(userText);
        //generate random number
        random = (int) (Math.random() * (1000 - 0)) + 0;
        
        check.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				//randomFunction(userNumber);
				 userTxt=txt.getText().toString();
				 userNumber=Integer.parseInt(userTxt);
				 check.setText("Check");
				{
				 if( userNumber<1001){
				 
				randomFunction(userNumber);
				 }
				 else{
					 Toast.makeText(getApplicationContext(), "your text is invalid", Toast.LENGTH_LONG).show();
				 }
				 }
				//Toast.makeText(getApplicationContext(), userTxt, Toast.LENGTH_LONG).show();
				
			}
		});
        
        
        }
    public void randomFunction(int userGess){
    	
    	 
    	//
    	String r=""+random;
    	//Toast.makeText(getApplicationContext(), "The Random number is"+r, Toast.LENGTH_LONG).show();
    	 //generate random number function
    	
    	//if true
    	if(random==userGess){
    		Toast.makeText(getApplicationContext(), "Your Gess True", Toast.LENGTH_LONG).show();
    		Toast.makeText(getApplicationContext(), "The Random number is"+r, Toast.LENGTH_LONG).show();
    		check.setText("Try Againe");
    		
    		random = (int) (Math.random() * (1000 - 0)) + 0;
    		
    		
    		
    	}
    	//if in range
    	
    	else if((random-5) <= userGess && (random+5) >= userGess){
    		
    		Toast.makeText(getApplicationContext(), "The Random number is"+r, Toast.LENGTH_LONG).show();
    		Toast.makeText(getApplicationContext(), "Your Gess very close", Toast.LENGTH_LONG).show();
    		
    		
    	}
    	//if small
    	
    	else if((userGess) < random){
    		
    		Toast.makeText(getApplicationContext(), "The Random number is"+r, Toast.LENGTH_LONG).show();
    		Toast.makeText(getApplicationContext(), "Your Gess smaller", Toast.LENGTH_LONG).show();
    		
    	}
    	//if greate
    	
    	else{
    		Toast.makeText(getApplicationContext(), "The Random number is"+r, Toast.LENGTH_LONG).show();
    		Toast.makeText(getApplicationContext(), "Your Gess grater", Toast.LENGTH_LONG).show();
    		
    	}
    	
    	
    	
    	      
    	   
    	
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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
