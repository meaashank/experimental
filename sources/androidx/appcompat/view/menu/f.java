package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.view.menu.p;
import g.C4426a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class f implements o, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f85601k = "ListMenuPresenter";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f85602l = "android:menu:list";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f85603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LayoutInflater f85604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h f85605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ExpandedMenuView f85606d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f85607e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f85608f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f85609g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public o.a f85610h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f85611i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f85612j;

    public class a extends BaseAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f85613a = -1;

        public a() {
            a();
        }

        public void a() {
            k expandedItem = f.this.f85605c.getExpandedItem();
            if (expandedItem != null) {
                ArrayList<k> nonActionItems = f.this.f85605c.getNonActionItems();
                int size = nonActionItems.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (nonActionItems.get(i10) == expandedItem) {
                        this.f85613a = i10;
                        return;
                    }
                }
            }
            this.f85613a = -1;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public k getItem(int i10) {
            ArrayList<k> nonActionItems = f.this.f85605c.getNonActionItems();
            int i11 = i10 + f.this.f85607e;
            int i12 = this.f85613a;
            if (i12 >= 0 && i11 >= i12) {
                i11++;
            }
            return nonActionItems.get(i11);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = f.this.f85605c.getNonActionItems().size() - f.this.f85607e;
            return this.f85613a < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                f fVar = f.this;
                view = fVar.f85604b.inflate(fVar.f85609g, viewGroup, false);
            }
            ((p.a) view).initialize(getItem(i10), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public f(Context context, int i10) {
        this(i10, 0);
        this.f85603a = context;
        this.f85604b = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.f85611i == null) {
            this.f85611i = new a();
        }
        return this.f85611i;
    }

    public int b() {
        return this.f85607e;
    }

    public void c(Bundle bundle) {
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(f85602l);
        if (sparseParcelableArray != null) {
            this.f85606d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // androidx.appcompat.view.menu.o
    public boolean collapseItemActionView(h hVar, k kVar) {
        return false;
    }

    public void d(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f85606d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray(f85602l, sparseArray);
    }

    public void e(int i10) {
        this.f85612j = i10;
    }

    @Override // androidx.appcompat.view.menu.o
    public boolean expandItemActionView(h hVar, k kVar) {
        return false;
    }

    public void f(int i10) {
        this.f85607e = i10;
        if (this.f85606d != null) {
            updateMenuView(false);
        }
    }

    @Override // androidx.appcompat.view.menu.o
    public boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.o
    public int getId() {
        return this.f85612j;
    }

    @Override // androidx.appcompat.view.menu.o
    public p getMenuView(ViewGroup viewGroup) {
        if (this.f85606d == null) {
            this.f85606d = (ExpandedMenuView) this.f85604b.inflate(C4426a.j.f201358n, viewGroup, false);
            if (this.f85611i == null) {
                this.f85611i = new a();
            }
            this.f85606d.setAdapter((ListAdapter) this.f85611i);
            this.f85606d.setOnItemClickListener(this);
        }
        return this.f85606d;
    }

    @Override // androidx.appcompat.view.menu.o
    public void initForMenu(Context context, h hVar) {
        if (this.f85608f != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f85608f);
            this.f85603a = contextThemeWrapper;
            this.f85604b = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f85603a != null) {
            this.f85603a = context;
            if (this.f85604b == null) {
                this.f85604b = LayoutInflater.from(context);
            }
        }
        this.f85605c = hVar;
        a aVar = this.f85611i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.o
    public void onCloseMenu(h hVar, boolean z10) {
        o.a aVar = this.f85610h;
        if (aVar != null) {
            aVar.onCloseMenu(hVar, z10);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        this.f85605c.performItemAction(this.f85611i.getItem(i10), this, 0);
    }

    @Override // androidx.appcompat.view.menu.o
    public void onRestoreInstanceState(Parcelable parcelable) {
        c((Bundle) parcelable);
    }

    @Override // androidx.appcompat.view.menu.o
    public Parcelable onSaveInstanceState() {
        if (this.f85606d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        d(bundle);
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.o
    public boolean onSubMenuSelected(t tVar) {
        if (!tVar.hasVisibleItems()) {
            return false;
        }
        new i(tVar).d(null);
        o.a aVar = this.f85610h;
        if (aVar == null) {
            return true;
        }
        aVar.a(tVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.o
    public void setCallback(o.a aVar) {
        this.f85610h = aVar;
    }

    @Override // androidx.appcompat.view.menu.o
    public void updateMenuView(boolean z10) {
        a aVar = this.f85611i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public f(int i10, int i11) {
        this.f85609g = i10;
        this.f85608f = i11;
    }
}
