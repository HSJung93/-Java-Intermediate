package synch;

class AccountSynch{
    int balance = 1000;

    public synchronized void withDraw(int money){

        if(balance >= money){
            try{
                Thread thread = Thread.currentThread();
                System.out.println(thread.getName() + " 출금 금액 ->> "+money);
                Thread.sleep(1000);
                balance -= money;
                System.out.println(thread.getName()+" balance:" + balance);

            }catch (Exception e) {}

        }
    }
}

