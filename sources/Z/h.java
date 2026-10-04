package Z;

import android.content.res.Resources;
import android.util.TypedValue;
import androidx.collection.C1562v0;
import androidx.compose.runtime.internal.r;
import e.InterfaceC4346u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@r(parameters = 0)
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f79389b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final C1562v0<TypedValue> f79390a = new C1562v0<>(0, 1, null);

    public final void a() {
        synchronized (this) {
            this.f79390a.P();
        }
    }

    @NotNull
    public final TypedValue b(@NotNull Resources resources, @InterfaceC4346u int i10) {
        TypedValue typedValueN;
        synchronized (this) {
            typedValueN = this.f79390a.n(i10);
            if (typedValueN == null) {
                typedValueN = new TypedValue();
                resources.getValue(i10, typedValueN, true);
                this.f79390a.c0(i10, typedValueN);
            }
        }
        return typedValueN;
    }
}
