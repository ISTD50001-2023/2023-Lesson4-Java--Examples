package Example4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestExecutor {
    public static void main(String[] args) {
        Account account = new Account();
        ExecutorService executorService=Executors.newCachedThreadPool(); for( int i = 0; i < 100; i++){
            executorService.execute( new Add(account));
        }
        executorService.shutdown();
        while( !executorService.isTerminated()){}
        System.out.println(account.getBalance()); //does not display 100!
    }
    private static class Add implements Runnable{
        private Account account;
        Add( Account account){
            this.account = account;
        }

        @Override
        public void run() {
            this.account.deposit(1);
        }
    }
    private static class Account{
        private int balance;
        public int getBalance() {
            return balance;
        }
        public void deposit(int amount){
            int newBalance = balance + amount; waitFor(1);
            balance = newBalance;
        }
    }
    public static void waitFor(int nanoSeconds){

        try{
            Thread.sleep(0, nanoSeconds);
        }catch( InterruptedException ex){
            ex.printStackTrace();
        }
    }
}
