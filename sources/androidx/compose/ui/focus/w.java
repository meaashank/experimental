package androidx.compose.ui.focus;

import kotlin.L0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    public static final class a implements A, kotlin.jvm.internal.B {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ed.l f100669a;

        public a(ed.l lVar) {
            this.f100669a = lVar;
        }

        @Override // androidx.compose.ui.focus.A
        public final /* synthetic */ void a(v vVar) {
            this.f100669a.invoke(vVar);
        }

        @Override // kotlin.jvm.internal.B
        @NotNull
        public final kotlin.A<?> b() {
            return this.f100669a;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof A) && (obj instanceof kotlin.jvm.internal.B)) {
                return kotlin.jvm.internal.G.g(this.f100669a, ((kotlin.jvm.internal.B) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return this.f100669a.hashCode();
        }
    }

    @NotNull
    public static final androidx.compose.ui.p a(@NotNull androidx.compose.ui.p pVar, @NotNull ed.l<? super v, L0> lVar) {
        return pVar.P0(new FocusPropertiesElement(new a(lVar)));
    }
}
