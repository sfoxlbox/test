package accessmodifier;

public class TestmodifirePrivate {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

		private void used() {
			System.out.println("This is a Used inventory");
			return ;
		}
		private void New() {
			System.out.println("This is a New Inventory");
			return ;
		}
		public String displayCar() {
			System.out.println("<<<<<< >>>>>>>");
			System.out.println("Display Car"); 
			used(); // private
			String Car= "Ford";
			return Car;
			
		}
		public String displayBus() {
			System.out.println("<<<<<< >>>>>>>");
			System.out.println("Display Bus");
			New();
			String Bus= "Hammer";
			return Bus;
			
		}
		public String displayPlane() {
			System.out.println("<<<<<< >>>>>>>");
			System.out.println("Display Plane");
			String Plane= "Boeing";
			return Plane;
			
		}
	}


