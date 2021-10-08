package umn.ac.id;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.app.uts_41790.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {


    private ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(binding.etLogin.getText().toString().length() == 0) {
                    binding.etLogin.setError("Harap diisi");
                } else {
                    Intent intent = new Intent(LoginActivity.this, LibraryActivity.class);
                    intent.putExtra("login_name", binding.etLogin.getText().toString());
                    startActivity(intent);

                }
            }
        });
    }
}