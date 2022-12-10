public class Customer {

    private final String name;
    private final String email;
    private final int phoneNumber;
    private final boolean cardPresent;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public boolean isCardPresent() {
        return cardPresent;
    }

    public static class Builder {
        //required
        private final String name;
        private final String email;

        //optional
        private int phoneNumber;
        private boolean cardPresent;

        public Builder(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public Builder withPhoneNumber(int phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder withCardPresent(boolean cardPresent) {
            this.cardPresent = cardPresent;
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }
    }

    public Customer(Builder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.phoneNumber = builder.phoneNumber;
        this.cardPresent = builder.cardPresent;
    }
}