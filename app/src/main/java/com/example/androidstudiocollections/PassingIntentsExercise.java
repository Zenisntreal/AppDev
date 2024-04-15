package com.example.androidstudiocollections;

import androidx.appcompat.app.AppCompatActivity;

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
        // Get values from EditTexts
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
        int selectedRelationshipStatusId = relationshipStatusRadioGroup.getCheckedRadioButtonId();


        String gender = "";
        String relationshipStatus = "";

        // Get selected radio button texts
        if (selectedGenderId != -1) {
            RadioButton selectedGenderRadioButton = findViewById(selectedGenderId);
            gender = selectedGenderRadioButton.getText().toString();
        }

        if (selectedRelationshipStatusId != -1) {
            RadioButton selectedRelationshipStatusRadioButton = findViewById(selectedRelationshipStatusId);
            relationshipStatus = selectedRelationshipStatusRadioButton.getText().toString();
        }

        // Display a toast with the collected information
        String toastMessage = "First Name: " + firstName + "\n" +
                "Last Name: " + lastName + "\n" +
                "Birth Date: " + birthDate + "\n" +
                "Phone Number: " + phoneNumber + "\n" +
                "Email Address: " + emailAddress + "\n" +
                "School Name: " + schoolName + "\n" +
                "Address: " + address + "\n" +
                "Guardian's Name: " + guardiansName + "\n" +
                "Graduated School: " + graduatedSchool + "\n" +
                "Gender: " + gender + "\n" +
                "Relationship Status: " + relationshipStatus;

        Toast.makeText(this, toastMessage, Toast.LENGTH_LONG).show();
    }
}
