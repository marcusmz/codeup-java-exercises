//public class ServerNameGenerator {
//
//    private String[] adjectives = {"alert", "blue", "cruel", "clumsy", "kind", "dark", "ill", "healthy", "hungry", "easy"};
//    private String[] nouns = {"apple", "rose", "ice", "pillow", "animal", "bed", "camera", "jelly", "france", "zoo"};
//
//    public String[] getAdjectives() {
//        return adjectives;
//    }
//
//    public void setAdjectives(String[] adjectives) {
//        this.adjectives = adjectives;
//    }
//
//    public String[] getNouns() {
//        return nouns;
//    }
//
//    public void setNouns(String[] nouns) {
//        this.nouns = nouns;
//    }
//
//    private static String getStringInArray(String[] arrayOfStrings){
//        return arrayOfStrings[(int) Math.ceil(Math.random() * arrayOfStrings.length-1)];
//    }
//
//    public static void main(String[] args) {
//        ServerNameGenerator serverNameGenerator = new ServerNameGenerator();
//        System.out.println("Here is your server name:");
//        String noun = getStringInArray(serverNameGenerator.getNouns());
//        String adjective = getStringInArray(serverNameGenerator.getAdjectives());
//        System.out.printf("%s-%s%n", adjective, noun);
//    }
//}
