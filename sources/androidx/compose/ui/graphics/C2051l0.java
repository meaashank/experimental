package androidx.compose.ui.graphics;

import android.graphics.Shader;
import android.os.Build;
import androidx.compose.ui.graphics.i3;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2051l0 {

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.l0$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f101143a;

        static {
            int[] iArr = new int[Shader.TileMode.values().length];
            try {
                iArr[Shader.TileMode.CLAMP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Shader.TileMode.MIRROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Shader.TileMode.REPEAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f101143a = iArr;
        }
    }

    public static final boolean a(int i10) {
        if (Build.VERSION.SDK_INT >= 31) {
            return true;
        }
        i3.f101130b.getClass();
        return i10 != i3.f101134f;
    }

    @NotNull
    public static final Shader.TileMode b(int i10) {
        i3.a aVar = i3.f101130b;
        aVar.getClass();
        if (i10 == i3.f101131c) {
            return Shader.TileMode.CLAMP;
        }
        aVar.getClass();
        if (i10 == i3.f101132d) {
            return Shader.TileMode.REPEAT;
        }
        aVar.getClass();
        if (i10 == i3.f101133e) {
            return Shader.TileMode.MIRROR;
        }
        aVar.getClass();
        return i10 == i3.f101134f ? Build.VERSION.SDK_INT >= 31 ? j3.f101137a.b() : Shader.TileMode.CLAMP : Shader.TileMode.CLAMP;
    }

    public static final int c(@NotNull Shader.TileMode tileMode) {
        int i10 = a.f101143a[tileMode.ordinal()];
        if (i10 == 1) {
            i3.f101130b.getClass();
            return i3.f101131c;
        }
        if (i10 == 2) {
            i3.f101130b.getClass();
            return i3.f101133e;
        }
        if (i10 == 3) {
            i3.f101130b.getClass();
            return i3.f101132d;
        }
        if (Build.VERSION.SDK_INT >= 31 && tileMode == Shader.TileMode.DECAL) {
            return j3.f101137a.a();
        }
        i3.f101130b.getClass();
        return i3.f101131c;
    }
}
