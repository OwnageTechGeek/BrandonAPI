/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;

package Sound;

/**
 *
 * @author hogueb10289
 */
public class Wav {
    
    public void play(File file) {
        try
        {
            final Clip clip = (Clip)AudioSystem.getLine(new Line.Info(Clip.class));
            
            clip.addLineListener(new LineListener()
            {
                @Override
                public void update(LineEvent event)
                {
                    if (event.getType() == LineEvent.Type.STOP)
                        clip.close();
                }
            });
            
            clip.open(AudioSystem.getAudioInputStream(file));
            clip.start();
        }
        catch(LineUnavailableException | UnsupportedAudioFileException | IOException exc)
        {
            exc.printStackTrace(System.out);
        }
    }
    
                }
            }
        }
    }
    
}
