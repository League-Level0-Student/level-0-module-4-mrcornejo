PImage gary;
int width = 800;
int height = 600;

void setup() {
  size(800, 600);
  gary = loadImage("cat.jpg");
  gary.resize(800, 600);
  image(gary,0,0);
  
}

void draw() {
  background(gary);
  fill(#FFFFFF);
  ellipse(210,290,230,230);
  fill(#FFFFFF);
  ellipse(550,290,230,230);
  fill(#000000);
  if(mouseX<165){
     ellipse(165,mouseY,150,150);
  }
  else if(mouseY<250){
    ellipse(mouseX,250,150,150);
  }
  else if (mouseX< 165 && mouseY < 250) {
      ellipse(165,250,150,150);
  }else{
    ellipse(mouseX,mouseY,150,150);
  }
  fill(#000000);
  ellipse(mouseX+300,mouseY,150,150);
  
  //(x,y,w,h)
  
}
