package com.hridayesh.connect5game;

import androidx.appcompat.app.AppCompatActivity;
import androidx.gridlayout.widget.GridLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // 0 : yellow, 1 : red, 2 : empty
    int activePlayer = 0;
    int gameState[] = {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2};
    int[][] winningPositions = {{0,1,2,3,4}, {5,6,7,8,9}, {10,11,12,13,14}, {15,16,17,18,19}, {20,21,22,23,24}, {0,5,10,15,20}, {1,6,11,16,21}, {2,7,12,17,22}, {3,8,13,18,23}, {4,9,14,19,24}, {0,6,12,18,24}, {4,8,12,16,20}};
    boolean gameActive = true;

    public void dropIn(View view) {
        ImageView counter = (ImageView) view;
        int tag = Integer.parseInt(counter.getTag().toString());

        if(gameState[tag] == 2 && gameActive) {
            gameState[tag] = activePlayer;
            if (activePlayer == 0) {
                counter.setImageResource(R.drawable.yellow);
                activePlayer = 1;
            } else {
                counter.setImageResource(R.drawable.red);
                activePlayer = 0;
            }

            counter.setTranslationY(-1500);
            counter.animate().translationYBy(1500).rotation(3600).setDuration(300);
        }

        for(int[] winningPosition : winningPositions) {
            if(gameState[winningPosition[0]] == gameState[winningPosition[1]] && gameState[winningPosition[1]] == gameState[winningPosition[2]] && gameState[winningPosition[2]] == gameState[winningPosition[3]] && gameState[winningPosition[3]] == gameState[winningPosition[4]] && gameState[winningPosition[0]] != 2) {
                gameActive = false;
                String winner;

                if(activePlayer == 1)
                    winner = "Yellow";
                else
                    winner = "Red";

                TextView winnerTextView = (TextView) findViewById(R.id.winnerTextView);
                Button playAgainButton = (Button) findViewById(R.id.playAgainButton);

                winnerTextView.setText(winner + " has won!");

                winnerTextView.setVisibility(View.VISIBLE);
                playAgainButton.setVisibility(View.VISIBLE);
            }
        }
    }

    public void playAgain(View view) {
        TextView winnerTextView = (TextView) findViewById(R.id.winnerTextView);
        Button playAgainButton = (Button) findViewById(R.id.playAgainButton);

        winnerTextView.setVisibility(View.INVISIBLE);
        playAgainButton.setVisibility(View.INVISIBLE);

        GridLayout boardGridLayout = (GridLayout) findViewById(R.id.boardGridLayout);
        for(int i = 0; i < boardGridLayout.getChildCount(); i++) {
            ImageView counter = (ImageView) boardGridLayout.getChildAt(i);
            counter.setImageDrawable(null);
        }

        ImageView counter0 = (ImageView) findViewById(R.id.counterImageView0);
        counter0.setImageDrawable(null);

        ImageView counter1 = (ImageView) findViewById(R.id.counterImageView1);
        counter1.setImageDrawable(null);

        ImageView counter2 = (ImageView) findViewById(R.id.counterImageView2);
        counter2.setImageDrawable(null);

        ImageView counter3 = (ImageView) findViewById(R.id.counterImageView3);
        counter3.setImageDrawable(null);

        ImageView counter4 = (ImageView) findViewById(R.id.counterImageView4);
        counter4.setImageDrawable(null);

        ImageView counter5 = (ImageView) findViewById(R.id.counterImageView5);
        counter5.setImageDrawable(null);

        ImageView counter6 = (ImageView) findViewById(R.id.counterImageView6);
        counter6.setImageDrawable(null);

        ImageView counter7 = (ImageView) findViewById(R.id.counterImageView7);
        counter7.setImageDrawable(null);

        ImageView counter8 = (ImageView) findViewById(R.id.counterImageView8);
        counter8.setImageDrawable(null);

        ImageView counter9 = (ImageView) findViewById(R.id.counterImageView9);
        counter9.setImageDrawable(null);

        ImageView counter10 = (ImageView) findViewById(R.id.counterImageView10);
        counter10.setImageDrawable(null);

        ImageView counter11 = (ImageView) findViewById(R.id.counterImageView11);
        counter11.setImageDrawable(null);

        ImageView counter12 = (ImageView) findViewById(R.id.counterImageView12);
        counter12.setImageDrawable(null);

        ImageView counter13 = (ImageView) findViewById(R.id.counterImageView13);
        counter13.setImageDrawable(null);

        ImageView counter14 = (ImageView) findViewById(R.id.counterImageView14);
        counter14.setImageDrawable(null);

        ImageView counter15 = (ImageView) findViewById(R.id.counterImageView15);
        counter15.setImageDrawable(null);

        ImageView counter16 = (ImageView) findViewById(R.id.counterImageView16);
        counter16.setImageDrawable(null);

        ImageView counter17 = (ImageView) findViewById(R.id.counterImageView17);
        counter17.setImageDrawable(null);

        ImageView counter18 = (ImageView) findViewById(R.id.counterImageView18);
        counter18.setImageDrawable(null);

        ImageView counter19 = (ImageView) findViewById(R.id.counterImageView19);
        counter19.setImageDrawable(null);

        ImageView counter20 = (ImageView) findViewById(R.id.counterImageView20);
        counter20.setImageDrawable(null);

        ImageView counter21 = (ImageView) findViewById(R.id.counterImageView21);
        counter21.setImageDrawable(null);

        ImageView counter22 = (ImageView) findViewById(R.id.counterImageView22);
        counter22.setImageDrawable(null);

        ImageView counter23 = (ImageView) findViewById(R.id.counterImageView23);
        counter23.setImageDrawable(null);

        ImageView counter24 = (ImageView) findViewById(R.id.counterImageView24);
        counter24.setImageDrawable(null);

        activePlayer = 0;
        gameActive = true;
        for(int j = 0; j < gameState.length; j++) {
            gameState[j] = 2;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
