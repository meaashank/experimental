package androidx.core.view;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f111457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f111458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f111459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f111460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f111461e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View.OnLongClickListener f111462f = new View.OnLongClickListener() { // from class: androidx.core.view.A
        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            return this.f111453a.d(view);
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View.OnTouchListener f111463g = new View.OnTouchListener() { // from class: androidx.core.view.B
        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return this.f111455a.e(view, motionEvent);
        }
    };

    public interface a {
        boolean a(@NonNull View view, @NonNull C c10);
    }

    public C(@NonNull View view, @NonNull a aVar) {
        this.f111457a = view;
        this.f111458b = aVar;
    }

    public void a() {
        this.f111457a.setOnLongClickListener(this.f111462f);
        this.f111457a.setOnTouchListener(this.f111463g);
    }

    public void b() {
        this.f111457a.setOnLongClickListener(null);
        this.f111457a.setOnTouchListener(null);
    }

    public void c(@NonNull Point point) {
        point.set(this.f111459c, this.f111460d);
    }

    public boolean d(@NonNull View view) {
        if (this.f111461e) {
            return true;
        }
        boolean zA = this.f111458b.a(view, this);
        this.f111461e = zA;
        return zA;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean e(@androidx.annotation.NonNull android.view.View r7, @androidx.annotation.NonNull android.view.MotionEvent r8) {
        /*
            r6 = this;
            float r0 = r8.getX()
            int r0 = (int) r0
            float r1 = r8.getY()
            int r1 = (int) r1
            int r2 = r8.getAction()
            r3 = 0
            if (r2 == 0) goto L49
            r4 = 1
            if (r2 == r4) goto L46
            r5 = 2
            if (r2 == r5) goto L1b
            r7 = 3
            if (r2 == r7) goto L46
            goto L4d
        L1b:
            r2 = 8194(0x2002, float:1.1482E-41)
            boolean r2 = androidx.core.view.V.l(r8, r2)
            if (r2 == 0) goto L4d
            int r8 = r8.getButtonState()
            r8 = r8 & r4
            if (r8 != 0) goto L2b
            goto L4d
        L2b:
            boolean r8 = r6.f111461e
            if (r8 == 0) goto L30
            goto L4d
        L30:
            int r8 = r6.f111459c
            if (r8 != r0) goto L39
            int r8 = r6.f111460d
            if (r8 != r1) goto L39
            goto L4d
        L39:
            r6.f111459c = r0
            r6.f111460d = r1
            androidx.core.view.C$a r8 = r6.f111458b
            boolean r7 = r8.a(r7, r6)
            r6.f111461e = r7
            return r7
        L46:
            r6.f111461e = r3
            goto L4d
        L49:
            r6.f111459c = r0
            r6.f111460d = r1
        L4d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.C.e(android.view.View, android.view.MotionEvent):boolean");
    }
}
