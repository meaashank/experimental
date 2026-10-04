package s6;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import c6.C2947b;

/* JADX INFO: renamed from: s6.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C5578c extends ArrayAdapter<C5577b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f238575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f238576b;

    public C5578c(@NonNull Context context) {
        this(context, 0);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    @NonNull
    public View getView(int i10, @Nullable View view, @NonNull ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.f238575a).inflate(this.f238576b, viewGroup, false);
        }
        C5577b c5577b = (C5577b) getItem(i10);
        ((TextView) view.findViewById(C2947b.h.f129234r4)).setText(c5577b.d(this.f238575a));
        ((TextView) view.findViewById(C2947b.h.f129226q4)).setText(c5577b.a(this.f238575a));
        return view;
    }

    public C5578c(@NonNull Context context, int i10) {
        super(context, i10);
        this.f238575a = context;
        this.f238576b = i10 == 0 ? C2947b.k.f129426U : i10;
    }
}
