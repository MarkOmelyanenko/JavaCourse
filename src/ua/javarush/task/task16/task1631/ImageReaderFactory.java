package ua.javarush.task.task16.task1631;

import ua.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {
    private ImageReaderFactory() {
    }

    public static ImageReader getImageReader(ImageTypes type) {
        if (type == null) {
            throw new IllegalArgumentException("Невідомий тип картинки");
        }
        ImageReader imageReader;
        switch (type) {
            case BMP:
                imageReader = new BmpReader();
                break;
            case JPG:
                imageReader = new JpgReader();
                break;
            case PNG:
                imageReader = new PngReader();
                break;
            default:
                throw new IllegalArgumentException("Невідомий тип картинки");
        }
//        if (type == ImageTypes.BMP) {
//            imageReader = new BmpReader();
//        } else if (type == ImageTypes.JPG) {
//            imageReader = new JpgReader();
//        } else if (type == ImageTypes.PNG) {
//            imageReader = new PngReader();
//        } else {
//            throw new IllegalArgumentException("Невідомий тип картинки");
//        }

        return imageReader;
    }
}

