package login_app.utils;

public class StringUtils {
    /*
     TODO
     * Buatlah sebuah method static yang akan
     * mengembalikan nickName berdasarkan fullName yang diberikan
     * aturan pembuatan nickName adalah :
     * 1. Jika fullName hanya 1 kata maka nickName = fullName
     * (ex: FullName = Agus, maka NickName = Agus)
     * 2. Jika fullName lebih dari 1 kata maka nickName adalah kata kedua dari
     * fullName
     * (ex: FullName = Eurico Devon, maka NickName = Devon)
     */
    public static String generateNickName(String fullName) {
        // Memecah fullName menjadi array kata-kata
        String[] words = fullName.split(" ");
        
        // Mengembalikan nickName sesuai aturan
        if (words.length == 1) {
            // Jika fullName hanya terdiri dari 1 kata
            return words[0];
        } else {
            // Jika fullName terdiri dari lebih dari 1 kata, maka nickName adalah kata kedua
            return words[1];
        }
    }
}
