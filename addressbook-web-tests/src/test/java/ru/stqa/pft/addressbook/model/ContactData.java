package ru.stqa.pft.addressbook.model;

public class ContactData {
  private final String name;
  private final String lastname;
  private final String nickname;
  private final String company;
  private final String address;
  private final String fonenumber;
  private final String birthday;
  private final String month;
  private final String year;
  private final String addInfo;
  private final String group;

  public ContactData(String name, String lastname, String nickname, String company, String address, String fonenumber, String birthday, String month, String year, String addInfo, String group) {
    this.name = name;
    this.lastname = lastname;
    this.nickname = nickname;
    this.company = company;
    this.address = address;
    this.fonenumber = fonenumber;
    this.birthday = birthday;
    this.month = month;
    this.year = year;
    this.addInfo = addInfo;
    this.group =  group;
  }

  public String getName() {
    return name;
  }

  public String getLastname() {
    return lastname;
  }

  public String getNickname() {
    return nickname;
  }

  public String getCompany() {
    return company;
  }

  public String getAddress() {
    return address;
  }

  public String getFonenumber() {
    return fonenumber;
  }

  public String getBirthday() {
    return birthday;
  }

  public String getMonth() {
    return month;
  }

  public String getYear() {
    return year;
  }

  public String getAddInfo() {
    return addInfo;
  }

  public String getGroup() {
    return group;
  }
}
