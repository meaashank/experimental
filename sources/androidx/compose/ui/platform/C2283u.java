package androidx.compose.ui.platform;

import android.view.View;
import e.InterfaceC4345t;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.platform.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@e.T(24)
public final class C2283u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C2283u f103934a = new C2283u();

    @e.T(24)
    @InterfaceC4345t
    public final boolean a(@NotNull View view, @NotNull androidx.compose.ui.draganddrop.g gVar, @NotNull androidx.compose.ui.draganddrop.a aVar) {
        return view.startDragAndDrop(gVar.f100463a, aVar, gVar.f100464b, gVar.f100465c);
    }
}
