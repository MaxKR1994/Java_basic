public class Main {
    public static void Store(){
        System.out.println("Welcome to our store!");
    }

    public static void main(String[] args) {
        Phone IphoneX = new Phone("Black","IOS", 2500,5,64,12);
        Phone Iphone13 = new Phone("Silver","IOS",3000,6,512,12);
        Phone SamsungS20 = new Phone("Blue","android",4000,6,256,102);
        Phone Pixel6 = new Phone("White","android",4500,6,128,48);
        Phone Xiaomi12 = new Phone("Red","android",5000,6,32,48);
        Phone Huawei = new Phone();
        Phone OPPO = new Phone(2750,256);
        Phone.stock = "In stock:";

        IphoneX.setColor("SpaceGrey");
        IphoneX.setOperatingSystem("IOS");
        IphoneX.setBatteryCapacity(2500);
        IphoneX.setScreenSize(6);
        IphoneX.setMemory(512);
        IphoneX.setCameraMpx(12);


        SamsungS20.setCameraMpx(12);
        SamsungS20.setCameraMpx(48);

        Store();
        System.out.println(Phone.stock);
        System.out.println(IphoneX.toString());
        System.out.println(Iphone13.toString());
        System.out.println(SamsungS20.toString());
        System.out.println(Pixel6.toString());
        System.out.println(Xiaomi12.toString());
        System.out.println(Huawei.toString());
        System.out.println(SamsungS20.getMemory());
        System.out.println(SamsungS20.getCameraMpx());
        System.out.println(OPPO);
    }
}
