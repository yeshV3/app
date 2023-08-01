package Vehicle;

public class Driver {
	    private int driverId;
	    private String driverName;
	    private String licenseNumber;
		public Driver(int driverId, String driverName, String licenseNumber) {
			super();
			this.driverId = driverId;
			this.driverName = driverName;
			this.licenseNumber = licenseNumber;
		}
		public int getDriverId() {
			return driverId;
		}
		public void setDriverId(int driverId) {
			this.driverId = driverId;
		}
		public String getDriverName() {
			return driverName;
		}
		public void setDriverName(String driverName) {
			this.driverName = driverName;
		}
		public String getLicenseNumber() {
			return licenseNumber;
		}
		public void setLicenseNumber(String licenseNumber) {
			this.licenseNumber = licenseNumber;
		}
		@Override
		public String toString() {
			return "Driver [driverId=" + driverId + ", driverName=" + driverName + ", licenseNumber=" + licenseNumber
					+ "]";
		}
	}

