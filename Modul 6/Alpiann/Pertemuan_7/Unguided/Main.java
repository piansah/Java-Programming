package main.java.com.Alpian.Pertemuan_7.Unguided;
/**
 *
 * @author
 * Alif Alpian Sahrul Muharom
 * 20102007
 * IF-08-0
 */
public class Main {
    public static void main(String[] args) {
        
        SalariedEmployee salaried = new SalariedEmployee(100_000, 
                "Johnny B. Goode", 
                "2110211", 0, 0);
        CommissionEmployee commission = new CommissionEmployee(100, 
                "Gaunter O'dymm", 
                "2001666", 
                5_000_000, 25_000);
        
        ProjectPlanner project = new ProjectPlanner(4, "Ryuugoku", 
                "2001345", 
                5_500_000, 30_000);
        
            
        System.out.println("DATA SALARIED EMPLOYEE");
        salaried.cetakSE();
                
        System.out.println("\nDATA COMMISSION EMPLOYEE");
        commission.cetakCE();
        
        System.out.println("\nDATA PROJECT PLANNER");
        project.cetakPP();
    }
}
