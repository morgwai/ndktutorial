package pl.morgwai.ndktutorial;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		TextView mainText = (TextView) findViewById(R.id.mainText);
		mainText.setText("value from native lib: " + new Native().fun(2));
	}

}
