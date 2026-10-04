package androidx.activity;

import kotlin.L0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class F {

    public static final class a extends C {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ed.l<C, L0> f84856d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(boolean z10, ed.l<? super C, L0> lVar) {
            super(z10);
            this.f84856d = lVar;
        }

        @Override // androidx.activity.C
        public void g() {
            this.f84856d.invoke(this);
        }
    }

    @NotNull
    public static final C a(@NotNull OnBackPressedDispatcher onBackPressedDispatcher, @Nullable androidx.lifecycle.B b10, boolean z10, @NotNull ed.l<? super C, L0> onBackPressed) {
        kotlin.jvm.internal.G.p(onBackPressedDispatcher, "<this>");
        kotlin.jvm.internal.G.p(onBackPressed, "onBackPressed");
        a aVar = new a(z10, onBackPressed);
        if (b10 != null) {
            onBackPressedDispatcher.i(b10, aVar);
            return aVar;
        }
        onBackPressedDispatcher.j(aVar);
        return aVar;
    }

    public static /* synthetic */ C b(OnBackPressedDispatcher onBackPressedDispatcher, androidx.lifecycle.B b10, boolean z10, ed.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            b10 = null;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return a(onBackPressedDispatcher, b10, z10, lVar);
    }
}
