import com.sun.jna.Library;
import com.sun.jna.Native;

public class JNATest {
	static {
		System.load("/Users/......./libNativeTest.dylib");
	}

	public interface NativeTest extends Library {
		public float ast();
	}

	public static void main(String[] args) {
		NativeTest nt = (NativeTest) Native.loadLibrary("NativeTest", NativeTest.class);
		if (nt != null) {
			float x = nt.ast();
			System.out.println("X===="+x);
		}
	}


}
