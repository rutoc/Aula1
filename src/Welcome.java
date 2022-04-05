public class Welcome {

    public static void main(String[] args) {


        Person p1 = new Vendor();

        p1.setName("Adalberto");

        Vendor v1 = (Vendor) p1; //Down Casting

        v1.setCompanyName("CrepeSuico");


        System.out.println(p1.getName() + " trabalha na " + v1.getCompanyName());



        Person p1e = new Employee();

        Employee e1 = (Employee) p1e;

        e1.setName("Abertino");
        e1.setCpf(654987);
        e1.setFullBadge(321987);

        System.out.println("Nome: " + e1.getName() + "\n CPF : "+ e1.getCpf() + "\n Definitive Badge: " + e1.getFullBadge());


        Person p2 = new Employee();

        Employee e2 = (Employee) p2;

        e2.setName("Ricardown");
        e2.setCpf(654987);
        e2.setFullBadge(98765432);

        System.out.println("Nome: " + e2.getName() + "\nCPF: " + e2.getCpf() + "\nBadge Definitivo: " + e2.getFullBadge());




        /*
        Person p1 = new Person();

        p1.setName("Damastor");
        p1.setCpf(1254478);
        System.out.println(p1.getName());
        System.out.println(p1.getCpf());

        Vendor vd1 = new Vendor();

        vd1.setName("Adalberto");
        vd1.setCompanyName("CrepeSuico");
        System.out.println(vd1.getName()+ " trabalha na "+ vd1.getCompanyName() + "\n");

        Employee e1 = new Employee();

        e1.setName("Roberval");
        e1.setFullBadge(321654);
        System.out.println(e1.getName() + " possui Badge definitivo de numero: "+ e1.getFullBadge()+ "\n");

        Visitor vs1 = new Visitor();

        vs1.setName("Clovis");
        vs1.setTempBadge(654321);
        System.out.println(vs1.getName() + " possui Badge temporario de numero : " + vs1.getTempBadge()+ "\n");


         */

    }
}
