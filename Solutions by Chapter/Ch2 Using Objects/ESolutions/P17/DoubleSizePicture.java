/* 

17.- Using the Picture class of Worked Example 2.2, write a DoubleSizePicture program 
that loads a picture, doubles its size, and shows the center of the picture in the window.

*/

public class DoubleSizePicture {
	public static void main(String[] args) {
		  Picture pic = new Picture();
		  pic.load("queen-mary.png");
		  pic.move(-pic.getWidth()/4,-pic.getHeight()/4);
		  pic.scale((pic.getWidth()*2), (pic.getHeight()*2));
	}
}
