package C19471814;

import ie.tudublin.Visual;

public class CubeVisual extends Visual
{

    public void settings()
    {
       
        fullScreen(P3D, SPAN);
    }

    public void keyPressed()
    {
        /* this code is the key function 
        by pressing space key on the keyboard the song 
        will paly*/
        if (key == ' ')
        {
            getAudioPlayer().cue(0);
            getAudioPlayer().play();
            
        }
    }

    public void setup()
    {
        colorMode(HSB);
        noCursor(); 
        
        setFrameSize(256); // this is the frame size

        startMinim(); // starting the minim
        loadAudio("Weazel-Intro-xx.mp3"); //loading audio file in audioplayer
        
    }
    float smoothedBoxSize = 0;
    int OFF_MAX = 250; // the size of the box in the screen if OFF_max is more box is bigger

    public void draw()
    {
        /*
        amplitude average calcuation that make the 
        box code response to music connect it to music
        */
        calculateAverageAmplitude();
        background(0);
        float boxSize = 25 + (getAmplitude() * 950); // this is to show how box size react to the beats 
        smoothedBoxSize = lerp(smoothedBoxSize, boxSize, 0.2f);
        translate(width/2, height/2, -OFF_MAX); 
        rotateX((float) (frameCount * .01));    //these are to retate the boxes
        rotateY((float) (frameCount * .01));
        rotateY((float) (frameRate * .01));
      for (int i = -OFF_MAX; i<= OFF_MAX; i+=50) // nested for loop
      {
          for(int j= -OFF_MAX; j<=OFF_MAX; j+=50)
          {
              for(int k= -OFF_MAX; k <= OFF_MAX; k+=50)
              {
                  pushMatrix();
                  translate(i, j, k);
                  rotateX((float) (frameCount * .02));
                  rotateY((float) (frameCount * .02));
                  rotateY((float) (frameRate * .02));
                  fill(colorFromOffset(i),colorFromOffset(j),colorFromOffset(k)); // the color of boxes
                  box((float) (10 + (Math.sin(frameCount / 10.0)) * 10), smoothedBoxSize, boxSize); // this is to create the box
                  popMatrix();
              }
          }
      }  
    }
    int colorFromOffset(int offset) // color of the boxes
    {
        return (int) ((offset+OFF_MAX)/(2.8 *OFF_MAX)*255);
    }
} 