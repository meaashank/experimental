package androidx.compose.runtime.changelist;

import androidx.compose.runtime.internal.r;
import com.bumptech.glide.load.engine.GlideException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@r(parameters = 1)
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f99547a = 0;

    public static /* synthetic */ String b(k kVar, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toDebugString");
        }
        if ((i10 & 1) != 0) {
            str = GlideException.a.f139488d;
        }
        return kVar.a(str);
    }

    @NotNull
    public abstract String a(@NotNull String str);
}
