package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class n {
    public static final int a(@NotNull m mVar) {
        return (int) (mVar.a() == Orientation.Vertical ? mVar.b() & ZipKt.f225990j : mVar.b() >> 32);
    }
}
