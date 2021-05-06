# Music Visualiser Project

Name: Hussain Hussaini

Student Number: C19471814

# Description of the assignment
This Project is an audio visualiser which displays the effects of music and the different base and volume of it and it definitely is "Something beautiful to enjoy while listening to music." This project expresses different colors and design and it is pleasing to the eye. The starting screen is where you can see the box rotating but no sound is playing by clicking spacebar you can run the audio visualiser.
# Instructions
![An image](https://drive.google.com/file/d/1HJ4RER85ge2LKJ7qRJ1bg-xwDHlyMU9x/view?usp=sharing)
In order to use this audio visualiser you would have to navigate to the folder which contains all the necessary files which is in: C:\Users\MusicVisuals\java

To compile the project you need to run the compile.sh file on Windows or mcompile.sh on Mac

To run the project, you need to run run.sh on Windows, or the mrun.sh file for Mac

you will then enter fulllscreen and to start the duration of the music visualiser you need to click spacebar

Once it starts it will play till it finishes and if you want to restart it you just need to click spacebar again
# How it works
https://www.youtube.com/watch?v=uUHsAMEH7aY

In the video above, you can watch the video by clicking on it. The audio visualiser contains visula cube class, what it does is that it makes rotating clorfull boxes. i have used the nested for loop to create the boxes and using frame count make the rotation of boxes andThe fill() method is passed the color  which are incremented as the song plays on and that is how it changes the colors. In the code below it shows how I imported the audio and used in this audio visualiser and used the Boxes.


# What I am most proud of in the assignment
 make a 3d path which keeps on moving based on the frequencies of the sound that is playing but make it semi-complex.
 making a colorful box that rotate and respond to music in a very pleasent way.
 good looking project using nested for loop.
using github and commiting on it 

This is code:

```Java
public void draw()
{
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

}
```

```


This is a youtube video:

[![YouTube](http://img.youtube.com/vi/uUHsAMEH7aY/0.jpg)](https://www.youtube.com/watch?v=uUHsAMEH7aY)
https://www.youtube.com/watch?v=uUHsAMEH7aY
