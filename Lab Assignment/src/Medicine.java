public class Medicine {
    private String medicineId;
    private String name;
    private double price;
    private int quantity;
    private String manufacturer;
    private String batchNumber;
    //private Date expiryDate;

    Medicine(String medicineId, String name, double price, int quantity, String manufacturer, String batchNumber /*Date expiryDate*/) {
        setMedicineId(medicineId);
        setName(name);
        setPrice(price);
        setQuantity(quantity);
        setManufacturer(manufacturer);
        setBatchNumber(batchNumber);
        //setExpiryDate(expiryDate);
    }

    public String getMedicineId() {
        return medicineId;
    }
    public void setMedicineId(String medicineId) {
        this.medicineId = medicineId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public String getBatchNumber() {
        return batchNumber;
    }
    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }
    /*public Date getExpiryDate() {
        return expiryDate;
    }
    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }*/

    public String toString() {
        return String.format("Medicine iD : %s \nMedicine Name : %s \nPrice : %s \nQuantity : %d \nManufacturer : %s \nBatch Number : %s\n", medicineId, name, price,quantity,manufacturer,batchNumber);
        //expiryDate.displayInfo();
    }
}
