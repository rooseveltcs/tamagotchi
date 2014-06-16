import processing.core.*;

	void setup(){
		 size(500,500);
		 background(255);
		 img = loadImage("images.jpg"); 
		 tama = new Character();
		 smooth();
		 font = createFont("Arial",16,true);
		 //font = loadFont("AgencyFB-Reg-48.vlw");
		 textFont(font);
		}
	
		void draw(){
		  image(img,170,270); //4th and 5th param rescales the image
		  int indent = 170;
		  textFont(font);
		  fill(0); 
		  stroke(15);
		  	if(name == ""){
		  		text("Pet name: ", indent, 220);
		  		text(typing, indent, 250);
		  	}
		  
		  strokeWeight(5);
		  line(0,300,500,300);
		  
		  strokeWeight(5);
		  strokeCap(ROUND);
		  rect(8,8,120,120);//window
		  rect(20,20,40,40);
		  rect(75,20,40,40);
		  rect(20,75,40,40);
		  rect(75,75,40,40);
		  /*line(10,14,14,10);
		  line(13,16,18,10);
		  li
		  ne(35,20,42,12);*/
		}
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
		}
		}
		

