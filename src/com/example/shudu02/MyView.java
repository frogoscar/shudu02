package com.example.shudu02;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class MyView extends View{

	public MyView(Context context) {
		// TODO Auto-generated constructor stub
		super(context);
	}

	@SuppressLint("DrawAllocation")
	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		Paint paint = new Paint();
		paint.setARGB(150, 0, 100, 200);
		//paint.setStyle(Paint.Style.STROKE);
		//paint.setStrokeWidth(10);
		paint.setTextSize(100);
		
		canvas.drawText("apple", 50, 200, paint);
		canvas.drawLine(0, 200, 720, 200, paint);
		
		canvas.drawBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher), 100, 400, paint);
		//canvas.drawRect(100, 300, 300, 500, paint);
		//canvas.drawCircle(400, 400, 180, paint);
		super.onDraw(canvas);
	}

}
