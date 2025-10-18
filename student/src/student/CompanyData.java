package student;

public class CompanyData {
    private String companyName;
    private double stockPrice;
    

	public CompanyData(String companyName, double stockPrice) {
		super();
		this.companyName = companyName;
		this.stockPrice = stockPrice;
	
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public double getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(double stockPrice) {
		this.stockPrice = stockPrice;
	}

	@Override
	public String toString() {
		return "CompanyData [companyName=" + companyName + ", stockPrice=" + stockPrice + "]";
	}
	
	
}
