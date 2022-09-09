package task3.progressed;

public abstract class Man {
  private String FIO;
  private String address;
  private String phoneNumber;

  public Man(String FIO, String address, String phoneNumber) {
    this.FIO = FIO;
    this.address = address;
    this.phoneNumber = phoneNumber;
  }

  public String getFIO() {
    return FIO;
  }

  public void setFIO(String FIO) {
    this.FIO = FIO;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public abstract void voice();

  @Override
  public String toString() {
    return "Man{" +
        "FIO='" + FIO + '\'' +
        ", address='" + address + '\'' +
        ", phoneNumber='" + phoneNumber + '\'' +
        '}';
  }
}
