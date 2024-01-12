public class Pizza {
    private double price;
    private Boolean veg;

    private double extraCheesePrice = 1.00;
    private double extraToppingsPrice = 1.50;
    private double takeawayPrice= 2.50;

    private double basePizzaPrice;

    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isTakeAwayAdded = false;


    public Pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg) {
            this.price = 3.50;
        } else{
            this.price=4.50;
        }
        basePizzaPrice = this.price;
    }


    public void addExtraCheese() {
        isExtraCheeseAdded = true;
        this.price += extraCheesePrice;
    }

    public void addExtraToppings() {
        isExtraToppingsAdded = true;
        this.price += extraToppingsPrice;

    }

    public void takeAway() {
        isTakeAwayAdded = true;
        this.price += takeawayPrice;

    }

    public void getBill() {
        String bill = "";
        System.out.println("Pizza: £" + basePizzaPrice);
        if(isExtraCheeseAdded){
            bill += "Extra Cheese added: £" + extraCheesePrice+ "\n";
        }
        if(isExtraToppingsAdded){
            bill += "Extra Toppings added: £" + extraToppingsPrice+ "\n";
        }
        if(isTakeAwayAdded){
            bill += "Take away added: £" + takeawayPrice + "\n";
        }
        bill += "Bill: £" + this.price + "\n";
        System.out.println(bill);



    }
}
