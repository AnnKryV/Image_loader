package App.Readers;

public class PNGReader implements AdvancedImageReader{

    @Override
    public void readPNG(String imgName){
        System.out.println("Reading png image: " + imgName);
    }
    @Override
    public void readJPG(String imgName) {
    }
}
