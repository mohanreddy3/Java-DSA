package Java_Projects;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class SnakeGame extends JFrame implements ActionListener {
    private static final int WIDTH = 800; // Width of the game window
    private static final int HEIGHT = 600; // Height of the game window
    private static final int UNIT_SIZE = 20; // Size of each snake unit
    private static final int GAME_UNITS = (WIDTH * HEIGHT) / UNIT_SIZE; // Total number of game units
    private static final int DELAY = 105; // Delay for timer

    private final int[] x = new int[GAME_UNITS]; // X coordinates of snake body parts
    private final int[] y = new int[GAME_UNITS]; // Y coordinates of snake body parts
    private int bodyParts = 6; // Initial length of the snake
    private int applesEaten; // Number of apples eaten by the snake
    private int appleX; // X coordinate of the apple
    private int appleY; // Y coordinate of the apple
    private char direction = 'R'; // Initial direction of the snake
    private boolean running = true; // Game state

    private Timer timer; // Timer for game loop

    public SnakeGame() {
        setTitle("Snake Game"); // Set title of the window
        setSize(WIDTH, HEIGHT); // Set size of the window
        setResizable(false); // Disable window resizing
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set default close operation
        setLocationRelativeTo(null); // Center the window on the screen
        setVisible(true); // Make the window visible
        setBackground(Color.black); // Set background color

        // Initialize snake starting position
        for (int i = 0; i < bodyParts; i++) {
            x[i] = 100 - i * UNIT_SIZE;
            y[i] = 100;
        }

        // Generate initial apple
        newApple();

        // Set up timer for game loop
        timer = new Timer(DELAY, this);
        timer.start();

        // Key listener for controlling the snake
        addKeyListener(new MyKeyAdapter());
    }

    // Method to generate new apple at random position
    public void newApple() {
        appleX = new Random().nextInt((int) (WIDTH / UNIT_SIZE)) * UNIT_SIZE;
        appleY = new Random().nextInt((int) (HEIGHT / UNIT_SIZE)) * UNIT_SIZE;
    }

    // Method to move the snake
    public void move() {
        // Move body parts
        for (int i = bodyParts; i > 0; i--) {
            x[i] = x[i - 1];
            y[i] = y[i - 1];
        }

        // Move head in the specified direction
        switch (direction) {
            case 'U' -> y[0] -= UNIT_SIZE;
            case 'D' -> y[0] += UNIT_SIZE;
            case 'L' -> x[0] -= UNIT_SIZE;
            case 'R' -> x[0] += UNIT_SIZE;
        }
    }

    // Method to check if snake has eaten apple
    public void checkApple() {
        if (x[0] == appleX && y[0] == appleY) {
            bodyParts++;
            applesEaten++;
            newApple();
        }
    }

    // Method to check if snake has collided with itself or walls
    public void checkCollisions() {
        // Check for self collision
        for (int i = bodyParts; i > 0; i--) {
            if (x[0] == x[i] && y[0] == y[i]) {
                running = false;
            }
        }

        // Check for wall collision
        if (x[0] < 0 || x[0] >= WIDTH || y[0] < 0 || y[0] >= HEIGHT) {
            running = false;
        }

        // Stop timer if game over
        if (!running) {
            timer.stop();
        }
    }

    // Method to paint graphics on the screen
    public void paint(Graphics g) {
        super.paint(g);

        if (running) {
            // Draw apple
            g.setColor(Color.red);
            g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);

            // Draw snake body
            for (int i = 0; i < bodyParts; i++) {
                if (i == 0) {
                    g.setColor(Color.green);
                } else {
                    g.setColor(new Color(45, 180, 0));
                }
                g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
            }

            // Draw score
            g.setColor(Color.white);
            g.setFont(new Font("Arial", Font.BOLD, 20));
            FontMetrics metrics = getFontMetrics(g.getFont());
            g.drawString("Score: " + applesEaten, (WIDTH - metrics.stringWidth("Score: " + applesEaten)) / 2, g.getFont().getSize());
        } else {
            gameOver(g);
        }
    }

    // Method to display game over message
    public void gameOver(Graphics g) {
        g.setColor(Color.red);
        g.setFont(new Font("Arial", Font.BOLD, 75));
        FontMetrics metrics = getFontMetrics(g.getFont());
        g.drawString("Game Over", (WIDTH - metrics.stringWidth("Game Over")) / 2, HEIGHT / 2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (running) {
            move();
            checkApple();
            checkCollisions();
        }
        repaint();
    }

    // Inner class for key events
    private class MyKeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    if (direction != 'R') {
                        direction = 'L';
                    }
                    break;
                case KeyEvent.VK_RIGHT:
                    if (direction != 'L') {
                        direction = 'R';
                    }
                    break;
                case KeyEvent.VK_UP:
                    if (direction != 'D') {
                        direction = 'U';
                    }
                    break;
                case KeyEvent.VK_DOWN:
                    if (direction != 'U') {
                        direction = 'D';
                    }
                    break;
            }
        }
    }

    // Main method to start the game
    public static void main(String[] args) {
        new SnakeGame();
    }
}
