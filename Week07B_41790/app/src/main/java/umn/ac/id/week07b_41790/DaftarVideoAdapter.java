package umn.ac.id.week07b_41790;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.BreakIterator;
import java.util.LinkedList;

public class DaftarVideoAdapter extends
        RecyclerView.Adapter<DaftarVideoAdapter.ItemVideoViewHolder> {
    private LinkedList<SumberVideo> mDaftarVideo;
    private LayoutInflater mInflater;
    private Context mContext;

    public DaftarVideoAdapter(Context context,
                              LinkedList<SumberVideo> daftarVideo) {
        this.mContext = context;
        this.mDaftarVideo = daftarVideo;
        this.mInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ItemVideoViewHolder onCreateViewHolder(
            @NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.video_item_layout,
                parent, false);
        return new ItemVideoViewHolder(view, this);
    }

    public class ItemVideoViewHolder {
        public BreakIterator tvJudul;
        public BreakIterator tvKeterangan;
        public BreakIterator tvUri;
        public VideoView kotakVideo;
    }
    @Override
    public void onBindViewHolder(@NonNull ItemVideoViewHolder holder,
                                 int position) {
        SumberVideo mSumberVideo = mDaftarVideo.get(position);
        holder.tvJudul.setText(mSumberVideo.getJudul());
        holder.tvKeterangan.setText(mSumberVideo.getKeterangan());
        holder.tvUri.setText(mSumberVideo.getVideoURI());
        holder.kotakVideo.setVideoURI(
                Uri.parse(mSumberVideo.getVideoURI()));
        holder.kotakVideo.seekTo(100);
    }
    @Override
    public int getItemCount() {
        return mDaftarVideo.size();
    }
}
