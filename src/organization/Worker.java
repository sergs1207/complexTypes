package organization;

public class Worker {

    public String workerName;
    public String workerSurname;
    public Badge myBadge;

    public Worker(String workerName, String workerSurname, Badge myBadge) {
        this.workerName = workerName;
        this.workerSurname = workerSurname;
        this.myBadge = myBadge;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public String getWorkerSurname() {
        return workerSurname;
    }

    public void setWorkerSurname(String workerSurname) {
        this.workerSurname = workerSurname;
    }

    public Badge getMyBadge() {
        return myBadge;
    }

    public void setMyBadge(Badge myBadge) {
        this.myBadge = myBadge;
    }

    public static void main(String[] args) {
        Badge newBadge = new Badge(1, true,false, "01-01-2020");
        Worker sergiiWorker = new Worker("Sergii", "Maksiuta", newBadge);
        System.out.println("Can Sergii access back door of our office?");
        System.out.println(sergiiWorker.myBadge.isIfBackDoor());
    }
}
