package umn.ac.id;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.app.uts_41790.R;
import com.app.uts_41790.databinding.ActivityLibraryBinding;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import umn.ac.id.adapter.LibraryAdapter;
import umn.ac.id.model.Library;

public class LibraryActivity extends AppCompatActivity {
    private final List<Library> libraryList = new ArrayList<>();
    private ActivityLibraryBinding binding;
    private LibraryAdapter adapter;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityLibraryBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        if (getIntent() != null) {
            String name = getIntent().getStringExtra("login_name");
            initToolbar(name);
            Toast.makeText(this, "Selamat datang, " + name, Toast.LENGTH_SHORT).show();

        } else {
            Log.d("bundle ", "kosong");
        }

        initAdapter(binding);
        loadData();
    }

    private void initToolbar(String name) {
        setSupportActionBar(binding.toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle(name);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_profile:
                startActivity(new Intent(this, ProfileActivity.class));
                return true;
            case R.id.action_exit:
                Intent intent = new Intent(this, LoginActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                return true;

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mediaPlayer!=null && mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (mediaPlayer!=null && mediaPlayer.isPlaying()) {
            mediaPlayer.pause();
        }
    }

    private void initAdapter(ActivityLibraryBinding binding) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        binding.rvLibrary.setLayoutManager(layoutManager);
        adapter = new LibraryAdapter(this, libraryList, new LibraryAdapter.onItemClickListener() {
            @Override
            public void onPlaySound(Library library, int index) {
                mediaPlayer = library.getMediaPlayer();
                if (!library.isPlay()) {
                    library.setPlay(true);
                    libraryList.set(index, library);
                    mediaPlayer.start();
                    adapter.notifyDataSetChanged();
                } else {
                    library.setPlay(false);
                    libraryList.set(index, library);
                    mediaPlayer.pause();
                    adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onDeleteItem(int index) {
                libraryList.remove(index);
                adapter.notifyDataSetChanged();
            }
        });
        binding.rvLibrary.setAdapter(adapter);
    }

    private void loadData() {
        libraryList.clear();
        Library library = new Library();
        library.setId("1");
        library.setTitle("Bruh");
        library.setSubTitle("Meme");
        library.setSound(R.raw.bruh);
        library.setMediaPlayer(MediaPlayer.create(this, R.raw.bruh));
        library.setPlay(false);
        libraryList.add(library);

        library = new Library();
        library.setId("2");
        library.setTitle("Nico nico mi");
        library.setSubTitle("Anime");
        library.setSound(R.raw.niconiconi);
        library.setMediaPlayer(MediaPlayer.create(this, R.raw.niconiconi));
        library.setPlay(false);
        libraryList.add(library);

        library = new Library();
        library.setId("3");
        library.setTitle("Tuturu");
        library.setSubTitle("Anime");
        library.setSound(R.raw.tuturu_1);
        library.setMediaPlayer(MediaPlayer.create(this, R.raw.tuturu_1));
        library.setPlay(false);
        libraryList.add(library);

        library = new Library();
        library.setId("4");
        library.setTitle("Vine Boom");
        library.setSubTitle("Meme");
        library.setSound(R.raw.vine_boom);
        library.setMediaPlayer(MediaPlayer.create(this, R.raw.vine_boom));
        library.setPlay(false);
        libraryList.add(library);

        library = new Library();
        library.setId("5");
        library.setTitle("Windows XP");
        library.setSubTitle("Meme");
        library.setSound(R.raw.windows_startup);
        library.setMediaPlayer(MediaPlayer.create(this, R.raw.windows_startup));
        library.setPlay(false);
        libraryList.add(library);

        adapter.notifyDataSetChanged();
    }

}