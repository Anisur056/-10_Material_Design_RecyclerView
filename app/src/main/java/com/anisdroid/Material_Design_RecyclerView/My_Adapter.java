package com.anisdroid.Material_Design_RecyclerView;
import android.support.v7.widget.*;
import android.view.*;
import android.widget.*;

public class My_Adapter extends RecyclerView.Adapter<My_Adapter.My_ViewHolder>
{
	private String[] data;
	
	public My_Adapter(String[] data){
		this.data = data;
	}

	@Override
	public My_Adapter.My_ViewHolder onCreateViewHolder(ViewGroup p1, int p2)
	{
		LayoutInflater li = LayoutInflater.from(p1.getContext());
		View v = li.inflate(R.layout.my_list,p1,false);
		
		// TODO: Implement this method
		return new My_ViewHolder(v);
	}

	@Override
	public void onBindViewHolder(My_Adapter.My_ViewHolder p1, int p2)
	{
		// TODO: Implement this method
		String title = data[p2];
		p1.ttt.setText(title);
		
	}

	@Override
	public int getItemCount()
	{
		// TODO: Implement this method
		return data.length;
	}
	
	
	public class My_ViewHolder extends RecyclerView.ViewHolder{
		
		ImageView iii;
		TextView ttt;
		
		public My_ViewHolder (View v){
			super(v);
			
			iii = (ImageView) v.findViewById(R.id.img);
			ttt = (TextView) v.findViewById(R.id.title);
		}
		
	}
	
}
