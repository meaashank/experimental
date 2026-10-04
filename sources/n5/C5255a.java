package n5;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import e.G;
import java.util.ArrayList;
import k5.b;

/* JADX INFO: renamed from: n5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C5255a extends ArrayAdapter<b> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ boolean f221234f = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LayoutInflater f221235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList<b> f221236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList<b> f221237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @G
    public int f221238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Filter f221239e;

    /* JADX INFO: renamed from: n5.a$a, reason: collision with other inner class name */
    public class C0842a extends Filter {
        public C0842a() {
        }

        @Override // android.widget.Filter
        public CharSequence convertResultToString(Object obj) {
            return obj == null ? "" : ((b) obj).b();
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            Filter.FilterResults filterResults = new Filter.FilterResults();
            C5255a.this.f221237c.clear();
            if (charSequence != null) {
                ArrayList<b> arrayList = C5255a.this.f221236b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    b bVar = arrayList.get(i10);
                    i10++;
                    b bVar2 = bVar;
                    if (bVar2.compareTo(charSequence.toString()) == 0) {
                        C5255a.this.f221237c.add(bVar2);
                    }
                }
                ArrayList<b> arrayList2 = C5255a.this.f221237c;
                filterResults.values = arrayList2;
                filterResults.count = arrayList2.size();
            }
            return filterResults;
        }

        @Override // android.widget.Filter
        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            ArrayList arrayList = (ArrayList) filterResults.values;
            C5255a.this.clear();
            if (arrayList != null && arrayList.size() > 0) {
                C5255a.this.addAll(arrayList);
            }
            C5255a.this.notifyDataSetChanged();
        }
    }

    public C5255a(@NonNull Context context, @G int i10, @NonNull ArrayList<b> arrayList) {
        super(context, i10, arrayList);
        this.f221239e = new C0842a();
        this.f221235a = LayoutInflater.from(context);
        this.f221236b = (ArrayList) arrayList.clone();
        this.f221237c = new ArrayList<>();
        this.f221238d = i10;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    @NonNull
    public Filter getFilter() {
        return this.f221239e;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    @NonNull
    public View getView(int i10, @Nullable View view, @NonNull ViewGroup viewGroup) {
        if (view == null) {
            view = this.f221235a.inflate(this.f221238d, (ViewGroup) null);
        }
        b bVar = (b) getItem(i10);
        TextView textView = (TextView) view.findViewById(b.j.f215569A1);
        textView.setText(bVar.b());
        int iC = bVar.c();
        if (iC == 0) {
            textView.setTypeface(Typeface.MONOSPACE);
            return view;
        }
        if (iC != 1) {
            return view;
        }
        textView.setTypeface(Typeface.MONOSPACE);
        return view;
    }
}
