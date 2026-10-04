package androidx.compose.foundation.text.input;

import androidx.activity.C1477d;
import androidx.compose.foundation.text.C1758e;
import androidx.compose.runtime.InterfaceC1924k0;
import androidx.compose.runtime.T1;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@T1
public interface o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f94362a = a.f94363a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f94363a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final o f94364b;

        static {
            int i10 = 0;
            f94364b = new b(i10, i10, 3, null);
        }

        @NotNull
        public final o a() {
            return f94364b;
        }
    }

    @InterfaceC1924k0
    public static final class b implements o {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f94365d = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f94366b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f94367c;

        /* JADX WARN: Illegal instructions before constructor call */
        public b() {
            int i10 = 0;
            this(i10, i10, 3, null);
        }

        public final int a() {
            return this.f94367c;
        }

        public final int b() {
            return this.f94366b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f94366b == bVar.f94366b && this.f94367c == bVar.f94367c;
        }

        public int hashCode() {
            return (this.f94366b * 31) + this.f94367c;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("MultiLine(minHeightInLines=");
            sb2.append(this.f94366b);
            sb2.append(", maxHeightInLines=");
            return C1477d.a(sb2, this.f94367c, ')');
        }

        public b(int i10, int i11) {
            this.f94366b = i10;
            this.f94367c = i11;
            if (1 > i10 || i10 > i11) {
                throw new IllegalArgumentException(C1758e.a("Expected 1 ≤ minHeightInLines ≤ maxHeightInLines, were ", i10, U6.j.f68738d, i11).toString());
            }
        }

        public /* synthetic */ b(int i10, int i11, int i12, C4969v c4969v) {
            this((i12 & 1) != 0 ? 1 : i10, (i12 & 2) != 0 ? Integer.MAX_VALUE : i11);
        }
    }

    @androidx.compose.runtime.internal.r(parameters = 1)
    public static final class c implements o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final c f94368b = new c();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f94369c = 0;

        @NotNull
        public String toString() {
            return "TextFieldLineLimits.SingleLine";
        }
    }
}
