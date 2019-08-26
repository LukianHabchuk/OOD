package Adapter.Adapter;

import Adapter.Animation.AnimatedImageViewer;
import Adapter.Animation.GifViewer;
import Adapter.Image.ImageViewer;

public class ImageAdapter implements ImageViewer {

    private AnimatedImageViewer animatedImageViewer;

    public ImageAdapter(String format){
        if(format.equalsIgnoreCase(".gif")){
            animatedImageViewer = new GifViewer();
        }
    }

    @Override
    public void WatchImage(String title, String format) {
        if(format.equalsIgnoreCase(".gif")){
            animatedImageViewer.watchGif(title);
        }
    }
}
