package App.Adapters;

public class FileReader implements ImageReaderAdapt{

    ImageAdapter imageAdapter;

    @Override
    public void read(String imageType, String imageName){

        if (imageType.equalsIgnoreCase("jpg")||
        imageType.equalsIgnoreCase("png")) {
            imageAdapter = new ImageAdapter(imageType);
            imageAdapter.read(imageType, imageName);
            System.out.println("Reading type image: "+ imageType);
            System.out.println("Reading name of image: "+ imageName);
        } else {
            System.out.println("Invalid image. " + imageType + " format not supported");
        }
    }
}
