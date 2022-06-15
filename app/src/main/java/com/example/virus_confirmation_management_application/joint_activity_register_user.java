package com.example.virus_confirmation_management_application;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.auth.User;

public class joint_activity_register_user extends AppCompatActivity {

    private View view;
    private FirebaseAuth mFirebaseAuth; //  파베인증
    private DatabaseReference databaseReference; // 실시간 DB
    private EditText re_user_name,re_user_phnum,re_user_email,re_user_pwd;
    private Button re_user_signup;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.joint_activity_register_user);

        mFirebaseAuth = FirebaseAuth.getInstance();
        databaseReference = FirebaseDatabase.getInstance().getReference("final_project");

        re_user_name = findViewById(R.id.register_name);
        re_user_email = findViewById(R.id.register_email);
        re_user_phnum = findViewById(R.id.register_phoneNum);
        re_user_pwd = findViewById(R.id.register_pwd);

        re_user_signup = findViewById(R.id.register_registerButton);
        re_user_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user_name = re_user_name.getText().toString();
                String user_email = re_user_email.getText().toString();
                String user_phoneNum = re_user_phnum.getText().toString();
                String user_pwd = re_user_pwd.getText().toString();

                mFirebaseAuth.createUserWithEmailAndPassword(user_email,user_pwd).addOnCompleteListener(joint_activity_register_user.this, new OnCompleteListener<AuthResult>() {
                    @Override // 회원가입 성공시
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            FirebaseUser firebaseUser = mFirebaseAuth.getCurrentUser();
                            UserAccount userAccount = new UserAccount();
                            userAccount.setName(user_name);
                            userAccount.setEmail(firebaseUser.getEmail());
                            userAccount.setPwd(user_pwd);

                            //setValue : database에 insert
                            databaseReference.child("UserAccount").child(firebaseUser.getUid()).setValue(userAccount);

                            Intent intent = new Intent(joint_activity_register_user.this,joint_login.class);
                            startActivity(intent);



                        }

                    }
                });
            }
        });


    }
}