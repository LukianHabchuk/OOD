package Adapter;

import Adapter.Image.PictureViewer;

public class Main {
    public static void main(String[] args) {
        PictureViewer pictureViewer = new PictureViewer();
        pictureViewer.WatchImage("title",".jpeg");
        pictureViewer.WatchImage("title1",".bmp");
        pictureViewer.WatchImage("title2",".img");
        pictureViewer.WatchImage("title3",".gif");
        pictureViewer.WatchImage("title4",".jpg");
    }
}
