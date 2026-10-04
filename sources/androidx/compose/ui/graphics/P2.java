package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.AbstractC2098q2;
import androidx.compose.ui.unit.LayoutDirection;
import k0.InterfaceC4814e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class P2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c3 f100788a = new a();

    public static final class a implements c3 {
        @Override // androidx.compose.ui.graphics.c3
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC2098q2.b a(long j10, @NotNull LayoutDirection layoutDirection, @NotNull InterfaceC4814e interfaceC4814e) {
            return new AbstractC2098q2.b(P.o.m(j10));
        }

        @NotNull
        public String toString() {
            return "RectangleShape";
        }
    }

    @NotNull
    public static final c3 a() {
        return f100788a;
    }

    @androidx.compose.runtime.T1
    public static /* synthetic */ void b() {
    }
}
