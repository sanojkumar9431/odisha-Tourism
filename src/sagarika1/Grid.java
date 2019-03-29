package sagarika1;

import com.example.sagarika1.Balangir;
import com.example.sagarika1.Balasore;
import com.example.sagarika1.Bargarh;
import com.example.sagarika1.Baripada;
import com.example.sagarika1.Berhampur;
import com.example.sagarika1.Bhadrak;
import com.example.sagarika1.Bhawanipatna;
import com.example.sagarika1.Cuttack;
import com.example.sagarika1.Jeypore;
import com.example.sagarika1.Jharsuguda;
import com.example.sagarika1.R;
import com.example.sagarika1.Rayagada;
import com.example.sagarika1.Sambalpur;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

public class Grid extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_grid);
		
		GridView gv=(GridView)findViewById(R.id.gridView1);
		AdapterView adapter=new AdapterView(this);
		gv.setAdapter(adapter);
		
		gv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(android.widget.AdapterView<?> parent,
					View view, int position, long id) {
				// TODO Auto-generated method stub
				if(position==0)
				{
				Intent i=new Intent(Grid.this,Bhubaneswar.class);
				startActivity(i);
			                 }
			          if(position==1)
			{
			Intent i=new Intent(Grid.this,Puri.class);
			startActivity(i);
		                 }
		     if(position==2)
		     {
		    Intent i=new Intent(Grid.this,Cuttack.class);
		    startActivity(i); 
		     }               
		     if(position==3)
				{
				Intent i=new Intent(Grid.this,Rourkela.class);
				startActivity(i);
			    }
		     if(position==4)
		     {
		    Intent i=new Intent(Grid.this,Sambalpur.class);
		    startActivity(i); 
		     }               
		     if(position==5)
				{
				Intent i=new Intent(Grid.this,Berhampur.class);
				startActivity(i);
			    }
	          if(position==6)
				{
				Intent i=new Intent(Grid.this,Balangir.class);
				startActivity(i);
			                 }
			     if(position==7)
			     {
			    Intent i=new Intent(Grid.this,Balasore.class);
			    startActivity(i); 
			     }               
			     if(position==8)
					{
					Intent i=new Intent(Grid.this,Baripada.class);
					startActivity(i);
				    }
			     if(position==9)
			     {
			    Intent i=new Intent(Grid.this,Jeypore.class);
			    startActivity(i); 
			     }               
			     if(position==10)
					{
					Intent i=new Intent(Grid.this,Jharsuguda.class);
					startActivity(i);
				    }
			     if(position==11)
			     {
			    Intent i=new Intent(Grid.this,Bargarh.class);
			    startActivity(i); 
			     }               
			     if(position==12)
					{
					Intent i=new Intent(Grid.this,Bhadrak.class);
					startActivity(i);
				    }
			     if(position==13)
			     {
			    Intent i=new Intent(Grid.this,Bhawanipatna.class);
			    startActivity(i); 
			     }               
			     if(position==14)
					{
					Intent i=new Intent(Grid.this,Rayagada.class);
					startActivity(i);
				    }  
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.grid, menu);
		return true;
	}

}
