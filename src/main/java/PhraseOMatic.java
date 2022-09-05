public class PhraseOMatic {
    public static void main(String[] args) {

        String[] wordListOne = {"Multi-million dollar", " A Great", "A Huge", " A Very Successful", "Intelligent"};
        String[] wordListTwo = {"Fantastic", "Powerful", "Perservering", "entertaining", "Fabulous", "Excellent", "Passionate"};
        String[] wordListThree = {"Business", "Company", "Idea", "Project"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;


        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("What we need is a " + phrase);
    }
}



















