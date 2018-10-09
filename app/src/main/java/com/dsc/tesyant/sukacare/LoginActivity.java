//package com.dsc.tesyant.sukacare;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.support.annotation.NonNull;
//import android.support.design.widget.TextInputLayout;
//import android.support.v7.app.AppCompatActivity;
//import android.text.TextUtils;
//import android.view.View;
//import android.widget.Button;
//import android.widget.Toast;
//
//import com.google.android.gms.tasks.OnCompleteListener;
//import com.google.android.gms.tasks.Task;
//import com.google.firebase.auth.AuthResult;
//import com.google.firebase.auth.FirebaseAuth;
//
//import java.util.Objects;
//
//public class LoginActivity extends AppCompatActivity {
//
//    TextInputLayout inputTextNim, inputTextPassword;
//    Button btnLogin, btnForgot, btnRegister;
//
//    private FirebaseAuth firebaseAuth;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_login);
//
//        firebaseAuth = FirebaseAuth.getInstance();
//
//        inputTextNim = (TextInputLayout) findViewById(R.id.inputText_nim);
//        inputTextPassword = (TextInputLayout) findViewById(R.id.inputText_password);
//        btnLogin = (Button) findViewById(R.id.btnLogin);
//        btnForgot = (Button) findViewById(R.id.btn_forgotPassword);
//        btnRegister= (Button) findViewById(R.id.btn_register);
//
//
//        btnForgot.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(LoginActivity.this, ResetPasswordActivity.class);
//                startActivity(intent);
//                finish();
//            }
//        });
//
//        btnRegister.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);
//                startActivity(intent);
//                finish();
//            }
//        });
//
//
//        btnLogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                String email = Objects.requireNonNull(inputTextNim.getEditText()).getText().toString();
//                final String password = Objects.requireNonNull(inputTextPassword.getEditText()).getText().toString();
//
//                if (TextUtils.isEmpty(email)) {
//                    Toast.makeText(getApplicationContext(), "Enter Email", Toast.LENGTH_SHORT).show();
//                    return;
//                }
//                if (TextUtils.isEmpty(password)) {
//                    Toast.makeText(getApplicationContext(), "Enter Password", Toast.LENGTH_SHORT).show();
//                    return;
//                }
//
//                firebaseAuth.signInWithEmailAndPassword(email, password)
//                        .addOnCompleteListener(LoginActivity.this, new OnCompleteListener<AuthResult>() {
//                            @Override
//                            public void onComplete(@NonNull Task<AuthResult> task) {
//                                if (!task.isSuccessful()) {
//                                    if (password.length() < 6) {
//                                        inputTextPassword.setError("Password lebih dari 6 karakter");
//                                    }
//                                    else {
//                                        Toast.makeText(LoginActivity.this, "gagal", Toast.LENGTH_LONG).show();
//                                    }
//                                }
//                                else {
//                                    Intent intent = new Intent(LoginActivity.this, RequestBookActivity.class);
//                                    startActivity(intent);
//                                    finish();
//                                }
//                            }
//                        });
//            }
//        });
//
//    }
//}
