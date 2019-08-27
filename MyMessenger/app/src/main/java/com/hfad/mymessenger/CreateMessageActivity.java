package com.hfad.mymessenger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    public void onSendMessage(View view) {
//        Intent intent = new Intent(this, ReceiveMessageActivity.class);
//        EditText inputText = (EditText)findViewById(R.id.message);
//        intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE, inputText.getText().toString());
//        startActivity(intent);


        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        EditText inputText = (EditText)findViewById(R.id.message);
        intent.putExtra(Intent.EXTRA_TEXT, inputText.getText().toString());


        Intent chosenIntent = Intent.createChooser(intent, getString(R.string.chooser));
        startActivity(chosenIntent);

    }
}
