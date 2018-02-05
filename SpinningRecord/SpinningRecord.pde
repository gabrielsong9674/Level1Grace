import ddf.minim.*;
Minim minim;
AudioPlayer song;
PImage pictureOfRecord;
int imageAngle;
void setup(){
  size(500, 500);
  pictureOfRecord = loadImage("record.png");
  pictureOfRecord.resize(500, 500);
  minim = new Minim(this);
  song = minim.loadFile("song.mp3", 512);
  
  
}
void draw(){
   rotateImage(pictureOfRecord, imageAngle);
   image(pictureOfRecord, 0, 0);
  if(mousePressed){
   imageAngle += 100;
  song.play();
  }
  else{
    song.pause();
  }
}

void rotateImage(PImage image, int amountToRotate){
  translate(width/2, height/2);
  rotate(amountToRotate*TWO_PI/360);
  translate(-image.width/2, -image.height/2);
}