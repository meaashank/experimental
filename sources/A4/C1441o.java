package a4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.cookiegames.smartcookie.p;

/* JADX INFO: renamed from: a4.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1441o implements D2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f84677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final SeekBar f84678b;

    public C1441o(@NonNull LinearLayout linearLayout, @NonNull SeekBar seekBar) {
        this.f84677a = linearLayout;
        this.f84678b = seekBar;
    }

    @NonNull
    public static C1441o a(@NonNull View view) {
        int i10 = p.j.f144554Vb;
        SeekBar seekBar = (SeekBar) D2.c.a(view, i10);
        if (seekBar != null) {
            return new C1441o((LinearLayout) view, seekBar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static C1441o c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static C1441o d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(p.m.f145275q0, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @NonNull
    public LinearLayout b() {
        return this.f84677a;
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.f84677a;
    }
}
