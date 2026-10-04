package X;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.compose.runtime.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@r(parameters = 0)
public final class b implements ActionMode.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f76684b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final c f76685a;

    public b(@NotNull c cVar) {
        this.f76685a = cVar;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(@Nullable ActionMode actionMode, @Nullable MenuItem menuItem) {
        return this.f76685a.i(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(@Nullable ActionMode actionMode, @Nullable Menu menu) {
        this.f76685a.j(actionMode, menu);
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(@Nullable ActionMode actionMode) {
        this.f76685a.k();
    }

    @Override // android.view.ActionMode.Callback
    public boolean onPrepareActionMode(@Nullable ActionMode actionMode, @Nullable Menu menu) {
        return this.f76685a.l(actionMode, menu);
    }
}
