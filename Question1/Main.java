class Main{
    public static void main(String[] args){
        SalariedEmployee JoeJones = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500);
        SalariedEmployee RenwaChanel = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700);
        HourlyEmployee StephanieSmith = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32);
        HourlyEmployee MaryQuinn = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47);
        CommissionEmployee NicoleDior = new CommissionEmployee("Nicole", "Dior", "444-44-4444", 0.15, 50000);
        CommissionEmployee MahnazVaziri = new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 0.22, 40000);
    }
}