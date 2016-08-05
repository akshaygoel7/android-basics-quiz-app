package com.example.android.quizroom;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getScore(View view) {
        int marksScored = 0;
        int totalRightAnswer = 0;
        int totalWrongAnswer = 0;

        //Question 1 code verify part
        RadioButton radioButton = (RadioButton) findViewById(R.id.answerOne);
        if (radioButton.isChecked()) {
            ++marksScored;
            ++totalRightAnswer;
        } else {
            ++totalWrongAnswer;
        }

        //Question 2 code verify part
        CheckBox checkBoxOne = (CheckBox) findViewById(R.id.answerTwoOne);
        CheckBox checkBoxTwo = (CheckBox) findViewById(R.id.answerTwoTwo);
        CheckBox checkBoxThree = (CheckBox) findViewById(R.id.answerTwoThree);
        CheckBox checkBoxFour = (CheckBox) findViewById(R.id.answerTwoFour);
        if ((checkBoxOne.isChecked() && checkBoxThree.isChecked()) && (!checkBoxTwo.isChecked() && !checkBoxFour.isChecked()) ) {
            ++marksScored;
            ++totalRightAnswer;
        } else {
            ++totalWrongAnswer;
        }

        //Question 3 code verify part
        EditText editTextOne = (EditText) findViewById(R.id.answerThree);
        String answerThree = editTextOne.getText().toString();
        if (answerThree.equalsIgnoreCase("Nougat")) {
            ++marksScored;
            ++totalRightAnswer;
        } else {
            ++totalWrongAnswer;
        }

        //Question 4 code verify part
        EditText editTextTwo = (EditText) findViewById(R.id.answerFour);
        String answerFour = editTextTwo.getText().toString();
        if (answerFour.equalsIgnoreCase("Quiz room")) {
            ++marksScored;
            ++totalRightAnswer;
        } else {
            ++totalWrongAnswer;
        }

        //Question 5 code verify part
        EditText editTextThree = (EditText) findViewById(R.id.answerFive);
        String answerFive = editTextThree.getText().toString();
        if (answerFive.equalsIgnoreCase("Cupcake")) {
            ++marksScored;
            ++totalRightAnswer;
        } else {
            ++totalWrongAnswer;
        }
        //Toast message display code
        String toastMessage = "Marks Scored : " + marksScored;
        toastMessage += "\nRight answer : " + totalRightAnswer;
        toastMessage += "\nWrong answer : " + totalWrongAnswer;
        Toast toast = Toast.makeText(this, toastMessage, Toast.LENGTH_SHORT);
        toast.show();
    }

}
