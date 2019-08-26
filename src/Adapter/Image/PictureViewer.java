package Adapter.Image;

import Adapter.Adapter.ImageAdapter;

public class PictureViewer implements ImageViewer {
    @Override
    public void WatchImage(String title, String format) {
        switch (format){
            case (".img"): {
                System.out.println("Watching "+title+".img");
                break;
            }
            case (".jpeg"): {
                System.out.println("Watching "+title+".jpeg");
                break;
            }
            case (".bmp"): {
                System.out.println("Watching "+title+".bmp");
                break;
            }
            case (".gif"): {
                ImageAdapter imageAdapter = new ImageAdapter(format);
                imageAdapter.WatchImage(title,format);
                break;
            }
            default:
                System.out.println("Format "+format+" not supporterd");
        }
    }
}
