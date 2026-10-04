package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import g.C4426a;
import q8.C5443b;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class f0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f86360h = "TooltipPopup";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f86361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f86362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f86363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WindowManager.LayoutParams f86364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f86365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f86366f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f86367g;

    public f0(@NonNull Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f86364d = layoutParams;
        this.f86365e = new Rect();
        this.f86366f = new int[2];
        this.f86367g = new int[2];
        this.f86361a = context;
        View viewInflate = LayoutInflater.from(context).inflate(C4426a.j.f201340B, (ViewGroup) null);
        this.f86362b = viewInflate;
        this.f86363c = (TextView) viewInflate.findViewById(C4426a.g.f201258I);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = C4426a.l.f201588e;
        layoutParams.flags = 24;
    }

    public static View b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if (!(layoutParams instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams).type != 2) {
            for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof Activity) {
                    return ((Activity) context).getWindow().getDecorView();
                }
            }
        }
        return rootView;
    }

    public final void a(View view, int i10, int i11, boolean z10, WindowManager.LayoutParams layoutParams) {
        int height;
        int i12;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f86361a.getResources().getDimensionPixelOffset(C4426a.e.f201096Q0);
        if (view.getWidth() < dimensionPixelOffset) {
            i10 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f86361a.getResources().getDimensionPixelOffset(C4426a.e.f201094P0);
            height = i11 + dimensionPixelOffset2;
            i12 = i11 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i12 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f86361a.getResources().getDimensionPixelOffset(z10 ? C4426a.e.f201102T0 : C4426a.e.f201100S0);
        View viewB = b(view);
        if (viewB == null) {
            Log.e(f86360h, "Cannot find app view");
            return;
        }
        viewB.getWindowVisibleDisplayFrame(this.f86365e);
        Rect rect = this.f86365e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f86361a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f86365e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        viewB.getLocationOnScreen(this.f86367g);
        view.getLocationOnScreen(this.f86366f);
        int[] iArr = this.f86366f;
        int i13 = iArr[0];
        int[] iArr2 = this.f86367g;
        int i14 = i13 - iArr2[0];
        iArr[0] = i14;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i14 + i10) - (viewB.getWidth() / 2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f86362b.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int measuredHeight = this.f86362b.getMeasuredHeight();
        int i15 = this.f86366f[1];
        int i16 = ((i12 + i15) - dimensionPixelOffset3) - measuredHeight;
        int i17 = i15 + height + dimensionPixelOffset3;
        if (z10) {
            if (i16 >= 0) {
                layoutParams.y = i16;
                return;
            } else {
                layoutParams.y = i17;
                return;
            }
        }
        if (measuredHeight + i17 <= this.f86365e.height()) {
            layoutParams.y = i17;
        } else {
            layoutParams.y = i16;
        }
    }

    public void c() {
        if (d()) {
            ((WindowManager) this.f86361a.getSystemService(C5443b.f226850e)).removeView(this.f86362b);
        }
    }

    public boolean d() {
        return this.f86362b.getParent() != null;
    }

    public void e(View view, int i10, int i11, boolean z10, CharSequence charSequence) {
        if (d()) {
            c();
        }
        this.f86363c.setText(charSequence);
        a(view, i10, i11, z10, this.f86364d);
        ((WindowManager) this.f86361a.getSystemService(C5443b.f226850e)).addView(this.f86362b, this.f86364d);
    }
}
