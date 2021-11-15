package exportkit.id;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

public class on_boarding_page_1_activity extends Activity {

	
	private View _bg__on_boarding_page_1_ek2;
	private View rectangle_5_ek2;
	private ImageView no_color_1_ek2;
	private TextView jelajahi_ratusan_resep_pintar_;
	private TextView kami_memiliki_ratusan_resep_pintar_dari_berbagai_belahan_dunia_;
	private View ellipse_3;
	private View _ellipse_4;
	private View _ellipse_5;
	private View _rectangle_15;
	private TextView lewati;
	private ImageView on_board_1_1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.on_boarding_page_1);

		
		_bg__on_boarding_page_1_ek2 = (View) findViewById(R.id._bg__on_boarding_page_1_ek2);
		rectangle_5_ek2 = (View) findViewById(R.id.rectangle_5_ek2);
		no_color_1_ek2 = (ImageView) findViewById(R.id.no_color_1_ek2);
		jelajahi_ratusan_resep_pintar_ = (TextView) findViewById(R.id.jelajahi_ratusan_resep_pintar_);
		kami_memiliki_ratusan_resep_pintar_dari_berbagai_belahan_dunia_ = (TextView) findViewById(R.id.kami_memiliki_ratusan_resep_pintar_dari_berbagai_belahan_dunia_);
		ellipse_3 = (View) findViewById(R.id.ellipse_3);
		_ellipse_4 = (View) findViewById(R.id._ellipse_4);
		_ellipse_5 = (View) findViewById(R.id._ellipse_5);
		_rectangle_15 = (View) findViewById(R.id._rectangle_15);
		lewati = (TextView) findViewById(R.id.lewati);
		on_board_1_1 = (ImageView) findViewById(R.id.on_board_1_1);
	
		
		_ellipse_4.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), on_boarding_page_2_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_ellipse_5.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), on_boarding_page_3_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_rectangle_15.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), on_boarding_page_2_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	