class Reservation {

    int availableBerths = 5;

    synchronized void bookBerth(String name, int berthsRequested) {

        System.out.println(name + " is requesting " + berthsRequested + " berth(s)");

        if (berthsRequested <= availableBerths) {

            System.out.println("Berth confirmed for " + name);
            availableBerths = availableBerths - berthsRequested;

            System.out.println("Ticket printed for " + name);
            System.out.println("Remaining berths: " + availableBerths);
        }

        else {

            System.out.println("Sorry " + name + ", No berths available");
            System.out.println("Remaining berths: " + availableBerths);
        }

        System.out.println("--------------------------------");
    }
}

class Person extends Thread {

    Reservation res;
    String personName;
    int berths;

    Person(Reservation r, String name, int b) {

        res = r;
        personName = name;
        berths = b;
    }

    public void run() {

        res.bookBerth(personName, berths);
    }
}

public class task11 {

    public static void main(String[] args) {

        Reservation r = new Reservation();

        Person p1 = new Person(r, "Person1", 2);
        Person p2 = new Person(r, "Person2", 1);
        Person p3 = new Person(r, "Person3", 3);
        Person p4 = new Person(r, "Person4", 1);

        p1.start();
        p2.start();
        p3.start();
        p4.start();
    }
}
