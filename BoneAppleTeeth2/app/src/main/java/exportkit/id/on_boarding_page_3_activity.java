package exportkit.id;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

public class on_boarding_page_3_activity extends Activity {

	
	private View _bg__on_boarding_page_3_ek2;
	private View rectangle_5_ek5;
	private ImageView no_color_1_ek5;
	private TextView simpan_resep_terlezatmu_;
	private TextView simpan_resep_favoritmu_di_sini;
	private View ellipse_3_ek1;
	private View _ellipse_4_ek1;
	private View _ellipse_5_ek1;
	private View _rectangle_15_ek1;
	private TextView lewati_ek1;
	private ImageView on_board_3_1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.on_boarding_page_3);

		
		_bg__on_boarding_page_3_ek2 = (View) findViewById(R.id._bg__on_boarding_page_3_ek2);
		rectangle_5_ek5 = (View) findViewById(R.id.rectangle_5_ek5);
		no_color_1_ek5 = (ImageView) findViewById(R.id.no_color_1_ek5);
		simpan_resep_terlezatmu_ = (TextView) findViewById(R.id.simpan_resep_terlezatmu_);
		simpan_resep_favoritmu_di_sini = (TextView) findViewById(R.id.simpan_resep_favoritmu_di_sini);
		ellipse_3_ek1 = (View) findViewById(R.id.ellipse_3_ek1);
		_ellipse_4_ek1 = (View) findViewById(R.id._ellipse_4_ek1);
		_ellipse_5_ek1 = (View) findViewById(R.id._ellipse_5_ek1);
		_rectangle_15_ek1 = (View) findViewById(R.id._rectangle_15_ek1);
		lewati_ek1 = (TextView) findViewById(R.id.lewati_ek1);
		on_board_3_1 = (ImageView) findViewById(R.id.on_board_3_1);
	
		
		_ellipse_4_ek1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), on_boarding_page_2_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_ellipse_5_ek1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), on_boarding_page_1_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_rectangle_15_ek1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), homescreen_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	