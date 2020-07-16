class Ideone{
    public static void main(String[] args){
        System.out.println("Кофе-машина");
        
        int moneyAmount = 120;
        int cappucinoPrice = 150;
        int espressowPrice = 80;
        int waterPrice = 20;
        int milkPrice = 50;
        boolean canBuyAnything = false;
        
        if(moneyAmount >= cappucinoPrice){
            System.out.println("Вы можете купить капучино");
            canBuyAnything = true;
        }
        if(moneyAmount >= espressowPrice){
            System.out.println("Вы можете купить эспрессо");
            canBuyAnything = true;
        }
        if(moneyAmount >= waterPrice){
            System.out.println("Вы можете купить воду");
            canBuyAnything = true;
        }
        if(moneyAmount >= milkPrice){
            System.out.println("Вы можете купить молоко");
            canBuyAnything = true;
        }
        if(canBuyAnything == false){
            System.out.println("Недостаточно средств");
        }
    }
}
