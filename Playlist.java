mport java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {

    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

    desertIslandPlaylist.add("Tinashe - 2 on");
    desertIslandPlaylist.add("Chaka Khan - I feel for you");
    desertIslandPlaylist.add("Megan Thee Stallion -Savage");
    desertIslandPlaylist.add("Michael Jackson - Remember the Time");
    desertIslandPlaylist.add("Jody Watly-Looking for a new love");
    desertIslandPlaylist.add("Mariah Carey - A no no");

    desertIslandPlaylist.remove(4);
    System.out.println(desertIslandPlaylist.size());

    int indexA = desertIslandPlaylist.indexOf("Tinashe - 2 on");
    int indexB = desertIslandPlaylist.indexOf("Mariah Carey - A no no");

    String tempA = "Tinashe - 2 on";

    desertIslandPlaylist.set(indexA, "Mariah Carey - A no no");
    desertIslandPlaylist.set(indexB, tempA);
    System.out.println(desertIslandPlaylist);
