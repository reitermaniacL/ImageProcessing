package pixelfilters;

public class InvertFilter extends PixelFilter {

	@Override
	protected int calculate(int pixel) {
		int r = 255 - getR(pixel);
		int g = 255 - getG(pixel);
		int b = 255 - getB(pixel);
		return rgbPixel(r, g, b);
	}
	
}
