package q3;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.engine.s;
import g3.C4447e;
import g3.InterfaceC4449g;
import java.io.File;
import java.io.IOException;
import y3.C5812a;

/* JADX INFO: renamed from: q3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5425d implements InterfaceC4449g<C5424c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f226768a = "GifEncoder";

    @Override // g3.InterfaceC4449g
    @NonNull
    public EncodeStrategy a(@NonNull C4447e c4447e) {
        return EncodeStrategy.SOURCE;
    }

    @Override // g3.InterfaceC4443a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull s<C5424c> sVar, @NonNull File file, @NonNull C4447e c4447e) throws Throwable {
        try {
            C5812a.f(sVar.get().c(), file);
            return true;
        } catch (IOException e10) {
            if (!Log.isLoggable(f226768a, 5)) {
                return false;
            }
            Log.w(f226768a, "Failed to encode GIF drawable data", e10);
            return false;
        }
    }
}
