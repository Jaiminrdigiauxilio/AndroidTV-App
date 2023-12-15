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

//        executorService = Executors.newSingleThreadExecutor();
//        FutureTask<Bitmap>  futureTask = new FutureTask<>(()->downloadImg(url));
//        executorService.submit(futureTask);
//
//        try {
//            Bitmap taskResult = futureTask.get();
//            if(taskResult != null) {
//                img.setImageBitmap(taskResult);
//
//            } else {
//                System.out.println("err");
////                Snackbar.make(view, "errrorrrrr", Snackbar.LENGTH_SHORT).show();
////                img.setImageResource(androidx.transition.R.drawable.abc_text_select_handle_left_mtrl_dark);
//
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
////            Toast.makeText(getContext(), "error: "+e.getStackTrace(), Toast.LENGTH_SHORT).show();
//        } finally {
//            executorService.shutdown();
//        }
    }


//    private Bitmap downloadImg(String imgUrl) {
//        try {
//            URL url = new URL(imgUrl);
//            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//            connection.setDoInput(true);
//            InputStream input = connection.getInputStream();
//            return BitmapFactory.decodeStream(input);
//
//        } catch (Exception e) {
//            e.printStackTrace();
////            Toast.makeText(getContext(), "error in downloading: "+e.getStackTrace(), Toast.LENGTH_SHORT).show();
//            return null;
//        }
//    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}