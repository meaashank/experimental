package a4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.cookiegames.smartcookie.p;

/* JADX INFO: renamed from: a4.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1443q implements D2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f84686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final CheckBox f84687b;

    public C1443q(@NonNull LinearLayout linearLayout, @NonNull CheckBox checkBox) {
        this.f84686a = linearLayout;
        this.f84687b = checkBox;
    }

    @NonNull
    public static C1443q a(@NonNull View view) {
        int i10 = p.j.f144586Y1;
        CheckBox checkBox = (CheckBox) D2.c.a(view, i10);
        if (checkBox != null) {
            return new C1443q((LinearLayout) view, checkBox);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static C1443q c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static C1443q d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(p.m.f145285s0, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @NonNull
    public LinearLayout b() {
        return this.f84686a;
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.f84686a;
    }
}
