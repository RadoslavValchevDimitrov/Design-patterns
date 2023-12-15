package Prototype;

public class Client {

    public static void main(String[] args) {
        PhoneCache.loadData();
        Phone clonedPhone = (Phone) PhoneCache.getPhone(1);
        clonedPhone.setModel("Iphone");
        System.out.println("Phone " +  clonedPhone.getModel());

        Phone clonedPhone2 = (Phone) PhoneCache.getPhone(2);
        clonedPhone2.setModel("Samsung");
        System.out.println("Phone " +  clonedPhone2.getModel());
        Phone clonedPhone3 = (Phone)PhoneCache.getPhone(3);
        clonedPhone3.setModel("Xiaomi");
        System.out.println("Phone " +  clonedPhone3.getModel());
    }
}
