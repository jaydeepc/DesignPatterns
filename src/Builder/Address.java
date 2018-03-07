package Builder;

public class Address {

    private String street;
    private String state;
    private String city;


    private Address(Builder builder){
        this.street = builder.street;
        this.state = builder.state;
        this.city = builder.city;
    }

    public String getStreet() {
        return street;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public static class Builder{

        private String street;
        private String state;
        private String city;

        public Builder street(final String street){
            this.street = street;
            return this;
        }

        public Builder state(final String state){
            this.state = state;
            return this;
        }

        public Builder city(final String city){
            this.city = city;
            return this;
        }

        public Address build(){
            return new Address(this);
        }

    }
}
