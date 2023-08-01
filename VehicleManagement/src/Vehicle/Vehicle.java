package Vehicle;

public class Vehicle {
	
	    private int vehicleId;
	    private String vehicleName;
	    private String vehicleType;
		public Vehicle(int vehicleId, String vehicleName, String vehicleType) {
			super();
			this.vehicleId = vehicleId;
			this.vehicleName = vehicleName;
			this.vehicleType = vehicleType;
		}
		public int getVehicleId() {
			return vehicleId;
		}
		public void setVehicleId(int vehicleId) {
			this.vehicleId = vehicleId;
		}
		public String getVehicleName() {
			return vehicleName;
		}
		public void setVehicleName(String vehicleName) {
			this.vehicleName = vehicleName;
		}
		public String getVehicleType() {
			return vehicleType;
		}
		public void setVehicleType(String vehicleType) {
			this.vehicleType = vehicleType;
		}
		@Override
		public String toString() {
			return "Vehicle [vehicleId=" + vehicleId + ", vehicleName=" + vehicleName + ", vehicleType=" + vehicleType
					+ "]";
		}
		public void displayInfo() {
			System.out.println("Vehicle name : "+ vehicleName);
		}
	}

