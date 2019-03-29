package sagarika1;

import com.example.sagarika1.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AdapterView extends BaseAdapter {
	String[] cityname={"Bhubaneswar","Puri","Cuttack","Rourkela","Sambalpur","Berahmpur","Balangir",
			           "Balasore","Baripada","Jeypore","Jharsuguda","Bargarh","Bhadrak","Bhawanipatna","Rayagada"};
	int[] cityimage={R.drawable.bbsr,R.drawable.puri,R.drawable.cuttack,R.drawable.rourkela,
		         R.drawable.sambalpur,R.drawable.brahmapur,R.drawable.balangir,R.drawable.balasore,
			          R.drawable.baripada,R.drawable.jeypore,R.drawable.jharsuguda,R.drawable.bargarh,
			          R.drawable.bhadrak,R.drawable.bhavanipatna,R.drawable.rayagada,};
     private Context c;
	public AdapterView(Context ctx){
		this.c=ctx;
	}
	public int getCount() {
		// TODO Auto-generated method 
		return cityname.length;
	}

	@Override
	public Object getItem(int pos) {
		// TODO Auto-generated method stub
		return cityname[pos];
	}

	@Override
	public long getItemId(int pos) {
		// TODO Auto-generated method stub
		return pos;
	}

	@Override
	public View getView(int pos, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		if(convertView==null)
		{
			LayoutInflater inflater=(LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView=inflater.inflate(R.layout.data, null);
		}
		TextView nameTxt=(TextView) convertView.findViewById(R.id.datatextView1);
		ImageView img=(ImageView)convertView.findViewById(R.id.dataimgView1);
		
		nameTxt.setText(cityname[pos]);
		img.setImageResource(cityimage[pos]);
		return convertView;
	}

}
