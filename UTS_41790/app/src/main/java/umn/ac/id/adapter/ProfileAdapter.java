package umn.ac.id.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.app.uts_41790.databinding.ReferensiItemBinding;

import java.util.List;

public class ProfileAdapter extends RecyclerView.Adapter<ProfileAdapter.ProfileViewHolder> {

    private final Context context;
    private final List<String>  referensiList;

    public ProfileAdapter(Context context, List<String> referensiList) {
        this.context = context;
        this.referensiList = referensiList;
    }

    @NonNull
    @Override
    public ProfileViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ReferensiItemBinding binding = ReferensiItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ProfileAdapter.ProfileViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ProfileViewHolder holder, int position) {
        holder.binding.tvReverensi.setText(referensiList.get(position));
    }

    @Override
    public int getItemCount() {
        return referensiList.size();
    }

    public static class ProfileViewHolder extends RecyclerView.ViewHolder {
        ReferensiItemBinding binding;

        public ProfileViewHolder(ReferensiItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
