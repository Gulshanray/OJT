import java.io.File;

class one {
    public static void main(String args[]){
        File a = new File("C:\\Users\\SES-1\\Desktop\\OJT  assignment\\3-06-2024\\task2\\gulshan.txt");

        if (a.exists()){
            long bytes = a.length();
            double kilobytes = bytes / 1024.0;
            double megabytes = kilobytes / 1024.0;

            System.out.println("File size is: " + bytes + " bytes");
            System.out.println("Kilobytes: " + String.format("%.2f", kilobytes));
            System.out.println("Megabytes: " + String.format("%.2f", megabytes));
        } else {
            System.out.println("File not found");
        }
    }
}
