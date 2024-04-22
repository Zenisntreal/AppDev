package com.example.androidstudiocollections;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class PassingIntentsExercise extends AppCompatActivity {

    private EditText firstNameEditText, lastNameEditText, birthDateEditText, phoneNumberEditText,
            emailAddressEditText, schoolNameEditText, addressEditText, guardiansNameEditText, graduatedSchoolEditText;
    private RadioGroup genderRadioGroup, relationshipStatusRadioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_intents_exercise);


        firstNameEditText = findViewById(R.id.FirstName);
        lastNameEditText = findViewById(R.id.LastName);
        birthDateEditText = findViewById(R.id.BirthDate);
        phoneNumberEditText = findViewById(R.id.PhoneNumber);
        emailAddressEditText = findViewById(R.id.EmailAddress);
        schoolNameEditText = findViewById(R.id.SchoolName);
        addressEditText = findViewById(R.id.Address);
        guardiansNameEditText = findViewById(R.id.GuardiansName);
        graduatedSchoolEditText = findViewById(R.id.GraduatedSchool);


        genderRadioGroup = findViewById(R.id.rgGender);
        relationshipStatusRadioGroup = findViewById(R.id.rgStatus);


        Button clearButton = findViewById(R.id.btnClear);
        Button submitButton = findViewById(R.id.btnSubmit);

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearForm();
            }
        });

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitForm();
            }
        });
    }

    private void clearForm() {
        firstNameEditText.setText("");
        lastNameEditText.setText("");
        birthDateEditText.setText("");
        phoneNumberEditText.setText("");
        emailAddressEditText.setText("");
        schoolNameEditText.setText("");
        addressEditText.setText("");
        guardiansNameEditText.setText("");
        graduatedSchoolEditText.setText("");
        genderRadioGroup.clearCheck();
        relationshipStatusRadioGroup.clearCheck();
    }

    private void submitForm() {

        String firstName = firstNameEditText.getText().toString();
        String lastName = lastNameEditText.getText().toString();
        String birthDate = birthDateEditText.getText().toString();
        String phoneNumber = phoneNumberEditText.getText().toString();
        String emailAddress = emailAddressEditText.getText().toString();
        String schoolName = schoolNameEditText.getText().toString();
        String address = addressEditText.getText().toString();
        String guardiansName = guardiansNameEditText.getText().toString();
        String graduatedSchool = graduatedSchoolEditText.getText().toString();


        int selectedGenderId = genderRadioGroup.getCheckedRadioButtonId();
        String gender = "";
        if (selectedGenderId != -1) {
            RadioButton selectedGenderRadioButton = findViewById(selectedGenderId);
            gender = selectedGenderRadioButton.getText().toString();
        }

        int selectedRelationshipStatusId = relationshipStatusRadioGroup.getCheckedRadioButtonId();
        String relationshipStatus = "";
        if (selectedRelationshipStatusId != -1) {
            RadioButton selectedRelationshipStatusRadioButton = findViewById(selectedRelationshipStatusId);
            relationshipStatus = selectedRelationshipStatusRadioButton.getText().toString();
        }


        Intent intent = new Intent(this, PassingIntentsExercise2.class);


        intent.putExtra("firstName", firstName);
        intent.putExtra("lastName", lastName);
        intent.putExtra("birthDate", birthDate);
        intent.putExtra("phoneNumber", phoneNumber);
        intent.putExtra("emailAddress", emailAddress);
        intent.putExtra("schoolName", schoolName);
        intent.putExtra("address", address);
        intent.putExtra("guardiansName", guardiansName);
        intent.putExtra("graduatedSchool", graduatedSchool);
        intent.putExtra("gender", gender);
        intent.putExtra("relationshipStatus", relationshipStatus);


        startActivity(intent);
    }



}