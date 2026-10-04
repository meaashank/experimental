package androidx.compose.ui.platform;

import android.view.ActionMode;
import android.view.View;
import ed.InterfaceC4376a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class AndroidTextToolbar implements y1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f103391e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final View f103392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public ActionMode f103393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final X.c f103394c = new X.c(new InterfaceC4376a<kotlin.L0>() { // from class: androidx.compose.ui.platform.AndroidTextToolbar$textActionModeCallback$1
        {
            super(0);
        }

        @Override // ed.InterfaceC4376a
        public /* bridge */ /* synthetic */ kotlin.L0 invoke() {
            invoke2();
            return kotlin.L0.f217464a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f103396d.f103393b = null;
        }
    }, null, null, null, null, null, 62, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public TextToolbarStatus f103395d = TextToolbarStatus.Hidden;

    public AndroidTextToolbar(@NotNull View view) {
        this.f103392a = view;
    }

    @Override // androidx.compose.ui.platform.y1
    public void a(@NotNull P.j jVar, @Nullable InterfaceC4376a<kotlin.L0> interfaceC4376a, @Nullable InterfaceC4376a<kotlin.L0> interfaceC4376a2, @Nullable InterfaceC4376a<kotlin.L0> interfaceC4376a3, @Nullable InterfaceC4376a<kotlin.L0> interfaceC4376a4) {
        X.c cVar = this.f103394c;
        cVar.f76688b = jVar;
        cVar.f76689c = interfaceC4376a;
        cVar.f76691e = interfaceC4376a3;
        cVar.f76690d = interfaceC4376a2;
        cVar.f76692f = interfaceC4376a4;
        ActionMode actionMode = this.f103393b;
        if (actionMode == null) {
            this.f103395d = TextToolbarStatus.Shown;
            this.f103393b = z1.f103964a.b(this.f103392a, new X.a(this.f103394c), 1);
        } else if (actionMode != null) {
            actionMode.invalidate();
        }
    }

    @Override // androidx.compose.ui.platform.y1
    @NotNull
    public TextToolbarStatus getStatus() {
        return this.f103395d;
    }

    @Override // androidx.compose.ui.platform.y1
    public void hide() {
        this.f103395d = TextToolbarStatus.Hidden;
        ActionMode actionMode = this.f103393b;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.f103393b = null;
    }
}
