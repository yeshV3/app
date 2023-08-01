package Vehicle;

public class Fuel {
	
	    private int fuelId;
	    private String fuelType;
	    private double price;
	    
		public Fuel(int fuelId, String fuelType, double price) {
			super();
			this.fuelId = fuelId;
			this.fuelType = fuelType;
			this.price = price;
		}
		public int getFuelId() {
			return fuelId;
		}
		public void setFuelId(int fuelId) {
			this.fuelId = fuelId;
		}
		public String getFuelType() {
			return fuelType;
		}
		public void setFuelType(String fuelType) {
			this.fuelType = fuelType;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		@Override
		public String toString() {
			return "Fuel [fuelId=" + fuelId + ", fuelType=" + fuelType + ", price=" + price + "]";
		}
	}



