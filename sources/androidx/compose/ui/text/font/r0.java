package androidx.compose.ui.text.font;

import androidx.compose.runtime.X1;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface r0 extends X1<Object> {

    @androidx.compose.runtime.internal.r(parameters = 1)
    public static final class a implements r0, X1<Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f104648b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final AsyncFontListLoader f104649a;

        public a(@NotNull AsyncFontListLoader asyncFontListLoader) {
            this.f104649a = asyncFontListLoader;
        }

        @Override // androidx.compose.ui.text.font.r0
        public boolean a() {
            return this.f104649a.f104443g;
        }

        @NotNull
        public final AsyncFontListLoader d() {
            return this.f104649a;
        }

        @Override // androidx.compose.runtime.X1
        @NotNull
        public Object getValue() {
            return this.f104649a.getValue();
        }
    }

    boolean a();

    @androidx.compose.runtime.internal.r(parameters = 1)
    public static final class b implements r0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f104650c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Object f104651a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f104652b;

        public b(@NotNull Object obj, boolean z10) {
            this.f104651a = obj;
            this.f104652b = z10;
        }

        @Override // androidx.compose.ui.text.font.r0
        public boolean a() {
            return this.f104652b;
        }

        @Override // androidx.compose.runtime.X1
        @NotNull
        public Object getValue() {
            return this.f104651a;
        }

        public /* synthetic */ b(Object obj, boolean z10, int i10, C4969v c4969v) {
            this(obj, (i10 & 2) != 0 ? true : z10);
        }
    }
}
