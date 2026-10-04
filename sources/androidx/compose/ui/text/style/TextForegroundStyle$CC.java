package androidx.compose.ui.text.style;

import androidx.compose.ui.text.style.m;
import ed.InterfaceC4376a;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.text.style.TextForegroundStyle$-CC, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class TextForegroundStyle$CC {
    @NotNull
    public static m a(final m mVar, @NotNull m mVar2) {
        boolean z10 = mVar2 instanceof c;
        return (z10 && (mVar instanceof c)) ? new c(((c) mVar2).f104957b, l.d(((c) mVar2).f104958c, new InterfaceC4376a<Float>() { // from class: androidx.compose.ui.text.style.TextForegroundStyle$merge$1
            {
                super(0);
            }

            @Override // ed.InterfaceC4376a
            @NotNull
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Float invoke() {
                return Float.valueOf(mVar.f());
            }
        })) : (!z10 || (mVar instanceof c)) ? (z10 || !(mVar instanceof c)) ? mVar2.b(new InterfaceC4376a<m>() { // from class: androidx.compose.ui.text.style.TextForegroundStyle$merge$2
            {
                super(0);
            }

            @NotNull
            public final m g() {
                return mVar;
            }

            @Override // ed.InterfaceC4376a
            public m invoke() {
                return mVar;
            }
        }) : mVar : mVar2;
    }

    @NotNull
    public static m b(m mVar, @NotNull InterfaceC4376a interfaceC4376a) {
        return !G.g(mVar, m.b.f105033b) ? mVar : (m) interfaceC4376a.invoke();
    }
}
