package ru.leonidivankin.materialdesignlesson4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class ProgressActivity extends AppCompatActivity {

    private ProgressBar progressBarRound;
    private ProgressBar progressBarLine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);

        progressBarRound = findViewById(R.id.progress_round_activity_progress);
        progressBarLine = findViewById(R.id.progress_line_activity_progress);

        progressBarLine.setMax(100);
        progressBarLine.setProgress(70);
    }

    public void show(View view) {
        progressBarLine.setVisibility(View.VISIBLE);
        progressBarRound.setVisibility(View.VISIBLE);
    }

    public void hide(View view) {
        progressBarLine.setVisibility(View.INVISIBLE);
        progressBarRound.setVisibility(View.INVISIBLE);
    }
}
