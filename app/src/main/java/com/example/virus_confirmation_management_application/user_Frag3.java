package com.example.virus_confirmation_management_application;

import static android.app.Activity.RESULT_OK;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class user_Frag3 extends Fragment {
    private View view;

    private final int GET_GALLERY_IMAGE = 200;
    private ImageView imageview;


    public void onStart() {
        super.onStart();
        //사진 불러오는곳
        imageview = (ImageView)getView().findViewById(R.id.mypageimage);
        imageview.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_PICK);
                intent. setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*");
                startActivityForResult(intent, GET_GALLERY_IMAGE);
            }
        });
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view= inflater.inflate(R.layout.user_mypage_activity, container, false);

        Button checkwirth_button = (Button) view.findViewById(R.id.checkwirth_button);
        checkwirth_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),user_checkwirhlist.class);
                startActivity(intent);
            }
        });

        Button announce_button = (Button) view.findViewById(R.id.announce_button);
        announce_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),user_announce.class);
                startActivity(intent);
            }
        });

        Button mystatereport_button = (Button) view.findViewById(R.id.mystatereport_button);
        mystatereport_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),user_mystatereportlist.class);
                startActivity(intent);
            }
        });
        Button addfamily_button = (Button) view.findViewById(R.id.addfamily_button);
        addfamily_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), user_myfamily.class);
                startActivity(intent);
            }
        });

        Button wishlist_button = (Button) view.findViewById(R.id.wishlist_button);
        wishlist_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), user_wishlista.class);
                startActivity(intent);
            }
        });

        return view;

    }

    //이미지 최신화코드
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {

        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == GET_GALLERY_IMAGE && resultCode == RESULT_OK && data != null && data.getData() != null) {

            Uri selectedImageUri = data.getData();
            imageview.setImageURI(selectedImageUri);

        }

    }

}
