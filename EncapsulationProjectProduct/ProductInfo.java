package EncapsulationProjectProduct;
import EncapsulationProjectProduct.*;
import java.time.LocalDateTime;

public class ProductInfo {
	private int productId;
	private String productName;
	private static double price;
	private LocalDateTime localDateTime;
	private String updatedStatus;
	private double priceWithGst;
	private static int stok;
//	private static int remainingStok;
	
	//setter-getter method for product id
	public void setProductId(int productId) {
		this.productId=productId;
		
	}
	public int getProductId() {
		return productId;
	}
	//setter-getter method for product Name
		public void setProductName(String productName) {
			this.productName=productName;
			
		}
		public String getProductName() {
			return productName;
		}
		//setter-getter method for product price
		public void setPrice(double price) {
			this.price=price;
			
		}
		public static double getPrice() {
			return price;
		}
		//setter-getter method for LocalDateTime
				public void setlocalDateTime(LocalDateTime localDateTime) {
					this.localDateTime=localDateTime;
					
				}
				public LocalDateTime getLocalDateTime() {
					return localDateTime;
				}
				//setter-getter method for product Updated Status
				public void setUpdatedStatus(String updatedStatus) {
					this.updatedStatus=updatedStatus;
					
				}
				public String getUpdatedStatus() {
					return updatedStatus;
				}
				//setter-getter method for product Gst
				public void setPriceWithGst(double priceWithGst) {
					this.priceWithGst=priceWithGst;
					
				}
				public double getPriceWithGst() {
					return priceWithGst;
				}
				//setter-getter method for  stock
				public void setStok(int stok) {
					this.stok=stok;
					
				}
				public static int getStok() {
					return stok;
				}
//				//setter-getter method for  remainingStok
//				public void setRemainingStok(int remainingStok) {
//					this.remainingStok=remainingStok;
//					
//				}
//				public static int getRemainingStok() {
//					return remainingStok;
//				}

}
