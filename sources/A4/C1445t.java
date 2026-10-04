package a4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.cookiegames.smartcookie.p;

/* JADX INFO: renamed from: a4.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1445t implements D2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f84692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final CheckBox f84693b;

    public C1445t(@NonNull FrameLayout frameLayout, @NonNull CheckBox checkBox) {
        this.f84692a = frameLayout;
        this.f84693b = checkBox;
    }

    @NonNull
    public static C1445t a(@NonNull View view) {
        int i10 = p.j.f144600Z1;
        CheckBox checkBox = (CheckBox) D2.c.a(view, i10);
        if (checkBox != null) {
            return new C1445t((FrameLayout) view, checkBox);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static C1445t c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static C1445t d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(p.m.f145300v0, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @NonNull
    public FrameLayout b() {
        return this.f84692a;
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.f84692a;
    }
}
