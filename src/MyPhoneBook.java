public class MyPhoneBook {



    private PhoneNumber[] phoneNumbers = new PhoneNumber[10];

    public void addPhoneNumber(String name, String phone) {
        PhoneNumber phoneNumber = new PhoneNumber(name, phone);

        for (int i = 0; i < phoneNumbers.length; i++) {
            if (phoneNumbers[i] == null) {
                phoneNumbers[i] = phoneNumber;
                break;
            }
        }
    }

    public void printPhoneBook() {
        for (PhoneNumber phoneNumber:phoneNumbers) {
            if(phoneNumber != null) {
                System.out.println(phoneNumber);
            }
        }
    }

    static class PhoneNumber {
        private String name;
        private String phone;

        public PhoneNumber(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }

        public String getName() {
            return name;
        }

        public String getPhone() {
            return phone;
        }

        @Override
        public String toString() {
            return "PhoneNumber{" +
                    "name='" + name + '\'' +
                    ", phone='" + phone + '\'' +
                    '}';
        }
    }
}
