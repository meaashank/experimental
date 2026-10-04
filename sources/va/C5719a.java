package va;

import java.io.IOException;
import wa.C5770a;
import wa.InterfaceC5771b;
import xa.C5800b;

/* JADX INFO: renamed from: va.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C5719a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f239921a = 10;

    public static InterfaceC5771b a(InterfaceC5771b interfaceC5771b, C5800b c5800b) throws IllegalAccessException, IOException {
        int iV1 = interfaceC5771b.V1();
        String strJ2 = interfaceC5771b.j2("Location");
        int i10 = 0;
        while (b(iV1)) {
            if (strJ2 == null) {
                throw new IllegalAccessException("Location is null");
            }
            c5800b.y0(strJ2);
            interfaceC5771b = interfaceC5771b.clone();
            C5770a c5770a = (C5770a) interfaceC5771b;
            c5770a.m3(c5800b);
            int iV12 = c5770a.V1();
            String headerField = c5770a.f240175a.getHeaderField("Location");
            i10++;
            if (i10 >= 10) {
                throw new IllegalAccessException("Max redirection done");
            }
            strJ2 = headerField;
            iV1 = iV12;
        }
        return interfaceC5771b;
    }

    public static boolean b(int i10) {
        return i10 == 301 || i10 == 302 || i10 == 303 || i10 == 300 || i10 == 307 || i10 == 308;
    }
}
