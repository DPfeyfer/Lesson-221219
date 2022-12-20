public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        dog = dog + 4;
        System.out.println(dog);
        dog = dog - 3.5;
        System.out.println(dog);


        var cat = 3.6;
        System.out.println(cat);
        cat = cat + 4;
        System.out.println(cat);
        cat = cat - 1.6;
        System.out.println(cat);


        var paper = 763789;
        System.out.println(paper);
        paper = paper + 4;
        System.out.println(paper);
        paper = paper - 7639;
        System.out.println(paper);


        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);


        var frog = 3.5;
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);


        var boxerPiter = 78.2;
        var boxerIvan = 82.7;
        var fullWeight = boxerPiter + boxerIvan;
        System.out.println("Full weight boxer is " + fullWeight + " kg!");
        var differenceWeight = boxerIvan - boxerPiter;
        System.out.println("Difference weight between boxer is " + differenceWeight + " kg!");
        var differenceWeight1 = fullWeight % boxerPiter;
        System.out.println("Difference weight between boxer is " + differenceWeight1 + " kg!");

        var workHours = 640;
        var workDay = 8;
        var companyWorkers = workHours / workDay;
        System.out.println("Total worker in company is " + companyWorkers + " human!");


        var addedWorker = 94;
        var totalWorker = companyWorkers + addedWorker;
        var workDayNow = workHours / totalWorker;
        System.out.println("If in company " + totalWorker + " human then only " + workDayNow + " hours of work can be divided among employees!");}}

