public class BeerSong {
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "bottles";
        String word2 = "bottle";


        while (beerNum > 0) {

            if (beerNum > 1) {
                System.out.println(beerNum + " " + word + " of beer on the wall");
                System.out.println(beerNum + " " + word + " of beer");
                System.out.println("Take one down.");
                System.out.println("Pass it around.");
            }



            if (beerNum == 1){
                System.out.println(beerNum + " " + word2 + " of beer on the wall");
                System.out.println(beerNum + " " + word2 + " of beer");
                System.out.println("Take one down.");
                System.out.println("Pass it around.");


            }


            beerNum = beerNum -1;

        }
        System.out.println("NO more bottles of beer on the wall");

    }
}







