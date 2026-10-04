package h5;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* JADX INFO: renamed from: h5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C4494c extends TouchDelegate {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Rect f202428d = new Rect();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<TouchDelegate> f202429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TouchDelegate f202430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f202431c;

    public C4494c(View view) {
        super(f202428d, view);
        this.f202429a = new ArrayList<>();
    }

    public void a(@NonNull TouchDelegate touchDelegate) {
        this.f202429a.add(touchDelegate);
    }

    public void b() {
        this.f202429a.clear();
        this.f202430b = null;
    }

    public void c(TouchDelegate touchDelegate) {
        this.f202429a.remove(touchDelegate);
        if (this.f202430b == touchDelegate) {
            this.f202430b = null;
        }
    }

    public void d(boolean z10) {
        this.f202431c = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001a  */
    @Override // android.view.TouchDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(@androidx.annotation.NonNull android.view.MotionEvent r7) {
        /*
            r6 = this;
            boolean r0 = r6.f202431c
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getAction()
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L20
            if (r0 == r3) goto L1a
            r4 = 2
            if (r0 == r4) goto L17
            r4 = 3
            if (r0 == r4) goto L1a
            goto L3d
        L17:
            android.view.TouchDelegate r2 = r6.f202430b
            goto L3d
        L1a:
            android.view.TouchDelegate r0 = r6.f202430b
            r6.f202430b = r2
            r2 = r0
            goto L3d
        L20:
            r0 = r1
        L21:
            java.util.ArrayList<android.view.TouchDelegate> r4 = r6.f202429a
            int r4 = r4.size()
            if (r0 >= r4) goto L3d
            java.util.ArrayList<android.view.TouchDelegate> r4 = r6.f202429a
            java.lang.Object r4 = r4.get(r0)
            android.view.TouchDelegate r4 = (android.view.TouchDelegate) r4
            boolean r5 = r4.onTouchEvent(r7)
            if (r5 == 0) goto L3a
            r6.f202430b = r4
            return r3
        L3a:
            int r0 = r0 + 1
            goto L21
        L3d:
            if (r2 == 0) goto L46
            boolean r7 = r2.onTouchEvent(r7)
            if (r7 == 0) goto L46
            return r3
        L46:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.C4494c.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
