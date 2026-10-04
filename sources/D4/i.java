package d4;

import G0.C1142d;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.BlendModeCompat;
import e.InterfaceC4337k;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class i {
    public static final void a(@NotNull Drawable drawable, @InterfaceC4337k int i10) {
        G.p(drawable, "<this>");
        drawable.setColorFilter(C1142d.a(i10, BlendModeCompat.SRC_IN));
    }
}
