package Builder;

public class Name {

    private String firstname;
    private String middlename;
    private String lastname;


    private Name(Builder builder){
        this.firstname = builder.firstname;
        this.middlename = builder.middlename;
        this.lastname = builder.lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public static class Builder{

        private String firstname;
        private String middlename;
        private String lastname;

        public Builder firstname(final String firstname){
            this.firstname = firstname;
            return this;
        }

        public Builder middlename(final String middlename){
            this.middlename = middlename;
            return this;
        }

        public Builder lastname(final String lastname){
            this.lastname = lastname;
            return this;
        }

        public Name build(){
            return new Name(this);
        }

    }
}
