package App.Adapters;

import App.Readers.AdvancedImageReader;
import App.Readers.JPGReader;
import App.Readers.PNGReader;

public class ImageAdapter implements ImageReaderAdapt{

    AdvancedImageReader advancedImageReader;

    public ImageAdapter(String imageType){

        if (imageType.equalsIgnoreCase("jpg")){
            advancedImageReader = new JPGReader();
        } else if (imageType.equalsIgnoreCase("png")) {
            advancedImageReader = new PNGReader();
        }
    }

    @Override
    public void read(String imageType, String imageName) {

        if (imageName.equalsIgnoreCase("jpg")) {
            advancedImageReader.readJPG(imageName);
        } else if (imageName.equalsIgnoreCase("png")) {
            advancedImageReader.readPNG(imageType);
        }
    }
}
