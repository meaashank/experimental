package androidx.compose.ui.text;

import androidx.compose.runtime.R0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.text.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public abstract class AbstractC2360m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f104865a = 0;

    public AbstractC2360m() {
    }

    @Nullable
    public abstract InterfaceC2361n a();

    @Nullable
    public abstract T b();

    public AbstractC2360m(C4969v c4969v) {
    }

    /* JADX INFO: renamed from: androidx.compose.ui.text.m$a */
    @androidx.compose.runtime.internal.r(parameters = 0)
    public static final class a extends AbstractC2360m {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f104866e = 8;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f104867b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final T f104868c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final InterfaceC2361n f104869d;

        public a(@NotNull String str, @Nullable T t10, @Nullable InterfaceC2361n interfaceC2361n) {
            this.f104867b = str;
            this.f104868c = t10;
            this.f104869d = interfaceC2361n;
        }

        @Override // androidx.compose.ui.text.AbstractC2360m
        @Nullable
        public InterfaceC2361n a() {
            return this.f104869d;
        }

        @Override // androidx.compose.ui.text.AbstractC2360m
        @Nullable
        public T b() {
            return this.f104868c;
        }

        @NotNull
        public final String c() {
            return this.f104867b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.G.g(this.f104867b, aVar.f104867b) && kotlin.jvm.internal.G.g(this.f104868c, aVar.f104868c) && kotlin.jvm.internal.G.g(this.f104869d, aVar.f104869d);
        }

        public int hashCode() {
            int iHashCode = this.f104867b.hashCode() * 31;
            T t10 = this.f104868c;
            int iHashCode2 = (iHashCode + (t10 != null ? t10.hashCode() : 0)) * 31;
            InterfaceC2361n interfaceC2361n = this.f104869d;
            return iHashCode2 + (interfaceC2361n != null ? interfaceC2361n.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return R0.a(new StringBuilder("LinkAnnotation.Clickable(tag="), this.f104867b, ')');
        }

        public /* synthetic */ a(String str, T t10, InterfaceC2361n interfaceC2361n, int i10, C4969v c4969v) {
            this(str, (i10 & 2) != 0 ? null : t10, interfaceC2361n);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.text.m$b */
    @androidx.compose.runtime.internal.r(parameters = 0)
    public static final class b extends AbstractC2360m {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f104870e = 8;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f104871b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final T f104872c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final InterfaceC2361n f104873d;

        public b(@NotNull String str, @Nullable T t10, @Nullable InterfaceC2361n interfaceC2361n) {
            this.f104871b = str;
            this.f104872c = t10;
            this.f104873d = interfaceC2361n;
        }

        @Override // androidx.compose.ui.text.AbstractC2360m
        @Nullable
        public InterfaceC2361n a() {
            return this.f104873d;
        }

        @Override // androidx.compose.ui.text.AbstractC2360m
        @Nullable
        public T b() {
            return this.f104872c;
        }

        @NotNull
        public final String c() {
            return this.f104871b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.G.g(this.f104871b, bVar.f104871b) && kotlin.jvm.internal.G.g(this.f104872c, bVar.f104872c) && kotlin.jvm.internal.G.g(this.f104873d, bVar.f104873d);
        }

        public int hashCode() {
            int iHashCode = this.f104871b.hashCode() * 31;
            T t10 = this.f104872c;
            int iHashCode2 = (iHashCode + (t10 != null ? t10.hashCode() : 0)) * 31;
            InterfaceC2361n interfaceC2361n = this.f104873d;
            return iHashCode2 + (interfaceC2361n != null ? interfaceC2361n.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return R0.a(new StringBuilder("LinkAnnotation.Url(url="), this.f104871b, ')');
        }

        public /* synthetic */ b(String str, T t10, InterfaceC2361n interfaceC2361n, int i10, C4969v c4969v) {
            this(str, (i10 & 2) != 0 ? null : t10, (i10 & 4) != 0 ? null : interfaceC2361n);
        }
    }
}
