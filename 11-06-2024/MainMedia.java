

import comMedia.media.Media;
import comMedia.media.Book;
import comMedia.media.CD;
import comMedia.media.DVD;

public class MainMedia {
    public static void main(String[] args) {
        Media[] mediaArray = new Media[3];
        mediaArray[0] = new Book();
        mediaArray[1] = new CD();
        mediaArray[2] = new DVD();

        for (Media media : mediaArray) {
            media.displayInfo();
        }
    }
}
