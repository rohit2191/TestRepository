package TestScript;
import org.monte.media.math.Rational;
import org.monte.media.Format;
import org.monte.screenrecorder.ScreenRecorder;
import static org.monte.media.AudioFormatKeys.*;
import static org.monte.media.VideoFormatKeys.*;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
public class Screencast
{
	GraphicsConfiguration gc = GraphicsEnvironment//
	        .getLocalGraphicsEnvironment()//
	        .getDefaultScreenDevice()//
	        .getDefaultConfiguration();
	 public static ScreenRecorder Screen() throws Exception 
	 {
		 
	        //Create a instance of GraphicsConfiguration to get the Graphics configuration
	        //of the Screen. This is needed for ScreenRecorder class.
	        GraphicsConfiguration gc = GraphicsEnvironment//
	        .getLocalGraphicsEnvironment()//
	        .getDefaultScreenDevice()//
	        .getDefaultConfiguration();
	 
	        //Create a instance of ScreenRecorder with the required configurations
	        ScreenRecorder screenRecorder = new ScreenRecorder(gc,
	        new Format(MediaTypeKey, MediaType.FILE, MimeTypeKey, MIME_AVI),
	        new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
	        CompressorNameKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
	        DepthKey, (int)24, FrameRateKey, Rational.valueOf(15),
	        QualityKey, 1.0f,
	        KeyFrameIntervalKey, (int) (15 * 60)),
	        new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey,"black",
	        FrameRateKey, Rational.valueOf(30)),
	        null);
			return screenRecorder;
	        
	 }
	 
	 
}
