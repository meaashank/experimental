package a4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.cookiegames.smartcookie.p;

/* JADX INFO: loaded from: classes3.dex */
public final class K implements D2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final View f84525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f84526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f84527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f84528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageButton f84529e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f84530f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ImageView f84531g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final RecyclerView f84532h;

    public K(@NonNull View view, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageButton imageButton, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull RecyclerView recyclerView) {
        this.f84525a = view;
        this.f84526b = imageView;
        this.f84527c = imageView2;
        this.f84528d = imageView3;
        this.f84529e = imageButton;
        this.f84530f = imageView4;
        this.f84531g = imageView5;
        this.f84532h = recyclerView;
    }

    @NonNull
    public static K a(@NonNull View view) {
        int i10 = p.j.f144703g0;
        ImageView imageView = (ImageView) D2.c.a(view, i10);
        if (imageView != null) {
            i10 = p.j.f144928v0;
            ImageView imageView2 = (ImageView) D2.c.a(view, i10);
            if (imageView2 != null) {
                i10 = p.j.f144958x0;
                ImageView imageView3 = (ImageView) D2.c.a(view, i10);
                if (imageView3 != null) {
                    i10 = p.j.f144494R7;
                    ImageButton imageButton = (ImageButton) D2.c.a(view, i10);
                    if (imageButton != null) {
                        i10 = p.j.f144508S7;
                        ImageView imageView4 = (ImageView) D2.c.a(view, i10);
                        if (imageView4 != null) {
                            i10 = p.j.f144714gb;
                            ImageView imageView5 = (ImageView) D2.c.a(view, i10);
                            if (imageView5 != null) {
                                i10 = p.j.f144789lb;
                                RecyclerView recyclerView = (RecyclerView) D2.c.a(view, i10);
                                if (recyclerView != null) {
                                    return new K(view, imageView, imageView2, imageView3, imageButton, imageView4, imageView5, recyclerView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static K b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException(androidx.constraintlayout.widget.d.f107893V1);
        }
        layoutInflater.inflate(p.m.f145268o3, viewGroup);
        return a(viewGroup);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.f84525a;
    }
}
