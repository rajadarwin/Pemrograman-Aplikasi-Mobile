
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		bone_apple_teeth
	 *	@date 		1636906010036
	 *	@title 		Bone Apple Teeth 2
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package exportkit.xd;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

public class on_boarding_page_2_activity extends Activity {

	
	private View _bg__on_boarding_page_2_ek2;
	private View rectangle_5_ek6;
	private ImageView no_color_1_ek6;
	private TextView resep_pintar_mudah_untukmu_;
	private TextView ratusan_resep_pintar_untuk_koki_pemula;
	private View ellipse_3_ek2;
	private View _ellipse_4_ek2;
	private View _ellipse_5_ek2;
	private View _rectangle_15_ek2;
	private TextView lewati_ek2;
	private ImageView on_board_2_1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.on_boarding_page_2);

		
		_bg__on_boarding_page_2_ek2 = (View) findViewById(R.id._bg__on_boarding_page_2_ek2);
		rectangle_5_ek6 = (View) findViewById(R.id.rectangle_5_ek6);
		no_color_1_ek6 = (ImageView) findViewById(R.id.no_color_1_ek6);
		resep_pintar_mudah_untukmu_ = (TextView) findViewById(R.id.resep_pintar_mudah_untukmu_);
		ratusan_resep_pintar_untuk_koki_pemula = (TextView) findViewById(R.id.ratusan_resep_pintar_untuk_koki_pemula);
		ellipse_3_ek2 = (View) findViewById(R.id.ellipse_3_ek2);
		_ellipse_4_ek2 = (View) findViewById(R.id._ellipse_4_ek2);
		_ellipse_5_ek2 = (View) findViewById(R.id._ellipse_5_ek2);
		_rectangle_15_ek2 = (View) findViewById(R.id._rectangle_15_ek2);
		lewati_ek2 = (TextView) findViewById(R.id.lewati_ek2);
		on_board_2_1 = (ImageView) findViewById(R.id.on_board_2_1);
	
		
		_ellipse_4_ek2.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), on_boarding_page_1_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_ellipse_5_ek2.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), on_boarding_page_3_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_rectangle_15_ek2.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), on_boarding_page_3_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	