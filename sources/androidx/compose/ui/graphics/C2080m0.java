package androidx.compose.ui.graphics;

import android.graphics.Canvas;
import androidx.compose.ui.graphics.m3;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2080m0 {
    @NotNull
    public static final Canvas.VertexMode a(int i10) {
        m3.a aVar = m3.f101346b;
        aVar.getClass();
        if (i10 == m3.f101347c) {
            return Canvas.VertexMode.TRIANGLES;
        }
        aVar.getClass();
        if (i10 == m3.f101348d) {
            return Canvas.VertexMode.TRIANGLE_STRIP;
        }
        aVar.getClass();
        return i10 == m3.f101349e ? Canvas.VertexMode.TRIANGLE_FAN : Canvas.VertexMode.TRIANGLES;
    }
}
