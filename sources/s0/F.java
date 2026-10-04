package s0;

import com.github.ahmadaghazadeh.editor.processor.TextProcessor;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/* JADX INFO: loaded from: classes.dex */
public class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static a f237957a;

    public interface a {
        void a(String str);
    }

    public static int a(int i10) {
        int i11 = (i10 & (~(i10 >> 31))) - 255;
        return (i11 & (i11 >> 31)) + 255;
    }

    public static void c(String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String strSubstring = (stackTraceElement.getMethodName() + "                  ").substring(0, 17);
        String str2 = ".(" + stackTraceElement.getFileName() + com.prism.gaia.server.accounts.b.f166434b0 + stackTraceElement.getLineNumber() + ")" + TextProcessor.f150538k0.substring(Integer.toString(stackTraceElement.getLineNumber()).length()) + strSubstring;
        System.out.println(str2 + C4.q.f17581a + str);
        a aVar = f237957a;
        if (aVar != null) {
            aVar.a(str2 + C4.q.f17581a + str);
        }
    }

    public static void d(String str, String str2) {
        System.out.println(str + " : " + str2);
    }

    public static void e(String str, int i10) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int iMin = Math.min(i10, stackTrace.length - 1);
        String strA = C4.q.f17581a;
        for (int i11 = 1; i11 <= iMin; i11++) {
            StackTraceElement stackTraceElement = stackTrace[i11];
            String str2 = ".(" + stackTrace[i11].getFileName() + com.prism.gaia.server.accounts.b.f166434b0 + stackTrace[i11].getLineNumber() + ") " + stackTrace[i11].getMethodName();
            strA = androidx.compose.runtime.changelist.j.a(strA, C4.q.f17581a);
            System.out.println(str + strA + str2 + strA);
        }
    }

    public static void f(String str, String str2) {
        System.err.println(str + " : " + str2);
    }

    public static int g(float f10, float f11, float f12, float f13) {
        int iA = a((int) (f10 * 255.0f));
        int iA2 = a((int) (f11 * 255.0f));
        return (iA << 16) | (a((int) (f13 * 255.0f)) << 24) | (iA2 << 8) | a((int) (f12 * 255.0f));
    }

    public static void h(a aVar) {
        f237957a = aVar;
    }

    public static void i(String str) {
        try {
            OutputStream outputStream = new Socket(H3.b.f45544f, 5327).getOutputStream();
            outputStream.write(str.getBytes());
            outputStream.close();
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    public int b(float[] fArr) {
        return (a((int) (fArr[3] * 255.0f)) << 24) | (a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
    }
}
