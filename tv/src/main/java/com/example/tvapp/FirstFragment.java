package com.example.tvapp;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;
import com.example.tvapp.databinding.FragmentFirstBinding;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;
    private ImageView img;
    private ExecutorService executorService;
    private String url = "https://unsplash.com/photos/silhouette-of-trees-near-aurora-borealis-at-night-62V7ntlKgL8";
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }


    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

//        try {
//            Glide.with(this)
//                    .load(url)
//                    .apply(new RequestOptions()
//                            .diskCacheStrategy(DiskCacheStrategy.NONE)
//                            .skipMemoryCache(true)
//                            .override(Target.SIZE_ORIGINAL, Target.SIZE_ORIGINAL))
//                    .into((ImageView) view.findViewById(R.id.imageView));
//        } catch (Exception e) {
//
//        }
//        Glide.with(this).load(url).into(binding.imageView);
        binding.imageView.setImageResource(R.drawable.img_1);

    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}