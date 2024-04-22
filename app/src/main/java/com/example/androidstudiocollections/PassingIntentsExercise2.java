package com.example.androidstudiocollections;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PassingIntentsExercise2 extends AppCompatActivity {

    Button btnReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_intents_exercise2);

        btnReturn = (Button) findViewById(R.id.btnReturn);

        Intent intent = getIntent();

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(PassingIntentsExercise2.this, PassingIntentsExercise.class);
                startActivity(intent1);
            }
        });

        String firstName = intent.getStringExtra("firstName");
        String lastName = intent.getStringExtra("lastName");
        String birthDate = intent.getStringExtra("birthDate");
        String phoneNumber = intent.getStringExtra("phoneNumber");
        String emailAddress = intent.getStringExtra("emailAddress");
        String schoolName = intent.getStringExtra("schoolName");
        String address = intent.getStringExtra("address");
        String guardiansName = intent.getStringExtra("guardiansName");
        String graduatedSchool = intent.getStringExtra("graduatedSchool");
        String gender = intent.getStringExtra("gender");
        String relationshipStatus = intent.getStringExtra("relationshipStatus");

        TextView textFirstName = findViewById(R.id.textFirstName);
        textFirstName.setText("First Name: ");

        TextView FN = findViewById(R.id.txtviewFN);
        FN.setText(firstName);

        TextView textLastName = findViewById(R.id.textLastName);
        textLastName.setText("Last Name: ");

        TextView LN = findViewById(R.id.txtViewLN);
        LN.setText(lastName);

        TextView textBirthDate = findViewById(R.id.textBirthDate);
        textBirthDate.setText("Birth Date: ");

        TextView BD = findViewById(R.id.txtviewBD);
        BD.setText(birthDate);

        TextView textPhoneNumber = findViewById(R.id.textPhoneNumber);
        textPhoneNumber.setText("Phone Number: ");

        TextView PN = findViewById(R.id.txtviewPN);
        PN.setText(phoneNumber);

        TextView textEmailAddress = findViewById(R.id.textEmailAddress);
        textEmailAddress.setText("Email Address: ");

        TextView EA = findViewById(R.id.txtviewEA);
        EA.setText(emailAddress);

        TextView textSchoolName = findViewById(R.id.textSchoolName);
        textSchoolName.setText("School Name: ");

        TextView SN = findViewById(R.id.txtviewSN);
        SN.setText(schoolName);

        TextView textAddress = findViewById(R.id.textAddress);
        textAddress.setText("Address: ");

        TextView AD = findViewById(R.id.txtviewAD);
        AD.setText(address);

        TextView textGuardiansName = findViewById(R.id.textGuardiansName);
        textGuardiansName.setText("Guardian's Name: ");

        TextView GN = findViewById(R.id.txtviewGN);
        GN.setText(guardiansName);

        TextView textGraduatedSchool = findViewById(R.id.textGraduatedSchool);
        textGraduatedSchool.setText("Graduated School: ");

        TextView GS = findViewById(R.id.txtviewGS);
        GS.setText(graduatedSchool);

        TextView textGender = findViewById(R.id.textGender);
        textGender.setText("Gender: ");

        TextView G = findViewById(R.id.txtviewG);
        G.setText(gender);

        TextView textRelationshipStatus = findViewById(R.id.textRelationshipStatus);
        textRelationshipStatus.setText("Relationship Status: ");

        TextView RS = findViewById(R.id.txtviewRS);
        RS.setText(relationshipStatus);
    }
}