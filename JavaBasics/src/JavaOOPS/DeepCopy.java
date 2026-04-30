package JavaOOPS;


class Job {
    String job;

    Job(String job) {
        this.job = job;
    }

    //@Override
//    public String toString() {
//        return job;
//    }
}

public class DeepCopy {
    int id;
    String name;
    Job job;

     DeepCopy(int id, String name, Job job) {
        this.id = id;
        this.name = name;
        this.job = new Job(job.job); // Deep copy
    }

    public static void main(String[] args) {
        Job job = new Job("Pilot");
        DeepCopy de = new DeepCopy(114, "Likhitha Munagapati", job);

        System.out.println(de.id);
        System.out.println(de.name);
        System.out.println(de.job.job);

        System.out.println("-------------------");

        //Job job1 = new Job("Loco Pilot");
        DeepCopy dd = new DeepCopy(122, "Lokaksha", job);

        System.out.println(dd.id);
        System.out.println(dd.name);
        System.out.println(dd.job.job);
        //System.out.println(de.job);
    }
}