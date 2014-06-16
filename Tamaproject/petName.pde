PFont font;
// Variable to store text currently being typed
String typing = "";
// Variable to store name text when return is hit
String name = "";
/*
void setup(){
 size(500,500);
 smooth();
 font = createFont("Arial",16,true);
 //font = loadFont("AgencyFB-Reg-48.vlw");
 textFont(font);
}
*/

/*void draw(){
 background(255);
 //textSize(46);
 // Set the font and fill for text
 int indent = 170;
 textFont(font);
 fill(0); 
 stroke(15);
 if(name == ""){
   text("Pet name: ", indent, 220);
   text(typing, indent, 250);
 }
  
}*/
/*
void keyPressed() {
  // If the return key is pressed, save the String and clear it
  if (key == '\n' && typing.length() != 0) {
    name = typing;
    // A String can be cleared by setting it equal to ""
    typing = ""; 
  }else if(key == BACKSPACE && typing.length() > 0){
      typing = typing.substring(0, typing.length() - 1);
  }else if(typing.length() < 5  && key != '\n' && keyCode >= 65 && keyCode <= 90){
    // Otherwise, concatenate the String
    // Each character typed by the user is added to the end of the String variable.
    typing = typing + key; 
  }  
}*/
