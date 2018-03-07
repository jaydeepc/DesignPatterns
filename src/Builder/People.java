package Builder;


public class People {

    private final Name name;
    private final Address address;

    private People(Builder builder){
        this.name = builder.name;
        this.address = builder.address;
    }

    public Name getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public static class Builder {

        private Name name;
        private Address address;

        public Builder name(final Name name){
            this.name = name;
            return this;
        }

        public Builder address(final Address address){
            this.address = address;
            return this;
        }

        public People build(){
            return new People(this);
        }

    }


}
