class StarbuzzCoffee {
    public static void main(String args[]) {
        Beverage beverage3 = new HouseBlend();
        beverage3.setSize(Size.VENTI);
        beverage3 = new Soy(beverage3);
        beverage3 = new Soy(beverage3);
        System.out.println(beverage3.getDescription()
                + "; Size : " + beverage3.getSize()
                + "; Price : $" + String.format("%.2f", beverage3.cost()));
    }
}
