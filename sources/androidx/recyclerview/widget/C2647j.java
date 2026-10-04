package androidx.recyclerview.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: androidx.recyclerview.widget.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2647j extends RecyclerView.n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f116718d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f116719e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f116720f = "DividerItem";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f116721g = {R.attr.listDivider};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f116722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f116723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f116724c = new Rect();

    public C2647j(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f116721g);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f116722a = drawable;
        if (drawable == null) {
            Log.w(f116720f, "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        typedArrayObtainStyledAttributes.recycle();
        setOrientation(i10);
    }

    private void c(Canvas canvas, RecyclerView recyclerView) {
        int height;
        int paddingTop;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingTop = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            paddingTop = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.f116724c);
            int iRound = Math.round(childAt.getTranslationX()) + this.f116724c.right;
            this.f116722a.setBounds(iRound - this.f116722a.getIntrinsicWidth(), paddingTop, iRound, height);
            this.f116722a.draw(canvas);
        }
        canvas.restore();
    }

    private void d(Canvas canvas, RecyclerView recyclerView) {
        int width;
        int paddingLeft;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingLeft = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            paddingLeft = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            recyclerView.getDecoratedBoundsWithMargins(childAt, this.f116724c);
            int iRound = Math.round(childAt.getTranslationY()) + this.f116724c.bottom;
            this.f116722a.setBounds(paddingLeft, iRound - this.f116722a.getIntrinsicHeight(), width, iRound);
            this.f116722a.draw(canvas);
        }
        canvas.restore();
    }

    @Nullable
    public Drawable e() {
        return this.f116722a;
    }

    public void f(@NonNull Drawable drawable) {
        if (drawable == null) {
            throw new IllegalArgumentException("Drawable cannot be null.");
        }
        this.f116722a = drawable;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
        Drawable drawable = this.f116722a;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f116723b == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        if (recyclerView.getLayoutManager() == null || this.f116722a == null) {
            return;
        }
        if (this.f116723b == 1) {
            d(canvas, recyclerView);
        } else {
            c(canvas, recyclerView);
        }
    }

    public void setOrientation(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
        }
        this.f116723b = i10;
    }
}
