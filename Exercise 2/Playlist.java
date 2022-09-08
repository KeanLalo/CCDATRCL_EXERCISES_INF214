import java.util.LinkedList;

class App {
	public static void main(String[] args){
		LinkedList<String> favoriteSongs = new LinkedList<>();
		
		favoriteSongs.add("Enemy");
		favoriteSongs.add("Burn it all Down");
		favoriteSongs.add("Epiphany");
		favoriteSongs.add("Left and Right");
		favoriteSongs.add("Racing into the night");
		favoriteSongs.add("kanden");
		favoriteSongs.add("uma to shika");
		favoriteSongs.add("Everything goes on");


		favoriteSongs.addFirst("Rude");
		favoriteSongs.addLast("Life goes on");

		System.out.println(favoriteSongs.get(0));

		favoriteSongs.set(6, "New Song replacing Song10");
		favoriteSongs.remove(0);

		System.out.println("My Top 10 Songs are: " + favoriteSongs);
	}
}
