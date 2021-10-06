package synch;

class TaskSynch implements Runnable{
    AccountSynch acc = new AccountSynch();

    @Override
    public void run() {
        while(acc.balance > 0){
            // 100, 200, 300 중의 한 값을 임의로 선택해서 출금(withDraw)한다.
            int money = (int)(Math.random() * 3 + 1) * 100;
            acc.withDraw(money);

        }
    }
}