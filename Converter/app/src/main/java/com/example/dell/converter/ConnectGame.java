package com.example.dell.converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ConnectGame extends AppCompatActivity {

    int activePlayer = 0; // 0-> yellow turn, 1-> red turn

    int[] gameState = {2, 2, 2, 2, 2, 2, 2, 2, 2};

    int[][] winningPositions = {{0,1,2}, {3,4,5}, {6,7,8}, {0,3,6}, {1,4,7}, {2,5,8}, {0,4,8}, {2,4,6}};

    boolean gameIsActive = true;

    public void dropIn(View v) {
        ImageView counter = (ImageView)v;
        int taggedImage = Integer.parseInt(counter.getTag().toString());
        if (gameState[taggedImage] == 2 && gameIsActive) {
            gameState[taggedImage] = activePlayer;
            counter.setTranslationY(-1000f);
            if (activePlayer == 0) {
                counter.setImageResource(R.drawable.yellow);
                activePlayer = 1;
            } else {
                counter.setImageResource(R.drawable.red);
                activePlayer = 0;
            }
            counter.animate().translationYBy(1000f).rotationBy(3600).setDuration(100);
            for (int[] winningInts : winningPositions) {
                if ((gameState[winningInts[0]] != 2) && (gameState[winningInts[0]] == gameState[winningInts[1]]) && (gameState[winningInts[1]] == gameState[winningInts[2]])) {
                    String winner = (activePlayer == 1)? "Yellow" : "Red";
                    TextView tv = findViewById(R.id.winnerMessage);
                    tv.setText(winner + " has won");
                    LinearLayout linearLayout= findViewById(R.id.playAgainLayout);
                    linearLayout.setVisibility(View.VISIBLE);
                    linearLayout.setAlpha(0.8f);
                    gameIsActive = false;
                } else {

                    boolean gameIsOver = true;
                    for (int counterState : gameState) {
                        if (counterState == 2) {
                            gameIsOver = false;
                            break;
                        }
                    }
                    if (gameIsOver) {
                        gameIsActive = false;
                        TextView winnerMessage = (TextView) findViewById(R.id.winnerMessage);
                        winnerMessage.setText("It's a draw");
                        LinearLayout layout = (LinearLayout)findViewById(R.id.playAgainLayout);
                        layout.setVisibility(View.VISIBLE);
                        layout.setAlpha(0.8f);
                    }
                }
            }
        }
    }

    public void playAgain(View view) {

        gameIsActive = true;

        LinearLayout layout = (LinearLayout)findViewById(R.id.playAgainLayout);
        layout.setVisibility(View.INVISIBLE);

        activePlayer = 0;

        for (int i = 0; i < gameState.length; i++) {
            gameState[i] = 2;
        }

        GridLayout gridLayout = (GridLayout)findViewById(R.id.grid);

        for (int i = 0; i< gridLayout.getChildCount(); i++) {
            ((ImageView) gridLayout.getChildAt(i)).setImageResource(0);
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect_game);
    }
}
