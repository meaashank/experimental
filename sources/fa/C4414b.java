package fa;

import U9.d1;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.launcher3.Launcher;
import com.android.launcher3.ShortcutInfo;
import com.bumptech.glide.request.h;
import com.prism.commons.utils.l0;
import com.prism.hider.utils.m;
import e.e0;
import java.util.ArrayList;
import v3.n;
import w3.InterfaceC5744e;

/* JADX INFO: renamed from: fa.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C4414b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f200669g = l0.b(C4414b.class.getSimpleName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f200670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Drawable f200671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Drawable f200672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ShortcutInfo f200673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Launcher f200674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f200675f = false;

    /* JADX INFO: renamed from: fa.b$a */
    public class a extends n<Bitmap> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Context f200676d;

        public a(Context context) {
            this.f200676d = context;
        }

        @Override // v3.p
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void g(@NonNull Bitmap bitmap, @Nullable InterfaceC5744e<? super Bitmap> interfaceC5744e) {
            Log.d(C4414b.f200669g, "on resource loaded : " + C4414b.this.f200670a);
            C4414b.this.f200672c = new BitmapDrawable(this.f200676d.getResources(), bitmap);
            C4414b c4414b = C4414b.this;
            if (c4414b.f200673d == null || c4414b.f200674e == null) {
                return;
            }
            c4414b.n();
        }
    }

    public C4414b(String str, Drawable drawable) {
        this.f200670a = str;
        this.f200671b = drawable;
    }

    public static /* synthetic */ ArrayList a(C4414b c4414b, ArrayList arrayList) {
        c4414b.k(arrayList);
        return arrayList;
    }

    public void h(Launcher launcher, ShortcutInfo shortcutInfo) {
        this.f200673d = shortcutInfo;
        this.f200674e = launcher;
        n();
    }

    public Drawable i() {
        Drawable drawable = this.f200672c;
        return drawable != null ? drawable : this.f200671b;
    }

    public String j() {
        return this.f200670a;
    }

    public final /* synthetic */ ArrayList k(ArrayList arrayList) {
        Log.d(f200669g, "update icon shortcuts: " + arrayList.size());
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            m.y(this.f200674e, (ShortcutInfo) obj, i());
        }
        return arrayList;
    }

    @e0
    public void l(Context context) {
        Log.d(f200669g, "load icon: " + this.f200670a);
        new h();
        com.bumptech.glide.c.F(context).t().q(this.f200670a).s1(new a(context));
    }

    public void m(Drawable drawable) {
        this.f200671b = drawable;
    }

    public final synchronized void n() {
        if (this.f200675f) {
            return;
        }
        d1.D(this.f200674e.getModel(), this.f200673d.getPackageNameInComponent(), new d1.f() { // from class: fa.a
            @Override // U9.d1.f
            public final ArrayList a(ArrayList arrayList) {
                C4414b.a(this.f200668a, arrayList);
                return arrayList;
            }
        });
        if (this.f200672c != null) {
            this.f200675f = true;
        }
    }
}
