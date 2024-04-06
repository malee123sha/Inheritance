public class School {
    void oldLearning() {
        System.out.println("Using Rock Table");
    }
}
class newSchool extends School {
    void newLearning() {
        System.out.println("Using Books");
    }
}
class modernSchool extends newSchool {
    void modernLearning() {
        System.out.println("Using Smart Phones");
    }
}
class Test1 {
    public static void main(String[] args) {
        modernSchool ms = new modernSchool();
        ms.modernLearning();
        ms.newLearning();
        ms.oldLearning();
    }
}
