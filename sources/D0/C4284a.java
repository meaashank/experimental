package d0;

import android.text.SegmentFinder;
import androidx.compose.runtime.internal.r;
import b0.C2748a;
import e.InterfaceC4345t;
import e.T;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: d0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@T(34)
@r(parameters = 1)
public final class C4284a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C4284a f194540a = new C4284a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f194541b = 0;

    /* JADX INFO: renamed from: d0.a$a, reason: collision with other inner class name */
    public static final class C0710a extends SegmentFinder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4289f f194542a;

        public C0710a(InterfaceC4289f interfaceC4289f) {
            this.f194542a = interfaceC4289f;
        }

        public int nextEndBoundary(int i10) {
            return this.f194542a.d(i10);
        }

        public int nextStartBoundary(int i10) {
            return this.f194542a.b(i10);
        }

        public int previousEndBoundary(int i10) {
            return this.f194542a.a(i10);
        }

        public int previousStartBoundary(int i10) {
            return this.f194542a.c(i10);
        }
    }

    @InterfaceC4345t
    @NotNull
    public final SegmentFinder a(@NotNull InterfaceC4289f interfaceC4289f) {
        return C2748a.a(new C0710a(interfaceC4289f));
    }
}
