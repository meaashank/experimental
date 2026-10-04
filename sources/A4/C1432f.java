package a4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.cookiegames.smartcookie.p;

/* JADX INFO: renamed from: a4.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1432f implements D2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f84644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f84645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f84646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f84647d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final RecyclerView f84648e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f84649f;

    public C1432f(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull RecyclerView recyclerView, @NonNull RelativeLayout relativeLayout) {
        this.f84644a = linearLayout;
        this.f84645b = imageView;
        this.f84646c = imageView2;
        this.f84647d = imageView3;
        this.f84648e = recyclerView;
        this.f84649f = relativeLayout;
    }

    @NonNull
    public static C1432f a(@NonNull View view) {
        int i10 = p.j.f144673e0;
        ImageView imageView = (ImageView) D2.c.a(view, i10);
        if (imageView != null) {
            i10 = p.j.f144347H0;
            ImageView imageView2 = (ImageView) D2.c.a(view, i10);
            if (imageView2 != null) {
                i10 = p.j.f144869r1;
                ImageView imageView3 = (ImageView) D2.c.a(view, i10);
                if (imageView3 != null) {
                    i10 = p.j.f144899t1;
                    RecyclerView recyclerView = (RecyclerView) D2.c.a(view, i10);
                    if (recyclerView != null) {
                        i10 = p.j.f144944w1;
                        RelativeLayout relativeLayout = (RelativeLayout) D2.c.a(view, i10);
                        if (relativeLayout != null) {
                            return new C1432f((LinearLayout) view, imageView, imageView2, imageView3, recyclerView, relativeLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static C1432f c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static C1432f d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(p.m.f145142N, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @NonNull
    public LinearLayout b() {
        return this.f84644a;
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.f84644a;
    }
}
