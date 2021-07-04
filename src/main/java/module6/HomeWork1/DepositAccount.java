package module6.HomeWork1;


import java.time.LocalDateTime;


public class DepositAccount extends BankAccount{
    LocalDateTime date1;
    LocalDateTime date2;

    public DepositAccount(double money){
        super(money);
    }

    public void withdrawMoney(double withdrawedMoney) {
        date1 = LocalDateTime.now();
        if ((date1 == date2.plusMonths(1))) {
            this.money = this.money - withdrawedMoney;
        }else{
            System.out.println("Средства снять невозможно");
        }
    }
    @Override
    public void depositMoney (double depositedMoney)  {
        date2 = LocalDateTime.now();
        this.money = this.money + depositedMoney;
    }
}
