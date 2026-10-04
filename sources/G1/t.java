package g1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.databinding.v;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class t<T> extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<T> f202211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v.a f202212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f202213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f202214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f202215e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f202216f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LayoutInflater f202217g;

    public class a extends v.a {
        public a() {
        }

        @Override // androidx.databinding.v.a
        public void a(androidx.databinding.v vVar) {
            t.this.notifyDataSetChanged();
        }

        @Override // androidx.databinding.v.a
        public void f(androidx.databinding.v vVar, int i10, int i11) {
            t.this.notifyDataSetChanged();
        }

        @Override // androidx.databinding.v.a
        public void g(androidx.databinding.v vVar, int i10, int i11) {
            t.this.notifyDataSetChanged();
        }

        @Override // androidx.databinding.v.a
        public void h(androidx.databinding.v vVar, int i10, int i11, int i12) {
            t.this.notifyDataSetChanged();
        }

        @Override // androidx.databinding.v.a
        public void i(androidx.databinding.v vVar, int i10, int i11) {
            t.this.notifyDataSetChanged();
        }
    }

    public t(Context context, List<T> list, int i10, int i11, int i12) {
        this.f202213c = context;
        this.f202215e = i10;
        this.f202214d = i11;
        this.f202216f = i12;
        this.f202217g = i10 == 0 ? null : (LayoutInflater) context.getSystemService("layout_inflater");
        b(list);
    }

    public View a(int i10, int i11, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = i10 == 0 ? new TextView(this.f202213c) : this.f202217g.inflate(i10, viewGroup, false);
        }
        int i12 = this.f202216f;
        TextView textView = (TextView) (i12 == 0 ? view : view.findViewById(i12));
        T t10 = this.f202211a.get(i11);
        textView.setText(t10 instanceof CharSequence ? (CharSequence) t10 : String.valueOf(t10));
        return view;
    }

    public void b(List<T> list) {
        List<T> list2 = this.f202211a;
        if (list2 == list) {
            return;
        }
        if (list2 instanceof androidx.databinding.v) {
            ((androidx.databinding.v) list2).n2(this.f202212b);
        }
        this.f202211a = list;
        if (list instanceof androidx.databinding.v) {
            if (this.f202212b == null) {
                this.f202212b = new a();
            }
            ((androidx.databinding.v) list).Y1(this.f202212b);
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f202211a.size();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        return a(this.f202214d, i10, view, viewGroup);
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        return this.f202211a.get(i10);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        return a(this.f202215e, i10, view, viewGroup);
    }
}
