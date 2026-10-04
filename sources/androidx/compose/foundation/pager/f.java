package androidx.compose.foundation.pager;

import androidx.compose.runtime.T1;
import k0.InterfaceC4814e;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@T1
public interface f {

    @androidx.compose.runtime.internal.r(parameters = 1)
    public static final class b implements f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f92483b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f92484a;

        public /* synthetic */ b(float f10, C4969v c4969v) {
            this(f10);
        }

        @Override // androidx.compose.foundation.pager.f
        public int a(@NotNull InterfaceC4814e interfaceC4814e, int i10, int i11) {
            return interfaceC4814e.I1(this.f92484a);
        }

        public final float b() {
            return this.f92484a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return k0.i.l(this.f92484a, ((b) obj).f92484a);
            }
            return false;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f92484a);
        }

        public b(float f10) {
            this.f92484a = f10;
        }
    }

    int a(@NotNull InterfaceC4814e interfaceC4814e, int i10, int i11);

    @androidx.compose.runtime.internal.r(parameters = 1)
    public static final class a implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f92481a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f92482b = 0;

        @Override // androidx.compose.foundation.pager.f
        public int a(@NotNull InterfaceC4814e interfaceC4814e, int i10, int i11) {
            return i10;
        }
    }
}
