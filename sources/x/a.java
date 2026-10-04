package X;

import P.j;
import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.compose.runtime.internal.r;
import e.T;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@T(23)
@r(parameters = 0)
public final class a extends ActionMode.Callback2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f76682b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final c f76683a;

    public a(@NotNull c cVar) {
        this.f76683a = cVar;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(@Nullable ActionMode actionMode, @Nullable MenuItem menuItem) {
        return this.f76683a.i(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(@Nullable ActionMode actionMode, @Nullable Menu menu) {
        this.f76683a.j(actionMode, menu);
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(@Nullable ActionMode actionMode) {
        this.f76683a.k();
    }

    @Override // android.view.ActionMode.Callback2
    public void onGetContentRect(@Nullable ActionMode actionMode, @Nullable View view, @Nullable Rect rect) {
        j jVar = this.f76683a.f76688b;
        if (rect != null) {
            rect.set((int) jVar.f65511a, (int) jVar.f65512b, (int) jVar.f65513c, (int) jVar.f65514d);
        }
    }

    @Override // android.view.ActionMode.Callback
    public boolean onPrepareActionMode(@Nullable ActionMode actionMode, @Nullable Menu menu) {
        return this.f76683a.l(actionMode, menu);
    }
}
