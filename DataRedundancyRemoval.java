import java.util.ArrayList;
import java.util.Scanner;
public class DataRedundancyRemoval {
 public static void main(String[] args) {
 ArrayList<String> emails = new ArrayList<>();
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter number of users:");
 int n = sc.nextInt();
 sc.nextLine();
 for(int i = 0; i < n; i++) {
 System.out.println("Enter email:");
 String email = sc.nextLine();
 if(emails.contains(email)) {
 System.out.println("Duplicate data detected. Not added.");
 } else {
 emails.add(email);
 System.out.println("Unique data added successfully.");
 }
 }
 System.out.println("\nStored Unique Emails:");
 for(String e : emails) {
 System.out.println(e);
 }
 }
}