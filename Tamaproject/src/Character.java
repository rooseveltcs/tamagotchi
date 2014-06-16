import processing.core.*;
	
 //PFont font;
	
	
	public class Character extends PApplet  {
	    PImage appearance;
	    PImage sleep; 
	    boolean alive;
	    boolean gender;
	    String name;
	    int hunger;
	    int happiness;
	    int weight;
	    int seconds;
	    boolean bathroom;
	    boolean sick;
	    
	    Character(){
	      alive = true;
	      float rand = random(10);//0-10
	      if(rand >= 5){        
	        gender = true;
	      }else{
	         gender = false; 
	      }
	    //  font= loadFont("AgencyFB-Reg-48");
	    //  textFont(font);
	      //name = console.next();
	      hunger = 5;
	      happiness = 5;
	      weight = 10;
	      seconds = 0;
	      bathroom = false;
	      sick = false;
	      if(gender){ 
	         appearance = loadImage("female.jpg");
	         sleep = loadImage("fsleep.jpg");
	      } else{
	         appearance = loadImage("male.jpg");
	         sleep = loadImage("msleep.jpg");
	      }
	    }
	    
	    public void display(int x, int y){
	      image(appearance, x, y);
	      if(bathroom)
	        image(loadImage("poop.jpg"), 350, 250);

	    }
	    
	    public void sleep(){
	      image(sleep, 250, 250); 
	    }
	    
	    public void die(){
	      appearance = null;
	       alive = false;
	       hunger = 0;
	       happiness = 0;
	       seconds = 0;
	    }
	    
	    public void bathroom(){
	        hunger --;
	        bathroom = true;
	    }
	    
	    public void cleanUp(){
	       bathroom = false;
	       image(loadImage("clean.jpg"), 0, 0); 
	    }
	}
	

