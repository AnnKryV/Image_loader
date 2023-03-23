package App.Readers;

public class JPGReader implements AdvancedImageReader{

    @Override
    public void readJPG(String imgName){
        System.out.println("Reading jpg image: " + imgName);
    }
    @Override
    public void readPNG(String imgName) {
    }
}
