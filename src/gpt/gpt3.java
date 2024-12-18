package gpt;


public class gpt3 {
    public static void main(String[] args) {
        // 使用 java.lang.String 進行字串操作
        String message = "Hello, Java!";
        System.out.println("Original message: " + message);
        System.out.println("Message in uppercase: " + message.toUpperCase());
        System.out.println("Length of message: " + message.length());
        System.out.println("Does the message contain 'Java'? " + message.contains("Java"));

        // 使用 java.lang.Math 進行數學計算
        double number = 25.0;
        System.out.println("\nNumber: " + number);
        System.out.println("Square root of number: " + Math.sqrt(number));
        System.out.println("Power of number (25^2): " + Math.pow(number, 2));
        System.out.println("Value of PI: " + Math.PI);

        // 使用 java.lang.System 取得系統資訊
        System.out.println("\nSystem Information:");
        System.out.println("Current time in milliseconds: " + System.currentTimeMillis());
        System.out.println("Available processors: " + Runtime.getRuntime().availableProcessors());
        System.out.println("Free memory (bytes): " + Runtime.getRuntime().freeMemory());
        System.out.println("Java version: " + System.getProperty("java.version"));
        System.out.println("OS name: " + System.getProperty("os.name"));
    }
}

