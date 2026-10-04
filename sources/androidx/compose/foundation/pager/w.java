package androidx.compose.foundation.pager;

import androidx.compose.animation.core.C1610t;
import androidx.compose.runtime.T1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@T1
public interface w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f92539a = a.f92540a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f92540a = new a();

        @NotNull
        public final w a(int i10) {
            if (i10 >= 0) {
                return new y(i10);
            }
            throw new IllegalArgumentException(C1610t.a("pages should be greater than or equal to 0. You have used ", i10, '.').toString());
        }
    }

    int a(int i10, int i11, float f10, int i12, int i13);
}
