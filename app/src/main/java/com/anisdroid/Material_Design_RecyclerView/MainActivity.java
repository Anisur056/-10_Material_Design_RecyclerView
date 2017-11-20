package com.anisdroid.Material_Design_RecyclerView;

import android.app.*;
import android.os.*;
import android.support.v7.widget.*;

public class MainActivity extends Activity 
{
	RecyclerView rcv;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		rcv = (RecyclerView) findViewById(R.id.rcv);
		
		rcv.setLayoutManager(new LinearLayoutManager(this));
		
		String[] name = {"Recycler View","Material Design","Appcompat support","Toolbar","Recycler View","Material Design","Appcompat support","Toolbar","Recycler View","Material Design","Appcompat support","Toolbar"};
		
		rcv.setAdapter(new My_Adapter(name));
		
    }
}
