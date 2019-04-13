package com.example.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity
{
    public String computerChoice;
    public String playerChoice;
    public String player1;
    public String player2;
    public String theWinner;
    public String symbols;
    public int i;
    public String password;
    public String randomize;
    public String answer;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.computerChoice = "";
        this.playerChoice = "";
        this.player1 = "Player 1";
        this.player2 = "Player 2";
        this.theWinner = "";
        this.symbols = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*";
        this.password = "";
        this.randomize = "";
        this.answer = "";

    }

    public void player2Random()
    {
        Random rand = new Random();
        int n = rand.nextInt(3) + 1;
        if(n == 1)
        {
            this.computerChoice = "Rock";
            System.out.println("***** Rock");
        }
        else if(n == 2)
        {
            this.computerChoice = "Paper";
            System.out.println("***** Paper");
        }
        else if(n == 3)
        {
            this.computerChoice = "Scissor";
            System.out.println("***** Scissors");
        }

    }

    public void rockPaperScissors() {
        if(this.playerChoice == "Rock")
        {
            if(this.computerChoice == "Rock")
            {
                this.theWinner = "Draw";
            }
            else if(this.computerChoice == "Paper")
            {
                this.theWinner = "Player 2";
            }
            else if(this.computerChoice == "Scissor")
            {
                this.theWinner = "Player 1";
            }
            System.out.println("***** 1");
        }
        else if(this.playerChoice == "Paper")
        {
            if(this.computerChoice == "Paper")
            {
                this.theWinner = "Draw";
            }
            else if(this.computerChoice == "Scissor")
            {
                this.theWinner = "Player 2";
            }
            else if(this.computerChoice == "Rock")
            {
                this.theWinner = "Player 1";
            }
            System.out.println("***** 2");
        }
        else if(this.playerChoice == "Scissor")
        {
            if(this.computerChoice == "Scissor")
            {
                this.theWinner = "Draw";
            }
            else if(this.computerChoice == "Rock")
            {
                this.theWinner = "Player 2";
            }
            else if(this.computerChoice == "Paper")
            {
                this.theWinner = "Player 1";
            }
            System.out.println("***** 3");
        }
    }

    public void onRockPressed(View v)
    {
        this.playerChoice = "Rock";
        player2Random();
        rockPaperScissors();
        System.out.println("****** Rock Button Pressed");
        TextView winner = (TextView)findViewById(R.id.winnerTV);
        winner.setText(this.theWinner);
        //this.theWinner = "";
}

    public void onPaperPressed(View v)
    {
        this.playerChoice = "Paper";
        player2Random();
        rockPaperScissors();
        System.out.println("***** Paper Button Pressed");
        TextView winner = (TextView)findViewById(R.id.winnerTV);
        winner.setText(this.theWinner);
        //this.theWinner = "";
    }

    public void onScissorPressed(View v)
    {
        this.playerChoice = "Scissor";
        player2Random();
        rockPaperScissors();
        System.out.println("****** Scissor Button Pressed");
        TextView winner = (TextView)findViewById(R.id.winnerTV);
        winner.setText(this.theWinner);
        //this.theWinner = "";
    }
    public void onSwitchPressed(View v)
    {
        Intent i = new Intent(this, Apps.class);
        this.startActivity(i);
    }
    public void onRandomPasswordPressed(View v)
    {

        EditText input1 = (EditText)findViewById(R.id.input1ET);
        this.randomize = input1.getText().toString();
        int r = Integer.parseInt(this.randomize);

        for(i = 0;i < r; i++)
        {
            Random rand2 = new Random();
            int s = rand2.nextInt(59);
            this.password = this.password + symbols.charAt(s);
        }
        System.out.println("Your Random Password is" + this.password);
        System.out.println("");
        TextView output = (TextView)findViewById(R.id.outputTV);
        output.setText(this.password);
        this.password = "";

    }
    public void on8BallPressed(View v)
    {
        Random yesOrNo = new Random();
        int x = yesOrNo.nextInt(10) + 1;

        if(x == 1)
        {
            this.answer = "Inconceivable!";
            TextView output = (TextView)findViewById(R.id.outputTV);
            output.setText(this.answer);
        }
        else if(x == 2)
        {
            this.answer = "Not Likely!";
            TextView output = (TextView)findViewById(R.id.outputTV);
            output.setText(this.answer);
        }
        else if(x == 3)
        {
            this.answer = "Would not bet on it!";
            TextView output = (TextView)findViewById(R.id.outputTV);
            output.setText(this.answer);
        }
        else if(x == 4)
        {
            this.answer = "Its possible...";
            TextView output = (TextView)findViewById(R.id.outputTV);
            output.setText(this.answer);
        }
        else if(x == 5)
        {
            this.answer = "Its likely";
            TextView output = (TextView)findViewById(R.id.outputTV);
            output.setText(this.answer);
        }
        else if(x == 6)
        {
            this.answer = "Maybe!";
            TextView output = (TextView)findViewById(R.id.outputTV);
            output.setText(this.answer);
        }
        else if(x == 7)
        {
            this.answer = "Chances are high!";
            TextView output = (TextView)findViewById(R.id.outputTV);
            output.setText(this.answer);
        }
        else if(x == 8)
        {
            this.answer = "Probably not";
            TextView output = (TextView)findViewById(R.id.outputTV);
            output.setText(this.answer);
        }
        else if(x == 9)
        {
            this.answer = "Go for it!";
            TextView output = (TextView)findViewById(R.id.outputTV);
            output.setText(this.answer);
        }
        else if(x == 10)
        {
            this.answer = "Its gonna happen!";
            TextView output = (TextView)findViewById(R.id.outputTV);
            output.setText(this.answer);
        }
    }

}
