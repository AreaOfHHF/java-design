package DecoratorPatternAPI;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class DecoratorMain2 {

    public static void main(String[] args) throws IOException{

        int c;
        try{
            InputStream inputStream=new LowerCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream("E:\\project\\sources\\idea\\study\\design-study\\src\\DecoratorPatternAPI\\text.txt")
                    )
            );
            while ((c=inputStream.read())>-1){
                System.out.print((char) c);
            }
            inputStream.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }

}
