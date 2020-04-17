/**
 * 
 */
package ImageViewer;

import java.awt.EventQueue;

import javax.swing.JFrame;

/**
 * @author leihuang
 *
 */
public class ImageViewer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(()->{
			var frame = new ImageViewerFrame();
			frame.setTitle("ImageViewer");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		});
	}

}
