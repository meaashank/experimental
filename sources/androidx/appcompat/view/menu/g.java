package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.p;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class g extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f85615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f85616b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f85617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f85618d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LayoutInflater f85619e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f85620f;

    public g(h hVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f85618d = z10;
        this.f85619e = layoutInflater;
        this.f85615a = hVar;
        this.f85620f = i10;
        a();
    }

    public void a() {
        k expandedItem = this.f85615a.getExpandedItem();
        if (expandedItem != null) {
            ArrayList<k> nonActionItems = this.f85615a.getNonActionItems();
            int size = nonActionItems.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (nonActionItems.get(i10) == expandedItem) {
                    this.f85616b = i10;
                    return;
                }
            }
        }
        this.f85616b = -1;
    }

    public h b() {
        return this.f85615a;
    }

    public boolean c() {
        return this.f85617c;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public k getItem(int i10) {
        ArrayList<k> nonActionItems = this.f85618d ? this.f85615a.getNonActionItems() : this.f85615a.getVisibleItems();
        int i11 = this.f85616b;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return nonActionItems.get(i10);
    }

    public void e(boolean z10) {
        this.f85617c = z10;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f85616b < 0 ? (this.f85618d ? this.f85615a.getNonActionItems() : this.f85615a.getVisibleItems()).size() : r0.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f85619e.inflate(this.f85620f, viewGroup, false);
        }
        int i11 = getItem(i10).f85651m;
        int i12 = i10 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.h(this.f85615a.isGroupDividerEnabled() && i11 != (i12 >= 0 ? getItem(i12).f85651m : i11));
        p.a aVar = (p.a) view;
        if (this.f85617c) {
            listMenuItemView.g(true);
        }
        aVar.initialize(getItem(i10), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
