public class Phone {
    private String color;
    private String operatingSystem;
    private Integer batteryCapacity;
    private Integer screenSize;
    private Integer memory;
    private Integer cameraMpx;
    public static String stock;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public Integer getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(Integer batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public Integer getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(Integer screenSize) {
        this.screenSize = screenSize;
    }

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public Integer getCameraMpx() {
        return cameraMpx;
    }

    public void setCameraMpx(Integer cameraMpx) {
        this.cameraMpx = cameraMpx;
    }

    public Phone(String color, String operatingSystem, Integer batteryCapacity, Integer screenSize, Integer memory, Integer cameraMpx) {
        this.color = color;
        this.operatingSystem = operatingSystem;
        this.batteryCapacity = batteryCapacity;
        this.screenSize = screenSize;
        this.memory = memory;
        this.cameraMpx = cameraMpx;
    }

    public Phone() {
    }

    public Phone(Integer batteryCapacity, Integer memory) {
        this.batteryCapacity = batteryCapacity;
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "color='" + color + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", batteryCapacity=" + batteryCapacity +
                ", screenSize=" + screenSize +
                ", memory=" + memory +
                '}';
    }

    public String toString(String color, String operatingSystem, Integer batteryCapacity, Integer screenSize, Integer memory, Integer cameraMpx) {
        return "Phone{" +
                "color='" + color + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", batteryCapacity=" + batteryCapacity +
                ", screenSize=" + screenSize +
                ", memory=" + memory +
                ", cameraMpx=" + cameraMpx +
                '}';
    }

    public String toString(String color, String operatingSystem, Integer batteryCapacity, Integer screenSize, Integer memory) {
        return "Phone{" +
                "color='" + color + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", batteryCapacity=" + batteryCapacity +
                ", screenSize=" + screenSize +
                ", memory=" + memory +
                '}';
    }

    public String toString(String color, String operatingSystem) {
        return "Phone{" +
                "color='" + color + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                '}';
    }
}
