/* 

15.- In order to estimate the cost of painting a house, a painter needs to know the surface area of the exterior. Develop an algorithm for computing that value. Your inputs are the width, length, and height of the house, the number of windows and doors, and their dimensions. (Assume the windows and doors have a uniform size.)

A. 

	Start getting the Width, Length and Height of the house.
	Get the Width and Height of the Windows and Doors.
	Get the Total Number of Windows and Doors.
	Define the Area-Roof as the Width times the Length.
	Define the Front-Back walls as the Length times the Height times 2.
	Define the Lateral walls as the Width times the Height times 2.
	Define the Total Surface Area as the Area-Roof plus Front-Back walls plus Lateral walls
	Define the Area-Window as the Width times the Length of a window, times the Total Number of Windows.
	Define the Area-Door as the Width times the Length of a door, times the Total Number of Doors.
	Define the Total Door-Window Area as the Area-Door plus the Area-Window.
	Define the Total Area as the Total Surface Area minus the Total Door-Window Area.
	End reporting the value of the Total Area as the total surface area of the exterior.

*/

public class SurfaceAreaCalculator {

	public static void main(String[] args){
		
		double width = 10;
		double length = 10;
		double height = 10;
		double widthWindow = 2;
		double lengthWindow = 3;
		double widthDoor = 3;
		double lengthDoor = 1;
		double numberWindows = 3;
		double numberDoors = 2;
		
		double areaRoof = (width*length);
		double areaFrontBack = ((length*height)*(2));
		double areaLateral = ((width*height)*(2));
		double totalArea = (areaRoof + areaFrontBack + areaLateral);
		double areaWindow = ((widthWindow * lengthWindow) * numberWindows) ;
		double areaDoor = ((widthDoor * lengthDoor) * numberDoors) ; 
		double totalSurfaceArea = (totalArea - (areaWindow + areaDoor));
		
		System.out.println("The surface area of the exterior is: " + totalSurfaceArea);
		
		System.exit(0);
		
	}

}

