import java.util.Scanner;

public class Email {
   private String firstName;
   private String lastName;
   private String password;
   private String department;
   private String email;
   private int mailboxCapacity =500;
   private int defaultPasswordLength =10;
   private String alternateEmail;
   private String companySuffix = "koiroi.com";

   //Constructor to receive the first name and last name
   public Email(String firstName, String lastName) {
       this.firstName = firstName;
       this.lastName = lastName;
       
       //Call a method asking for the department to return the department
       this.department = setDepartment();
   
       //Call a method that returns a random password 
       this.password = randomPassword(defaultPasswordLength);
       System.out.println("Your password is:" +  this.password);

        //Combine elemts to generate email
       email = firstName.toLowerCase() + "." +lastName.toLowerCase() + "@" + department +"."+ companySuffix;
    
   }

   // Ask for the department 
    private String setDepartment(){
        System.out.println("DEPARTMENT CODES \n1 for sales \n2 for Development \n3 for Accounting\n0 for none \n Enter code:");
        Scanner in = new Scanner(System.in);
        int deChoice = in.nextInt();
        
        if(deChoice == 1){
            return "Sales";
        }
        else if(deChoice == 2){
            return "Dev";
        }
        else if(deChoice == 3){
            return "Acct";
        }
        else{
            return "";
        }

        }
        private String randomPassword(int length){

            String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
            char[] password = new char[length];
            for(int i = 0;i<length;i++){
                int rand = (int)(Math.random()*passwordSet.length());
                password[i] = passwordSet.charAt(rand);
            }
            return new String(password);

        }
        // Set the mailbox capacity 
        public void setMailboxCapacity(int capacity){
            this.mailboxCapacity = capacity;
        }

        // Set the alternate email
        public void setAlternateEmail(String altmail){
            this.alternateEmail = altmail;
        }

        // Change the password
        public void changePassword(String password){
            this.password = password;
        }

        public int getMailboxCapacity(){
            return mailboxCapacity;
        }
        public String getAlternateEmail(){
            return alternateEmail;
        }
        public String getPassword(){
            return password;
        }

        public String showInfo(){
            return ("DISPLAY NAME: "+ firstName + " " + lastName +
                   "\nCOMPANY EMAIL: "+ email +
                   "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb");
        }
    }

   
    
    

