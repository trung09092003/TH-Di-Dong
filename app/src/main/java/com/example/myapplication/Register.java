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
import com.google.firebase.database.FirebaseDatabase;

public class Register extends AppCompatActivity {
    private EditText name05,age05,gmail05,phone05,password05;
    private Button register05;
    private FirebaseAuth mAuth05;
    TextView back_login05;
    ProgressBar progressBar05;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        mAuth05=FirebaseAuth.getInstance();
        name05=findViewById(R.id.title);
        age05=findViewById(R.id.age);
        phone05=findViewById(R.id.phone);
        gmail05=findViewById(R.id.gmail);
        password05=findViewById(R.id.password);
        register05=findViewById(R.id.register);
        back_login05=findViewById(R.id.back_login);
        progressBar05= findViewById(R.id.progressBar);
        back_login05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back=new Intent(Register.this,Login_activity.class);
                startActivity(back);
            }
        });
        register05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email= gmail05.getText().toString().trim();
                String pass= password05.getText().toString().trim();
                String fullname=name05.getText().toString().trim();
                String ages=age05.getText().toString().trim();
                String phones=phone05.getText().toString().trim();

                if (fullname.isEmpty()){
                    name05.setError("Không được để trống");
                    name05.requestFocus();
                    return;
                }
                if (ages.isEmpty()){
                    age05.setError("Không được để trống");
                    age05.requestFocus();
                    return;
                }
                if (phones.isEmpty()){
                    phone05.setError("Không được để trống");
                    phone05.requestFocus();
                    return;
                }
                if (email.isEmpty()){
                    gmail05.setError("Không được để trống");
                    gmail05.requestFocus();
                    return;
                }
                if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                    gmail05.setError("Vui lòng nhập đúng định dạng Email");
                    gmail05.requestFocus();
                    return;
                }
                if (pass.isEmpty()){
                    password05.setError("Không được để trống");
                    password05.requestFocus();
                    return;
                }
                if (pass.length()<6){
                    password05.setError("Mật khẩu phải lớn hơn 6 ký tự!");
                    password05.requestFocus();
                    return;
                }
                progressBar05.setVisibility(View.VISIBLE);
                mAuth05.createUserWithEmailAndPassword(email,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            User user=new User(fullname,ages,phones,email);
                            FirebaseDatabase.getInstance().getReference("Users").child(FirebaseAuth.getInstance().getUid()).setValue(user).addOnCompleteListener(new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(@NonNull Task<Void> task) {
                                    if (task.isSuccessful()){
                                        Toast.makeText(Register.this,"Đăng ký thành công !",Toast.LENGTH_LONG).show();
                                        progressBar05.setVisibility(View.VISIBLE);
                                    }
                                    else {
                                        Toast.makeText(Register.this,"Đăng ký không thành công !",Toast.LENGTH_LONG).show();
                                        progressBar05.setVisibility(View.GONE);
                                    }
                                }
                            });
                        }
                        else {
                           Toast.makeText(Register.this,"Đăng ký không thành công !",Toast.LENGTH_LONG).show();
                           progressBar05.setVisibility(View.GONE);
                        }
                    }
                });
            }
        });
        }
    }