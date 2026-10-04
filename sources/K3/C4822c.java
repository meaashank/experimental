package k3;

import android.util.Log;
import androidx.annotation.NonNull;
import g3.C4447e;
import g3.InterfaceC4443a;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import y3.C5812a;

/* JADX INFO: renamed from: k3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C4822c implements InterfaceC4443a<ByteBuffer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f214358a = "ByteBufferEncoder";

    @Override // g3.InterfaceC4443a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull ByteBuffer byteBuffer, @NonNull File file, @NonNull C4447e c4447e) throws Throwable {
        try {
            C5812a.f(byteBuffer, file);
            return true;
        } catch (IOException e10) {
            if (!Log.isLoggable(f214358a, 3)) {
                return false;
            }
            Log.d(f214358a, "Failed to write data", e10);
            return false;
        }
    }
}
