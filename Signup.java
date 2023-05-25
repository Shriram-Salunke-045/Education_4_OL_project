package com.example.educationapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.FirebaseFirestore;

public class Signup extends AppCompatActivity {
    EditText Name,Email,Uname,Password;
    FirebaseAuth auth;
    FirebaseFirestore database;
    FirebaseDatabase rootNode;
    DatabaseReference reference;
    ProgressDialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        auth = FirebaseAuth.getInstance();
        dialog = new ProgressDialog(this);
        dialog.setMessage("Please Wait, We're creating your new account...");
        Name=(EditText) findViewById(R.id.fname);
        Email=findViewById(R.id.email);
        Uname=findViewById(R.id.uid);
        Password=findViewById(R.id.pass);

    }



    public void signup(View v) {

        dialog.show();

        String email=Email.getText().toString().trim();
        System.out.println(email);
        String password=Password.getText().toString();
        String name=Name.getText().toString().trim();
        String uname=Uname.getText().toString().trim();

        DatabaseReference ref = FirebaseDatabase.getInstance().getReference();
        ref.child("register").child(uname).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {

                } else {
                    rootNode = FirebaseDatabase.getInstance();
                    reference = rootNode.getReference("register");
                    Userhelperclass userhelperclass = new Userhelperclass(name, email, uname, password);
                    reference.child(uname).setValue(userhelperclass);

                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        auth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()) {
                    // String uid = task.getResult().getUser().getUid();
                    dialog.dismiss();

                    FirebaseAuth.getInstance().signOut();
                    finish();
                } else {
                    dialog.dismiss();
                    Toast.makeText(Signup.this, task.getException().getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });




    }


}