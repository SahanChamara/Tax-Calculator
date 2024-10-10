import java.util.*;
class taxcalculator{

    // ====================  Console Clear Method =========================================
    public final static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }
    // ============================================ Main Method =========================================================
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
                    
        System.out.println("\t\t\t\t\t\t                     ______   ______   ________  ________ ");
        System.out.println("\t\t\t\t\t\t                    |      \\ /      \\ |        \\|        \\");
        System.out.println("\t\t\t\t\t\t                    \\$$$$$$|  $$$$$$\\| $$$$$$$$ \\$$$$$$$$");
        System.out.println("\t\t\t\t\t\t                    | $$  | $$   \\$$| $$__       | $$   ");
        System.out.println("\t\t\t\t\t\t                    | $$  | $$      | $$  \\      | $$   ");
        System.out.println("\t\t\t\t\t\t                    | $$  | $$   __ | $$$$$      | $$   ");
        System.out.println("\t\t\t\t\t\t                    | $$_ | $$__/  \\| $$_____    | $$   ");
        System.out.println("\t\t\t\t\t\t                    |  $$ \\ \\$$   $$| $$     \\   | $$   ");
        System.out.println("\t\t\t\t\t\t                    \\$$$$$$  \\$$$$$$ \\$$$$$$$$    \\$$   ");
    
        System.out.println();
        System.out.println();
        
        System.out.println("\t                     _______             __   __   _____              _         _____   _    _   _                   _______    ____    _____  ");
        System.out.println("\t                    |__   __|     /\\     \\ \\ / /  / ____|     /\\     | |       / ____| | |  | | | |          /\\     |__   __|  / __ \\  |  __ \\ ");
        System.out.println("\t                       | |       /  \\     \\ V /  | |         /  \\    | |      | |      | |  | | | |         /  \\       | |    | |  | | | |__) |");
        System.out.println("\t                       | |      / /\\ \\     > <   | |        / /\\ \\   | |      | |      | |  | | | |        / /\\ \\      | |    | |  | | |  _  / ");
        System.out.println("\t                       | |     / ____ \\   / . \\  | |____   / ____ \\  | |____  | |____  | |__| | | |____   / ____ \\     | |    | |__| | | | \\ \\ ");
        System.out.println("\t                       |_|    /_/    \\_\\ /_/ \\_\\  \\_____| /_/    \\_\\ |______|  \\_____|  \\____/  |______| /_/    \\_\\    |_|     \\____/  |_|  \\_\\");
    
        System.out.println();
        System.out.println();
    
        System.out.println("\t                    ============================================================================================================================");
    
        System.out.println();
        System.out.println();
    
        System.out.println("\t\t\t\t\t[1] Withholding Tax");
        System.out.println();
    
        System.out.println("\t\t\t\t\t[2] Payble Tax");
        System.out.println();
    
        System.out.println("\t\t\t\t\t[3] Income Tax");
        System.out.println();
    
        System.out.println("\t\t\t\t\t[4] Social Security Contribution Levy (SSCL) Tax");
        System.out.println();
    
        System.out.println("\t\t\t\t\t[5] Leasing Payment");
        System.out.println();
    
        System.out.println("\t\t\t\t\t[6] Exit");
        System.out.println();
    
        System.out.println();
        System.out.print("\t\t\t\tEnter An Option to Continue -> ");
        int option = input.nextInt();


        //============================================================================= Switching the Tax Calculators ===================================================
        switch (option) {
            case 1: 
                clearConsole();               
                withHoldingTax();
            break;

            // case 2:
            //     clearConsole();
            //     //paybleTax();
            // break;

            // case 3:
            //     clearConsole();
            //     //incomeTax();
            // break;

            // case 4:
            //     clearConsole();
            //     //ssclTax();
            // break;

            // case 5:
            //     clearConsole();
            //     //leasingPayment();
            // break;

            case 6:
                return;
                
        }
   
        input.close();
    }  
    // =============================================================== With Holding Tax Calculator (withHoldingTax Method) ==========================================================
    public static void withHoldingTax(){
        Scanner withhold = new Scanner(System.in);

        System.out.println("\t\t\t\t\t\t+----------------------------------------------------------------------------------+");
        System.out.println("\t\t\t\t\t\t|\t\t\t\t WITHHOLDING TAX\t\t\t\t   |");
        System.out.println("\t\t\t\t\t\t+----------------------------------------------------------------------------------+");
        System.out.println();

        System.out.println("\t\t\t\t\t\t\t\t[1] Rent Tax");
        System.out.println();

        System.out.println("\t\t\t\t\t\t\t\t[2] Bank Interest Tax");
        System.out.println();

        System.out.println("\t\t\t\t\t\t\t\t[3] Dividend Tax");
        System.out.println();

        System.out.println("\t\t\t\t\t\t\t\t[4] Exit");
        System.out.println();

        System.out.print("\t\t\t\t\t\tEnter an Option to continues -> ");
        int withHoldingOption = withhold.nextInt();


        // ================================================= Withholding Tax three catogories Swithcing ====================================================
        switch (withHoldingOption) {
            case 1:
                clearConsole();
                rentTax();
            break;       
            
            case 2:
                clearConsole();
                bankInterest();
            break;

            case 3:
                clearConsole();
                dividendTax();
            break;

            case 4:
                clearConsole();
                return;          
   
        }
        withhold.close();
    }
    // ======================================================== RENT TAX ==============================================
    public static void rentTax(){
        Scanner retax = new Scanner(System.in);
        
        System.out.println("\t\t\t\t\t\t+----------------------------------------------------------------------------------+");
        System.out.println("\t\t\t\t\t\t|\t\t\t\t RENT TAX\t\t\t\t           |");
        System.out.println("\t\t\t\t\t\t+----------------------------------------------------------------------------------+");
        System.out.println();

        System.out.print("\t\t\t\t\t\t Enter your Rent \t\t : ");
        int rent = retax.nextInt();
        System.out.println();

        if(rent>0){
            if(rent>100000){
               double tax=rent*0.1;             // calculating rent tax 10%...........
               System.out.println("\t\t\t\t\t\t You have to pay Rent Tax \t : "+String.format("%.2f",tax));
               System.out.println();

               // changing the calculators....................
               char anotherrt='Y';
               System.out.print("\t\t\t\t\t\t Do you want to Calculate another Rent Tax (Y/N) : ");
               anotherrt = retax.next().charAt(0);
               System.out.println();

               if(anotherrt=='Y' || anotherrt=='y'){
                    clearConsole();
                    rentTax();
               } else {
                    clearConsole();
                    main(null);
                    
               }

            } else {
                System.out.println("\t\t\t\t\t\t\t\t\t You dont have to pay Rent Tax...");
                System.out.println();

                char anotherrt2='Y';
                System.out.print("\t\t\t\t\t\t Do you want to Calculate another Rent Tax (Y/N) : ");
                anotherrt2 = retax.next().charAt(0);
                System.out.println();
 
                if(anotherrt2=='Y' || anotherrt2=='y'){
                     clearConsole();
                     rentTax();
                } else {
                     clearConsole();
                     main(null);
                     
                }
            }
        } else {
            System.out.println("\t\t\t\t\t\t\t\t\t Invalid input...");
            System.out.println();

            char againrt = 'Y';
            System.out.print("\t\t\t\t\t\t\t Do you want to enter the correct value again (Y/N) : ");
            againrt = retax.next().charAt(0);
            System.out.println();

            if(againrt=='Y' || againrt=='y'){
                clearConsole();
                rentTax();
            } else {
                clearConsole();
                main(null);
            }
                 
        }

        retax.close();
    }
    // ======================================== Bank Interest Tax ==========================================================
    public static void bankInterest(){
        Scanner biTax = new Scanner(System.in);
        
        System.out.println("\t\t\t\t\t\t+----------------------------------------------------------------------------------+");
        System.out.println("\t\t\t\t\t\t|\t\t\t\t BANK INTEREST TAX\t\t\t           |");
        System.out.println("\t\t\t\t\t\t+----------------------------------------------------------------------------------+");
        System.out.println();

        System.out.print("\t\t\t\t\t\t Enter your Bank Interest Per Year \t\t\t : ");
        int bankInterestAmount = biTax.nextInt();
        System.out.println();

        if(bankInterestAmount>0){
            double bkiAmount = bankInterestAmount*0.05;             // calculating the bacnk interest tax......................
            System.out.println("\t\t\t\t\t\t You have to pay Bank Interest Tax per Year \t\t : "+String.format("%.2f",bkiAmount));
            System.out.println();

            // ========= Home page or again calculation method run ====================
            char anotherbki='Y';            
            System.out.print("\t\t\t\t\t\t Do you want to calculate another Bank Interest Tax (Y/N) : ");
            anotherbki = biTax.next().charAt(0);

            if(anotherbki=='Y' || anotherbki=='y'){
                clearConsole();
                bankInterest();
            } else {
                clearConsole();
                main(null);
            }

        } else {
            System.out.println("\t\t\t\t\t\t\t\t\t Invalid Input");
            System.out.println();

            char againbki='Y';
            System.out.print(" \t\t\t\t\t\t\t Do you want to entet the corrcet value again (Y/N) : ");
            againbki = biTax.next().charAt(0);

            if(againbki=='Y' || againbki=='y'){
                clearConsole();
                bankInterest();
            } else {
                clearConsole();
                main(null);
            }
        }
  
        biTax.close();
    // ================= Bank interest Calculator End =========================

    }
    // ========================================== Dividend Tax  =======================================================
    public static void dividendTax(){
        Scanner diviTax = new Scanner(System.in);

        System.out.println("\t\t\t\t\t\t+----------------------------------------------------------------------------------+");
        System.out.println("\t\t\t\t\t\t|\t\t\t\t DIVIDEND TAX\t\t\t               |");
        System.out.println("\t\t\t\t\t\t+----------------------------------------------------------------------------------+");
        System.out.println();

        System.out.print("\t\t\t\t\t\t Enter your total dividend Per Year \t : ");
        int diviTot = diviTax.nextInt();
        System.out.println();

        if(diviTot>0){
            if(diviTot>100000){
                double dividendTaxTotal = diviTot*0.14;
                System.out.println("\t\t\t\t\t\t You have to pay Dividend Tax per year \t : "+String.format("%.2f",dividendTaxTotal));
                System.out.println();

                char anotherdivi='Y';
                System.out.print("\t\t\t\t\t\t\t\t\t Do you want to calculate another Dividend Tax (Y/N) : ");
                anotherdivi = diviTax.next().charAt(0);
                System.out.println();

                if(anotherdivi=='Y' || anotherdivi=='y'){
                    clearConsole();
                    dividendTax();
                } else {
                    clearConsole();
                    main(null);
                }
            } else {
                System.out.println("\t\t\t\t\t\t\t\t\t You dont have to pay Dividend Tax...");
                System.out.println();

                char anotherdivi2='Y';
                System.out.print("\t\t\t\t\t\t\t\t\t Do you want to calculate another Dividend Tax (Y/N) : ");
                anotherdivi2 = diviTax.next().charAt(0);
                System.out.println();

                if(anotherdivi2=='Y' || anotherdivi2=='y'){
                    clearConsole();
                    dividendTax();
                } else {
                    clearConsole();
                    main(null);
                }
            }
        } else {
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t Invalid Input");
            System.out.println();

            char againdivi='Y';
            System.out.print("\t\t\t\t\t\t\t\t\t Do you want to Enter the correct Value Again (Y/N) : ");
            againdivi = diviTax.next().charAt(0);
            System.out.println();

            if(againdivi=='Y' || againdivi=='y'){
                clearConsole();
                dividendTax();
            } else {
                clearConsole();
                main(null);
            }
 
        }
    }
    // ================================= Payble Tax Calculator ==================================================
    
}