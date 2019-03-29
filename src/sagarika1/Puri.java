package sagarika1;

import com.example.sagarika1.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Puri extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_puri);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.puri, menu);
		return true;
	}

}
