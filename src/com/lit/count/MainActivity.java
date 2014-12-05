package com.lit.count;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {
	private TextView text;
	private TextView jyoutai;
	private ImageView nabeatsu;
	private int number;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		text = (TextView)findViewById(R.id.textView1);
		text.setText("0");
		jyoutai =  (TextView)findViewById(R.id.jyoutai);
		jyoutai.setText("普通だよ");
		
		nabeatsu = (ImageView)findViewById(R.id.nabeatsu);
		nabeatsu.setVisibility(View.INVISIBLE);
	}
		public void updateNumber(){
			text.setText(String.valueOf(number));
			if(number % 3 == 0 && number != 0) {
				jyoutai.setText("３の倍数だよ！");
				nabeatsu.setVisibility(View.VISIBLE);
			}else{
				jyoutai.setText("普通だよ");
				nabeatsu.setVisibility(View.INVISIBLE);
			}
	}
	public void onPlus(View v) {
		number = number + 1;
		updateNumber();
		/*text.setText(String.valueOf(number));
		if(number % 3 == 0 && number != 0) {
			jyoutai.setText("３の倍数だよ！");
			nabeatsu.setVisibility(View.VISIBLE);
			
		}else{
			jyoutai.setText("普通だよ");
			nabeatsu.setVisibility(View.INVISIBLE);*/
	//	}
			}
	public void mainasu(View v) {
		number = number - 1;
		updateNumber();
		/*text.setText(String.valueOf(number));
		if(number % 3 == 0 && number != 0) {
			jyoutai.setText("３の倍数だよ！");
			nabeatsu.setVisibility(View.VISIBLE);
		}else{
			jyoutai.setText("普通だよ");
			nabeatsu.setVisibility(View.INVISIBLE);
		}*/
		}
	public void clear(View v) {
		number = 0;
		text.setText(String.valueOf(number));
		nabeatsu.setVisibility(View.INVISIBLE);
	}

	
		
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
