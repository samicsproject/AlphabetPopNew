import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
import java.io.*;
import javax.swing.filechooser.*;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import java.io.*;
import javax.sound.sampled.*;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

/**
 * Auto Generated Java Class.
 */
public class LevelOne extends Levels {
  
  public LevelOne(int x, int y)
  {
    super(x, y);
    background = 1;
    letters = new char [3];
    readWords("Level1.txt.txt");
    word = words.get(0).toUpperCase();
    
    volume(-15.0f, 2);
    audio[2].loop(Clip.LOOP_CONTINUOUSLY);
    t = new GameTimer();
    t.start();
    
    for (int q = 0; q < word.length(); q++)
    {
      letters[q] = word.charAt(q);
    }

    for (int z = 0 ; z < 26; z ++)
    {
      ball[z] = new Ball(50+(z%9)*(2*radius+30), 50+(z/9)*(2*radius+30), radius, 0, 0, Colors.bubbles, (char)(65+z), false);
    }
    alphabet[letters[currentLetter]-65].start();
    
    startup();
  }
  
}
