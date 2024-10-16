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

            case 2:
                clearConsole();
                paybleTax();
                break;

            case 3:
                clearConsole();
                incomeTax();
                break;

            case 4:
                clearConsole();
                ssclTax();
                break;

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
    public static void paybleTax(){
        Scanner payTax = new Scanner(System.in);

        System.out.println("\t\t\t\t\t\t+----------------------------------------------------------------------------------+");
        System.out.println("\t\t\t\t\t\t|\t\t\t\t PAYBLE TAX\t\t\t\t           |");
        System.out.println("\t\t\t\t\t\t+----------------------------------------------------------------------------------+");
        System.out.println();

        System.out.print("\t\t\t\t\t\t Enter your Employee Payment Per Month \t : ");
        int salary = payTax.nextInt();
        System.out.println();

        if(salary>0){
            double tax = 0;
            if(salary<100000){
                System.out.println("\t\t\t\t\t\t\t\t\t You dont have to pay payble Tax");
                System.out.println();

                char anotherpt1 = 'Y';
                System.out.print("\t\t\t\t\t\t\t\t\t Do you want to calculate another Payble Tax (Y/N) : ");
                anotherpt1 = payTax.next().charAt(0);

                if(anotherpt1=='Y' || anotherpt1=='y'){
                    clearConsole();
                    paybleTax();
                } else{
                    clearConsole();
                    main(null);
                }
            } else if(salary<141667){
                tax = (salary-100000) * 0.06;
            } else if(salary<183333){
                tax = (41667*0.06) + (salary-141667) * 0.12;
            } else if(salary<225000){
                tax = (41667*0.06) + (41667*0.12) + (salary-183333) * 0.18;
            } else if(salary<266667){
                tax = (41667*0.06) + (41667*0.12) + (41667*0.18) + (salary-225000) * 0.24;
            } else if(salary<308333){
                tax = (41667*0.06) + (41667*0.12) + (41667*0.18) + (41667*0.24) + (salary-266667) * 0.30;
            } else {
                tax = (416667*0.06) + (41667*0.12) + (41667*0.18) + (41667*0.24) + (41667*0.30) + (salary-308333) *0.36;
            }
            System.out.println("\t\t\t\t\t\t you have to pay Payble Tax per month \t : "+String.format("%.2f",tax));
            System.out.println();

            char anotherpt2 = 'Y';
            System.out.print("\t\t\t\t\t\t\t\t\t Do you want to calculate another Payble Tax (Y/N) : ");
            anotherpt2 = payTax.next().charAt(0);

            if(anotherpt2=='Y' || anotherpt2=='y'){
                clearConsole();
                paybleTax();
            } else{
                clearConsole();
                main(null);
            }       

        } else {
            System.out.println("\t\t\t\t\t\t\t\t\t Invalid Input");
            System.out.println();

            char againpt='Y';
            System.out.print("\t\t\t\t\t\t\t\t\t Do you want to calculate Payble Tax Again (Y/N) : ");
            againpt = payTax.next().charAt(0);

            if(againpt=='Y' || againpt=='y'){
                clearConsole();
                paybleTax();
            } else {
                clearConsole();
                main(null);
            }
        }
        payTax.close();
    }
        // ================================== Income Tax Calculator ====================================================
        public static void incomeTax(){
            Scanner inTax = new Scanner(System.in);
    
            System.out.println("\t\t\t\t\t\t+----------------------------------------------------------------------------------+");
            System.out.println("\t\t\t\t\t\t|\t\t\t\t INCOME TAX\t\t\t\t           |");
            System.out.println("\t\t\t\t\t\t+----------------------------------------------------------------------------------+");
            System.out.println();
    
            System.out.print("\t\t\t\t\t\t Enter your total income per year \t : ");
            int income = inTax.nextInt();
            System.out.println();
    
            double intax = 0;
            if(income>0){
                if(income<1200000){
                    System.out.println("\t\t\t\t\t\t\t\t you dont have to pay Income Tax...");
                    System.out.println();
    
                    char anotherin1 = 'Y';
                    System.out.print("\t\t\t\t\t\t\t\t\t Do you want to calculate another Income Tax (Y/N) : ");
                    anotherin1 = inTax.next().charAt(0);
    
                    if(anotherin1=='Y' || anotherin1=='y'){
                        clearConsole();
                        incomeTax();
                    } else{
                        clearConsole();
                        main(null);
                    }
    
                }else if(income<1700000){
                    intax = (income-1200000) * 0.06;
                }else if(income<2200000){
                    intax = (500000*0.06) + (income-1700000) * 0.12;
                }else if(income<2700000){
                    intax = (500000*0.06) + (500000*0.12) + (income-2200000) * 0.18;
                }else if(income<3200000){
                    intax = (500000*0.06) + (500000*0.12) + (500000*0.18) + (income-2700000) * 0.24;
                }else if(income<3700000){
                    intax = (500000*0.06) + (500000*0.12) + (500000*0.18) + (500000*0.24) + (income-3200000) * 0.30;
                }else{
                    intax = (500000*0.06) + (500000*0.12) + (500000*0.18) + (500000*0.24) + (500000*0.30) + (income-3700000) * 0.36;
                }
                System.out.println("\t\t\t\t\t\t you have to pay Income Tax Per Year \t : "+String.format("%.2f",intax));
                System.out.println();
    
                char anotherin2 = 'Y';
                System.out.print("\t\t\t\t\t\t\t\t\t Do you want to calculate another Income Tax (Y/N) : ");
                anotherin2 = inTax.next().charAt(0);
    
                if(anotherin2=='Y' || anotherin2=='y'){
                    clearConsole();
                    incomeTax();
                } else {
                    clearConsole();
                    main(null);
                }
    
            } else {
                System.out.println("\t\t\t\t\t\t\t\t\t Invalid input");
                System.out.println();
    
                char againintax='Y';
                System.out.print("\t\t\t\t\t\t\t\t\t Do you want to calculate Payble Tax Again (Y/N) : ");
                againintax = inTax.next().charAt(0);
    
                if(againintax=='Y' || againintax=='y'){
                    clearConsole();
                    paybleTax();
                } else {
                    clearConsole();
                    main(null);
                }
            }
    
            inTax.close();
        }
          //====================================================== Social Security Contribution Levt tax Calculator =======================================
    public static void ssclTax(){
        Scanner ssConTax = new Scanner(System.in);

        System.out.println("\t\t\t\t\t\t+----------------------------------------------------------------------------------+");
        System.out.println("\t\t\t\t\t\t|\t\t SOCIAL SECURITY CONTRIBUTION LEVY (SSCL) TAX \t\t           |");
        System.out.println("\t\t\t\t\t\t+----------------------------------------------------------------------------------+");
        System.out.println();

        System.out.print("\t\t\t\t\t\t Enter Value of Good or Service \t : ");
        int sscLevy = ssConTax.nextInt();
        System.out.println();

        if(sscLevy>0){
            // Step 1 -> add sale tax to the value            meka first step eka...............
            double saleTax = sscLevy * 0.025;
            double afterSaleTax = saleTax+sscLevy;

            // Step 2 sale tax andd vat sum eka..................
            double vat = afterSaleTax*0.15;
            double totalSsclTax = saleTax+vat;

            System.out.println("\t\t\t\t\t\t You have to pay SSCL Tax \t\t : "+String.format("%.2f",totalSsclTax));
            System.out.println();

            char anotherSsclt = 'Y';
            System.out.print(" \t\t\t\t\t\t\t\t\t Do you want to calculate another SSCL Tax (Y/N) : ");
            anotherSsclt = ssConTax.next().charAt(0);

            if(anotherSsclt=='Y' || anotherSsclt=='y'){
                clearConsole();
                ssclTax();
            }else{
                clearConsole();
                main(null);
            }

        } else {
            System.out.println("\t\t\t\t\t\t Invalid Input");
            System.out.println();

            char agianSsclt = 'Y';
            System.out.print("\t\t\t\t\t\t Do you want to calculate SSCL Tax again (Y/N) : ");
            agianSsclt = ssConTax.next().charAt(0);

            if(agianSsclt=='Y' || agianSsclt=='y'){
                clearConsole();
                ssclTax();
            }else{
                clearConsole();
                main(null);
            }
        }
        ssConTax.close();
    }
     
    // ========================= Leasing Payment Calculator ==================================
    public static void leasingPayment(){
        Scanner leasePmtcalculationoption = new Scanner(System.in);

        System.out.println("\t\t\t\t\t\t+----------------------------------------------------------------------------------+");
        System.out.println("\t\t\t\t\t\t|\t\t\t\t LEASING PAYMENT \t\t\t           |");
        System.out.println("\t\t\t\t\t\t+----------------------------------------------------------------------------------+");
        System.out.println();

        System.out.println("\t\t\t\t\t\t\t\t[1] Calculate Monthly Installment");
        System.out.println();

        System.out.println("\t\t\t\t\t\t\t\t[2] Search Leasing Category");
        System.out.println();

        System.out.println("\t\t\t\t\t\t\t\t[3] Find Leasing Amount");
        System.out.println();

        System.out.println("\t\t\t\t\t\t\t\t[4] Exit");
        System.out.println();

        System.out.print("\t\t\t\t\t\tEnter an Option to continues -> ");
        int leasingPaymentOption = leasePmtcalculationoption.nextInt();

        //============================================= Switching the leasing payment categories =====================================

        switch(leasingPaymentOption){
            case 1:
                clearConsole();
                monthlyInstallmentcalc();
            break;

            case 2:
                clearConsole();
                serachLeasing();
            break;

            case 3:
                clearConsole();
                findLeasingAmount();
            break;

            case 4:
            return;
        }
        leasePmtcalculationoption.close();    
    }
    
    // ========================== Calculating Monthly Installment (lease payment) ======================================

    public static void monthlyInstallmentcalc(){
        Scanner leasingpmt = new Scanner(System.in);

        System.out.println("\t\t\t\t\t\t+----------------------------------------------------------------------------------+");
        System.out.println("\t\t\t\t\t\t|\t\t\t\t CALCULATE LEASING PAYMENT\t\t           |");
        System.out.println("\t\t\t\t\t\t+----------------------------------------------------------------------------------+");
        System.out.println();

        System.out.print("\t\t\t\t\t\t Enter Lease Amount \t\t : ");
        double leaseAmount = leasingpmt.nextDouble();
        System.out.println();

        // ============= Validations =======================================
        if(leaseAmount>0){
            System.out.print("\t\t\t\t\t\t Enter Annual Interrest Rate \t : ");
            double annualInt = leasingpmt.nextDouble();
            System.out.println();

            if(annualInt>0){
                System.out.print("\t\t\t\t\t\t Enter Number of Year \t\t : ");
                int year = leasingpmt.nextInt();
                System.out.println();

                if(year<=5){
                    mCalculationPartOnly(leaseAmount,annualInt,year);

                    char anotherMinstallment = 'Y';
                    System.out.print("\t\t\t\t\t\t\t Do you want to calculate another Monthly Installment (Y/N) : ");
                    anotherMinstallment = leasingpmt.next().charAt(0);

                    if(anotherMinstallment=='Y' || anotherMinstallment=='y'){
                        clearConsole();
                        monthlyInstallmentcalc();
                    } else {
                        clearConsole();
                        main(null);
                    }
                    
                } else{
                    boolean validation=true;

                    L1:while(validation==true){
                        System.out.println("\t\t\t\t\t\t\t\t Invalid number of year....Enter the correct value again.......");

                        System.out.print("\t\t\t\t\t\t Enter Number of Year \t\t : ");
                        year = leasingpmt.nextInt();
                        System.out.println();

                        if(year<=5){
                            mCalculationPartOnly(leaseAmount,annualInt,year);

                            char anotherMinstallment2 = 'Y';
                            System.out.print("\t\t\t\t\t\t\t\t\t Do you want to calculate another Monthly Installment (Y/N) : ");
                            anotherMinstallment2 = leasingpmt.next().charAt(0);

                            if(anotherMinstallment2=='Y' || anotherMinstallment2=='y'){
                                clearConsole();
                                monthlyInstallmentcalc();
                            } else {
                                clearConsole();
                                main(null);
                            }
                        validation=false;
                        } else {
                            continue L1;
                           
                        }
                    }
                         
                }

            } else {
                System.out.println("Enter Valid Annual Interest Rate");
            }
           
        } else{
            // invalidation
            System.out.println("\t\t\t\t\t\t\t\t invalid Lease Amount");
            System.out.println();

            char againMonthlyInstall = 'Y';
            System.out.print("\t\t\t\t\t\t\t\t\t Do you want to calculate Monthly Installment Again (Y/N) : ");
            againMonthlyInstall = leasingpmt.next().charAt(0);

            if(againMonthlyInstall=='Y' || againMonthlyInstall=='y'){
                clearConsole();
                monthlyInstallmentcalc();
            } else {
                clearConsole();
                main(null);
            }
        }

        leasingpmt.close();
    }

    // ========================================= ## calculation Part Method (this is monthly installment calculation part only) ======================================
    public static void mCalculationPartOnly(double leaseAmount,double annualInt,int year){
        // ========== calculation start ================
        double monthlyInstallment = 0;
        double numberOfMonth = year*12;
        double i = annualInt/100/12;
        
        monthlyInstallment = leaseAmount*i / (1 - (1 / Math.pow(1 + i,numberOfMonth)));

        System.out.println("\t\t\t\t\t\t Your Monthly Installment \t : "+String.format("%.2f",monthlyInstallment));
        System.out.println();
        
    } // ================= end of calculation part ============================
     
    public static void serachLeasing(){
        Scanner serachLease = new Scanner(System.in);

        System.out.println("\t\t\t\t\t\t+----------------------------------------------------------------------------------+");
        System.out.println("\t\t\t\t\t\t|\t\t\t\t Search Leasing Category\t\t           |");
        System.out.println("\t\t\t\t\t\t+----------------------------------------------------------------------------------+");
        System.out.println();

        System.out.print("\t\t\t\t\t\t Enter Lease Amount \t\t : ");
        double leaseAmount = serachLease.nextDouble();
        System.out.println();

        System.out.print("\t\t\t\t\t\t Enter Annual Interrest Rate \t : ");
        double annualInt = serachLease.nextDouble();
        System.out.println();

        if(leaseAmount>0 && annualInt>0){
            double monthlyInstallment = 0;
            double numberOfMonth = 3*12;
            double i = annualInt/100/12;
        
            monthlyInstallment = leaseAmount*i / (1 - (1 / Math.pow(1 + i,numberOfMonth)));

            System.out.println("\t\t\t\t\t\t Your Monthly Installment for 3 Year leasing Plan \t : "+String.format("%.2f",monthlyInstallment));
            //System.out.println();

            // =========== monthly installment 4 year ===================
            monthlyInstallment = 0;
            numberOfMonth = 4*12;
            i = annualInt/100/12;
        
            monthlyInstallment = leaseAmount*i / (1 - (1 / Math.pow(1 + i,numberOfMonth)));

            System.out.println("\t\t\t\t\t\t Your Monthly Installment for 4 Year leasing Plan \t : "+String.format("%.2f",monthlyInstallment));
            //System.out.println();

            // ============================ monthly installment 5 year =====================
            monthlyInstallment = 0;
            numberOfMonth = 5*12;
            i = annualInt/100/12;
        
            monthlyInstallment = leaseAmount*i / (1 - (1 / Math.pow(1 + i,numberOfMonth)));

            System.out.println("\t\t\t\t\t\t Your Monthly Installment for 5 Year leasing Plan \t : "+String.format("%.2f",monthlyInstallment));
            System.out.println();

            char anothserachLease = 'Y';
            System.out.print("\t\t\t\t\t\t\t Do you want to Search Another Leasing Category (Y/N) : ");
            anothserachLease = serachLease.next().charAt(0);

            if(anothserachLease=='Y' || anothserachLease=='y'){
                clearConsole();
                serachLeasing();
            } else{
                clearConsole();
                main(null);
            }

        } else{
            System.out.println("\t\t\t\t\t\t\t\t Invalid Input");
            System.out.println();

            char againSserachLease = 'Y';
            System.out.print("\t\t\t\t\t\t\t\t\t Do you want to calculate Serach Leasing Category Again (Y/N) : ");
            againSserachLease = serachLease.next().charAt(0);

            if(againSserachLease=='Y' || againSserachLease=='y'){
                clearConsole();
                monthlyInstallmentcalc();
            } else {
                clearConsole();
                main(null);
            }
        }
        serachLease.close();
    }
    public static void findLeasingAmount(){
        Scanner flAmount = new Scanner(System.in);

        System.out.println("\t\t\t\t\t\t+----------------------------------------------------------------------------------+");
        System.out.println("\t\t\t\t\t\t|\t\t\t\t Find Leasing Category\t\t\t           |");
        System.out.println("\t\t\t\t\t\t+----------------------------------------------------------------------------------+");
        System.out.println();

        System.out.print("\t\t\t\t\t\t Enter the Monthly Lease Payment Amount you can afford \t : ");
        double affordAmount = flAmount.nextDouble();
        System.out.println();

        System.out.print("\t\t\t\t\t\t Enter number of Year \t\t\t\t\t : ");
        int year = flAmount.nextInt();
        System.out.println();

        System.out.print("\t\t\t\t\t\t Enter Annual Interrest Rate \t\t\t\t : ");
        double annualInt = flAmount.nextDouble();
        System.out.println();

        if(affordAmount>0 && year<=5 && annualInt>0){
            double leaseAmountCalc = 0;
            double numberOfMonth = year*12;
            double i = annualInt/100/12;
        
            leaseAmountCalc = affordAmount/i * (1 - (1 / Math.pow(1 + i,numberOfMonth)));

            double roundLeaseAmount = Math.round(leaseAmountCalc/1)*1;
           
            System.out.println("\t\t\t\t\t\t Your Monthly Installment \t\t\t\t : "+String.format("%.2f",roundLeaseAmount));
            System.out.println();

            char anothLeaseAmount = 'Y';
            System.out.print("\t\t\t\t\t\t\t\t\t Do you want to Search Another Lease Amount (Y/N) : ");
            anothLeaseAmount = flAmount.next().charAt(0);

            if(anothLeaseAmount=='Y' || anothLeaseAmount=='y'){
                clearConsole();
                findLeasingAmount();
            } else{
                clearConsole();
                main(null);
            }

        } else{
            System.out.println("\t\t\t\t\t\t\t Invalid Enter");
            System.out.println();

            char againLeaseAmount = 'Y';
            System.out.print("\t\t\t\t\t\t\t\t\t Do you want to calculate Lease Amount Again(Y/N) : ");
            againLeaseAmount = flAmount.next().charAt(0);

            if(againLeaseAmount=='Y' || againLeaseAmount=='y'){
                clearConsole();
                findLeasingAmount();
            } else {
                clearConsole();
                main(null);
            }
        }

        flAmount.close();
    }
}