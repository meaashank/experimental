package d1;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.P;
import d1.b;

/* JADX INFO: renamed from: d1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4294a extends BaseAdapter implements Filterable, b.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final int f194564j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f194565k = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean f194566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean f194567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Cursor f194568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Context f194569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int f194570e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public C0711a f194571f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public DataSetObserver f194572g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public d1.b f194573h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public FilterQueryProvider f194574i;

    /* JADX INFO: renamed from: d1.a$a, reason: collision with other inner class name */
    public class C0711a extends ContentObserver {
        public C0711a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            AbstractC4294a.this.j();
        }
    }

    /* JADX INFO: renamed from: d1.a$b */
    public class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            AbstractC4294a abstractC4294a = AbstractC4294a.this;
            abstractC4294a.f194566a = true;
            abstractC4294a.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            AbstractC4294a abstractC4294a = AbstractC4294a.this;
            abstractC4294a.f194566a = false;
            abstractC4294a.notifyDataSetInvalidated();
        }
    }

    @Deprecated
    public AbstractC4294a(Context context, Cursor cursor) {
        f(context, cursor, 1);
    }

    public void a(Cursor cursor) {
        Cursor cursorL = l(cursor);
        if (cursorL != null) {
            cursorL.close();
        }
    }

    @Override // d1.b.a
    public Cursor b() {
        return this.f194568c;
    }

    public Cursor c(CharSequence charSequence) {
        FilterQueryProvider filterQueryProvider = this.f194574i;
        return filterQueryProvider != null ? filterQueryProvider.runQuery(charSequence) : this.f194568c;
    }

    public CharSequence convertToString(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    public abstract void d(View view, Context context, Cursor cursor);

    public FilterQueryProvider e() {
        return this.f194574i;
    }

    public void f(Context context, Cursor cursor, int i10) {
        if ((i10 & 1) == 1) {
            i10 |= 2;
            this.f194567b = true;
        } else {
            this.f194567b = false;
        }
        boolean z10 = cursor != null;
        this.f194568c = cursor;
        this.f194566a = z10;
        this.f194569d = context;
        this.f194570e = z10 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i10 & 2) == 2) {
            this.f194571f = new C0711a();
            this.f194572g = new b();
        } else {
            this.f194571f = null;
            this.f194572g = null;
        }
        if (z10) {
            C0711a c0711a = this.f194571f;
            if (c0711a != null) {
                cursor.registerContentObserver(c0711a);
            }
            DataSetObserver dataSetObserver = this.f194572g;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    @Deprecated
    public void g(Context context, Cursor cursor, boolean z10) {
        f(context, cursor, z10 ? 1 : 2);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f194566a || (cursor = this.f194568c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f194566a) {
            return null;
        }
        this.f194568c.moveToPosition(i10);
        if (view == null) {
            view = h(this.f194569d, this.f194568c, viewGroup);
        }
        d(view, this.f194569d, this.f194568c);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f194573h == null) {
            this.f194573h = new d1.b(this);
        }
        return this.f194573h;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        Cursor cursor;
        if (!this.f194566a || (cursor = this.f194568c) == null) {
            return null;
        }
        cursor.moveToPosition(i10);
        return this.f194568c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        Cursor cursor;
        if (this.f194566a && (cursor = this.f194568c) != null && cursor.moveToPosition(i10)) {
            return this.f194568c.getLong(this.f194570e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f194566a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f194568c.moveToPosition(i10)) {
            throw new IllegalStateException(android.support.v4.media.c.a("couldn't move cursor to position ", i10));
        }
        if (view == null) {
            view = i(this.f194569d, this.f194568c, viewGroup);
        }
        d(view, this.f194569d, this.f194568c);
        return view;
    }

    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return i(context, cursor, viewGroup);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return !(this instanceof P);
    }

    public abstract View i(Context context, Cursor cursor, ViewGroup viewGroup);

    public void j() {
        Cursor cursor;
        if (!this.f194567b || (cursor = this.f194568c) == null || cursor.isClosed()) {
            return;
        }
        this.f194566a = this.f194568c.requery();
    }

    public void k(FilterQueryProvider filterQueryProvider) {
        this.f194574i = filterQueryProvider;
    }

    public Cursor l(Cursor cursor) {
        Cursor cursor2 = this.f194568c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0711a c0711a = this.f194571f;
            if (c0711a != null) {
                cursor2.unregisterContentObserver(c0711a);
            }
            DataSetObserver dataSetObserver = this.f194572g;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f194568c = cursor;
        if (cursor == null) {
            this.f194570e = -1;
            this.f194566a = false;
            notifyDataSetInvalidated();
            return cursor2;
        }
        C0711a c0711a2 = this.f194571f;
        if (c0711a2 != null) {
            cursor.registerContentObserver(c0711a2);
        }
        DataSetObserver dataSetObserver2 = this.f194572g;
        if (dataSetObserver2 != null) {
            cursor.registerDataSetObserver(dataSetObserver2);
        }
        this.f194570e = cursor.getColumnIndexOrThrow("_id");
        this.f194566a = true;
        notifyDataSetChanged();
        return cursor2;
    }

    public AbstractC4294a(Context context, Cursor cursor, boolean z10) {
        f(context, cursor, z10 ? 1 : 2);
    }

    public AbstractC4294a(Context context, Cursor cursor, int i10) {
        f(context, cursor, i10);
    }
}
