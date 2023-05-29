public class CutomeException {
        public static void main(String[] args) {
            try {
                withdrawMoney(1000, 500);
            } catch (InsufficientFundsException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    
        public static void withdrawMoney(double balance, double amount) throws InsufficientFundsException {
            if (amount > balance) {
                throw new InsufficientFundsException("Insufficient funds in the account!");
            } else {
                // Perform the withdrawal operation
                balance -= amount;
                System.out.println("Withdrawal successful. Remaining balance: " + balance);
            }
        }
    }
    
    class InsufficientFundsException extends Exception {
        public InsufficientFundsException(String message) {
            super(message);
        }
    }
