package Xa;

import android.util.Log;
import com.prism.commons.utils.l0;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f78756a = l0.b(d.class.getSimpleName());

    public static InputStream a(InputStream inputStream, int i10) throws IOException {
        Qa.a aVarA = Qa.c.a(inputStream, i10);
        Log.d(f78756a, "decrypt detect type: " + aVarA.f67660a);
        return new c(aVarA.f67662c, aVarA.f67663d, aVarA.f67660a);
    }

    public static InputStream b(InputStream inputStream, int i10) throws IOException {
        Qa.b bVarD = Qa.c.d(inputStream, i10);
        return new c(bVarD.f67666c, bVarD.f67665b, bVarD.f67664a);
    }

    public static long c(int i10) {
        return Qa.c.h(i10);
    }
}
