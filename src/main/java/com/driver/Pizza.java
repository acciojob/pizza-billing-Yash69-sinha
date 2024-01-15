package com.driver;

public class Pizza {

    private int BillPrice;//total prize
    private Boolean isVeg;
    private String bill;//total billing string format
    private int cheesePrize;
    private int toppingsPrize;
    private int paperbagPrize;
    private boolean isCheeseAdded;
    private boolean istoppingAdded;
    private boolean isPaperbagAdded;
    private boolean isbillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            this.BillPrice =300;
            this.toppingsPrize=70;
        }else
        {
            this.BillPrice =400;
            this.toppingsPrize=120;
        }
        this.cheesePrize=80;
        this.paperbagPrize=20;

        this.bill="Base Price Of The Pizza: "+this.BillPrice+"\n";
        // your code goes here
    }

    public int getBillPrice(){

        return this.BillPrice;
    }

    public void addExtraCheese(){
        if(isCheeseAdded==false)
        {
            BillPrice = BillPrice +cheesePrize;
            isCheeseAdded=true;
        }
        // your code goes here
    }

    public void addExtraToppings(){
        // your code goes here
        if(istoppingAdded==false)
        {
            BillPrice = BillPrice +toppingsPrize;
            istoppingAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if (isPaperbagAdded==false)
        {
            BillPrice +=paperbagPrize;
            isPaperbagAdded=true;
        }
    }

    public String getBill(){
        // your code goes here

        if (isbillGenerated==false)
        {
            if(isCheeseAdded==true)
            {
                bill= bill+"Extra Cheese Added: "+this.cheesePrize+"\n";
            }
            if(istoppingAdded==true)
            {
                bill=bill+"Extra Toppings Added: "+this.toppingsPrize+"\n";
            }
            if(isPaperbagAdded==true)
            {
                bill=bill+"Paperbag Added: "+this.paperbagPrize+"\n";
            }
            bill=bill+"Total Price: "+BillPrice+"\n";
            isbillGenerated=true;
        }

        return this.bill;
    }
}
