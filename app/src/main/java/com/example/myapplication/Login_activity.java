package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class Login_activity extends AppCompatActivity {
    TextView register05;
    Button login05;
    EditText user05,pass05;
    private FirebaseAuth mAuth;
    ProgressBar progressBar05;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_activity);
        register05 = findViewById(R.id.register);
        register05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Login_activity.this, Register.class);
                startActivity(intent);
            }
        });
        login05=findViewById(R.id.login);
        user05=findViewById(R.id.user);
        pass05=findViewById(R.id.password);
        progressBar05=findViewById(R.id.progressBar);
        login05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = user05.getText().toString().trim();
                String password= pass05.getText().toString().trim();
                if(email.isEmpty()){
                    user05.setError("Vui lòng nhập tên đăng nhập");
                    user05.requestFocus();
                    return;
                }
                if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                    user05.setError("Vui lòng nhập đúng định dạng Email");
                    user05.requestFocus();
                    return;
                }
                if(password.isEmpty()){
                    pass05.setError("Vui lòng nhập mật khẩu");
                    pass05.requestFocus();
                    return;
                }
                if(password.length()<6){
                    pass05.setError("Vui lòng nhập mật khẩu nhiều hơn 6 ký tự");
                    pass05.requestFocus();
                    return;
                }
                progressBar05.setVisibility(View.VISIBLE);
                mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                                Intent intent1=new Intent(Login_activity.this,Home.class);
                                startActivities(new Intent[]{intent1});
                        }
                        else {
                            Toast.makeText(Login_activity.this,"Đăng nhập thất bại",Toast.LENGTH_LONG).show();
                        }
                    }
                });
            }
        });
    }
}

