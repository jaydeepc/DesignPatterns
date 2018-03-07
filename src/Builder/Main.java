package Builder;

public class Main {


    public static void main(String[] args){

        Name name = new Name.Builder()
                        .firstname("Jaydeep")
                        .lastname("Chakrabarty")
                        .build();

        Address address = new Address.Builder()
                                .street("101 AppSec Street")
                                .city("Bangalore")
                                .state("Karnataka")
                                .build();

        People people = new People.Builder().name(name).address(address).build();

        System.out.println(people.getAddress().getState());
        System.out.println(people.getName().getFirstname());

    }

}
