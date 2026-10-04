package androidx.preference;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.C2507z0;
import androidx.preference.w;
import androidx.recyclerview.widget.RecyclerView;
import e.C;

/* JADX INFO: loaded from: classes2.dex */
public class v extends RecyclerView.C {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Drawable f115727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ColorStateList f115728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseArray<View> f115729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f115730e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f115731f;

    public v(@NonNull View view) {
        super(view);
        SparseArray<View> sparseArray = new SparseArray<>(4);
        this.f115729d = sparseArray;
        TextView textView = (TextView) view.findViewById(R.id.title);
        sparseArray.put(R.id.title, textView);
        sparseArray.put(R.id.summary, view.findViewById(R.id.summary));
        sparseArray.put(R.id.icon, view.findViewById(R.id.icon));
        int i10 = w.f.f115805a;
        sparseArray.put(i10, view.findViewById(i10));
        sparseArray.put(16908350, view.findViewById(16908350));
        this.f115727b = view.getBackground();
        if (textView != null) {
            this.f115728c = textView.getTextColors();
        }
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.TESTS})
    public static v c(@NonNull View view) {
        return new v(view);
    }

    public View d(@C int i10) {
        View view = this.f115729d.get(i10);
        if (view != null) {
            return view;
        }
        View viewFindViewById = this.itemView.findViewById(i10);
        if (viewFindViewById != null) {
            this.f115729d.put(i10, viewFindViewById);
        }
        return viewFindViewById;
    }

    public boolean e() {
        return this.f115730e;
    }

    public boolean f() {
        return this.f115731f;
    }

    public void g() {
        Drawable background = this.itemView.getBackground();
        Drawable drawable = this.f115727b;
        if (background != drawable) {
            C2507z0.O1(this.itemView, drawable);
        }
        TextView textView = (TextView) d(R.id.title);
        if (textView == null || this.f115728c == null || textView.getTextColors().equals(this.f115728c)) {
            return;
        }
        textView.setTextColor(this.f115728c);
    }

    public void h(boolean z10) {
        this.f115730e = z10;
    }

    public void i(boolean z10) {
        this.f115731f = z10;
    }
}
