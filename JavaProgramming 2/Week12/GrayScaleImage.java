package Week12;
// 응용 2 : 영상 처리
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GrayScaleImage extends JFrame {

	BufferedImage inputImage, outputImage;
	int width;
	int height;

	public GrayScaleImage() {
		try {
			File input = new File("Lenna.png");
			inputImage = ImageIO.read(input);
			width = inputImage.getWidth();
			height = inputImage.getHeight();

			for (int r = 0; r < height; r++) {
				for (int c = 0; c < width; c++) {

					Color color = new Color(inputImage.getRGB(r, c));

					int red = (int) (color.getRed());
					int green = (int) (color.getGreen());
					int blue = (int) (color.getBlue());
					int avg = (red + green + blue) / 3;
					Color newColor = new Color(avg, avg, avg);

					inputImage.setRGB(r, c, newColor.getRGB());
				}
			}

			File output = new File("output.png");
//			ImageIO.write(inputImage, "png", output);
			outputImage = inputImage;
			inputImage = ImageIO.read(input);
			add(new ImagePanel(), BorderLayout.WEST);
			add(new ImagePanel(outputImage), BorderLayout.CENTER);
			pack();
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);

		} catch (Exception e) {
			System.out.println("이미지 읽기 실패!");
		}
	}

	class ImagePanel extends JPanel {
		BufferedImage image;
		
		public ImagePanel() {
			image = inputImage;
		}
		public ImagePanel(BufferedImage img)
		{
			image = img;
		}
		
		public void paintComponent(Graphics g) {
			g.drawImage(image, 0, 0, null);
		}

		public Dimension getPreferredSize() {
			if (image == null) {
				return new Dimension(100, 100);
			} else {
				return new Dimension(image.getWidth(null),
						image.getHeight(null));
			}
		}
	}

	static public void main(String args[]) throws Exception {
		GrayScaleImage obj = new GrayScaleImage();
	}
}

