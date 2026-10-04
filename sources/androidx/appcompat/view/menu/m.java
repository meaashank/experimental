package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class m implements r, o, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Rect f85678a;

    public static int e(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i10) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i11 = 0;
        int i12 = 0;
        View view = null;
        for (int i13 = 0; i13 < count; i13++) {
            int itemViewType = listAdapter.getItemViewType(i13);
            if (itemViewType != i12) {
                view = null;
                i12 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i13, view, viewGroup);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i10) {
                return i10;
            }
            if (measuredWidth > i11) {
                i11 = measuredWidth;
            }
        }
        return i11;
    }

    public static boolean o(h hVar) {
        int size = hVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = hVar.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    public static g p(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (g) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (g) listAdapter;
    }

    public abstract void b(h hVar);

    public boolean c() {
        return !(this instanceof e);
    }

    @Override // androidx.appcompat.view.menu.o
    public boolean collapseItemActionView(h hVar, k kVar) {
        return false;
    }

    public Rect d() {
        return this.f85678a;
    }

    @Override // androidx.appcompat.view.menu.o
    public boolean expandItemActionView(h hVar, k kVar) {
        return false;
    }

    public abstract void f(View view);

    public void g(Rect rect) {
        this.f85678a = rect;
    }

    @Override // androidx.appcompat.view.menu.o
    public int getId() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.o
    public p getMenuView(ViewGroup viewGroup) {
        throw new UnsupportedOperationException("MenuPopups manage their own views");
    }

    public abstract void h(boolean z10);

    @Override // androidx.appcompat.view.menu.o
    public void initForMenu(@NonNull Context context, @Nullable h hVar) {
    }

    public abstract void j(int i10);

    public abstract void k(int i10);

    public abstract void l(PopupWindow.OnDismissListener onDismissListener);

    public abstract void m(boolean z10);

    public abstract void n(int i10);

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        p(listAdapter).f85615a.performItemAction((MenuItem) listAdapter.getItem(i10), this, c() ? 0 : 4);
    }
}
