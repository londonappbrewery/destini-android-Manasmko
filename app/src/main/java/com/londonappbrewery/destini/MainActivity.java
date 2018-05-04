package com.londonappbrewery.destini;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
        TextView mStoryTextView;
        Button mtopButton;
        Button mBottomButton;
        int mIndex=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
            mStoryTextView = (TextView) findViewById(R.id.storyTextView);
            mtopButton = (Button) findViewById(R.id.buttonTop);
            mBottomButton = (Button) findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
            mtopButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(mIndex==0) {
                        mStoryTextView.setText(R.string.T3_Story);
                        mtopButton.setText(R.string.T3_Ans1);
                        mBottomButton.setText(R.string.T3_Ans2);
                        mIndex =1;
                    } else if(mIndex==1){
                        mStoryTextView.setText(R.string.T6_End);
                        mtopButton.setVisibility(View.GONE);
                        mBottomButton.setVisibility(View.GONE);
                        mIndex=999;
                    } else if(mIndex==2){
                        mStoryTextView.setText(R.string.T3_Story);
                        mtopButton.setText(R.string.T3_Ans1);
                        mBottomButton.setText(R.string.T3_Ans2);
                    }
                }
            });

            mBottomButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mIndex == 0) {
                        mStoryTextView.setText(R.string.T2_Story);
                        mtopButton.setText(R.string.T2_Ans1);
                        mBottomButton.setText(R.string.T2_Ans2);
                        mIndex=2;
                    } else if(mIndex == 1){
                        mStoryTextView.setText(R.string.T5_End);
                        mtopButton.setVisibility(View.GONE);
                        mBottomButton.setVisibility(View.GONE);
                        mIndex=999;
                    }else if(mIndex==2){
                        mStoryTextView.setText(R.string.T4_End);
                        mtopButton.setVisibility(View.GONE);
                        mBottomButton.setVisibility(View.GONE);
                        mIndex=999;

                    }
                }
            });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:


    }
}
