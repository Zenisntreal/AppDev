package com.example.androidstudiocollections;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class Match3 extends AppCompatActivity {

    private static final int GRID_SIZE = 5;
    private static final int MATCH_THRESHOLD = 3;
    private static final int SCORE_PER_MATCH = 1;

    private GridView gridView;
    private Button restartButton;
    private int[][] grid;
    private int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match3);

        gridView = findViewById(R.id.grid_view);
        restartButton = findViewById(R.id.restart_button);

        initializeGrid();
        updateGridAdapter();

        restartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restartGame();
            }
        });

        gridView.setOnItemClickListener((parent, view, position, id) -> {
            int row = position / GRID_SIZE;
            int col = position % GRID_SIZE;
            swapTiles(row, col);
            checkMatches();
            updateGridAdapter();
        });
    }

    private void initializeGrid() {
        grid = new int[GRID_SIZE][GRID_SIZE];
        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                grid[i][j] = generateRandomTile();
            }
        }
        score = 0;
    }

    private int generateRandomTile() {
        Random rand = new Random();
        return rand.nextInt(4) + 1;
    }

    private void swapTiles(int row, int col) {

        if (row + 1 < GRID_SIZE) {
            int temp = grid[row][col];
            grid[row][col] = grid[row + 1][col];
            grid[row + 1][col] = temp;
        }
        if (col + 1 < GRID_SIZE) {
            int temp = grid[row][col];
            grid[row][col] = grid[row][col + 1];
            grid[row][col + 1] = temp;
        }
    }

    private void checkMatches() {

        for (int i = 0; i < GRID_SIZE; i++) {
            int count = 1;
            for (int j = 1; j < GRID_SIZE; j++) {
                if (grid[i][j] == grid[i][j - 1]) {
                    count++;
                    if (count == MATCH_THRESHOLD) {
                        replaceTiles(i, j - 2, i, j);
                        score += SCORE_PER_MATCH;
                        checkMatches();
                    }
                } else {
                    count = 1;
                }
            }
        }


        for (int j = 0; j < GRID_SIZE; j++) {
            int count = 1;
            for (int i = 1; i < GRID_SIZE; i++) {
                if (grid[i][j] == grid[i - 1][j]) {
                    count++;
                    if (count == MATCH_THRESHOLD) {
                        replaceTiles(i - 2, j, i, j);
                        score += SCORE_PER_MATCH;
                        checkMatches();
                    }
                } else {
                    count = 1;
                }
            }
        }
    }

    private void replaceTiles(int startRow, int startCol, int endRow, int endCol) {
        for (int i = startRow; i <= endRow; i++) {
            for (int j = startCol; j <= endCol; j++) {
                grid[i][j] = generateRandomTile();
            }
        }
    }

    private void updateGridAdapter() {
        GridAdapter adapter = new GridAdapter(this, grid);
        gridView.setAdapter(adapter);
    }

    private void restartGame() {
        initializeGrid();
        updateGridAdapter();
        score = 0;
        Toast.makeText(this, "Game restarted", Toast.LENGTH_SHORT).show();
    }
}
