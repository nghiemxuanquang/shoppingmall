package com.common;



import com.mortennobel.imagescaling.AdvancedResizeOp;
import com.mortennobel.imagescaling.ResampleOp;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageUpload {

    public void saveImage(byte[] bytes, String imageFileName, String rootPath) throws IOException {

        File serverFile = imageWrite(bytes, imageFileName, rootPath);
        if(bytes.length>1000000){
            imageResizing(imageFileName, rootPath, serverFile);
        }

    }

    private File imageWrite(byte[] bytes, String imageFileName,
                            String rootPath) throws IOException {
        File dir = new File(rootPath);
        if(!dir.exists()){
            dir.mkdir();
        }
        File serverFile = new File(dir.getAbsolutePath()+File.separator+imageFileName);
        BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
        stream.write(bytes);
        stream.close();
        return serverFile;
    }

    private void imageResizing(String imageFileName, String rootPath,File serverFile) throws IOException {
        BufferedImage resizeFile = ImageIO.read(serverFile);
        ResampleOp resampleOp = new ResampleOp(450,300);
        resampleOp.setUnsharpenMask(AdvancedResizeOp.UnsharpenMask.VerySharp);
        BufferedImage rescaled = resampleOp.filter(resizeFile, null);

        String thumbnailImage = "thumbnail_"+imageFileName;
        File thumbnailDir = new File(rootPath);
        if(!thumbnailDir.exists()){
            thumbnailDir.mkdir();
        }

        File thumbnailImageFile = new File(thumbnailDir.getAbsolutePath()+File.separator+thumbnailImage);

        ImageIO.write(rescaled,"JPG",thumbnailImageFile);

    }



}
