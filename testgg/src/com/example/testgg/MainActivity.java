package com.example.testgg;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener{
	private PopupWindow popupWindow;
	private View view;
	private Button btn;
	private TextView text;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btn=(Button)findViewById(R.id.btn);
		btn.setOnClickListener(this);
		text=(TextView)findViewById(R.id.text);
		text.getPaint().setAntiAlias(true);
//		text.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent newappIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("gdxmallbb://gdx.cnbb?amt=22&order_no=55555555555"));
		startActivity(newappIntent);
	}

	
//	private void showWindow(View v) {
//		LayoutInflater layoutInflater = LayoutInflater.from(this.getParent());
//		view = layoutInflater.inflate(R.layout.dialog_guide, null);
//		// 创建一个PopuWidow对象
//		popupWindow = new PopupWindow(view, LayoutParams.FILL_PARENT,  LayoutParams.FILL_PARENT);
//		popupWindow.showAsDropDown(v);
//	}

//	@Override
//	public void onWindowFocusChanged(boolean hasFocus) {
//		if (hasFocus) {
//			showWindow(btn);
//		}
//	}
}
