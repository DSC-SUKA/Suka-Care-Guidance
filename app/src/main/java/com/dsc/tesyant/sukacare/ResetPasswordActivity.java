//package com.dsc.tesyant.sukacare;
//
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
//import com.google.firebase.auth.FirebaseAuth;
//
//import java.util.Objects;
//
//public class ResetPasswordActivity extends AppCompatActivity {
//
//    TextInputLayout inputEmail;
//    Button btnResetPass;
//
//    FirebaseAuth auth;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_reset_password);
//
//        inputEmail = (TextInputLayout) findViewById(R.id.inputText_email);
//        btnResetPass = (Button) findViewById(R.id.btn_resetPass);
//
//        auth = FirebaseAuth.getInstance();
//
//        btnResetPass.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                String email = Objects.requireNonNull(inputEmail.getEditText()).getText().toString().trim();
//
//                if (TextUtils.isEmpty(email)) {
//                    Toast.makeText(getApplicationContext(), "Input Email", Toast.LENGTH_SHORT).show();
//                    return;
//                }
//
//                auth.sendPasswordResetEmail(email)
//                        .addOnCompleteListener(new OnCompleteListener<Void>() {
//                            @Override
//                            public void onComplete(@NonNull Task<Void> task) {
//                                if (task.isSuccessful()) {
//                                    Toast.makeText(ResetPasswordActivity.this, "We have sent you" +
//                                            "instructions to reset your password!", Toast.LENGTH_SHORT).show();
//                                } else {
//                                    Toast.makeText(ResetPasswordActivity.this, "Failed to send reset email!",
//                                            Toast.LENGTH_SHORT).show();
//                                }
//                            }
//                        });
//            }
//        });
//
//    }
//
//
//}
